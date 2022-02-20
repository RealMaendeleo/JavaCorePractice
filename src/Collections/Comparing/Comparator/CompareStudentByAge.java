package Collections.Comparing.Comparator;

import java.util.Comparator;

public class CompareStudentByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
