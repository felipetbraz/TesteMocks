import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class LinhaPedidoTeste {
	
	private LinhaPedido linhaPedido;
	
	@Mock
	private Produto produto;
	
	@Before
	public void initLinhaPedido() {
		MockitoAnnotations.initMocks(this);
		linhaPedido = new LinhaPedido(produto, 4);
	}
	
	@Test
	public void TestaLinhaPedido() {
		when(produto.obterPreco()).thenReturn(50.5);
		double valor = linhaPedido.calcularPreco();
		Assert.assertEquals(valor, 202.00, 0.001);
	}
}
