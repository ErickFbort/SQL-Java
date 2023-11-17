package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = MyConnectionFactory.obterConexao();
		
		String nome = "Erick";
		int CPF = 2;
		
		String SQL = "UPDATE pessoa set nome = ? WHERE CPF = ? ";	
		
		PreparedStatement instrucao = conexao.prepareStatement(SQL);
		
		instrucao.setString(1, nome);
		instrucao.setInt(2, CPF);
		
		instrucao.execute();
		
		System.out.println("Tabela Atualizada com sucesso");
	}

}
