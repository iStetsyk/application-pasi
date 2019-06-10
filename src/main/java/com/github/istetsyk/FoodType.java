package com.github.istetsyk;

enum FoodType {
                WELL_DONE_BURGER(30000),
                FRYTKI(10000),
                ZIELSKO(5000),
                NACHOSY(3000),
                SERUS(2000);

    private int preparationDurationMillis;

    FoodType(int preparationDurationMillis) {
            this.preparationDurationMillis = preparationDurationMillis;
    }

    public int getPreparationDurationMillis() {
//        int i = Character.toLowerCase(preparationDurationMillis);
        return preparationDurationMillis;
    }


}
