package sg.edu.nus.iss.d12lecture;

import java.util.List;
import java.util.ArrayList;

public class CartService {
    
    public List<Item> getShoppingItems() {

        List<Item> lstItems =  new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Chanel Wallet");
        itm.setQuantity(2);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Macbook pro");
        itm.setQuantity(10);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("LV tote Bag");
        itm.setQuantity(8);
        lstItems.add(itm);

        return lstItems;


    }
}
