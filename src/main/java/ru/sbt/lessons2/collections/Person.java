package ru.sbt.lessons2.collections;

/**
 * Created by LL on 11.08.2016.
 */
public class Person implements Comparable<Person>{
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        return name.equals(person.name);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        if (name == null) {
            throw new IllegalStateException("name is null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
