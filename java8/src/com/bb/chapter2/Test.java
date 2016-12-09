package com.bb.chapter2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by admin on 2016/11/3.
 */
public class Test {


    public static void main(String[] agrs) throws Exception {

        Stream.of("A", "B", "C").parallel()
                .forEach( s->System.out.println("Output:" + s) );
        System.out.println("-------------");
        Stream.of("A", "B", "C").parallel()
                .forEachOrdered( s->System.out.println("Output:" + s) );

        System.out.println("-------------");
//        testMap();

        testList();
    }


    private static void testList(){
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        items.forEach( item-> System.out.println("testList Output:" + item)  );

        items.stream()
                .filter( s-> s.contains("B") )
                .forEach( System.out::println );
    }


    private static void testMap(){
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach( (k,v) -> System.out.println("key:" + k + " value:" +v)  );
        items.forEach( (k,v) ->{
            System.out.println("key:" + k + " value:" +v);
            if( k.equals("E")){
                System.out.println("Hello E");

            }
        } );
    }

}
