
import model.cliente.Cliente;
import model.fabrica.deposito.materiaprima.MateriaPrima;
import model.fabrica.pedidos.Pedidos;
import model.fabrica.services.catalogo.Catalogo;
import model.fabrica.services.producao.Producao;

public class App {
    public static void main(String[] args) throws Exception {
        MateriaPrima deposito = new MateriaPrima(450, 573, 765, 564);
        Producao producao = new Producao(deposito);
        Cliente c1 = new Cliente("432.432/1000-53", "Rua Aurora 2340", "João Enxofados", "(85)94534-3325", 100000);
        Catalogo catalogo = new Catalogo(300, 500, 2300, 2450);
        
        Pedidos pedido = new Pedidos(c1, producao, catalogo);

        pedido.FazerPedido(10, 10, 10, 10);

        deposito.status();
    }
}

