package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListP {

     void main(String[] args) {

         List<Integer> ll=new LinkedList<>();
         ll.add(1);
         ll.add(2);
         ll.add(3);

         ListIterator<Integer> listIterator=ll.listIterator();
         // next() - return & then move the pointer
         System.out.println(listIterator.next());
         System.out.println(listIterator.next());
         // previous() -  move the pointer & then return
         System.out.println(listIterator.previous());

         //Converting list to array, by default 0 can be passed
         Integer[] arrInt=ll.toArray(new Integer[0]);

    }
}
