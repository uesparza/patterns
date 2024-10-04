package com.java.pattern.Design.adapter;

public class WineInGallonsImpClass extends WineInLitres implements WineInGallonsInterface {

   public Wine purchaseWineInGallons(double quantityInGallons) {
        double quantityInLitres = convertGallonsToLiters(quantityInGallons);
        return purchaseWine(quantityInLitres);
    }

    private double convertGallonsToLiters(double gallonQuantity) {
        return gallonQuantity * 3.78541;
    }
}
