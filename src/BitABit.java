import java.util.Scanner;

public class BitABit {
    public static void main(String[] args) {

/*
                (89) 0101 1001  &: 0001 1000 (24)
                (60) 0011 1100  |: 0111 1101 (125)
                                ^: 0110 0101 (101)
*/

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2); // 24
        System.out.println(n1 | n2); // 125
        System.out.println(n1 ^ n2); // 101

        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }

        sc.close();
    }
}
