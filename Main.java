package com.google.lesson_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Konstantinopol 2356", "London", 00000);
        Address address2 = new Address("HelloWrodll 123", "Brighton", 12313);
        Address address3 = new Address("sadfHelloWrodll 12331", "BrightonDSFFS", 12313324);
        Address address4 = new Address("HelloWrodldfg 123", "SDABrighton2WSDF", 12313323);
        ArrayList<User> users = new ArrayList<User>();

        User user1 = new User("Arman", "Absadyk", address1, new String[]{"1234-2122", "2313-4232"});
        User user2 = new User("Sultanbek", "Myrzakhmet", address2, new String[]{"2341234-2122", "2313523-4232"});
        User user3 = new User("Arman", "Absadsdfsdfgyk", address3, new String[]{"1234-2122", "2313-4232"});
        User user4 = new User("Arman", "Hello", address4, new String[]{"1234-2122", "2313-4232"});
        User user5 = new User("ArmanSDFGSD", "sfsgdAbsadyk", address3, new String[]{"1234-2122", "2313-4232"});
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);


        Collections.sort(users, Comparator.comparing(User::getFirstName).thenComparing(User::getLastName));
        // Collections.sort(users, (o1, o2) -> o1.getAddress().getCity().compareTo(o2.getAddress().getCity()));
        for (User user :
                users) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAddress().getCity());
        }

        Calculator calculator = (x, y) -> {
            return Math.pow(x, y);
        };
        System.out.println(calculator.execute(2,8));
    }
}
