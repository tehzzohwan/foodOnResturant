package com.food.on;


import java.util.Scanner;


public class CheckOutOrder {
    static int pricePerOrder = 25;
    static boolean reviewComplete = false;

    static Scanner orderInput = new Scanner(System.in);

    public static void reviewOrder() {
        PlaceOrder.order.add("Done");

        System.out.println("---You can review your order ---");
        editOrder();
        System.out.print("How many units will you like to order: ");
        int orderUnit = orderInput.nextInt();
        getOrderBill(orderUnit);
    }

    public static void editOrder() {
        while (!reviewComplete) {
            for (int orderIndex = 0; orderIndex < PlaceOrder.order.size(); orderIndex++) {
                System.out.println(orderIndex + 1 + ". " + PlaceOrder.order.get(orderIndex));
            }

            System.out.print("Select a number to edit your order item: ");
            int orderEdit = orderInput.nextInt();

            if (orderEdit == 1) {
                resetMealMenu();
            } else if (orderEdit == 2 || orderEdit == 3) {
                resetSidesMenu();
            } else if (orderEdit == 4) {
                resetDrinksMenu();
            } else {
                reviewComplete = true;
            }
        }
    };

    public static void getOrderBill(int orderUnit) {
        System.out.println("You ordered " + orderUnit + " units of: ");
        for (int orderIndex = 0; orderIndex < PlaceOrder.order.size(); orderIndex++) {
            System.out.println(orderIndex + 1 + ". " + PlaceOrder.order.get(orderIndex));
        }
        System.out.println("Total bill: $" + pricePerOrder * orderUnit);
        System.out.println("How do you want to pay? ");
        System.out.println("1. Cash \n2. Transfer");
        Scanner getPaymentType = new Scanner(System.in);
        int paymentType = getPaymentType.nextInt();
        if (paymentType == 1) {
             PlaceOrder.orderSummary();
            System.out.println("Your bill is: $" + pricePerOrder * orderUnit);
        } else {
            System.out.println("Bank: Opay. \n Name: FoodOn Restaurant. \nAccount number: 9099111234.");
            PlaceOrder.orderSummary();
            System.out.println("Your bill is: $" + pricePerOrder * orderUnit);
        }


    }

    public static void resetMealMenu() {
        System.out.println("--- Meal Menu ---");
        for (int i = 0; i < PlaceOrder.mealMenu.length; i++) {
            System.out.println(i + 1 + ". " + PlaceOrder.mealMenu[i]);
        }
        System.out.print("Select a meal of your choice: ");
        int selectedMealChoice = PlaceOrder.orderInput.nextInt();

        switch (selectedMealChoice) {
            case 1:
                PlaceOrder.order.set(0, PlaceOrder.mealMenu[0]);
                System.out.println(PlaceOrder.mealMenu[0] + " has been added to your order");
                break;
            case 2:
                PlaceOrder.order.set(0, PlaceOrder.mealMenu[1]);
                System.out.println(PlaceOrder.mealMenu[1] + " has been added to your order");
                break;
            case 3:
                PlaceOrder.order.set(0, PlaceOrder.mealMenu[2]);
                System.out.println(PlaceOrder.mealMenu[2] + " has been added to your order");
                break;
            case 4:
                PlaceOrder.order.set(0, PlaceOrder.mealMenu[3]);
                System.out.println(PlaceOrder.mealMenu[3] + " has been added to your order");
                break;
            case 5:
                PlaceOrder.order.set(0, PlaceOrder.mealMenu[4]);
                System.out.println(PlaceOrder.mealMenu[4] + " has been added to your order");
                break;
            case 6:
                PlaceOrder.order.set(0, PlaceOrder.mealMenu[5]);
                System.out.println(PlaceOrder.mealMenu[5] + " has been added to your order");
                break;
            case 7:
                PlaceOrder.order.set(0, PlaceOrder.mealMenu[6]);
                System.out.println(PlaceOrder.mealMenu[6] + " has been added to your order");
                break;
            default:
                System.out.println("Sorry no menu with that number");
        }
    }

