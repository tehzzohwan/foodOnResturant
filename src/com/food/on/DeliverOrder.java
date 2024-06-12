package com.food.on;

import java.util.Scanner;

public class DeliverOrder {

    public static void confirmAddress() {
        System.out.println("Confirm your address");
        System.out.println(PlaceOrder.getAddress());
        System.out.println("Is this your address? (y/n): ");
        Scanner confirmAddress = new Scanner(System.in);
        String addressReply = confirmAddress.nextLine();
        if (addressReply.equals("y")) {
            System.out.println(PlaceOrder.getName() + " your order is on it's way to " + PlaceOrder.getAddress());
            System.out.println("Bon' appetite, see you on the next order");
        } else {
            System.out.println("Input a new address: ");
            String newAddress = confirmAddress.nextLine();
            PlaceOrder.setAddress(newAddress);
            System.out.println(PlaceOrder.getName() + " your order is on it's way to " + PlaceOrder.getAddress());
            System.out.println("Bon' appetite, see you on the next order");
        }
    }
}
