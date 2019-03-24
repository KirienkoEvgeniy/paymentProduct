import org.shop.customer.Customer;
import org.shop.seller.Order;
import org.shop.seller.Product;
import org.shop.seller.Seller;

import java.util.HashMap;
import java.util.Map;

public class InternetShopDemo {


    public static void main(String[] args) {

        Product product1 = new Product("product1", 100.0);
        Product product2 = new Product("product2", 300.0);

        Map<Product, Integer> testMap = new HashMap<>();
        testMap.put(product1, 2);
        testMap.put(product2, 5);

        Seller seller = new Seller("seller1", testMap);
        Customer customer1 = new Customer("0987654321", "customer1", 500.00);

        Map<Product, Integer> orderMap1 = new HashMap<>();
        orderMap1.put(product1, 1);
        orderMap1.put(product2, 3);

        Order order1 = new Order(customer1, orderMap1);

        System.out.println("Order1");
        if (seller.sale(order1) == true) {
            System.out.println("Was a successful deal -->  " + seller.sale(order1));
        } else System.out.println("Not this time");


        Map<Product, Integer> orderMap2 = new HashMap<>();
        orderMap2.put(product1, 1);
        orderMap2.put(product2, 1);
        Order order2 = new Order(customer1, orderMap2);

        System.out.println("Order2");
        if (seller.sale(order2) == true) {
            System.out.println("Was a successful deal -->  " + seller.sale(order2));
        } else System.out.println("Not this time");



    }
}
