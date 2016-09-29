package com.service;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlRootElement;

import com.dao.ConexionBBDD;
import com.modelo.Respuesta;
import com.modelo.Usuario;
import com.utils.Constants;
import com.utils.Utiles;

@WebService(targetNamespace = "http://service.com/", portName = "UsuarioServcicePort", serviceName = "UsuarioServciceService")
public class UsuarioServcice {
	private List<Usuario> UsuariosList = null;

	@WebMethod(operationName = "getUsuariosList", action = "urn:GetUsuariosList")
	@WebResult(name = "Usuario")
	public List<Usuario> getUsuariosList() {

		//if (UsuariosList == null) {
			UsuariosList = new ArrayList<Usuario>();
			UsuariosList = ConexionBBDD.getUsuariosBBDD();
		//}

		return UsuariosList;
	}

	@WebMethod(operationName = "addUsuario", action = "urn:AddUsuario")
	@WebResult(name = "Respuesta")
	public Respuesta addUsuario(Usuario u) {
		Respuesta resp = null;
		int eval = ConexionBBDD.addUsuario(u);
		resp = checkCallWS(eval);
		/*if(resp.getCodigo()==200){
			UsuariosList.add(u);//Actualizamos listado guardado en memoria
		}*/
		return resp;
	}

	@WebMethod(operationName = "deleteUsuario", action = "urn:DeleteUsuario")
	public boolean deleteUsuario(Usuario u) {
		int eval = ConexionBBDD.deleteUsuario(u);
		boolean dev = false;
		Respuesta resp = null;
		resp = checkCallWS(eval);
		if(resp.getCodigo() == 200){
			dev = true;
			//UsuariosList.remove(u); //Actualizamos listado guardado en memoria
		}
		else{
			dev = false;
		}
		return dev;
	}

	@WebMethod(operationName = "updateUsuario", action = "urn:UpdateUsuario")
	@WebResult(name = "Respuesta")
	public Respuesta updateUsuario(Usuario u) throws IOException {
		Respuesta resp = null;
		int eval = ConexionBBDD.updateUsuario(u);
		resp = checkCallWS(eval);
		return resp;
	}

	@WebMethod(operationName = "getUsuario", action = "urn:GetUsuario")
	@WebResult(name = "Usuario")
	public Usuario getUsuario(long id) {
		Usuario u = ConexionBBDD.getUsuario(id);
		return u;
	}

	public void setUsuariosList(List<Usuario> lista) {
		UsuariosList = lista;
	}
	
	public Respuesta checkCallWS(int eval){
		Respuesta rs = null;
		switch (eval) {
		case -1:
			//Error en query BBDD
			rs = new Respuesta(Constants.ERROR_QUERY_BBDD,Constants.DESC_ERROR_QUERY_BBDD);					
			break;
		case 0: 	
			//Error al ejecutar operación sobre BBDD
			rs = new Respuesta(Constants.ERROR_OPERACION_BBDD,Constants.DESC_ERROR_OPERACION_BBDD);			
			break;
		case Constants.ERROR_WS:
			//Error al ejecutar WS
			rs = new Respuesta(Constants.ERROR_WS,Constants.DESC_ERROR_WS);			
			break;
		default:
			if(eval > 0){ 
				rs = new Respuesta(Constants.OK_WS,Constants.DESC_OK_WS);
			}
			break;
		}
		return rs;
	}

}