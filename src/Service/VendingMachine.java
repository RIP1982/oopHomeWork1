package Service;

import data.Drinks;
import java.util.Set;

public interface VendingMachine {
    void getProduct(Set<Drinks> drinks);
}
