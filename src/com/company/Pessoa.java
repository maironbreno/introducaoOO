package com.company;

/**
 * Created by mairon.nunes on 08/03/2017.
 */
public class Pessoa {

    public String nome;
    public String email;
    public String numeroTelefone;

    public Pessoa() {

    }

    public Pessoa(String nome, String email, String numeroTelefone) {
        this.nome = nome;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String novoNumeroTelefone) {
        this.numeroTelefone = novoNumeroTelefone;
    }
}
