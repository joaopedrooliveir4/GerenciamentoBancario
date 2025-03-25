package models;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private long cpf;
    private ArrayList<ContaBancaria> contas;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(ContaBancaria conta) {
        contas.remove(conta);
    }

    public void consultarConta(long numeroConta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroDaConta() == numeroConta) {
                System.out.println("Conta " + numeroConta + " encontrada com sucesso");
                return;
            }
        }
        System.out.println("Erro: Conta não encontrada");
    }
}