package com.utils;

import java.awt.List;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.xml.transform.stream.StreamResult;

import com.dao.ConexionBBDD;
import com.modelo.Respuesta;
import com.modelo.Usuario;
import com.service.UsuarioServcice;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Respuesta rs = new Respuesta();
		Usuario u = new Usuario("Pepe","Jimenez");
		UsuarioServcice us = new UsuarioServcice();
		//rs = us.addUsuario(u);
		java.util.List<Usuario> lista = new ArrayList<Usuario>();
		lista = ConexionBBDD.getUsuariosBBDD();
		u.setId(5);
		rs = null;
		rs = new Respuesta();
		try {
			rs = us.updateUsuario(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
