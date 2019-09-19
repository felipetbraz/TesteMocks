import java.util.List;

public class Pedido {
	Cliente cliente;
	List<LinhaPedido> linhas;
	Double valorBase;
	

	public Pedido(Cliente cliente, List<LinhaPedido> linhas) {
		super();
		this.cliente = cliente;
		this.linhas = linhas;
	}

	public Double obterValorBase() {
		return valorBase;
	}
	
	public Double calcularPreco() {
		valorBase = 0D;
		for(LinhaPedido linha : linhas) {
			valorBase+=linha.calcularPreco();
		}
		return cliente.obterValorComDesconto(this);
	}
}
