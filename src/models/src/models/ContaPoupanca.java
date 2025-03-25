package models;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(long numeroDaConta, String titular, double saldo) {
        super(numeroDaConta, titular, saldo, "Poupança");
    }
}