package org.example;

import java.util.Scanner;

public class IFElse {
    //if input is greater than 21 then eligiable
    public void challenge1() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input > 21) {
            System.out.println("eligible");
        } else {
            System.out.println("Ineligible");
        }
    }

    //    public void challenge2(){
//        //If user is > 21 years of age but < 55 - print "saving account"
//        //If user is > 55 years of age - print "senior citizen account"
//        //If user is below 21 years of age - print "ineligible"
//        System.out.println("Enter your age");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (input > 55 )
//        {
//            System.out.println("Senior citizen account");
//            if (input > 55){
//                System.out.println("Saving Account1");
//            }
//        }else{
//            System.out.println("Ineligible");
//        }
//    }
    public void challenge3() {
        //If user is > 21 years of age but < 55 - print "saving account"
        //If user is > 55 years of age - print "senior citizen account"
        //If user is below 21 years of age - print "ineligible"
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input > 55) {
            System.out.println("Senior citizen account");
        } else if (input > 20) {
            System.out.println("Saving Account");
        } else {
            System.out.println("Ineligible");
        }
    }

/////////////**************While Loop**************************//////////////

    public void whileloop() {
        int count = 0;
        while (count < 15) {
            System.out.println("I Love Java");
            count++;
        }
        System.out.println("out from loop");
    }

    public void challenge4() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int factorial = 1, i = 1;
        while (input >= i) {
            factorial *= i;
            i++;

        }
        System.out.println("factorial number" + factorial);
    }

    public void challenge5() {
        int a = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first numbers");
            int input1 = sc.nextInt();
            System.out.println("Enter Second numbers");
            int input2 = sc.nextInt();
            int sum = input1 + input2;
            System.out.println("This is the total " + sum);
            System.out.println("Enter 1 to continue, to exit enter anything else");
            a = sc.nextInt();

        } while (a == 1);

    }

//ask user to enter two numbers and print it. and do sum of the two numbers in do while loop.
// add condition as if user wants to continue the operation then loop execute otherwise it will terminate.

////////////////////////*************FOR LOOP ***********************/////////////////////

    ///when user will enter the number it will multiply by i every time and that i will increse by 1
    public void challenge6(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();

        for(int i = 1; i <= 10; i++  ){

            int total = input * i;

            System.out.println(input  + " * " + i + " = " + total);

        }
    }
}


