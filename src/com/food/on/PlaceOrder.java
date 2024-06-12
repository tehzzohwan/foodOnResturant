package com.food.on;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaceOrder extends Registration {
    static String[] mealMenu = {"Pelcasan rice", "Stir fry", "Jollof rice", "Fried rice", "Yam porridge", "Beans", "Coconut Rice"};
    static String[] sidesMenu = {"Salad", "Moi-moi", "Vegies", "Chicken", "Beef", "Goat meat", "Fish", "Back <"};
    static String[] drinksMenu = {"Champman", "Coke", "Pepsi", "Malt", "Water", "Juice", "Ice cream"};

    static ArrayList<String> order = new ArrayList<String>();

    static Scanner orderInput = new Scanner(System.in);
    static int doneWithSidesMenu = 2;


    public PlaceOrder(String name, String phoneNumber, String address) {
        super(name, phoneNumber, address);
    }

    public static void selectOrder() {
        boolean doneWithSelection = false;

        System.out.println("What are you ordering today " + Registration.getName() + "?");
        while (!doneWithSelection) {
            System.out.println("--- Main menu --- \n1. Meal menu \n2. Drinks menu \n3. Exit");
            System.out.print("Select a number: ");
            int selectedMenu = orderInput.nextInt();

            if (selectedMenu == 1) {

                System.out.println("First select your meal: ");
                setMealMenu();
                System.out.println("Now let's select your sides: ");
                while (doneWithSidesMenu > 0) {
                    setSidesMenu();
                    doneWithSidesMenu --;
                }
                System.out.println("Lastly your drinks: ");
                setDrinksMenu();
                System.out.println(PlaceOrder.getName() + " your order is ready");
                orderSummary();
                doneWithSelection = true;
            } else if (selectedMenu == 2) {
                setDrinksMenu();
            } else if (selectedMenu == 3) {
                if (order.isEmpty()) {
                    System.out.println("Your order is empty");
                    System.out.println("Are you sure you want to exit (y / n)");
                    String exitResponse = orderInput.nextLine();
                    if (exitResponse.equals("n")) {
                        return;
                    } else {
                        doneWithSelection = true;
                    }
                } else {
                    System.out.println(Registration.getName() + " your order is ready");
                    doneWithSelection = true;
                }
            }
        }
    }

    public static void setMealMenu() {
        System.out.println("--- Meal Menu ---");
        for (int i = 0; i < mealMenu.length; i++) {
            System.out.println(i + 1 + "." + " " + mealMenu[i]);
        }
        System.out.print("Select a meal of your choice: ");
        int selectedMealChoice = orderInput.nextInt();

        switch (selectedMealChoice) {
            case 1:
                order.add(mealMenu[0]);
                System.out.println(mealMenu[0] + " has been added to your order");
                break;
            case 2:
                order.add(mealMenu[1]);
                System.out.println(mealMenu[1] + " has been added to your order");
                break;
            case 3:
                order.add(mealMenu[2]);
                System.out.println(mealMenu[2] + " has been added to your order");
                break;
            case 4:
                order.add(mealMenu[3]);
                System.out.println(mealMenu[3] + " has been added to your order");
                break;
            case 5:
                order.add(mealMenu[4]);
                System.out.println(mealMenu[4] + " has been added to your order");
                break;
            case 6:
                order.add(mealMenu[5]);
                System.out.println(mealMenu[5] + " has been added to your order");
                break;
            case 7:
                order.add(mealMenu[6]);
                System.out.println(mealMenu[6] + " has been added to your order");
                break;
            default:
                System.out.println("Sorry no menu with that number");
        }
    }

    public static void setSidesMenu() {
        System.out.println("--- Sides and Protein menu ---");
        System.out.println(">>> Select your protein first then your sides");

        for (int i = 0; i < sidesMenu.length; i++) {
            System.out.println(i + 1 + " " + sidesMenu[i]);
        }
        System.out.print("Select a side dish / protein of your choice: ");
        int selectedMealChoice = orderInput.nextInt();

        switch (selectedMealChoice) {
            case 1:
                order.add(sidesMenu[0]);
                System.out.println(sidesMenu[0] + " has been added to your order");
                break;
            case 2:
                order.add(sidesMenu[1]);
                System.out.println(sidesMenu[1] + " has been added to your order");
                break;
            case 3:
                order.add(sidesMenu[2]);
                System.out.println(sidesMenu[2] + " has been added to your order");
                break;
            case 4:
                order.add(sidesMenu[3]);
                System.out.println(sidesMenu[3] + " has been added to your order");
                break;
            case 5:
                order.add(sidesMenu[4]);
                System.out.println(sidesMenu[4] + " has been added to your order");
                break;
            case 6:
                order.add(sidesMenu[5]);
                System.out.println(sidesMenu[5] + " has been added to your order");
                break;
            case 7:
                order.add(sidesMenu[6]);
                System.out.println(sidesMenu[6] + " has been added to your order");
                break;
            case 8:
                doneWithSidesMenu = 0;
                break;
            default:
                System.out.println("Sorry no menu with that number");
        }
    }

    public static void setDrinksMenu() {
        System.out.println("--- Drinks Menu ---");

        for (int i = 0; i < drinksMenu.length; i++) {
            System.out.println(i + 1 + " " + drinksMenu[i]);
        }
        System.out.print("Select a drink of your choice: ");
        int selectedMealChoice = orderInput.nextInt();

        switch (selectedMealChoice) {
            case 1:
                order.add(drinksMenu[0]);
                System.out.println(drinksMenu[0] + " has been added to your order");
                break;
            case 2:
                order.add(drinksMenu[1]);
                System.out.println(drinksMenu[1] + " has been added to your order");
                break;
            case 3:
                order.add(drinksMenu[2]);
                System.out.println(drinksMenu[2] + " has been added to your order");
                break;
            case 4:
                order.add(drinksMenu[3]);
                System.out.println(drinksMenu[3] + " has been added to your order");
                break;
            case 5:
                order.add(drinksMenu[4]);
                System.out.println(drinksMenu[4] + " has been added to your order");
                break;
            case 6:
                order.add(drinksMenu[5]);
                System.out.println(drinksMenu[5] + " has been added to your order");
                break;
            case 7:
                order.add(drinksMenu[6]);
                System.out.println(drinksMenu[6] + " has been added to your order");
                break;
            default:
                System.out.println("Sorry no menu with that number");
        }
    }

    public static void orderSummary() {
        if (order.size() == 3) {
            System.out.println("You ordered one portion of " + order.get(0) + " with " + order.get(1) + " and one " + order.get(2));
        } else if (order.size() == 4) {
            System.out.println("You ordered one portion of " + order.get(0) + " with " + order.get(1) + ", " + order.get(2) + " and one " + order.get(3));
        }
    }
}
