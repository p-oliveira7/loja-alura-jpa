package br.com.alura.loja.modelo;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    public Categoria(){

    }
    public Categoria(String nome) {
        this.nome = nome;
    }
}
