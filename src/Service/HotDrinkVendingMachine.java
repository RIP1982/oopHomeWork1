package Service;

import data.Drinks;
import util.ChooseDrink;
import java.util.Set;

public class HotDrinkVendingMachine implements VendingMachine{

    @Override
    public void getProduct(Set<Drinks> drinks) {
        ChooseDrink.getProduct(drinks);
    }
}
