package com.company;

public class Main {

    public static void main(String[] args) {
        String nome = "Mairon Breno";
        String email = "mairon.nunes@cg.df.gov.br";
        String telefone = "99999-9999";

	    Pessoa pessoaUm = new Pessoa();
	    pessoaUm.setNome(nome);
	    pessoaUm.setEmail(email);
	    pessoaUm.setNumeroTelefone(telefone);

	    System.out.println("Informações da Pessoa 1 - NOME: " + pessoaUm.getNome() + " - EMAIL: " + pessoaUm.getEmail() + " - TELEFONE: " + pessoaUm.getNumeroTelefone());

	    Pessoa pessoaDois = new Pessoa("Frederico", "frederico.fulano@teste.com", "96666-6666");

        System.out.println("Informações da Pessoa 2 - NOME: " + pessoaDois.getNome() + " - EMAIL: " + pessoaDois.getEmail() + " - TELEFONE: " + pessoaDois.getNumeroTelefone());
    }
}
