package com.java.pattern.Design.adapter;

public class Client {

    public static void main(String[] args) {
        WineInGallonsInterface adapterInterfaceClass = new WineInGallonsImpClass();
        adapterInterfaceClass.purchaseWineInGallons(10);
    }


}
