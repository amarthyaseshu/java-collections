package map;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ItineraryTicketsProblem {

    public static void main(String[] args) {
        Map<String,String> routeMap=new HashMap<>();
        routeMap.put("Chennai","Banglore");
        routeMap.put("Mumbai","Delhi");
        routeMap.put("Goa","Chennai");
        routeMap.put("Delhi","Goa");

        //soln
        // Mumbai->Delhi->Goa->Chennai->Banglore

        Set<String> keys = new HashSet<>();
        keys.addAll(routeMap.keySet());
        List<String> route = new CopyOnWriteArrayList<>();
        route.addAll(keys);
        Collection<String> values =  routeMap.values();

         keys.retainAll(values);

         route.removeAll(keys);

         boolean isLast=true;
         int i=0;
         while (isLast){
             if(routeMap.containsKey(route.get(i))){
                 route.add(routeMap.get(route.get(i)));
                 i++;
             }else {
                 break;
             }
         }
        System.out.println(route);









    }
}
