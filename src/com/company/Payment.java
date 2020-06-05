package com.company;

public abstract class Payment {
    protected int PaymentAmount;
    int PaymentID;

    public abstract void pay();
    public abstract void printTransferConfirmation(); //which only can but need not be redefined in derived classes


}
