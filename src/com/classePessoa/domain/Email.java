package com.classePessoa.domain;

public class Email extends Contato {
    private String tipo; // pessoal, trabalho, etc.

    public Email() {
        super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

