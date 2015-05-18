package com.intropro.academy.dkomisar;

//import com.intropro.academy.dkomisar.tasks.Anagramm;
import com.intropro.academy.dkomisar.tasks.VisualMath;
//import com.intropro.academy.dkomisar.tools.FileWorker;



public class Main {
/*
    public static void callAnagramm(String input){
        Anagramm anag1 = new Anagramm();
        anag1.setMyCharArray(input);
        System.out.println("What we have    : " + anag1.getMyCharArray());
        anag1.anagrammString(true);
        System.out.println("What we have got: " + anag1.getMyCharArray() + "\n");

    }

    public static void showAnagramm(){
        callAnagramm("a ab abc abcd abcde 1 12 123 1234 12345   12345     123 gfgkaade 111111");
        callAnagramm("12.3 a.bcd   a1b2c3d4");

        String textFromFile=FileWorker.read("/home/dkomisar/Tmp/a.txt");
        System.out.println("We have read: " + textFromFile);
        callAnagramm(textFromFile);
    }
*/
    public static void main(String[] args) {
    //showAnagramm();
        //VisualMath.longMultiplication(1111,987654321);

        //VisualMath.arrayMultiplication("11111111111111119","999");
        //VisualMath.longDivision(505050505,5);
        VisualMath.longDivision("9876543210","5");

    }
}
