import stock.Product;

import java.util.Locale;
import java.util.Scanner;

public class StockChallenge {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product stock;
        stock = new Product();

        System.out.print("Enter product data: ");
        System.out.print("Enter product name: ");
        stock.name = sc.next();
        System.out.print("Enter product price: ");
        stock.price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        stock.quantity = sc.nextInt();

        System.out.printf("Product data: %s, $ %.2f, %s units, Total: $ %.2f%n", stock.name, stock.price, stock.quantity, stock.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        stock.addProducts(sc.nextInt());

        System.out.printf("Update data: %s, $ %.2f, %s units, Total: $ %.2f%n", stock.name, stock.price, stock.quantity, stock.totalValueInStock());

        System.out.print("Enter the number of products to be removed in stock: ");
        stock.removeProducts(sc.nextInt());

        System.out.printf("Update data: %s, $ %.2f, %s units, Total: $ %.2f%n", stock.name, stock.price, stock.quantity, stock.totalValueInStock());

        sc.close();


    }
}
