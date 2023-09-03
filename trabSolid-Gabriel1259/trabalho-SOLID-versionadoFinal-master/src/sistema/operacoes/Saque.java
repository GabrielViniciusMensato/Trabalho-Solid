package sistema.operacoes;

import sistema.conta.Conta;

public class Saque {
    public static boolean efetuarSaque(Conta conta, double valor, int senha) {

        if (conta.getSenha() == senha && valor > 0 && conta.getSaldo() >= valor) {

            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        }
        return false;
    }
}

