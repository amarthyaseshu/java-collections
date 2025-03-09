import java.util.*;
import java.util.stream.Collectors;

public class CollectionMtds {

    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(1);


        int frequency = Collections.frequency(integerList, 1);
        System.out.println(frequency);

        // Find occurrence of each element in given list

        Map<Integer, Integer> collect = integerList.stream().collect(Collectors.toMap(num -> num, num -> Collections.frequency(integerList, num),(existingValue,newValue)->existingValue));
        System.out.println(collect);

        List<Integer> integerList1=new ArrayList<>();
        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);
        integerList1.add(5);
        integerList1.add(1);

        // Find if common elements exits

        boolean disjoint = Collections.disjoint(integerList, integerList1);
        System.out.println(disjoint);

        // creating singleton collections

        Set<String> jt = Collections.singleton("JT");

       // Collections.rotate(integerList,1);
       // Collections.rotate(integerList1,-2);

        Collections.rotate(integerList,integerList.size());
        Collections.rotate(integerList1,-15);
        System.out.println(integerList);
        System.out.println(integerList1);

    }

}
