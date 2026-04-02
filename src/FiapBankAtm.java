import java.util.Scanner;

public class FiapBankAtm {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 0.0;

        // Tela de inicial
        System.out.println("=== Bem-vindo ao FIAP Bank ===");
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = leitor.nextLine().trim();

        // Extraindo o primeiro nome
        String primeiroNome = nomeCompleto.split(" ")[0];
        System.out.println("Olá, " + primeiroNome + "! Vamos configurar sua segurança.");

        // Cadastro de Senha Forte
        String senhaCadastrada;
        String regexSenha = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*()\\-_+=?><]).{8,}$";

        while (true) {
            System.out.print("Cadastre uma senha forte: ");
            senhaCadastrada = leitor.nextLine();

            if (senhaCadastrada.matches(regexSenha)) {
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } else {
                System.out.println("Senha fraca! A senha deve ter 8+ caracteres, número, letra maiúscula e caractere especial.");
            }
        }
        // Autenticação (Login)
        int tentativas = 0;
        boolean autenticado = false;

        while (tentativas < 3) {
            System.out.print("\nDigite sua senha para acessar o terminal da ATM: ");
            String senhaLogin = leitor.nextLine();

            if (senhaLogin.equals(senhaCadastrada)) {
                autenticado = true;
                break;
            } else {
                tentativas++;
                System.out.println("Senha incorreta! Tentativa " + tentativas + " de 3.");
            }
        }

        if (!autenticado) {
            System.out.println("ACESSO BLOQUEADO");
            leitor.close();
            return;
        }
        // Menu Principal da ATM
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("[ 1 ] Consultar Saldo");
            System.out.println("[ 2 ] Fazer Depósito");
            System.out.println("[ 3 ] Fazer Saque");
            System.out.println("[ 4 ] Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.print("Valor do depósito: R$ ");
                    double valorDeposito = leitor.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Erro: Valor de depósito deve ser positivo.");
                    }
                    break;

                case 3:
                    System.out.print("Valor do saque: R$ ");
                    double valorSaque = leitor.nextDouble();
                    if (valorSaque <= 0) {
                        System.out.println("Erro: Valor de saque inválido.");
                    } else if (valorSaque > saldo) {
                        System.out.println("Erro: Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 4:
                    System.out.println("O FIAP Bank agradece sua preferência!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        leitor.close();
    }
}