package pruebasClase3;

import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class pruebasBD {
	
	private Connection conn;
	
	public void conectar() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		
		conn= DriverManager.getConnection("jdbc:sqlite:BD/pruebasDB.db");
		
	}
	public void desconectar() throws SQLException{
		conn.close();
	}
	
	public List<Usuario> obtenerUsuarios() throws SQLException, ParseException{
		String sql= "SELECT login, password, creationDate FROM usuario";
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			Usuario usuario = new Usuario();
			usuario.setLogin(rs.getString("login"));
			usuario.setPassword(rs.getString("password"));
			usuario.setCreationDateISO(rs.getString("creation_date"));
			
			usuarios.add(usuario);
		}
		return usuarios;
	}
	
	public void actualizar(Usuario usuario)throws SQLException {
		String sql= "UPDATE usuario SET (password = ?, creation_date= ?) WHERE login= ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, usuario.getPassword());
		stmt.setString(2, usuario.getCreationDateISO());
		stmt.setString(3, usuario.getLogin());
		
		stmt.executeUpdate();
	}
	public void guardar(Usuario usuario)throws SQLException {
			String sql = "INSERT INTO usuario (login, password, creation_date) VALUES (?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getPassword());
			stmt.setString(3, usuario.getCreationDateISO());
			
			stmt.executeUpdate();
	}
	
	public void borrar(Usuario usuario) throws SQLException {
			String sql = "DELETE FROM usuario WHERE login= ?";
			PreparedStatement stmt=conn.prepareStatement(sql);
			
			stmt.setString(1, usuario.getLogin());
			
			stmt.executeUpdate();
	}
	
	public Usuario obtener(String login) throws SQLException, ParseException   {
		
		String sql = ("SELECT login, password,creation_date FROM usuario WHERE login = ?");
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		Usuario usuario = new Usuario();
		
		try {
			stmt.setString(1, login);
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				usuario.setLogin(rs.getString("login"));
				usuario.setPassword(rs.getString("password"));
				usuario.setCreationDateISO(rs.getString("creation_date"));
				
			}else {
				return new Usuario();
			}
			
		} catch ( SQLException | ParseException e) {
			// TODO: handle exception
			throw e;
		} finally {
			stmt.close();
		}
		return usuario;
	}
}