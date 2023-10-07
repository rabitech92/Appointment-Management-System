package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arry = new ArrayList<>();
        arry.add(12);
        arry.add(13);
        arry.add(17);
        arry.add(18);
        arry.add(10);
        arry.add(8);
        arry.add(10);

        Iterator<Integer> it = arry.iterator();
        while (it.hasNext()){
            Integer i=it.next();
            if (i<10){
                it.remove();
            }
        }


        System.out.println(arry);

    }
}
