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
	List<LinhaPedido> linhas = new ArrayList<LinhaPedido>();
	
	@Mock
	private Cliente cliente;
	
	@Mock
	private LinhaPedido linhaPedido;
	
	@Mock
	private LinhaPedido linhaPedido2;
		
	@Mock
	private Produto produto;
	
	
	@Before
	public void initPedido() {		
		MockitoAnnotations.initMocks(this);
		pedido = new Pedido(cliente, linhas);
	}
	
	@Test
	public void testaPedido() {
		linhas.add(linhaPedido);
		linhas.add(linhaPedido2);
		when(linhaPedido.calcularPreco()).thenReturn(110.3);
		when(linhaPedido.calcularPreco()).thenReturn(60.2);
		when(cliente.obterValorComDesconto(pedido)).thenReturn(150.1);
		double valor = pedido.calcularPreco();
		Assert.assertEquals(valor, 150.1, 0.0001);
	}
}
