package Collections.Comparing.Comparator;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int age;
    private double averageScore;

    public Student(String firstName, String lastName, int age, double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return firstName + lastName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return '\'' + firstName + '\'' +
                ", '" + lastName + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}' + '\n';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.averageScore, averageScore);
    }
}
