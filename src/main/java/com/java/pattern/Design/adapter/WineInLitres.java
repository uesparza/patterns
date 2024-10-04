package com.java.pattern.Design.adapter;

public class WineInLitres implements WineInLitresInterface {

    public Wine purchaseWine(double quantityInLitres) {
        System.out.println("Purchasing: " + quantityInLitres + " litres of wine");
        return new Wine(quantityInLitres);
    }
}
