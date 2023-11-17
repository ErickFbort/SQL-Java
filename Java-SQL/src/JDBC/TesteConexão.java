package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexão {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost";
		final String user = "root"; 
		final String password = "12Erick1606#";
		
		Connection conexao = DriverManager.getConnection(url,user,password);
								
		System.out.println("Conexão Ok!");
	}

}
