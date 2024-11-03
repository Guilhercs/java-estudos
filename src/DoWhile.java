import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char response;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double farenheit = (celsius * 9/5) + 32;
            System.out.printf("Equivalente em Farenheit: %.1f%n", farenheit);
            System.out.print("Deseja repetir (s/n)?");
            response = sc.next().charAt(0);
        } while (response != 'n');
        sc.close();

    }
}
