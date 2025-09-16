package com.classePessoa.domain;

public abstract class Documento {
    private String numero;

    public Documento() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
