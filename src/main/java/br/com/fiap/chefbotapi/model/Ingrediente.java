package br.com.fiap.chefbotapi.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_ingrediente")
@SequenceGenerator(name = "ingrediente", sequenceName = "SQ_TB_INGREDIENTE", allocationSize = 1)
public class Ingrediente {

    @Id
    @GeneratedValue(generator = "ingrediente", strategy = GenerationType.SEQUENCE)
    @Column(name = "cd_ingrediente")
    private long id;

    @Column(name = "nm_ingrediente", length = 55, nullable = false)
    private String nome;

    @Column(name = "st_ingrediente", length = 55)
    private String tipo;

//    @ManyToOne
//
//    private Usuario usuario;

    public Ingrediente() {}

    public Ingrediente(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
