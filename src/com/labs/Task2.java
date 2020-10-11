package com.labs;

public class Task2 {
    private int intInit;
    private char charInit;

    public char getCharInit() {
        return charInit;
    }

    public void setCharInit(char charInit) {
        this.charInit = charInit;
    }

    public int getIntInit() {
        return intInit;
    }

    public void setIntInit(int intInit) {
        this.intInit = intInit;
    }

    /**
     * Function checks default initializations and prints it in console
     */
    public static void Run(){
        Task2 test = new Task2();
        System.out.println("Checking default initialization:   int = "+test.getIntInit()+"  char = "+test.getCharInit());
    }
}
