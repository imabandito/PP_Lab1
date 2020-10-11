package com.labs;

import java.util.Scanner;

/**
 *      Main class
 *      @author Ilko Bas
 *      @version 1.0.0.0.0.1
 *      @since   2020-10-10
 */
public class Main {

    /**
     * In this function you can choose which task to launch
     * @param args the command line arguments

     */
    public static void main(String[] args) {
        int progNumber = -1;

        Scanner sc = new Scanner(System.in);
        while(progNumber != 0) {
            System.out.println("To launch Task1 press 1,   Task2 : 2,   Task3: 3 ,   Task4 : 4\n0 To exit");
            progNumber = sc.nextInt();

            switch (progNumber) {
                case 1:
                    Task1.Run();
                    break;
                case 2:
                    Task2.Run();
                    break;
                case 3:
                    Task3.Run(args);
                    break;
                case 4:
                    Task4.Run();
                    break;
                default: break;
            }
        }

    }
}
