package com.github.istetsyk;

import java.util.Timer;

class Kitchen {

    private Manager manager;

    public void prepareMeal(Beeper beeper) {
        MealPreparation mealPreparation = new MealPreparation(this, beeper);
        Timer timer = new Timer();
        timer.schedule(mealPreparation, 5000);
        mealReady(beeper);
    }

    public void mealReady(Beeper beeper){
        System.out.println("I'm back " + beeper.getOrderName());
        manager.mealReady(beeper);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
