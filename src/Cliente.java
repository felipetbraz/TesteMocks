
public class Cliente {
	private int idCliente;
	private String nome;
	private Double desconto;
	
	
	public Cliente(int idCliente, String nome, Double desconto) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.desconto = desconto;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public Double obterValorComDesconto(Pedido pedido) {
		return pedido.obterValorBase() - (pedido.obterValorBase() * desconto);
	}
}
