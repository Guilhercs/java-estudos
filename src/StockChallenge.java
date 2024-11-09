import stock.Product;

import java.util.Locale;
import java.util.Scanner;

public class StockChallenge {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Enter product data: ");
        System.out.print("Enter product name: ");
        product.name = sc.next();
        System.out.print("Enter product price: ");
        product.price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        product.quantity = sc.nextInt();

        System.out.printf("Product data: %s, $ %.2f, %s units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.printf("Update data: %s, $ %.2f, %s units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("Enter the number of products to be removed in stock: ");
        product.removeProducts(sc.nextInt());

        System.out.printf("Update data: %s, $ %.2f, %s units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());

        sc.close();


    }
}
