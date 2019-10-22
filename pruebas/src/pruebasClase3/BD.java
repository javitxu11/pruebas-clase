package pruebasClase3;

import java.sql.*;
import java.util.ArrayList;

public class BD {
	
	public static ArrayList<String> aUsername = new ArrayList<>();
	public static ArrayList<String> aPassword = new ArrayList<>();
	
	// Inicializa la conexion
		public static Connection initBD( String nombreBD ) {
			try {
				Class.forName("org.sqlite.JDBC");
				Connection con = DriverManager.getConnection("jdbc:sqlite:"+nombreBD);
				System.out.println("Conectado con exito");
				return con;
			
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		

		// Devuelve el statement para utilizarlo
		public static Statement usarBD( Connection con ) {
			try {
				Statement statement = con.createStatement();
				statement.setQueryTimeout(30);  // poner timeout 30 msg
				return statement;
			
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		public static Statement CrearTablaBD(Connection con){
			try {
				Statement Stmt = con.createStatement();
				Stmt.setQueryTimeout(30);
				try{
					Stmt.executeUpdate("CREATE TABLE usuario " +
							"(Nombre TEXT NOT NULL PRIMARY KEY, Password TEXT, FechaCreacion TEXT )");
					System.out.println("Tabla creada con exito");
				}catch(Exception e){
					System.out.println("La tabla ya estaba creada");
					//NADA QUE HACER, LA TABLA YA EST� CREADA
				}
				return Stmt;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public static boolean InsertarUsuario(Connection con, String nombre, String password, String fecha) {
			try {
				Statement Stmt = con.createStatement();
				Stmt.setQueryTimeout(30);
				try {
					Stmt.executeUpdate("Insert into usuario values(" + "'" + nombre +"',"+password+ "',"+ fecha+ ");");
					System.out.println("Se han insertado los datos con exito! ");
					return true;
				} catch (Exception e) {
					System.out.println("El nombre "+nombre+" ya est� registrado");
					return false;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		
		public static ResultSet  ObtenerUsuarios(Connection con) {
			Statement Stmt=null;
			ResultSet rs=null;
			try {
				Stmt = con.createStatement();
				System.out.println("Se ha seleccionado todo con exito!");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			try {
				rs = Stmt.executeQuery("Select * from usuario");
				while (rs.next()) {
					aUsername.add(rs.getString(1));
					aPassword.add(rs.getString(2));
					System.out.println("Nombre: " + rs.getString(1));
					System.out.println("Password: " + rs.getString(2));
				}
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;

		}
		
		public static Statement BorrarTablaBD(Connection con){
			try {
				Statement Stmt = con.createStatement();
				Stmt.setQueryTimeout(30);
				try{
					Stmt.executeUpdate("drop table usuario ");
					System.out.println("Tabla borrada con exito");
				}catch(Exception e){
					System.out.println("b");
					//NADA QUE HACER, LA TABLA YA EST� CREADA
				}
				return Stmt;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public static void cerrarBaseDeDatos( Connection con) {
			try {
				if (con!=null) con.close();
				System.out.println("Base de datos cerrada con exito");
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}