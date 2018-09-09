package com.company;

import com.company.instances.Human;

public class Main {

    private static final String constant = "MAIN HUMAN";

    public static void main(String[] args) {
        System.out.println("Hello mad world");
        System.out.println(new Human("Alex", "Armstrong", 33).toString());
        System.out.println(constant);
    }
}