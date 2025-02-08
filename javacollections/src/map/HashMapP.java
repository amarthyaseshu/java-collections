package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapP {

    public static void main(String[] args) {
        Map<Integer, ArrayList<Integer>> listMap=new HashMap<>();

        if (listMap.get(1)==null){
            listMap.put(1,new ArrayList<>());
        }
        listMap.get(1).add(2);

       // instead of above 3 lines we can do in single line

        listMap.computeIfAbsent(1,f->new ArrayList<>()).add(2);

        Map<Integer,Integer> intMap=new HashMap<>();

        Set<Map.Entry<Integer,Integer>> entrySet=intMap.entrySet();

        entrySet.stream().forEach(e->e.getKey());
        entrySet.stream().forEach(e->e.getValue());

        Set<Integer> keys1 = intMap.keySet();
    }
}
