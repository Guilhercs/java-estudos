import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {

//        sintaxe/regra
//        for(inicio; condição; incremento){
//            comando 1
//            comando 2
//        }

       Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i < N; i++) {
//            int x = sc.nextInt();
//            sum += x;
//        }
//
//        System.out.println(sum);


        int myNumber = sc.nextInt();

        for(int i = 0; i < myNumber; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}
