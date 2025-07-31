package com.example;

public class EuroATM extends ATM {

    public EuroATM(ATM nextAtm) {
        super(nextAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        var currency = request.getCurrency();
        if (currency == WithdrawalRequest.Currency.EUR) {
            System.out.println("Dispensing €" + request.getAmount());
        } else if (currency != null) {
            nextAtm.dispense(request);
        }
    }
}
