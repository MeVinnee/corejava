package org.example;

import java.util.Scanner;

public class AllOperators {
    public void incrementOperators(){
        int x = 100;
        int y = x++;
        int z = ++x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public void decrementOperators(){
        int x = 100;
        int y = x--;
        int z = --x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public void incdecoperators(){

        int n1 = 100;
        int n2 , n3;

        n2 = ++n1;
        n3 = n1++ + --n2;

        System.out.println("Value of n1 : " + n1);
        System.out.println("Value of n2 : " + n2);
        System.out.println("Value of n3 : " + n3);

        int x = 100;

        System.out.println("Value of ++x : " + ++x);
        System.out.println("Value of x--: " + x--);
        System.out.println("Value of x : " + x);

        //Scanner inputs
        System.out.println("What is your name?" );
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Hi " + input + " How old are you?" );

        int age = sc.nextInt();
        System.out.println("Ohh Great! I am also " + age + " Years old");

    } public void swap(){

        int a, b, temp;

        System.out.println("Enter two values to swap ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of first variable : " + a);
        System.out.println("Value of Second variable : " + b);

    }
}
