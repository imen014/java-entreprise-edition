package tasks2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	Connection connection;

	
	public void openConnection() {
		
		try {
			String username="root";
			String password="root";
			String dbname = "tasks";
					
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasks", username, password);
			if(connection != null) {
				System.out.println("vous étes connecté au bdd");
			}
			
		}catch(SQLException e) {
			System.out.println("connection non aboutie à cause de : " + e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println("connection non aboutie à cause de : " + e.getMessage());
		}
	}
	
	public void closeConnection() {
		
		try {
			connection.close();
		}catch(SQLException e) {
			System.out.println("connection non aboutie à cause de : " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ConnectionClass connect = new ConnectionClass();
		connect.openConnection();
		
	}

}
