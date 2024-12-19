package com.satya.pattern.builder.director;

public class MealDirector {
    private MealBuilder mealBuilder;
    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    public Meal prepareMeal() {
        mealBuilder.addBread();
        mealBuilder.addBriyani();
        mealBuilder.addCurry();
        mealBuilder.addColdDrink();
        return mealBuilder.build();
    }
}
