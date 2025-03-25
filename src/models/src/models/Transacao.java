package models;

import java.time.LocalDate;

public class Transacao {
    private String tipo;
    private double valor;
    private LocalDate data;
    private ContaBancaria contaOrigem;
    private ContaBancaria contaDestino;

    public Transacao(String tipo, double valor, LocalDate data, ContaBancaria contaOrigem, ContaBancaria contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public ContaBancaria getContaOrigem() {
        return contaOrigem;
    }

    public ContaBancaria getContaDestino() {
        return contaDestino;
    }

    public void exibirDetalhes() {
        System.out.println("Transação: " + tipo + " | Valor: R$ " + valor + " | Data: " + data +
                " | Origem: " + (contaOrigem != null ? contaOrigem.getNumeroDaConta() : "N/A") +
                " | Destino: " + (contaDestino != null ? contaDestino.getNumeroDaConta() : "N/A"));
    }
}