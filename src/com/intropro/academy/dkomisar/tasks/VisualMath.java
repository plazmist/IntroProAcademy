package com.intropro.academy.dkomisar.tasks;

public class VisualMath {

    static final int DEEP=30;

    public static void multiplication(int a, int b) {
        printFromEnd(a,0);
        printFromEnd(b,0);
        for (int i = 0; i < DEEP; i++) {
            System.out.println("-");
        }

    }

    public static void printFromEnd(int a,int offset){
        int intLen=0, tmp=a;
        while (tmp>0) {
            tmp/=10;
            intLen++;
        }
        for (int i = 0; i < DEEP - intLen + offset; i++) {
            System.out.print(" ");
        }
        System.out.println(a);
    }

}
