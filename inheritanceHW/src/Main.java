//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setPassword("1234");
        instructor.givenLessons.add("Java Nitelikli Yazılım Geliştirici");
        instructor.givenLessons.add("Javascript Nitelikli Yazılım Geliştirici");

        Student student = new Student();
        student.setId(2);
        student.setEmail("tadiyaman@gmail.com");
        student.setFirstName("Taha");
        student.setLastName("Adıyaman");
        student.setPassword("1234");
        student.takenCourses.add("Java Nitelikli Yazılım Geliştirici");

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        userManager.logIn(student);
        studentManager.attendLesson(student);
        instructorManager.logOut(instructor);

    }
}