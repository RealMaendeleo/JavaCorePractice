package Collections.Comparing.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Semen", "Bodrov", 21, 3.7));
        students.add(new Student("Ivan", "Fedorov", 18, 4.7));
        students.add(new Student("Semen", "Kapustin", 21, 4.2));
        students.add(new Student("Semen", "Bodrov", 21, 4.4));
        students.add(new Student("Andrew", "Tabakov", 21, 4.2));

        System.out.println("By name");
        students.sort(new CompareStudentByName());
        System.out.println(students);
        System.out.println();

        System.out.println("By age");
        students.sort(new CompareStudentByAge());
        System.out.println(students);
        System.out.println();

        System.out.println("By score");
        students.sort(new CompareStudentByScore());
        System.out.println(students);
        System.out.println();

        System.out.println("By name -> by age -> by score");
        students.sort(new CompareStudentByName()
                .thenComparing(new CompareStudentByAge())
                .thenComparing(new CompareStudentByScore())
        );
        System.out.println(students);
    }
}
