package org.shop.customer;

import java.util.Objects;

public class Customer {

    private String phoneNumber;
    private String customerName;
    private double money;



    public Customer(String phoneNumber, String customerName, Double money) {
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.money = money;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getMoney() {
        return money;
    }

    public  void pay(String phoneNumber, String customerName, Double money){

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Customer customer = (Customer) object;

        if (!phoneNumber.equals(customer.phoneNumber)) return false;
        return customerName.equals(customer.customerName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

}

