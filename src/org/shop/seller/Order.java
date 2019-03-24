package org.shop.seller;

import org.shop.customer.Customer;

import java.util.Map;

public class Order {

   private Customer customer;
    private Map<Product, Integer> orderMap;

    public Order(Customer customer, Map<Product, Integer> orderMap) {
        this.customer = customer;
        this.orderMap = orderMap;
    }

    public Map<Product, Integer> getOrderMap() {
        return orderMap;
    }

    public Customer getCustomer() {
        return customer;
    }
}
