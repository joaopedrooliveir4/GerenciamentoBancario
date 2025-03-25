package models;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(long numeroDaConta, String titular, double saldo) {
        super(numeroDaConta, titular, saldo, "Corrente");
    }
}