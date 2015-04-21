package com.dkomisar.task1;

/**
 * Created by dkomisar on 4/20/15.
 */
public class Anagramm {

    public void anagrammString() {
        int i=0, k=0,startI=0,finishI=0;
        while (i<myCharArray.length) {
            while ((i<myCharArray.length) && (myCharArray[i] == ' ')) i++;
            startI = i;
            while ((i<myCharArray.length) && (myCharArray[i] != ' ')) i++;
            finishI = i-1;
            reverseAlpha(startI, finishI);
            //System.out.println("So, we have found the word from " + startI + " to " + finishI);
            i++;
        }
    }

    private void reverseWords(int start, int finish){
        char tmp;
        int k=(finish-start+1)/2;
        //System.out.println("We have to modify k=["+k+"]: \"" + subMyCharArray(start, finish) + "\"");
        for (int i = 0; i < k; i++) {
            tmp=myCharArray[start+i];
            myCharArray[start+i]=myCharArray[finish-i];
            myCharArray[finish-i]=tmp;
        }
        //System.out.println("The result is = " +  subMyCharArray(start, finish));
    }

    private void reverseAlpha(int start, int finish){
        char tmp;
        int k=(finish-start+1)/2, head=start, tail=finish;
        System.out.println("reverseAlpha k=["+k+"]: \"" + subMyCharArray(start, finish) + "\"" + " head="+ head + " tail = " + tail);
        while (tail-head > 0) {
            while ((tail-head > 0) && (!Character.isLetter(myCharArray[head]))) head++;
            while ((tail-head > 0) && (!Character.isLetter(myCharArray[tail]))) tail--;
            tmp=myCharArray[head];
            //System.out.println("\t change = " + tmp);
            myCharArray[head]=myCharArray[tail];
            myCharArray[tail]=tmp;
            head++;
            tail--;
        }
        System.out.println("The result is = " +  subMyCharArray(start, finish));
    }

    private String subMyCharArray(int start, int finish){
        String result = new String();
        for (int i = start; i <= finish; i++)
            result+=myCharArray[i];
        return result;
    }

    public void setMyCharArray(String input) {
        this.myCharArray = input.toCharArray();
    }

    public String getMyCharArray() {
        String result = new String();
        for (int i = 0; i < myCharArray.length; i++)
            result+=myCharArray[i];
        return result;
    }

    private char[] myCharArray;
}
