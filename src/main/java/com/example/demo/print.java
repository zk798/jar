package com.example.demo;

public class print {


    public void get(B a){
        System.out.println("b");
    }
    public void get(A a){
        System.out.println("a");
    }


    public static void main(String[] args) {
        B a = new B();
        new print().get(a);
    }

}
