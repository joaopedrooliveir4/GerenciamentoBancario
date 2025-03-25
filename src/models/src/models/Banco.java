package models;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<ContaBancaria> contas;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void buscarClientePorCpf(long cpf) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf() == cpf) {
                System.out.println("CPF: " + cpf + " encontrado com sucesso");
                return;
            }
        }
        System.out.println("CPF: " + cpf + " não encontrado");
    }

    public void buscarContaPorNumero(long numeroConta) {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        for (ContaBancaria conta : contas) {
            if (conta.getNumeroDaConta() == numeroConta) {
                System.out.println("Conta: " + numeroConta + " encontrada com sucesso");
                return;
            }
        }

        System.out.println("Conta não encontrada");
    }
}