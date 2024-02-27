

public class App {
    public static void checkAge(Student student) {
        if (student.getAge() < 18) {
            System.out.println("You are not allowed.");
        } else {
            System.out.println("You are allowed.");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("sattar", 15);
        checkAge(student);
    }
}
