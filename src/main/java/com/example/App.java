package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Hello from Maven + Java App!  ");
        System.out.println("=================================");

        // Basic variables
        String name = "Maven Project";
        int version = 1;
        double pi = 3.14159;

        System.out.println("Project Name : " + name);
        System.out.println("Version      : " + version);
        System.out.println("Value of Pi  : " + pi);

        // Loop example
        System.out.println("\nCounting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  Count: " + i);
        }

        // Method call
        String message = greet("Developer");
        System.out.println("\n" + message);
    }

    public static String greet(String name) {
        return "Welcome, " + name + "! Your Maven setup is working!";
    }
}
