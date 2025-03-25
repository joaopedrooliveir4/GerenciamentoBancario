# Sistema Bancário em Java

Este é um sistema bancário simples desenvolvido em Java que permite gerenciar clientes, contas bancárias e realizar operações como saques, depósitos, transferências e consultas.

## 📌 Funcionalidades

- Cadastro de clientes e contas bancárias (Conta Corrente e Conta Poupança).
- Realizar saques, depósitos e transferências entre contas.
- Consultar clientes por CPF e contas por número.
- Gerar extrato bancário.

## 🛠️ Estrutura do Projeto

```
├── Main.java
└── models/
    ├── Banco.java
    ├── Cliente.java
    ├── ContaBancaria.java
    ├── ContaCorrente.java
    ├── ContaPoupanca.java
    └── Transacao.java
```

### 📂 models

- **Banco**: Gerencia a lista de clientes e contas.
- **Cliente**: Representa um cliente do banco, contendo suas informações pessoais e suas contas bancárias.
- **ContaBancaria**: Classe abstrata que define as operações comuns entre contas bancárias.
- **ContaCorrente**: Subclasse de `ContaBancaria`, específica para contas correntes.
- **ContaPoupanca**: Subclasse de `ContaBancaria`, específica para contas poupança.
- **Transacao**: Representa as operações realizadas (saque, depósito, transferência).

## ▶️ Executando o Projeto

1. Certifique-se de ter o **Java JDK 17+** instalado em sua máquina.

2. Compile os arquivos Java:

   ```bash
   javac Main.java models/*.java
   ```

3. Execute o programa:

   ```bash
   java Main
   ```

## 📊 Exemplo de Saída

```
=== Clientes cadastrados no banco ===
Nome: João Silva | CPF: 12345678900
Nome: Maria Oliveira | CPF: 98765432100

CPF: 12345678900 encontrado com sucesso
Conta: 1001 encontrada com sucesso
Saldo atual: R$ 1500.00
Transferência realizada com sucesso!
```

## ✅ Melhorias Futuras

- Implementar autenticação de clientes.
- Adicionar persistência de dados (salvar em arquivos ou banco de dados).
- Melhorar a interface de interação com o usuário.

## 📚 Requisitos

- Java 17+
- IDE de sua preferência (IntelliJ, Eclipse, VSCode) ou terminal com `javac` e `java`.

## 📃 Licença

Este projeto é de livre utilização para estudos e aprimoramento. 🚀

