import models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco();

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", 12345678900L);
        Cliente cliente2 = new Cliente("Maria Oliveira", 98765432100L);

        // Criando contas bancárias
        ContaBancaria conta1 = new ContaCorrente(1001L, "João Silva", 5000.0);
        ContaBancaria conta2 = new ContaPoupanca(2002L, "Maria Oliveira", 3000.0);

        // Adicionando contas aos clientes
        cliente1.adicionarConta(conta1);
        cliente2.adicionarConta(conta2);

        // Adicionando clientes ao banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Exibindo clientes cadastrados
        System.out.println("=== Clientes cadastrados no banco ===");
        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Nome: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        }

        // Buscando clientes e contas
        banco.buscarClientePorCpf(12345678900L); // CPF existente
        banco.buscarClientePorCpf(11111111111L); // CPF inexistente
        banco.buscarContaPorNumero(1001L);      // Conta existente
        banco.buscarContaPorNumero(9999L);      // Conta inexistente

        // Realizando operações bancárias
        conta1.depositar(1500.0);
        conta1.sacar(1000.0);
        conta1.transferir(2000.0, conta2);

        // Gerando extratos
        conta1.gerarExtrato();
        conta2.gerarExtrato();

        // Criando e exibindo uma transação
        Transacao transacao = new Transacao("Transferência", 2000.0, LocalDate.now(), conta1, conta2);
        transacao.exibirDetalhes();
    }
}