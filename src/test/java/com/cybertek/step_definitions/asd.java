package com.cybertek.step_definitions;

import java.util.*;

public class asd {

    public static void main(String[] args) {


        List<Integer> arr = new ArrayList<>(Arrays.asList(11,2,3,412,5,2));
        Collections.sort(arr);
        System.out.println(arr);

        Vector<Integer> arr2 = new Vector<>(Arrays.asList(11,2,3,412,5,2));
        arr2.sort(Comparator.naturalOrder());
        System.out.println(arr2);

        Queue<Integer> prr = new PriorityQueue<>(Arrays.asList(1,2,3,4,2123,32,1,2,5));
        System.out.println(prr);



        Map<String,Integer> map = new HashMap<>();

        map.put("asd",12);


        List<Map.Entry<String, Integer>> asd = new LinkedList<>();

        Map<String, Integer> myMap = new HashMap<>();
        map.put("asd",12);
        map.put("qe",1);
        map.put("yre",5);

        System.out.println("sortByValue(myMap) = " + sortByValue(myMap));

        List<Map.Entry<String,Integer>> mylist = new ArrayList<>(map.entrySet());

        mylist.sort(Map.Entry.comparingByValue());

        Map<String, Integer> result = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> each : mylist){
            result.put(each.getKey(), each.getValue());
        }

        System.out.println(result);


        TreeSet<Integer> sm = new TreeSet<>(arr);
        System.out.println(sm);

        Queue<Integer> integers = new PriorityQueue<>(arr2);
        System.out.println("integers "+integers);

        SortedSet<Integer> treeSet = new TreeSet<>(map.values());


        System.out.println(treeSet);




    }


    public static Map<String, Integer> sortByValue(Map<String, Integer> map ){

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> each : list){
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }


    public  static  int  minValue( Map<String,Integer>    map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }


}
