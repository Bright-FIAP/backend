package br.com.fiap.chefbotapi.model;

import java.time.LocalDateTime;

public class Usuario {

    //TODO atributos
    // id : long
    //nome : String
    //email : String
    //senha : String
    //uf : String
    //ingredientes : List
    //dataCadastro : LocalDateTime
    //status : boolean

    private long id;

    private String email;

    private String senha;

    private String uf;

    private Ingrediente ingredientes;

    private LocalDateTime dataCadastro;

    private boolean status;

    public Usuario() {
    }

    public Usuario(String email, String senha, String uf, Ingrediente ingredientes) {
        this.email = email;
        this.senha = senha;
        this.uf = uf;
        this.ingredientes = ingredientes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Ingrediente getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente ingredientes) {
        this.ingredientes = ingredientes;
    }

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
