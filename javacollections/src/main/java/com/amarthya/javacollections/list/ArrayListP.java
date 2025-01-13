package com.amarthya.javacollections.list;

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


    }
}
