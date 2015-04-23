package com.intropro.academy.dkomisar.tasks;

/**
 * Created by dkomisar on 4/20/15.
 */
public class Anagramm {

    private char[] myCharArray;

    public void setMyCharArray(String input) {
        this.myCharArray = input.toCharArray();
    }

    public String getMyCharArray() {
        String result = null;//new String();
        for (int i = 0; i < myCharArray.length; i++)
            result+=myCharArray[i];
        return result;
    }

    public void anagrammString(boolean Alpha) {
        int i=0, k=0,startI=0,finishI=0;
        while (i<myCharArray.length) {
            while ((i<myCharArray.length) && (myCharArray[i] == ' ')) i++;
            startI = i;
            while ((i<myCharArray.length) && (myCharArray[i] != ' ')) i++;
            finishI = i-1;
            if (Alpha) reverseAlpha(startI, finishI);
                else   reverseBasic(startI, finishI);
            i++;
        }
    }

    private void reverseBasic(int start, int finish){
        char tmp;
        int k=(finish-start+1)/2;
        for (int i = 0; i < k; i++) {
            tmp=myCharArray[start+i];
            myCharArray[start+i]=myCharArray[finish-i];
            myCharArray[finish-i]=tmp;
        }
    }

    private void reverseAlpha(int start, int finish){
        char tmp;
        int head=start, tail=finish;
        while (tail-head > 0) {
            while ((tail-head > 0) && (!Character.isLetter(myCharArray[head]))) head++;
            while ((tail-head > 0) && (!Character.isLetter(myCharArray[tail]))) tail--;
            tmp=myCharArray[head];
            myCharArray[head]=myCharArray[tail];
            myCharArray[tail]=tmp;
            head++;
            tail--;
        }
    }
}
