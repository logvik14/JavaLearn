package Module7;

import java.util.Comparator;

/**
 * Created by Vladymyr on 19.12.2016.
 */
public class PriceComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
