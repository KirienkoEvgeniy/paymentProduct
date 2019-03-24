package org.shop.seller;


import java.util.Map;
import java.util.Set;

public class Seller {

    private String sellerName;
    private Map<Product, Integer> allProduct;

    public Seller(String sellerName, Map<Product, Integer> productMap) {
        this.sellerName = sellerName;
        this.allProduct = productMap;
    }

    public boolean checkOrder(Order order){
        Set<Product> productsOrder = order.getOrderMap().keySet();
        if (productsOrder.size() <= 0 ) return false;
        for (Product product : productsOrder) {
            if(!allProduct.containsKey(product))return false;
        }
        return true;
    }

    public boolean checkPay(Order order){
       Double orderPrice = 0.0;
        for (Product product : order.getOrderMap().keySet()) {
           orderPrice = orderPrice+ product.getPrice()*order.getOrderMap().get(product);
        }
        return  orderPrice <= order.getCustomer().getMoney();
    }

    public boolean sale(Order order){
        return checkOrder(order)  && checkPay(order) ;

    }

}
