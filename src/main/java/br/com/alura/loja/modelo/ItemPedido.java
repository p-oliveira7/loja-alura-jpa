package br.com.alura.loja.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Getter
@Setter
@Table(name = "itens_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal precoUnitario;
    private int quantidade;
    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Produto produto;

    private ItemPedido(){

    }
    public ItemPedido(int quantidade, Pedido pedido, Produto produto) {
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.precoUnitario = produto.getPreco();
        this.produto = produto;
    }
}
