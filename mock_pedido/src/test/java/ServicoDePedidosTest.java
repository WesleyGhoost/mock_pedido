import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoDePedidosTest {

    @Mock 
    private RepositorioDePedidos repositorioFalso;

    @InjectMocks 
    private ServicoDePedidos servico;

    @Test 
    public void retomarDescricaoDoPedido() {
        Pedido pedidoFalso = new Pedido(1, "Café");
        when(repositorioFalso.buscarPorId(1)).thenReturn(pedidoFalso);

        String resultado = servico.obterDescricaoDoPedido(1);
        
        assertEquals("Café", resultado);
    }
}
