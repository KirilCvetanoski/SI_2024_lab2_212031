package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {


    void checkEveryBranch() {
        RuntimeException exception;

        // 1,2 → 3
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 1));
        assertTrue(exception.getMessage().contains("allItems list can't be null"));

        // 1,2 → 4
        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));

        // 3 → 28
        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -1));

        // 4 → 5
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(create(new Item(" ", null, 20, 0.5f)), 1));
        assertTrue(exception.getMessage().contains("No barcode!"));

        // 4 → 6,7
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(create(new Item("Teodor", "0a34b", 20, 0.5f)), 1));
        assertTrue(exception.getMessage().contains("Invalid character in item barcode!"));

        // 5 → 6,7
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(create(new Item("Teodor", "0a34b", 20, 0.5f)), 1));
        assertTrue(exception.getMessage().contains("Invalid character in item barcode!"));

        // 6,7 → 8
    }

    private List<Item> create(Item... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void testMultipleConditions() {

        Item item1 = new Item("Test Item", "01234", 400, 0.5f);
        assertTrue(SILab2.checkCart(create(item1), 1));


        Item item2 = new Item("Test Item", "11234", 400, 0.5f);
        assertFalse(SILab2.checkCart(create(item2), 1));


        Item item3 = new Item("Test Item", "01234", 400, -0.5f);
        assertFalse(SILab2.checkCart(create(item3), 1));


        Item item4 = new Item("Test Item", "11234", 400, -0.5f);
        assertFalse(SILab2.checkCart(create(item4), 1));


        Item item5 = new Item("Test Item", "01234", 200, 0.5f);
        assertFalse(SILab2.checkCart(create(item5), 1));


        Item item6 = new Item("Test Item", "11234", 200, 0.5f);
        assertFalse(SILab2.checkCart(create(item6), 1));


        Item item7 = new Item("Test Item", "01234", 200, -0.5f);
        assertFalse(SILab2.checkCart(create(item7), 1));


        Item item8 = new Item("Test Item", "11234", 200, -0.5f);
        assertFalse(SILab2.checkCart(create(item8), 1));
    }
}