import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    List<String> takenCourses = new ArrayList<>();

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
    }
}
