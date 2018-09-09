package com.company;

import com.company.instances.Human;

public class Main {

    private static final String constant = "MAIN HUMAN";

    public static void main(String[] args) {
        String world = "Oh, what a stupid world!";
        System.out.println(world);
        System.out.println(new Human("Alex", "Armstrong", 39).toString());
        System.out.println(constant);
    }
}