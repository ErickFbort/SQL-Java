package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoSQL {

	final static String url = "jdbc:mysql://localhost/mercado";
	final static String user = "root";
	final static String password = "12Erick1606#";

	public static Connection iniciarConexao() {
		try {
			return DriverManager.getConnection(
					url,
					user,
					password);
		} catch (SQLException e) {
			System.err.println("erro ao conectar");
			throw new RuntimeException("Erro de conexao: " + e);
		}
	}

	public static void encerrarConexao(Connection connection) {
		if (connection != null) { // SE CONEXAO FOR DIFERENTE DE NULO
			try {
				connection.close();// FINALIZA CONEXAO
			} catch (SQLException e) {// SE TENTAR FINALIZAR CONEXAO INEXISTENTE
				e.printStackTrace();// EXIBE MENSAGEM DE ERRO
			}
		}
	}

	public static void encerrarConexao(Connection connection, PreparedStatement stmt) {
		encerrarConexao(connection, stmt);
		try {
			stmt.close();
		} catch (SQLException e) {// SE TENTAR FINALIZAR PREPAREDSTATEMENT INEXISTENTE
			e.printStackTrace(); // EXIBE MENSAGEM DE ERRO
		}
	}

	public static void encerrarConexao(Connection conexao, PreparedStatement stmt, ResultSet resultado) {
		encerrarConexao(conexao, stmt, resultado);
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}