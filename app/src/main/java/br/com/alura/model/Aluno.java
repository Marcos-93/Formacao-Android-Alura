package br.com.alura.model;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable {
    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Aluno(String nome, String telefone, String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Aluno() { }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public boolean temIdValido() {
        return id > 0;
    }
}
