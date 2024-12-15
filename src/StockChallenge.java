import stock.Product;

import java.util.Locale;
import java.util.Scanner;

public class StockChallenge {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product data: ");
        System.out.print("Enter product name: ");
        String name = sc.next();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        //Product product = new Product(name, price, quantity);

        System.out.printf("Product data: %s, $ %.2f, %s units, Total: $ %.2f%n",
                product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.printf("Update data: %s, $ %.2f, %s units, Total: $ %.2f%n",
                product.name, product.price, product.quantity, product.totalValueInStock());

        System.out.print("Enter the number of products to be removed in stock: ");
        product.removeProducts(sc.nextInt());

        System.out.printf("Update data: %s, $ %.2f, %s units, Total: $ %.2f%n",
                product.name, product.price, product.quantity, product.totalValueInStock());

        sc.close();


    }
}
