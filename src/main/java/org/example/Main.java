package org.example;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneNumber test = new PhoneNumber(812, 5980177);
        System.out.println(test);
        System.out.println();
        PhoneNumber test2 = new PhoneNumber(7771, 77766600);
        System.out.println(test2);
        System.out.println();
        PhoneNumber test3 = new PhoneNumber(43453,234342452);
        System.out.println(test3);
        System.out.println();

        System.out.println("Пример работы с множествами:");
        HashSet <String> mySet = new HashSet<>();
        mySet.add("111|134554");
        mySet.add("1233|444314");
        mySet.add("141|4341175");
        mySet.add("1421|41872");
        mySet.add("11df|5455655"); //Добавим какие-либо другие символы кроме цифр
        mySet.add("14141872"); // Добавим номер без разделителя
        mySet.add(null); //Добавим null

        mySet.forEach((s) -> System.out.println(new PhoneNumber(s)));
        System.out.println();

        Map <Integer,Integer> myMap = new HashMap<>();
        myMap.put(1234,111222333);
        myMap.put(234,232323323);
        myMap.put(777,77777777);
        System.out.println("Сделал реализацию работы с ассоциативными массивами:");
        myMap.forEach((key, value) -> System.out.println(new PhoneNumber(key, value)));
    }
}