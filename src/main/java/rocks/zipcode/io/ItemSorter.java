package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        List<Item> list = Arrays.asList(items);
        list.sort(comparator);
        return list.toArray(new Item[items.length]);
    }
}
