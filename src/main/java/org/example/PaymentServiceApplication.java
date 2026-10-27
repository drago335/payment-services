package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PaymentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);

    }
    @Bean
    public CommandLineRunner run(PaymentProcessorService paymentProcessorService){
        return args -> {
            String userId = "USER-12345";
            double amount = 250.00;

            System.out.println("--- Testing payment threw Spring service ---");
            paymentProcessorService.execute(userId,amount);
        };
    }
}
