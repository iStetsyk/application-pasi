package com.github.istetsyk;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();
        Giveaway giveaway = new Giveaway();
        CashDesk cashDesk = new CashDesk();

        Manager manager = new Manager(cashDesk, kitchen,giveaway);

        kitchen.setManager(manager);
        giveaway.setManager(manager);
        cashDesk.setManager(manager);

        String input = JOptionPane.showInputDialog("Co chcesz zamówić?");
        System.out.println(input);

        try {
            FoodType zielsko = FoodType.valueOf(input);
            System.out.println(zielsko.getPreparationDurationMillis());
        } catch (IllegalArgumentException e) {
            System.out.println("Takie danie nie istnieje!");
        }

        for (FoodType value : FoodType.values()) {
            System.out.println(value);
        }
    }
}