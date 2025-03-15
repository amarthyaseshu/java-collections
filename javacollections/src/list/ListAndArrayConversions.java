package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAndArrayConversions {

    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C++"};
        // Convert Array to List
        List<String> list = Arrays.asList(array);

        // Convert List to Array
        String[] newArray = list.toArray(new String[0]);

    }
}
