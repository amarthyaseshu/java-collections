package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetP {

    public static void main(String[] args) {
        NavigableSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(0);
        // Returns lower nearby if not found
        System.out.println(treeSet.floor(2));
        // Returns higher nearby if not found
        System.out.println(treeSet.ceiling(2));

        System.out.println(treeSet.higher(2));

        System.out.println(treeSet.lower(2));

    }
}
