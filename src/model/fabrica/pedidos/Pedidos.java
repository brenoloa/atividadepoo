package model.fabrica.pedidos;

import model.cliente.Cliente;
import model.fabrica.services.catalogo.Catalogo;
import model.fabrica.services.producao.Producao;

public class Pedidos {

    private Cliente cliente;
    private Producao producao; 
    private Catalogo catalogo;
    public Pedidos(Cliente cliente, Producao producao, Catalogo catalogo) {
        this.cliente = cliente;
        this.producao = producao;
        this.catalogo = catalogo;
    }

    public void FazerPedido(int x, int y, int z, int v){
        producao.fazerCadeira(x);
        producao.fazerCama(y);
        producao.fazerGuardaRoupa(z);
        producao.fazerMesa(v);

        double valorTotal = 0;

        valorTotal += y*catalogo.getCama();
        valorTotal += z*catalogo.getGuardaroupa();
        valorTotal += x*catalogo.getCadeira();
        valorTotal += v*catalogo.getMesa();

        cliente.reduzirSaldo(valorTotal);

        System.out.println("Cliente gastou R$: " + valorTotal);
        System.out.println("Saldo atual de cliente R$: " + cliente.getSaldo());



    }
    
}
