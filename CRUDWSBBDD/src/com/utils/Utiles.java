package com.utils;

import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.modelo.Usuario;

public class Utiles {

	public static List<Usuario> convertRSToList(ResultSet rs){
		List<Usuario> listado = new ArrayList<Usuario>();
		Usuario aux = null;
		try {
			rs.beforeFirst(); //Necesario posicionar ResultSet en el primer elemento para recorrerlo
			while (rs.next()) {
				long id = Long.parseLong(rs.getString(1));
				String nombreByPosCol = rs.getString(2); // Obtiene
																	// valor por
																	// posicion
																	// de
																	// columna
				String apellidosByNameCol = rs.getString("apellidos"); // Obtiene
																			// valor
																			// por
																			// nombre
																			// de
																			// columna

				//System.out.println(id + " ," + nombreByPosCol + " ," + nombreByNameCol);
				aux = new Usuario(id,nombreByPosCol, apellidosByNameCol);
				//aux = new Usuario();
				//aux.setId(id);
				//aux.setName(nombreByPosCol);
				//aux.setApel(apellidosByNameCol);
				listado.add(aux);
				
				id = 0;
				apellidosByNameCol = "";
				nombreByPosCol = "";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listado; 
	}
	
	
	public static StreamResult convertRSToXML(ResultSet listaUsuarios) {
		int colCount = 0;
		StreamResult sr = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = builder.newDocument();
		Element results = doc.createElement("Results");
		doc.appendChild(results);

		ResultSetMetaData rsmd;
		try {
			rsmd = listaUsuarios.getMetaData();
			colCount = rsmd.getColumnCount();

			while (listaUsuarios.next()) {
				Element row = doc.createElement("Row");
				results.appendChild(row);
				for (int i = 1; i <= colCount; i++) {
					String columnName = rsmd.getColumnName(i);
					Object value = listaUsuarios.getObject(i);
					Element node = doc.createElement(columnName);
					if (value == null) {
						node.appendChild(doc.createTextNode(""));

					} else {
						node.appendChild(doc.createTextNode(value.toString()));
					}
					row.appendChild(node);
				}
			}


		DOMSource domSource = new DOMSource(doc);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer;
			transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
			StringWriter sw = new StringWriter();
			sr = new StreamResult(sw);
			transformer.transform(domSource, sr);

			System.out.println("\n\n--- Listado convertido a XML ---");
			System.out.println(sw.toString());
			// listaUsuarios.close();

		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sr;
	}
	
}
