package com.company;

public abstract class Payment {
    protected int PaymentAmount;
    int PaymentID;

    public abstract void pay();
    public abstract void printTransferConfirmation();


}
