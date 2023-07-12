package br.com.alura.loja.modelo;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal valorTotal;
    private LocalDate data = LocalDate.now();

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(){
    }

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    public void adicionarItem(ItemPedido item){
        item.setPedido(this);
        this.itens.add(item);
    }
}