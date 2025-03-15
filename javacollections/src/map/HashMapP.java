package map;

import java.util.*;

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


        // count frequency of numbers

        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.computeIfAbsent(num, k -> 0);
            frequencyMap.put(num, frequencyMap.get(num) + 1);
            // above 2 lines can be written in single line
            // frequencyMap.computeIfAbsent returns the value of the map
            frequencyMap.put(num,  frequencyMap.computeIfAbsent(num, k -> 0) + 1);
        }

        System.out.println("Number Frequencies: " + frequencyMap);

        // Intersection of 2 arrays

        Integer[] array1 = {1, 2, 3, 2, 4};
        Integer[] array2 = {2, 3, 3, 5};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(array2));

        // Retain only common elements
        set1.retainAll(set2);


    }
}
