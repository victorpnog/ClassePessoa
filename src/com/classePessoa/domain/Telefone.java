package com.classePessoa.domain;

public class Telefone extends Contato {
    private String codigoPais;
    private String ddd;

    public Telefone() {
        super();
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return "[Telefone: " + getDescricao() +
                ", Principal: " + isPrincipal() +
                ", Código País: " + codigoPais +
                ", DDD: " + ddd + "]";
    }

}
