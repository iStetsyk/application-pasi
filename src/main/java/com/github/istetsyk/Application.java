package com.github.istetsyk;


public class Application {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();
        Giveaway giveaway = new Giveaway();
        CashDesk cashDesk = new CashDesk();

        Manager manager = new Manager(cashDesk, kitchen,giveaway);

        kitchen.setManager(manager);
        giveaway.setManager(manager);
        cashDesk.setManager(manager);
    }
}
