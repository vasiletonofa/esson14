package colections;

import java.util.*;

public class MyArrayList implements MyList {

    @Override
    public void add(Object obj) {

//        String[] arr = new String[10];
//        arr.length
//
        List<String> stringMyList = new ArrayList<>();
//        stringList.add("S"); // 0
//        stringList.get(0);
//        stringList.remove(0);
//        stringList.size();

        stringMyList.add("A"); // true
        stringMyList.add("B"); // true

        Set<Integer> set = new HashSet<>();
        boolean isAddedFirst = set.add(2); // isAddedFirst =  true
        boolean isAdded =  set.add(2); // isAdded = false
        set.add(3); // true
        set.add(4); // true
        set.add(3); // false

        set.size(); // 1

        Map<String, Integer> safeu = new HashMap<>();   // MAP = { [KEY, VALUE], [KEY, VALUE] }
                                                      // SET =  { VALUE, VALUE, VALUE }

        safeu.put("nr30", 222222);
        safeu.put("nr44", 3333333);

        safeu.put("nr30", 444444);

        safeu.get("nr30"); // 44444

        Integer bani = safeu.get("nr30"); // 222222
        Integer bani2 = safeu.get("nr44"); // 333333

       for(String key : safeu.keySet()) {
           System.out.println(safeu.get(key));
       }

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//
    }

    @Override
    public void remove(Object obj) {

    }

    @Override
    public void addAll(ArrayList<Object> objectList) {

    }
}
