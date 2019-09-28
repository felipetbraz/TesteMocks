
public class LinhaPedido {
	
	Produto produto;
	Integer quantidade;
	
	public LinhaPedido(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Double calcularPreco() {
		return produto.obterPreco(quantidade);
	}
}
