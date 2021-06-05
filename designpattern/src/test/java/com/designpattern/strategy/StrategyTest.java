package com.designpattern.strategy;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void testSortCatByWeight() {
        Cat c1 = new Cat(2,3);
        Cat c2 = new Cat(15,2);
        Cat c3 = new Cat(10,28);

        Cat[] cs = new Cat[] {c1, c2, c3};
        Sorter s = new Sorter<Cat>();
        s.sort(cs, new CatWeightComparator());

        for (Cat c: cs) {
            System.out.println(c);
        }
    }

    @Test
    public void testSortCatByHeight() {
        Cat c1 = new Cat(2,3);
        Cat c2 = new Cat(15,2);
        Cat c3 = new Cat(10,28);

        Cat[] cs = new Cat[] {c1, c2, c3};
        Sorter s = new Sorter<Cat>();
        s.sort(cs, new CatHeightComparator());

        for (Cat c: cs) {
            System.out.println(c);
        }
    }

    
}
