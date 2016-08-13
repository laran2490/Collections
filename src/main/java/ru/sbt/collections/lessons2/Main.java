package ru.sbt.collections.lessons2;

import java.util.*;

/**
 * Created by LL on 11.08.2016.
 */
public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Bob");
        Person person2 = new Person("Ivan");

        Set<Person> personSet = new HashSet<>();

        personSet.addAll(Arrays.asList(
                new Person("person1"),
                new Person("person2")
        ));

        ArrayList<Person> personList = new ArrayList<>(personSet);
        getSortedByName(personList);

        Collections.sort(personList);

        System.out.println(personList);
    }

    private static void getSortedByName(List<Person> personList) {

        getSorted(personList, new PersonComparatorByName());
    }

    private static void getSorted(List<Person> personList, Comparator<Person> personComparator) {
        Collections.sort(personList, personComparator);
    }

    private static class PersonComparatorByName implements Comparator<Person> {
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
