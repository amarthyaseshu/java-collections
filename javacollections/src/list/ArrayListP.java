package list;

import java.util.List;
import java.util.ArrayList;

public class ArrayListP {

    public void test(){
        List<Integer> intlist=new ArrayList<>();
        intlist.add(1);
        intlist.add(2);
        intlist.add(3);
        // To replace element
        int replacedEle=intlist.set(1,100);

        // Create a list copy of intlist
        List<Integer> intlist2=new ArrayList<>(intlist);
        //or - will be added after, if elements already exists in present list
        intlist2.addAll(intlist);

        // will provide the index of that element
        int index=intlist.indexOf(2);

        // starting index is inclusive, but ending index is exclusive
        List<Integer> subList=intlist.subList(0,3);

    }
}
