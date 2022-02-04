package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        List<Integer> linkList = new LinkedList<>();
        linkList.add(4);
        linkList.add(5);
        linkList.add(6);

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i) + "-" + linkList.get(i));
        }
    }
}
