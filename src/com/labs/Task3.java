package com.labs;

public class Task3 {
    /**
     * Function prints args array
     * @param args
     */
    public static void Run(String[] args){
        System.out.println("Command line agrs:\n");
        for (int i = 0;i< args.length;i++)  {
            System.out.println(args[i]);
        }
    }
}
