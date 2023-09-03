package sistema.conta;

import java.util.Random;


public class Conta {

    protected Cliente cliente;
    protected int agencia;
    protected int numeroConta;
    protected int senha;
    protected double saldo;


    public Conta(Cliente cliente, int agencia, int senha) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numeroConta = new Random().nextInt(9999);
        this.senha = senha;
        this.saldo = 0;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo!");
        }
        this.saldo += valor;
    }


    public boolean efetuarDeposito(double valor, int senha) {
        if (valor < 0 || this.senha != senha) {
            return false;
        }
        this.saldo += valor;
        return true;
    }


    public boolean efetuarSaque(double valor, int senha) {
        if (valor < 0 || this.senha != senha || this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }


    public boolean efetuarTransferencia(Conta destino, double valor, int senha) {
        if (valor < 0 || this.senha != senha || this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        destino.saldo += valor;
        return true;
    }


    public void sacar(double valor) {

    }
}
