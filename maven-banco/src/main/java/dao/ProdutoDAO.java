package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ModeloTable.Produto;
import conexao.ConexaoSQL;

public class ProdutoDAO implements IProdutoDAO {

	@Override
	public Produto findById(int produtoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Produto produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Produto produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Produto produto) {
		// TODO Auto-generated method stub

	}

	// SALVAR PRODUTOS
	public void salvar(Produto produto) throws SQLException {

		Connection conexao = ConexaoSQL.iniciarConexao();
		PreparedStatement stmt = null;

		try {
			stmt = conexao
					.prepareStatement("INSERT INTO produto " + "(nome, preco, quantidadeEstoque) " + "VALUES (?,?,?)");

			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getPreco());
			stmt.setInt(3, produto.getQuantidadeEstoque());

			stmt.executeUpdate();

		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		} finally {
			ConexaoSQL.encerrarConexao(conexao, stmt);
		}
	}

	// LISTAR PRODUTOS NO BANCO DE DADOS
	public List<Produto> listar() throws SQLException  {

		Connection conexao = ConexaoSQL.iniciarConexao();
		PreparedStatement stmt = null;
		ResultSet resultado = null;
		List<Produto> listaProdutos = new ArrayList<Produto>();

		try {
			stmt = conexao.prepareStatement("SELECT * FROM produto");

			resultado = stmt.executeQuery();

			while (resultado.next())
				;
			{
				Produto produto = new Produto();
				produto.setId(resultado.getInt("id"));
				produto.setNome(resultado.getString("nome"));
				produto.setPreco(resultado.getDouble("preco"));
				produto.setQuantidadeEstoque(resultado.getInt("quantidadeEstoque"));
				listaProdutos.add(produto);
			}

		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		} finally {
			ConexaoSQL.encerrarConexao(conexao, stmt, resultado);
		}
		return listaProdutos;
	}
	
	//ATUALIZAR PRODUTO
	public void atualizar(Produto produto, int idProduto) {
		Connection conexao = ConexaoSQL.iniciarConexao();
		PreparedStatement stmt = null;

		try {
			stmt = conexao
					.prepareStatement("UPDATE produto"
							+ " SET nome = ? "
							+ " WHERE id = ? ");

			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, idProduto);

			stmt.executeUpdate();

		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		} finally {
			ConexaoSQL.encerrarConexao(conexao, stmt);
		}
	}
	
	//DELETAR PRODUTO
	public void deletar(int idProduto) {
		Connection conexao = ConexaoSQL.iniciarConexao(); 
		PreparedStatement instrucao = null;
		
		try {
			instrucao = conexao
					 .prepareStatement(" DELETE FROM produto "
					 		+ " WHERE id = ? ");  
			
			instrucao.setInt(1, idProduto);
			instrucao.executeUpdate();

		} catch(SQLException ex) {
			System.err.println(ex.getMessage());		
		} finally {
			ConexaoSQL.encerrarConexao(conexao, instrucao);
		} 
	}
	
	//BUSCAR PRODUTO
	public Produto buscarProduto(int idProduto) {
		Connection conexao = ConexaoSQL.iniciarConexao(); 
		PreparedStatement instrucao = null;
		ResultSet resultado = null;
		Produto produto = new Produto();
		
		try {
			instrucao = conexao
					 .prepareStatement("SELECT * FROM produto "
					 		+ "WHERE id = ? ");
			
			
			instrucao.setInt(1, idProduto);
			
			resultado = instrucao.executeQuery();
			
			while (resultado.next()){ 
		           produto.setId(resultado.getInt("id"));
		           produto.setNome(resultado.getString("nome")); 
		           produto.setPreco(resultado.getDouble("preco")); 
		           produto.setQuantidadeEstoque(resultado.getInt("quantidadeEstoque"));
		    }
			
		} catch(SQLException ex) {
			System.err.println(ex.getMessage());		
		} finally {
			ConexaoSQL.encerrarConexao(conexao, instrucao, resultado);
		}
		 
		return produto;
	}
}
