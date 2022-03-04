public class CoffeeMachine {
    private int coffeeTank;
    private int waterTank;
    private int milkTank;


    public CoffeeMachine(int coffeeTank, int waterTank, int milkTank) {
        this.coffeeTank = coffeeTank;
        this.waterTank = waterTank;
        this.milkTank = milkTank;
    }

    public void addWater(int water) {
        if (water <= 0) {
            System.out.println("Error!");
            return;
        }
        waterTank += water;
    }

    public void addCoffee(int coffee) {
        if (coffee <= 0) {
            System.out.println("Error!");
            return;
        }
        coffeeTank += coffee;
    }

    public void addMilk(int milk) {
        if (milk <= 0) {
            System.out.println("Error!");
            return;
        }
        milkTank += milk;
    }

    public void ristretto(int volume) {
        if (volume < 10) {
            System.out.println("Неправильное кол-во!");
            return;
        }
        if (coffeeTank < (0.5 * volume) || waterTank < (0.5 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }
        coffeeTank = (int) (coffeeTank - 0.5 * volume);
        waterTank = (int) (waterTank - 0.5 * volume);
    }

    public void espresso(double volume) {
        if (volume < 10) {
            System.out.println("Неправильное кол-во!");
            return;
        }
        if (coffeeTank < (0.3 * volume) || waterTank < (0.7 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }

        coffeeTank = (int) (coffeeTank - 0.3 * volume);
        waterTank = (int) (waterTank - 0.7 * volume);
    }

    public void lungo(double volume) {
        if (volume < 10) {
            System.out.println("Неправильное кол-во!");
            return;
        }
        if (coffeeTank < (0.15 * volume) || waterTank < (0.85 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }
        coffeeTank = (int) (coffeeTank - 0.15 * volume);
        waterTank = (int) (waterTank - 0.85 * volume);
    }

    public void cappuccino(double volume) {
        if (volume < 10) {
            System.out.println("Неправильное кол-во!");
            return;
        }
        if (coffeeTank < (0.15 * volume) || waterTank < (0.4 * volume) || milkTank < (0.45 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }
        coffeeTank = (int) (coffeeTank - 0.15 * volume);
        waterTank = (int) (waterTank - 0.4 * volume / 100);
        milkTank = (int) (milkTank - 0.45 * volume);
    }

    public void latte(double volume) {
        if (volume < 10) {
            System.out.println("Неправильное кол-во!");
            return;
        }
        if (coffeeTank < (0.1 * volume) || waterTank < (0.3 * volume) || milkTank < (0.6 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }
        coffeeTank = (int) (coffeeTank - 0.1 * volume);
        waterTank = (int) (waterTank - 0.3 * volume);
        milkTank = (int) (milkTank - 0.6 * volume);
    }


    @Override

    public String toString() {
        return "Кофе машина заполнение:\n" +
                "Резервуар для кофе:" + coffeeTank + "\n" +
                "Резервуар для воды:" + waterTank + "\n" +
                "Резервуар для молока:" + milkTank;
    }

}
