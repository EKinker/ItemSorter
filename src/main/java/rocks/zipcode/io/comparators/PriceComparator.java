package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    public PriceComparator(){
    }

    @Override
    public int compare(Item o1, Item o2) {

        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
