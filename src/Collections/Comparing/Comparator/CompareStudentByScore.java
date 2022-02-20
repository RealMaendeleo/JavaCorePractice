package Collections.Comparing.Comparator;

import java.util.Comparator;

public class CompareStudentByScore implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageScore(), o2.getAverageScore());
    }
}
