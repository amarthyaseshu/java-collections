package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetP {
    public static void main(String[] args) {
        List<Integer> intlist=new ArrayList<>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(3);

        // We can also create a Set using an ArrayList
        Set<Integer> set1=new HashSet<>(intlist);
        Set<Integer> set2=new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // All common elements only r stored in set1, set2 remains unchanged
        set1.retainAll(set2);
        System.out.println(set1);
        // All common elements only r removed in set1, set2 remains unchanged
        set1.removeAll(set2);
        System.out.println(set1);
        // all elements in set2 r added in set1
        set1.addAll(set2);
        System.out.println(set1);

        Set<StudentMarks> studentMarksSet=new HashSet<>();
        studentMarksSet.add(new StudentMarks(1,2));

        // Returns true only if studentMarksSet implements equals & hashset
        System.out.println(studentMarksSet.contains(new StudentMarks(1,2)));

    }
}
