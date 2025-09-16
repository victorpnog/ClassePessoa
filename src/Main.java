package com.classePessoa.domain;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService();

        // Criar filiação
        Filiacao filiacao = new Filiacao();
        filiacao.setNomePai("João Silva");
        filiacao.setNomeMae("Maria Silva");

        // Criar Pessoa Física
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setId(1L);
        pessoa.setNome("Carlos Alberto");
        pessoa.setTipoSanguineo(TipoSanguineo.A_POSITIVO);
        pessoa.setFiliacao(filiacao);
        pessoa.setDataNascimento(LocalDate.of(1990, 5, 15));
        pessoa.setCpf("123.456.789-00");
        pessoa.setRg("MG-12.345.678");

        // Criar endereço e adicionar
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Flores");
        endereco.setNumero("123");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep("01001-000");
        pessoa.adicionarEndereco(endereco);

        // Criar contato telefone e adicionar
        Telefone telefone = new Telefone();
        telefone.setDescricao("11 99999-8888");
        telefone.setPrincipal(true);
        telefone.setCodigoPais("+55");
        telefone.setDdd("11");
        pessoa.adicionarContato(telefone);

        // Criar documento CPF e adicionar
        CPF cpfDoc = new CPF();
        cpfDoc.setNumero("123.456.789-00");
        cpfDoc.setDataEmissao("01/01/2010");
        cpfDoc.setOrgaoEmissor("SSP");
        pessoa.adicionarDocumento(cpfDoc);

        // Adicionar pessoa no serviço
        pessoaService.adicionarPessoa(pessoa);

        // Buscar pessoa por id e imprimir
        pessoaService.buscarPorId(1L).ifPresent(System.out::println);

        // Listar todas as pessoas e imprimir
        System.out.println("Lista de todas as pessoas cadastradas:");
        pessoaService.listarTodas().forEach(System.out::println);
    }
}
