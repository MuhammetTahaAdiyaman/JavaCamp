public class StudentManager extends UserManager{
    public void attendLesson(Student student ) {
        System.out.println(student.getFirstName() + student.getLastName() + " derse katılıyor.");
    }
}
