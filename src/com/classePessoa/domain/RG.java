package com.classePessoa.domain;

public class RG extends Documento {

    private String dataEmissao;
    private String orgaoEmissor;

    public RG() {
        super();
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;

    }
    @Override
    public String toString() {
        return "[RG: " + getNumero() +
                ", Data Emissão: " + dataEmissao +
                ", Órgão Emissor: " + orgaoEmissor + "]";
    }


}
