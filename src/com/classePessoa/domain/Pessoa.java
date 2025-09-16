package com.classePessoa.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {

    private Long id;
    private String nome;
    private TipoSanguineo tipoSanguineo;
    private Filiacao filiacao;

    private List<Endereco> enderecos;
    private List<Contato> contatos;
    private List<Documento> documentos;

    // Construtor padrão
    public Pessoa() {
        this.enderecos = new ArrayList<>();
        this.contatos = new ArrayList<>();
        this.documentos = new ArrayList<>();
    }

    // Construtor parametrizado
    public Pessoa(Long id, String nome, TipoSanguineo tipoSanguineo, Filiacao filiacao) {
        this();
        this.id = id;
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.filiacao = filiacao;
    }

    // Métodos para adicionar itens às listas
    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void adicionarDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    // toString para facilitar debug
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n========== Pessoa ==========\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Tipo Sanguíneo: ").append(tipoSanguineo).append("\n");
        sb.append("Filiação: ").append(filiacao).append("\n");

        sb.append("Endereços:\n");
        if (enderecos.isEmpty()) {
            sb.append("\t(Nenhum endereço cadastrado)\n");
        } else {
            for (Endereco end : enderecos) {
                sb.append("\t- ").append(end).append("\n");
            }
        }

        sb.append("Contatos:\n");
        if (contatos.isEmpty()) {
            sb.append("\t(Nenhum contato cadastrado)\n");
        } else {
            for (Contato contato : contatos) {
                sb.append("\t- ").append(contato).append("\n");
            }
        }

        sb.append("Documentos:\n");
        if (documentos.isEmpty()) {
            sb.append("\t(Nenhum documento cadastrado)\n");
        } else {
            for (Documento doc : documentos) {
                sb.append("\t- ").append(doc).append("\n");
            }
        }
        sb.append("============================\n");
        return sb.toString();
    }
}