package br.com.fiap.chefbotapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.bytebuddy.utility.nullability.MaybeNull;

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

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonManagedReference
    private Usuario usuario;

    public Ingrediente(String nome, String tipo, Usuario usuario) {
        this.nome = nome;
        this.tipo = tipo;
        this.usuario = usuario;
    }

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
