package com.company;

import com.company.instances.Human;

public class Main {

    private static final String constant = "MAIN HUMAN";

    public static void main(String[] args) {
        String world = "Hello mad world";
        System.out.println(world);
        System.out.println(new Human("Alex", "Armistrong", 23).toString());
        System.out.println(constant);
    }
}