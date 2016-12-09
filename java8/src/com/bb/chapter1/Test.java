package com.bb.chapter1;

import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by admin on 2016/11/3.
 */
public class Test {


//    public static boolean isGreenApple(Apple apple){
//        return "green".equals(apple.getColor());
//    }
//    public static boolean isHeavyApple(Apple apple){
//        return  apple.getWeight() > 150;
//    }


    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }


    public static void main(String[] agrs) throws Exception{

        System.out.println("11111222333");
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

//        [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples = filterApples(inventory , Test::isGreenApple );
        System.out.println(greenApples);

//        [Apple{color='green', weight=155}]
        List<Apple> heavyApples = filterApples(inventory , Test::isHeavyApple );
        System.out.println(heavyApples);

        List<Apple> greenApples2 = filterApples(inventory , (Apple a) -> "green".equals(a.getColor())  );
        System.out.println(greenApples2);

        List<Apple> heavyApples2 = filterApples(inventory , (Apple a) -> a.getWeight() > 150 );
        System.out.println(heavyApples2);

//        List<Apple> heavyApples3 = filter(inventory ,(Apple a) -> a.getWeight() > 150 );
//        System.out.println(heavyApples3);

//        List<Apple> heavyApples3 =  inventory.stream().filter(  (Apple a) -> a.getWeight() > 150 ).collect(Collectors.toList());
         List<Apple> heavyApples3 =  inventory.parallelStream().filter(  (Apple a) -> a.getWeight() > 150 ).collect(Collectors.toList());

    }

//    default void sort(Comparator<? super E> c){
//        Collections.sort(this , c);
//    }

    static List<Apple> filterApples(List<Apple> inventory , Predicate<Apple> predicate){

        List<Apple> result = new ArrayList<Apple>();
        for ( Apple apple: inventory) {
            if ( predicate.test(apple) ){
                result.add(apple);
            }
        }
        return result ;
    }

    private static void test(){
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
    }

    private static void test1(){
        File[] hiddenFiles = new File(".").listFiles( File::isHidden );
    }

    private  static void testApple(){

    }

//    public static List<Apple> filterGreenApples(List<Apple> inventory){
//        List<Apple> result = new ArrayList<Apple>();
//        for ( Apple apple: inventory) {
//            if ("green".equals(apple.getColor())){
//                result.add(apple);
//            }
//        }
//        return result ;
//    }

    public interface Predicate<T>{
        boolean test(T t);
    }


    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

}

