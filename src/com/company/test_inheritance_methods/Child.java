package com.company.test_inheritance_methods;

public class Child extends Parent {
    @Override
    public void method() {
        super.method();
    }

    @Override
    public void doSmth() {
        System.out.println("I am child");
    }
}
