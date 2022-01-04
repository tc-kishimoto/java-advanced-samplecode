package main;

import b.Hello;

public class CallHello {
    public static void main(String[] args) {
    	// package a のHello
        a.Hello.printHello();

        // package b のHello
        Hello.printHello();

    }
}