package com.github.istetsyk;

class CashDesk {

    private static Manager manager;

    public void newOrder(String orderName) {
        manager.newOrder(orderName);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
