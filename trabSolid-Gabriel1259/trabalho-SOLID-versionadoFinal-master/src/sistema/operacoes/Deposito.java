package sistema.operacoes;

import sistema.conta.Conta;


public class Deposito {


    public static boolean efetuarDeposito(Conta conta, double valor, int senha) {

        if(conta.getSenha() == senha && valor > 0) {

            conta.setSaldo(conta.getSaldo() + valor);

            return true;
        }

        return false;
    }
}
