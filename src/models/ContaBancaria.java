package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  abstract class ContaBancaria {
    private long numeroDaConta;
    private String titular;
    private double saldo;
    private String tipoDeConta;

    public ContaBancaria(long numeroDaConta, String titular, double saldo, String tipoDeConta) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoDeConta = tipoDeConta;
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void depositar(double valor) {
        this.saldo =+ valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insulficiente");
            return false;
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso para " + contaDestino.getTitular());
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void gerarExtrato() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("\n===== Extrato Bancário =====");
        System.out.println("Titular: " + titular);
        System.out.println("Data: " + agora.format(formato));
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("============================\n");
    }
}