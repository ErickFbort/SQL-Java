package maven_banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import ModeloTable.Produto;
import conexao.ConexaoSQL;
import dao.ProdutoDAO;
import dao.ProdutoDAO;
import dao.ProdutoDAO;

public class App 
{
	Connection conexao = ConexaoSQL.iniciarConexao();
	
    public static void main(String[] args) throws SQLException {
    
    	ProdutoDAO operacaoProduto = new ProdutoDAO();
    	
    	Produto Pasta = new Produto("Pasta", 0);
    	operacaoProduto.atualizar(Pasta, 8);
    	
    	List<Produto> produtos = operacaoProduto.listar();
    	
    	for(int i = 0; i < produtos.size(); i++) {
    		System.out.println(produtos.get(i).getNome());
    		
    		/*Scanner leitor = new Scanner (System.in);
        	Produto produto1 = new Produto();
        	
        	System.out.println("Digite um produto: ");
        	produto1.setNome(leitor.next());
        	
        	System.out.println("Digite o valor do produto: ");
        	produto1.setPreco(Double.parseDouble(leitor.next()));
        	
        	System.out.println("Digite a quantidade desse produto: ");
        	produto1.setQuantidadeEstoque(leitor.nextInt());
        	
        	operacaoProduto.salvar(produto1);*/
    	}
    	
    	
    	
    	
    }
}
