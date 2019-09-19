import java.util.List;

public class Pedido {
	Cliente cliente;
	List<LinhaPedido> linhas;
	

	public Pedido(Cliente cliente, List<LinhaPedido> linhas) {
		super();
		this.cliente = cliente;
		this.linhas = linhas;
	}

	public float obterValorBase() {
		float valorBase = 0;
		for(LinhaPedido linha : linhas) {
			valorBase+=linha.calcularPreco();
		}
		return valorBase;
	}
	public float calcularPreco() {
		return cliente.obterValorComDesconto(pedido);
	}
}
