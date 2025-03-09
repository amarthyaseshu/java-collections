package list;

import java.util.ArrayList;

public class CustomArrayListWithoutDuplicates extends ArrayList {


    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        }
        return super.add(o);
    }

    public static void main(String[] args) {

        CustomArrayListWithoutDuplicates listWithoutDuplicates=new CustomArrayListWithoutDuplicates();

        listWithoutDuplicates.add(1);
        listWithoutDuplicates.add(1);
        listWithoutDuplicates.add(1);
        listWithoutDuplicates.add(2);
        System.out.println(listWithoutDuplicates);
    }
}
