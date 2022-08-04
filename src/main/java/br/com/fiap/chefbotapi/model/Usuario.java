package br.com.fiap.chefbotapi.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_usuario")
@SequenceGenerator(name = "usuario", sequenceName = "SQ_TB_USUARIO", allocationSize = 1)
public class Usuario {

    @Id
    @GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
    @Column(name = "cd_usuario")
    private long id;

    @Column(name = "nm_usuario", nullable = false, length = 55)
    private String nome;

    @Column(name = "ds_email", nullable = false, length = 40)
    private String email;

    @Column(name = "ds_senha", nullable = false)
    private String senha;

    @Column(name = "ds_uf", length = 19)
    private String uf;

    //TODO criar classe Ingrediente
    //TODO setar relacionamento
//    private Ingrediente ingredientes;

    @Column(name = "dt_cadastro")
    private LocalDateTime dataCadastro;

    @Column(name = "st_usuario")
    @Value("${true}")
    private boolean status;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, String uf) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.uf = uf;
//        this.ingredientes = ingredientes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

//    public Ingrediente getIngredientes() {
//        return ingredientes;
//    }
//
//    public void setIngredientes(Ingrediente ingredientes) {
//        this.ingredientes = ingredientes;
//    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
