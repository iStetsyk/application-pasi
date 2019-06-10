package com.github.istetsyk;

public class Giveaway {

    private Manager manager;

    public void callCustomer(Beeper beeper) {
        customerCollectedOrder(beeper);
    }

    public void customerCollectedOrder(Beeper beeper) {
        manager.customerCollectedOrder(beeper);

    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
