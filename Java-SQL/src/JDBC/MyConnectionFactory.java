package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {

public static Connection obterConexao() {
		
		final String url = "jdbc:mysql://localhost/curso_app";
		final String user = "root"; 
		final String password = "12Erick1606#";
		
		try {
			return DriverManager.getConnection(
					url,
					user,
					password);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
	}
	
}

