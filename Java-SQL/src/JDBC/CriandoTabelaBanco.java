package JDBC;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriandoTabelaBanco {

	public static void main(String[] args) throws SQLException {
				
		Connection conexao = MyConnectionFactory.obterConexao();
		Statement instrucao = conexao.createStatement();
		
		String SQL = "Create table pessoa ("
				+ "CPF int primary key,"
				+ "nome varchar(50),"
				+ "sobrenome varchar(40)";
		
		instrucao.execute(SQL);
		
		System.out.println("Tabela SQL criada!");		
		
		String SQL1 = "Create table endereco ("
				+ "id_endereco int AUTO_INCREMENT primary key,"
				+ "nome_cidade varchar(20),"
				+ "estado varchar(2),"
				+ "numero varchar(5),"
				+ "CEP varchar(10)";
				
		instrucao.execute(SQL1);
		
		System.out.println("Tabela SQL1 criada!");
				
	}

}
