package com.company;

import com.company.Person;

public class Main {

    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Person("森田", "奈良");
        persons[1] = new Person("木村", "埼玉");
        persons[2] = new Person("高山", "東京");
        persons[3] = new Person("茂木", "沖縄");

        for (int i = 0; i < persons.length; i++) {
            persons[i].getSelfIntroduction();
        }
    }
}
