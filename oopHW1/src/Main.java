//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1,"C#+Angular","Yazılım Geliştirici Yetiştirme Kampı",0);
        Course course2 = new Course();
        course2.setId(2);
        course2.setName("Javascript");
        course2.setDetail("Yazılım Geliştirici Kampı");
        course2.setUnitPrice(0);
        Course course3 = new Course(3,"Java+React","Yazılım Geliştirici Yetiştirme Kampı",0);
        Course course4 = new Course(4,"Java","Yazılım Geliştirici Yetiştirme Kampı",0);

        Course[] courses = {course1,course2,course3,course4};

        for(Course course:courses){
            System.out.println(course.getName());
        }

        //teacher
        Instructor instructor1 = new Instructor(1,"Engin Demiroğ");
        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setName("Halit Enes Kalaycı");

        Instructor[] instructors = {instructor1,instructor2};

        for(Instructor instructor:instructors){
            System.out.println(instructor.getName());
        }

        CourseManage courseManage = new CourseManage();
        courseManage.joinTheCourse(course1);

        InstructorManage instructorManage = new InstructorManage();
        instructorManage.selectInstructor(instructor2);
    }
}