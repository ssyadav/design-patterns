package com.satya.pattern.builder;


public class Burger {
    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    private Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.egg = builder.egg;
        this.extraCheese = builder.extraCheese;
        this.mayonese = builder.mayonese;
        this.onion = builder.onion;
        this.lettuce = builder.lettuce;
    }

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public static class BurgerBuilder {
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }
        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }
        public BurgerBuilder mayonese(boolean mayonese) {
            this.mayonese = mayonese;
            return this;
        }
        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }


    }
}
