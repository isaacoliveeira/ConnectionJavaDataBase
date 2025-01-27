package com.example;

public class User {
    private int id;
    private String nome;
    private String sobrenome;

    public User(int id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public User(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", nome='" + nome + "', sobrenome='" + sobrenome + "'}";
    }
}
