package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriandoBancoDados {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost";
		final String user = "root"; 
		final String password = "12Erick1606#";
		
		Connection conexao = DriverManager.getConnection(url,user,password);
		
		Statement instrucao = conexao.createStatement();
		instrucao.execute("CREATE DATABASE aula_6");
				
		System.out.println("Banco criado com sucesso!");
		
	}

}
