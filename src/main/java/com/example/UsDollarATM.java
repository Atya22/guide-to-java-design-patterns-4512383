package com.example;

public class UsDollarATM extends ATM {

    public UsDollarATM(ATM nextAtm) {
        super(nextAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        var currency = request.getCurrency();
        if (currency == WithdrawalRequest.Currency.USD) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (currency != null) {
            nextAtm.dispense(request);
        }
    }


}
