package ru.sbt.lessons3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by LL on 13.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(100));
        }
    }
}
