package com.company;

public class Person {

    public String name;
    public String hometown;


    Person(String input_name, String input_hometown) {

        name = input_name;
        hometown = input_hometown;
    }
    public void getSelfIntroduction(){
        System.out.println("私の名前は"+name+"です。"+hometown+"出身。");
    }
}
