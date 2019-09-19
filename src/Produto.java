
public class Produto {
	private int idProduto;
	private String nomeProduto;
	private Float preco;
	
	public Produto(int idProduto, String nomeProduto, Float preco) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	public Float obterPreco(int quantidade) {
		return quantidade * preco;
	}
}
