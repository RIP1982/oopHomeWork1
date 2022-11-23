import Service.HotDrinkVendingMachine;
import Service.VendingMachine;
import data.Drinks;
import data.HotDrink;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        Drinks tea1 = new HotDrink("tea", "black", 384, "sugar", 100, 70);
        Drinks tea2 = new HotDrink("tea", "green", 200, "lemon", 85, 90);
        Drinks tea3 = new HotDrink("tea", "puer", 100, "without", 80, 100);
        Drinks coffee1 = new HotDrink("coffee", "americano", 180, "sugar",
                91, 120);
        Drinks coffee2 = new HotDrink("coffee", "cappuccino", 220, "cream",
                93, 140);
        Drinks coffee3 = new HotDrink("coffee", "espresso", 45, "milk",
                95, 170);

        Set<Drinks> tea = new HashSet<>();
        tea.add(tea1);
        tea.add(tea2);
        tea.add(tea3);
        Set<Drinks> coffee = new HashSet<>();
        coffee.add(coffee1);
        coffee.add(coffee2);
        coffee.add(coffee3);

        VendingMachine vendingMachine1 = new HotDrinkVendingMachine();
        VendingMachine vendingMachine2 = new HotDrinkVendingMachine();
        System.out.println("Choose tea");
        vendingMachine1.getProduct(tea);
        System.out.println();
        System.out.println("Choose coffee");
        vendingMachine2.getProduct(coffee);
    }
}