package pruebasClase3;

import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pruebasBD {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.sqlite.JDBC");
			
			Connection conn = DriverManager.getConnection("jdbc:sqlite:BD/pruebasDB.db");
			
			
			Scanner s = new Scanner(System.in);
			System.out.println("Usuario: ");
			String login= s.nextLine();
			
			System.out.println("Password: ");
			String password = s.nextLine();
			s.close();
			
			Date now = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
			String creationDate = df.format(now);
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO usuario(login, password, creation_date) VALUES (?,?,?)");
//			String insert= "INSERT INTO usuario (login, password, creation_date)" + 
//					"VALUES ('"+login + "', '" +password+ "', '" +creationDate + "')";
			
			stmt.setString(1, login);
			stmt.setString(2, password);
			stmt.setString(3, creationDate);
			
			int rows = stmt.executeUpdate();
			
			System.out.println("Filas actualizadas: "+rows);
			
			
			
			
		}  catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	} 
	

}