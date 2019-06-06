package com.github.istetsyk;

public class Manager {

    private CashDesk cashDesk;
    private Kitchen kitchen;
    private Giveaway giveaway;

    public Manager(CashDesk cashDesk, Kitchen kitchen, Giveaway giveaway) {
        this.cashDesk = cashDesk;
        this.kitchen = kitchen;
        this.giveaway = giveaway;
    }

    public void newOrder(String orderName){
        Beeper beeper = new Beeper(orderName);
        prepareMeal(beeper);
    }

    public void prepareMeal(Beeper beeper) {
        kitchen.prepareMeal(beeper);
    }

    public  void mealReady(Beeper beeper) {

    }

    public void callCustomer(Beeper beeper) {

    }

    public void customerCollectedOrder(Beeper beeper) {

    }
}