    public static void resetSidesMenu() {
        System.out.println("--- Sides and Protein menu ---");
        System.out.println(">>> Select your protein first then your sides");

        for (int i = 0; i < PlaceOrder.sidesMenu.length; i++) {
            System.out.println(i + 1 + ". " + PlaceOrder.sidesMenu[i]);
        }
        System.out.print("Select a side dish / protein of your choice: ");
        int selectedSidesChoice = PlaceOrder.orderInput.nextInt();

        switch (selectedSidesChoice) {
            case 1:
                PlaceOrder.order.set(1, PlaceOrder.sidesMenu[0]);
                System.out.println(PlaceOrder.sidesMenu[0] + " has been added to your order");
                break;
            case 2:
                PlaceOrder.order.set(1, PlaceOrder.sidesMenu[1]);
                System.out.println(PlaceOrder.sidesMenu[1] + " has been added to your order");
                break;
            case 3:
                PlaceOrder.order.set(1, PlaceOrder.sidesMenu[2]);
                System.out.println(PlaceOrder.sidesMenu[2] + " has been added to your order");
                break;
            case 4:
                PlaceOrder.order.set(2, PlaceOrder.sidesMenu[3]);
                System.out.println(PlaceOrder.sidesMenu[3] + " has been added to your order");
                break;
            case 5:
                PlaceOrder.order.set(2, PlaceOrder.sidesMenu[4]);
                System.out.println(PlaceOrder.sidesMenu[4] + " has been added to your order");
                break;
            case 6:
                PlaceOrder.order.set(2, PlaceOrder.sidesMenu[5]);
                System.out.println(PlaceOrder.sidesMenu[5] + " has been added to your order");
                break;
            case 7:
                PlaceOrder.order.set(2, PlaceOrder.sidesMenu[6]);
                System.out.println(PlaceOrder.sidesMenu[6] + " has been added to your order");
                break;
            case 8:
                PlaceOrder.doneWithSidesMenu = 0;
                break;
            default:
                System.out.println("Sorry no menu with that number");
        }
    }

    public static void resetDrinksMenu() {
        System.out.println("--- Drinks Menu ---");

        for (int i = 0; i < PlaceOrder.drinksMenu.length; i++) {
            System.out.println(i + 1 + ". " + PlaceOrder.drinksMenu[i]);
        }
        System.out.print("Select a drink of your choice: ");
        int selectedDrinksChoice = PlaceOrder.orderInput.nextInt();

        switch (selectedDrinksChoice) {
            case 1:
                PlaceOrder.order.set(3, PlaceOrder.drinksMenu[0]);
                System.out.println(PlaceOrder.drinksMenu[0] + " has been added to your order");
                break;
            case 2:
                PlaceOrder.order.set(3, PlaceOrder.drinksMenu[1]);
                System.out.println(PlaceOrder.drinksMenu[1] + " has been added to your order");
                break;
            case 3:
                PlaceOrder.order.set(3, PlaceOrder.drinksMenu[2]);
                System.out.println(PlaceOrder.drinksMenu[2] + " has been added to your order");
                break;
            case 4:
                PlaceOrder.order.set(3, PlaceOrder.drinksMenu[3]);
                System.out.println(PlaceOrder.drinksMenu[3] + " has been added to your order");
                break;
            case 5:
                PlaceOrder.order.set(3, PlaceOrder.drinksMenu[4]);
                System.out.println(PlaceOrder.drinksMenu[4] + " has been added to your order");
                break;
            case 6:
                PlaceOrder.order.set(3, PlaceOrder.drinksMenu[5]);
                System.out.println(PlaceOrder.drinksMenu[5] + " has been added to your order");
                break;
            case 7:
                PlaceOrder.order.set(3, PlaceOrder.drinksMenu[6]);
                System.out.println(PlaceOrder.drinksMenu[6] + " has been added to your order");
                break;
            default:
                System.out.println("Sorry no menu with that number");
        }
    }

}
