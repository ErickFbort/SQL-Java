package ModeloTable;

public class Produto {
	
	//ATRIBUTOS
	private int id;
	private String nome;
	private double preco;
	private int quantidadeEstoque;

	//CONSTRUTORES
	public Produto() {
	}

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, double preco, int quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;

	}

	public boolean verificaproduto(Produto prod) {
		if (prod.quantidadeEstoque > 0) {
			return true;
		} else {
			return false;
		}
	}

	//GETTERS E SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public boolean verificarEstoque(Produto prod) {
		if (prod.quantidadeEstoque > 0) {
			return true;
		} else {
			return false;
		}
	}
}
