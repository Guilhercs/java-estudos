import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int scPassword = sc.nextInt();

        int password = 2002;

        while (scPassword != password) {
            System.out.println("Senha inválida");
           scPassword = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}