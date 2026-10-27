package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessorService {
    private final Payment_methods paymentMethod;

    public PaymentProcessorService(@Qualifier("creditCardPayment") Payment_methods paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void execute(String userId,double amount){

        paymentMethod.proccessMethods(userId, amount);
    }
}

