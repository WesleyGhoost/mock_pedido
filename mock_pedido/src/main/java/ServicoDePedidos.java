public class ServicoDePedidos {
    private final RepositorioDePedidos repositorio;

    public ServicoDePedidos(RepositorioDePedidos repositorio) {
        this.repositorio = repositorio;
    }

    public String obterDescricaoDoPedido(int id) {
        Pedido pedido = repositorio.buscarPorId(id);
        return pedido != null ? pedido.getDescricao() : "Pedido não encontrado";
    }
}
