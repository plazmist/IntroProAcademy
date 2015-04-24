package com.intropro.academy.dkomisar.tasks;

public class VisualMath {

    private static int DEEP;

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
            printFromEnd(interim, offset);
            offset++;
            tmp/=10;
        }
        for (int i = 0; i < DEEP+1; i++) System.out.print("-");
        System.out.println();
        printFromEnd(a*b,0);
    }

    public static int arrayMultiplication(String a, String b){
        if (!isNumeric(a) || !isNumeric(b)) { System.out.println("You are the stupid asshole!");  return 1;}
        // I fucked on negative values. I'll do this another time.
        String tmp;
        byte byteTmp,kerry;
        if (b.length() > a.length()) {tmp=a; a=b; b=tmp;}
        byte[] aa = new byte[a.length()];
        byte[] bb = new byte[b.length()];
        byte[] cc = new byte[a.length()+1];
        byte[] result = new byte[a.length()+b.length()+1];
        for (int i = 0; i < a.length(); i++) {
            aa[i]= (byte) (a.charAt(a.length()-i-1)-48);
        }
        for (int i = 0; i < b.length(); i++) {
            bb[i]= (byte) (b.charAt(b.length()-i-1)-48);
        }
        DEEP = aa.length + bb.length + 1;
        printFromEnd(aa,0);
        printFromEnd(bb,0);
        for (int i = 0; i < DEEP+1; i++) System.out.print("-"); System.out.println();

        for (int i = 0; i < bb.length; i++) {
            kerry=0;
            for (int j = 0; j < aa.length; j++) {
                byteTmp = (byte) (aa[j] * bb[i] + kerry);
                kerry=0;
                if (byteTmp > 9) {
                    kerry=(byte) (byteTmp/10);
                    byteTmp%=10;
                }
                cc[j] = byteTmp;
                result[j+i]+=cc[j];
                if (result[j+i] > 9) {
                    result[i+j]-=10;
                    result[i+j+1]+=1;
                }
            }
            if (kerry>0) {
                cc[aa.length]=kerry;
                result[i+aa.length]+=kerry;
            }
            printFromEnd(cc, i);
        }
        for (int i = 0; i < DEEP+1; i++) System.out.print("-"); System.out.println();
        printFromEnd(result,0);
        return 0;
    }

    public static boolean isNumeric(String str)
    {
        return str.matches("\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getValueLength(long value){
        int length=0;
        while (value>0) {
            value/=10;
            length++;
        }
        return length;
    }

    private static void printFromEnd(long value,int offset){
        for (int i = 0; i < 1+ DEEP - getValueLength(value) - offset; i++) {
            System.out.print(" ");
        }
        System.out.println(value);
    }

    private static void printFromEnd(byte[] value,int offset){
        for (int i = 0; i < 1+ DEEP - value.length - offset; i++) {
            System.out.print(" ");
        }
        int hh=value.length-1;
        while ((hh > 0) && (value[hh] == 0)) {System.out.print(" "); hh--;}
        for (int i = hh; i >= 0; i--) {
            System.out.print(value[i]);
        }
        System.out.println();
    }

}
