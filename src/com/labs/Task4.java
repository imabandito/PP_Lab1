package com.labs;

import java.util.Scanner;


public class Task4 {

    private static int a;
    private static int b;
    private static int num1;
    private static int num2;
    private static int n;
    /**
     * Function deploys Interval() and Run() functions
     */
    public static void Run(){
        if(Interval())
            Fibo();
    }

    /**
     * Function scans interval [a;b], prints even numbers ascending, odd numbers descending and sum
     * @return boolean
     */
    public  static boolean Interval(){
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter interval a: ");
        a = sc.nextInt();
        System.out.print("               b: ");
        b = sc.nextInt();
        if(a >= 0 && a<b) {
            int oddSum = 0;
            int evenSum = 0;
            System.out.println("\nEven ascending: ");
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    evenSum += i;
                }
            }
            System.out.println("\nOdd descending: ");
            for (int i = b; i >= a; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    oddSum += i;
                }
            }

            System.out.println("\nSum of even: " + evenSum + "\nSum of odd: "+oddSum);
            return true;
        }else{
            System.out.println("Wrong numbers!");
            return false;
        }
    }

    /**
     * Function scans n from user, calculates Fibo number, percantage of odd/even numbers and prints it in console
     */
    public static void Fibo(){
        num1 = b-1;
        num2 = b;
        int next = 0;
        double even = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fibonacci length: ");
        n = sc.nextInt();
        System.out.print("\n"+num1+" "+num2+" | ");
        for (int i=0;i<n;i++){
            next = num1+num2;
            System.out.print(next+" ");
            num1 = num2;
            num2 = next;
            if(next%2==0)
                ++even;
        }
        System.out.println("\nEven Fibonacci numbers: "+(even/n)+"\n" +
                "Odd Fibonacci numbers: "+(1-even/n)+"\n");
    }
}
