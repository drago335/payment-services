package org.example;

public class Credit_card implements Payment_methods{
    @Override
    public void proccessMethods(String userId, double amount){
        System.out.println("Pay with credit card - " + userId + ":" + amount);
    }
}
