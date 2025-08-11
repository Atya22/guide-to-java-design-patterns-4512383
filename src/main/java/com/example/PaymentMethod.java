package com.example;

public interface PaymentMethod {
    void payment();

    PaymentMethod payWithCard = () ->
            System.out.println("Payment made with card");

    PaymentMethod payByBankTransfer = () ->
            System.out.println("Payment made by bank transfer");
}
