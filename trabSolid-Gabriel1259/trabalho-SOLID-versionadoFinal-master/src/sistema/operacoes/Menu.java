package sistema.operacoes;

import sistema.conta.Cliente;
import java.util.Scanner;


public class Menu {

    public void exibirMenu() {

        Scanner scanner = new Scanner(System.in);

        Banco banco = new Banco();


        while (true) {

            System.out.println("\n\nEscolha a opção que deseja:");
            System.out.println("1: Cadastrar Cliente Pessoa Física");
            System.out.println("2: Cadastrar uma Conta Corrente");
            System.out.println("3: Cadastrar uma Conta Poupança");
            System.out.println("4: Efetuar Depósito");
            System.out.println("5: Efetuar Saque");
            System.out.println("6: Efetuar Transferência");
            System.out.println("7: Exibir Saldo");
            System.out.println("0: Sair");
            System.out.print("insira:");


            int escolha = scanner.nextInt();


            switch (escolha) {
                case 1:
                    banco.cadastrarClientePessoaFisica();
                    break;
                case 2:

                    System.out.print("\n\nInforme o CPF do cliente para criar uma Conta Corrente:");
                    String cpfCorrente = scanner.next();
                    Cliente clienteCorrente = banco.getClientePorCpf(cpfCorrente);
                    if (clienteCorrente != null) {

                        System.out.print("Agência:");
                        int agenciaCorrente = scanner.nextInt();
                        banco.cadastrarContaCorrente(clienteCorrente, agenciaCorrente);
                    } else {
                        System.out.println("Sua conta não foi encontradada.");
                    }
                    break;

                case 3:

                    System.out.print("\n\nInforme o CPF do cliente para criar uma Conta Poupança:");
                    String cpfPoupanca = scanner.next();
                    Cliente clientePoupanca = banco.getClientePorCpf(cpfPoupanca);
                    if (clientePoupanca != null) {

                        System.out.print("Agência:");
                        int agenciaPoupanca = scanner.nextInt();
                        banco.cadastrarContaPoupanca(clientePoupanca, agenciaPoupanca);
                    } else {
                        System.out.println("Sua conta não foi encontrada.");
                    }
                    break;

                case 4:

                    banco.efetuarDeposito();
                    break;
                case 5:

                    banco.efetuarSaque();
                    break;
                case 6:

                    banco.efetuarTransferencia();
                    break;
                case 7:

                    banco.exibirSaldo();
                    break;
                case 0:

                    System.out.println("Saindo...");
                    System.exit(1);
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }
}
