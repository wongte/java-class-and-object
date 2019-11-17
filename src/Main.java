import model.Student;

public class Main {
    public static void main(String[] s) {
        Student student = new Student();
        student.setAge(18);
        student.setGender("Male");
        student.setIdNo("ABC123456");
        student.setName("Chan Dai Man");
        System.out.println("Student's name :" + student.getName());
        System.out.println("Student's id no :" + student.getIdNo());
        System.out.println("Student's gender :" + student.getGender());
        System.out.println("Student's age :" + student.getAge());
    }

}
