package sistema.operacoes;

import sistema.conta.Conta;
public class Transferencia {

    public static boolean efetuarTransferencia(Conta origem, Conta destino, double valor, int senhaOrigem) {

        if (origem.getSenha() == senhaOrigem && valor > 0 && origem.getSaldo() >= valor) {

            Saque.efetuarSaque(origem, valor, senhaOrigem);

            Deposito.efetuarDeposito(destino, valor, destino.getSenha());
            return true;
        }
        return false;
    }
}
