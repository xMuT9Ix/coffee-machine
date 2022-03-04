import java.util.Locale;
import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {


        CoffeeMachine coffeeMachine = new CoffeeMachine(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[1]));

        while (true) {
            try {
                System.out.println("Введите команду из списка:water, milk, coffee, ristretto, espresso, lungo, cappuccino, latte, turn off");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                if (input.equals("turn off")) {
                    break;
                }
                String[] words = input.split(" ");
                switch (words[0].toLowerCase(Locale.ROOT)) {
                    case "water": {
                        coffeeMachine.addWater(Integer.parseInt(words[1]));
                        System.out.println(coffeeMachine);
                        break;
                    }
                    case "milk": {
                        coffeeMachine.addMilk(Integer.parseInt(words[1]));
                        System.out.println(coffeeMachine);
                        break;
                    }
                    case "coffee": {
                        coffeeMachine.addCoffee(Integer.parseInt(words[1]));
                        System.out.println(coffeeMachine);
                        break;
                    }
                    case "ristretto": {
                        coffeeMachine.ristretto(Integer.parseInt(words[1]));
                        System.out.println(coffeeMachine);
                        break;
                    }
                    case "espresso": {
                        coffeeMachine.espresso(Integer.parseInt(words[1]));
                        System.out.println(coffeeMachine);
                        break;
                    }
                    case "lungo": {
                        coffeeMachine.lungo(Integer.parseInt(words[1]));
                        System.out.println(coffeeMachine);
                        break;
                    }
                    case "cappuccino": {
                        coffeeMachine.cappuccino(Integer.parseInt(words[1]));
                        System.out.println(coffeeMachine);
                        break;
                    }
                    case "latte": {
                        coffeeMachine.latte(Integer.parseInt(words[1]));
                        System.out.println(coffeeMachine);
                        break;
                    }

                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Введите желаемое кол-во:");
            } catch (NumberFormatException e){
                System.out.println("Error!");
            }

        }
    }
}
