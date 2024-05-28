package org.example.strategy;

public class PaypalStrategy implements PaymentStrategy{

    private String emailID;
    private String password;
    @Override
    public void pay(int amount) {
        System.out.println("Email: " + emailID + " has paid: " + amount);
    }

    public PaypalStrategy(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }
}
