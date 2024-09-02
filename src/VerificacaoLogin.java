import java.util.Scanner;

public class VerificacaoLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "Gui";
        String senha = "gui1227";

        System.out.println("Digite seu usuario: ");
        String login = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String informesenha = sc.nextLine();
        if (login.equals(usuario) && informesenha.equals(senha)) {
            System.out.println("Login efetuado com sucesso!");
        }
        else {
            System.out.println("Usuário ou senha incorreta");
        }
    }
}
