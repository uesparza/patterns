package com.java.pattern.Design.adapter;

public class Wine {

    private double winePrice;

    public Wine(double quantityLitres) {
        this.winePrice = quantityLitres * 19.99;
        System.out.println("Your wine order today is: " + winePrice + " dollars");
        System.out.println("Thank-you for your purchase!");
    }
}
