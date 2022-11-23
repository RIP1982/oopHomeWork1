package util;

import data.Drinks;
import data.HotDrink;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class ChooseDrink {
    public static void getProduct(Set<Drinks> drinks) {
        Logger logger = Logger.getAnonymousLogger();
        System.out.printf("Input request(name or volume or temperature): ");
        String request = (new Scanner(System.in)).nextLine();
        if (request.equals("name")) {
            System.out.printf("Enter the name of the hot drink: ");
            String name = (new Scanner(System.in)).nextLine();
            System.out.println();
            int count = 0;
            for (Drinks item: drinks) {
                HotDrink temp = (HotDrink) item;
                if (temp.getName().equals(name)) {
                    logger.info(String.valueOf(item));
                } else { count++; }
            }
            if (count == drinks.size()) {
                logger.info("Incorrect input!");
            }
        }
        else if (request.equals("volume")) {
            System.out.printf("Choose volume: ");
            String volume = (new Scanner(System.in)).nextLine();
            System.out.println();
            try {
                Integer.parseInt(volume);
                for (Drinks item: drinks) {
                    if (item.getVolume() == Integer.parseInt(volume)) {
                        logger.info(String.valueOf(item));
                    }
                }
            } catch (NumberFormatException e) {
                logger.info("Incorrect input!");
            }
        }
        else if (request.equals("temperature")) {
            System.out.printf("Choose temperature: ");
            String temperature = (new Scanner(System.in)).nextLine();
            System.out.println();
            try {
                Integer.parseInt(temperature);
                for (Drinks item: drinks) {
                    HotDrink temp = (HotDrink) item;
                    if (temp.getTemperature() == Integer.parseInt(temperature)) {
                        logger.info(String.valueOf(item));
                    }
                }
            } catch (NumberFormatException e) {
                logger.info("Incorrect input!");
            }
        } else { logger.info("Wrong request!"); }
    }
}
