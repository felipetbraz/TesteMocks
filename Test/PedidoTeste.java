import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class PedidoTeste {

	private Pedido pedido;
	
	@Mock
	private Cliente cliente;
	
	@Mock
	private LinhaPedido linhaPedido;
	
	@Mock
	private Produto produto;
	
	
	@Before
	public void initPedido() {
		List<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
		linhas.add(linhaPedido);
		MockitoAnnotations.initMocks(this);
		pedido = new Pedido(cliente, linhas);
	}
	
	@Test
	public void testaPedido() {
		when(cliente.obterValorComDesconto(pedido)).thenReturn(150.1);
		when(linhaPedido.calcularPreco()).thenReturn(150.1);
		double valor = pedido.calcularPreco();
		Assert.assertEquals(valor, 0, 0.1);
	}
}
