package datastructure;

import java.util.*;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        Set set=map.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()) {
                Map.Entry mentry=(Map.Entry)iterator.next();
                System.out.println("Key is : " +mentry.getKey() + " & value is : ");
                System.out.println(mentry.getValue());
        }



    }

}
