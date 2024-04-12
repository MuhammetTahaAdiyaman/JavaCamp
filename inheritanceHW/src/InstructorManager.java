public class InstructorManager extends UserManager{
    public void giveLesson(Instructor instructor ) {
        System.out.println(instructor.getFirstName() + instructor.getLastName() + " ders veriyor.");
    }
}
