package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelecionarPessoas {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = MyConnectionFactory.obterConexao();
		String SQL = "SELECT * FROM pessoa ";
		PreparedStatement instrucao = conexao.prepareStatement(SQL);
		
		ResultSet resultado = instrucao.executeQuery();
		
		while(resultado.next()) {
			System.out.println(resultado.getString("nome"));
			System.out.println(resultado.getInt("CPF"));
			System.out.println(resultado.getString("sobrenome"));
		}
			
	}

}
