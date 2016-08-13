package ru.sbt.collections.lessons3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LL on 13.08.2016.
 */
public class TruckDaoMemotyImpl implements TruckDao {
    @Override
    public List<Truck> list() {
        return Arrays.asList(
                new Truck(1, type, 10),
                new Truck(2, type, 30),
                new Truck(3, type, 20),
                new Truck(4, type, 11),
                new Truck(5, type, 98),
                new Truck(6, type, 100)
        );
    }
}
