package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirValorPessoa {

	public static void main (String[] args) throws SQLException { 
		Connection conexao = MyConnectionFactory.obterConexao();
		
		String nome = "Erick";
		String sobrenome = "Bortoloti";
		
		String SQL = "INSERT INTO pessoa (nome,sobrenome) VALUE (?, ?)";
		
		PreparedStatement instrucao = conexao.prepareStatement(SQL); 
		
		instrucao.setString(1, nome);
		instrucao.setString(2, sobrenome);
		
		instrucao.execute();
		
		System.out.println("Foi inserida um valor na tabela pessoa");
		conexao.close();
	}
	
}

