package com.bdd.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	private Connection connection;


	
	public void openConnection() {
		String username = "root";
		String password = "root";
		String db_url = "jdbc:mysql://localhost:3306/tasks";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(db_url,username, password);
			
			if(connection != null) {
				System.out.println("connection à la bdd reussite");
			}
			
			
		}catch(SQLException e) {
			System.out.println("echec d'accées à la bdd ! " + e.getMessage());

			
		}catch(ClassNotFoundException e) {
			System.out.println("driver introuvable ! " + e.getMessage());

			
		}
		
	}
	
	public void closeConnection() {
		try{
			connection.close();
			
		}catch(SQLException e) {
			System.out.println("erreur lors de la fermeture de ressource ! " + e.getMessage());
		}
	}
	
	

}

