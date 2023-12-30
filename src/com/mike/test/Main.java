package com.mike.test;


import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
//        String[] array = new String[]{"Test1","Test2", "Test3"};
//        System.out.println(array[2]);
//        array[0] = "TestOne";
//        System.out.println(array[0]);
//
//        List<String> list = new ArrayList<>();
//        list.add("Player1");
//        list.add("Player2");
//        System.out.println(list.get(1));
//
//        HashMap<String, String> map = new HashMap<>();
//        map.put("Banana", "Test");
//        map.put("Player1", "Mike");
//        System.out.println(map.get("Banana"));
//
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        for(int i = 0; i < map.size(); i++){
//            System.out.println("Key: " + map.keySet().toArray()[i] + ", value: " + map.get(map.keySet().toArray()[i]));
//            System.out.println(i);
//            for (String string: array){
//                System.out.println(string);
//            }
//            for (String string: list){
//                System.out.println(string);
//            }
//
//        }
//        int number = 0;
//        while(number < 10){
//            System.out.println(number);
//            number++;
//        }
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Motorbike());
        for(int i = 0; i < vehicleList.size(); i++){
            System.out.println(vehicleList.get(i).getColor());
        }
        for(Vehicle vehicle : vehicleList){
            vehicle.activateBreaks();
        }
    }
    }
