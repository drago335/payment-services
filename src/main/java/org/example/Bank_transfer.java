package org.example;

public class Bank_transfer implements Payment_methods{
    @Override
    public void proccessMethods(String userId, double amount){
        System.out.println("Bank transfer - " + userId + ":" + amount);
    }
}
