package com.dkomisar;

import com.dkomisar.task1.Anagramm;

public class Main {

    public static void callAnagramm(String input){
        Anagramm anag1 = new Anagramm();
        anag1.setMyCharArray(input);
        System.out.println("What we have    : " + anag1.getMyCharArray());
        anag1.anagrammString(true);
        System.out.println("What we have got: " + anag1.getMyCharArray() + "\n");

    }

    public static void main(String[] args) {
        callAnagramm("a ab abc abcd abcde 1 12 123 1234 12345   12345     123 gfgkaade 111111");
        callAnagramm("12.3 a.bcd   a1b2c3d4");
    }
}
