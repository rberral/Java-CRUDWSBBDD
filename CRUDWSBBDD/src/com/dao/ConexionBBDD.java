package com.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.modelo.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.utils.Constants;
import com.utils.Utiles;

public class ConexionBBDD {

	static Connection conexionMySQL;
	private static Statement estado;
	private static String IP = "127.0.0.1";
	private static String puerto = "3306";
	private static String name_bbdd = "sql7131893"; // catálogo
	private static String user_bbdd = "root";
	private static String pass_bbdd = "";
	private static String tabla_usuario = "usuario";

	public static int OpenConnection() {
		String urlConexionMySQL = "jdbc:mysql://" + IP + ":" + puerto + "/" + name_bbdd;
		int eval = 0;

		if (urlConexionMySQL != "") {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				conexionMySQL = (Connection) DriverManager.getConnection(urlConexionMySQL, user_bbdd, pass_bbdd);
				estado = (Statement) conexionMySQL.createStatement();

			} catch (ClassNotFoundException e) {
				//eval = e.getMessage();
				eval = Constants.ERROR_WS;
			} catch (SQLException e) {
				//eval = e.getMessage();
				eval = Constants.ERROR_WS;
			}
		}

		return eval;
	}

	public static void CloseConnection() {
		try {
			estado.close();
			conexionMySQL.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Usuario> getUsuariosBBDD() {
		ResultSet result = null;
		int eval = 0;
		List<Usuario> lista = new ArrayList<Usuario>();
		String peticion = "select * from " + tabla_usuario;

		eval = ConexionBBDD.OpenConnection();
		if(eval != Constants.ERROR_WS){
		try {
			result = (ResultSet) estado.executeQuery(peticion);
			lista = Utiles.convertRSToList(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConexionBBDD.CloseConnection();
		}
		return lista;
	}

	public static int addUsuario(Usuario u) {
		int eval = 0;
		String sql = "INSERT INTO usuario(nombre,apellidos) VALUES ('" + u.getName() + "','" + u.getApel() + "')";

		eval = ConexionBBDD.OpenConnection();
		if(eval != Constants.ERROR_WS){
		try {
			eval = estado.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			eval = -1;
		}

		ConexionBBDD.CloseConnection();
		}
		return eval;
	}

	public static int deleteUsuario(Usuario u) {
		int eval = 0;
		String sql = "DELETE FROM usuario WHERE id_usuario = '" + u.getId() + "'";

		eval = ConexionBBDD.OpenConnection();
		if(eval != Constants.ERROR_WS){
		try {
			eval = estado.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			eval = -1;
		}

		ConexionBBDD.CloseConnection();
		}
		return eval;
	}

	public static int updateUsuario(Usuario u) {
		int eval = 0;
		String sql = "UPDATE usuario SET nombre = '" + u.getName() + "', apellidos = '" + u.getApel()
				+ "' WHERE id_usuario = '" + u.getId() + "'";
		ConexionBBDD.OpenConnection();
		if(eval != Constants.ERROR_WS){
		try {
			eval = estado.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			eval = -1;
		}

		ConexionBBDD.CloseConnection();
		}
		return eval;
	}

	public static Usuario getUsuario(long id) {
		ResultSet rs = null;
		int eval = 0;
		Usuario u = null;
		String sql = "SELECT * FROM usuario WHERE id_usuario = '" + id + "'";
		ConexionBBDD.OpenConnection();
		if(eval != Constants.ERROR_WS){
		try {
			rs = (ResultSet) estado.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		try {
			// rs.beforeFirst();
			if (rs.next()) {
				u = new Usuario(Long.parseLong(rs.getString(1)),rs.getString(2), rs.getString("apellidos"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConexionBBDD.CloseConnection();
		}
		return u;
	}

}
