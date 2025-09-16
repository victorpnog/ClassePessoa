package com.classePessoa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PessoaService {

    private List<Pessoa> pessoas;

    public PessoaService() {
        this.pessoas = new ArrayList<>();
    }

    // Adicionar uma pessoa (cadastrar)
    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    // Buscar pessoa por ID
    public Optional<Pessoa> buscarPorId(Long id) {
        return pessoas.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    // Listar todas as pessoas
    public List<Pessoa> listarTodas() {
        return new ArrayList<>(pessoas);
    }

    // Atualizar pessoa - exemplo simples (substitui pelo id)
    public boolean atualizarPessoa(Pessoa pessoaAtualizada) {
        Optional<Pessoa> optPessoa = buscarPorId(pessoaAtualizada.getId());
        if (optPessoa.isPresent()) {
            Pessoa pessoaAtual = optPessoa.get();
            int idx = pessoas.indexOf(pessoaAtual);
            pessoas.set(idx, pessoaAtualizada);
            return true;
        }
        return false;
    }

    // Remover pessoa por id
    public boolean removerPorId(Long id) {
        return pessoas.removeIf(p -> p.getId().equals(id));
    }
}
