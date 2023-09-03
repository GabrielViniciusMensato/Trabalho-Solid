package sistema.conta;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente, int agencia, int senha) {
        super(cliente, agencia, senha);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser positivo");
        }
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        setSaldo(getSaldo() - valor);
    }
}
