package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        ListIterator<String> listIter = states.listIterator();
        while (listIter.hasNext()) {
            String item = listIter.next();
            if (item.equals("France")) {
                listIter.remove();
            } else {
                System.out.println(item);
            }
        }
        System.out.println();

        listIter.set("Португалия");  // Заменили Spain на Португалию
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }
    }
}
