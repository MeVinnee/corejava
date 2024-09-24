package org.example;

import java.util.ArrayList;

public class Arrays {
    public void practice1 (){
                int[] arr= new int[5];
                arr[0]= 1;
                arr[1]= 2;
                arr[2]= 3;
                arr[3]= 4;
                arr[4]= 7;
            for (int i=0; i<arr.length; i++) {
                System.out.println(arr[i]);
            }

            //Instead of this we can simplify like below
             int[] arr2 = {1, 2, 3, 4, 10, 6};

            for (int i=0; i<arr2.length; i++){
                System.out.println(arr2[i]);
            }

            for (int  a:arr2){
                System.out.println(a);
            }

            String[] name = {"Anu, Ajit, Anvi, Ayansh"};
            for (int i=0; i<name.length; i++){
                System.out.println(name[i]);
            }

            for(String s:name){
                System.out.println(s);
            }
                ////******** Even Numbers *********///
            int[] arr3 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            for(int i =0; i<arr3.length; i++){
                if(arr3[i] % 2 == 0){
                System.out.println(arr3[i]);}
            }

            ArrayList<String> a = new ArrayList<String>();
            a.add("Anuradha");
            a.add("Ajit");
            a.add("Patil");
            System.out.println(a.get(1));
           // a.remove(1);
            System.out.println(a);

            System.out.println("*******************");

            for(int i=0; i<a.size(); i++){
                System.out.println(a.get(i));
            }
             System.out.println("*******************");
            for( String val : a ){
                System.out.println(val);
            }
             System.out.println("*******************");
            //Check Item is present in Arraylist
            System.out.println(a.contains("Patil"));

    }
        public void Practice2 (){
            String s1 = "Vanita Ajit Patil";
            String[] splittedString = s1.split(" Ajit ");
            System.out.println(splittedString[0]);
            System.out.println(splittedString[1]);

            for (int i=0; i<s1.length(); i++){
                System.out.println(s1.charAt(i));
            }
        }
        //How to print Reverse order
        public void Practice3 (){
            String s2 = "Anvi Ajit patil";

            for (int i= s2.length()-1; i >= 0; i--){
                System.out.println(s2.charAt(i));
            }

    }

}
