package com.intropro.academy.dkomisar.tasks;

import java.nio.charset.Charset;
import java.util.Arrays;

public class VisualMath {

    static int DEEP;

    public static void longMultiplication(long a, long b) {
        long tmp,interim,factor;
        int offset=0;
        if (b>a) {tmp=a; a=b; b=tmp;} // make first value always bigger
        DEEP=getValueLength(a)+getValueLength(b)+1;
        printFromEnd(a,0);
        printFromEnd(b,0);
        for (int i = 0; i < DEEP+1; i++) System.out.print("-");
        System.out.println();
        tmp=b;
        while (tmp>0) {
            factor=tmp%10;
            interim=a*factor;
            //System.out.println("a = "+ a + " factor=" + factor+ " inerim = "+ interim);
            printFromEnd(interim, offset);
            offset++;
            tmp/=10;
        }
        for (int i = 0; i < DEEP+1; i++) System.out.print("-");
        System.out.println();
        printFromEnd(a*b,0);
    }

    public static void arrayMultiplication(String a, String b){
        String tmp;
        if (b.length() > a.length()) {tmp=a; a=b; b=tmp;}
        byte[] aa=a.getBytes(Charset.forName("UTF-8"));
        for (int i = 0; i < aa.length; i++) {
            aa[i]-=48;
        }
        for (int i = 0; i < bb.length; i++) {
            bb[i]-=48;
        }
        byte[] bb=b.getBytes();
        printFromEnd(aa,0);
        printFromEnd(bb,0);

        }


    public static int getValueLength(long value){
        int length=0;
        while (value>0) {
            value/=10;
            length++;
        }
        return length;
    }

    public static void printFromEnd(long value,int offset){
        for (int i = 0; i < 1+ DEEP - getValueLength(value) - offset; i++) {
            System.out.print(" ");
        }
        System.out.println(value);
    }

    public static void printFromEnd(byte[] value,int offset){
        for (int i = 0; i < 1+ DEEP - value.length - offset; i++) {
            System.out.print(" ");
        }
        System.out.println(Arrays.toString(value));
    }

}
