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
        leitor.close();
    }
}