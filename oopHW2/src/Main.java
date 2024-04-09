import java.nio.charset.CoderResult;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor(1,"Engin Demiroğ");
        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setName("Halit Enes Kalaycı");

        Course course1 = new Course(1,"C#+Angular",0,instructor1);
        Course course2 = new Course();
        course2.setId(2);
        course2.setName("Javascript");
        course2.setInstructor(instructor1);
        course2.setPrice(0);
        Course course3 = new Course(3,"Java+React",0,instructor1);
        Course course4 = new Course(4,"Python+Selenium",0,instructor2);

        Course[] courses = {course1,course2,course3,course4};

        for(Course course:courses){
            System.out.println("Kurs:"+course.getName());
        }

        CourseManager courseManager = new CourseManager();
        courseManager.joinTheCourse(course1);
        courseManager.joinTheCourse(course4);
    }
}