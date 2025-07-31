package com.example;

public abstract class ATM {
    public final ATM nextAtm;

    public ATM(ATM nextAtm) {
        this.nextAtm = nextAtm;
    }

    public abstract void dispense(WithdrawalRequest request);

}
