package ru.sbt.collections.lessons3;

/**
 * Created by LL on 13.08.2016.
 */
public class Truck {

    private long id;
    private String type; // kamaz, uas, ... - возможно перечисление
    //ѕодсказка: в мапе не траки должны хранитьс€, а коллекци€ траков
    private int capacity;

    public Truck(long id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public long getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
}
