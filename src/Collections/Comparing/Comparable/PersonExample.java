package Collections.Comparing.Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(111, "Ruslan", "Ivanov"),
                new Person(29, "Mark", "Petrov"),
                new Person(111, "Masha", "Belova")
        );
        Collections.sort(personList);
        System.out.println(personList);
    }
}
