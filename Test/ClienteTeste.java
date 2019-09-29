import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class ClienteTeste {
	
	private Cliente cliente;
	
	@Mock
	private Pedido pedido;
	
	@Before
	public void initCliente() {
		MockitoAnnotations.initMocks(this);
		cliente = new Cliente(1, "Joao", 0.1);
	}
	
	@Test
	public void TestaCliente() {
		when(pedido.obterValorBase()).thenReturn(25.5);
		double valor = cliente.obterValorComDesconto(pedido);
		Assert.assertEquals(valor, 22.95, 0.001);
	}
}
