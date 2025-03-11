package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStudent {

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"amar"));
        students.add(new Student(3,"balu"));
        students.add(new Student(2,"rohan"));
        students.add(new Student(2,"gohan"));
        students.add(new Student(6,"chetan"));

        Collections.sort(students);

        System.out.println(students);

        Collections.sort(students,new StudentNameComparator());

        System.out.println(students);
        // If both ids & equal then compare by name
        Collections.sort(students,new StudentIdComparator().thenComparing(new StudentNameComparator()));

        System.out.println(students);


    }
}
