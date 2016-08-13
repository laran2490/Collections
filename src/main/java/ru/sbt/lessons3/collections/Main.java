package ru.sbt.lessons3.collections;

import java.util.*;

/**
 * Created by LL on 13.08.2016.
 */
public class Main {

    public static final int LIST_SIZE = 20;
    public static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());

        List<Integer> arrayList = new ArrayList<>(LIST_SIZE);

        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(random.nextInt(MAX_RANDOM));
        }

        System.out.println(arrayList);

        Set<Integer> sortSet = new TreeSet<>(arrayList);
        System.out.println(sortSet);
    }
}
