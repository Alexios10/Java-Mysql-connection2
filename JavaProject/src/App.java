import java.util.Scanner;

public class App {

    static int x = 1;
    static int y = 2;

    static int temp;


    public static void main(String[] args) {

        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);


//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Whats ur name ");
//            String name = scanner.nextLine();
//
//            System.out.println("How old are you");
//            int age = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Whats ur hobby");
//            String hobby = scanner.nextLine();
//
//            System.out.println("Hello " + name);
//            System.out.println("You are " + age + " years old");
//            System.out.println("You hobby is " + hobby);
//        } catch (Exception e) {
//
//            System.out.println("Somthing went wrong: ");
//            System.err.println(e);
//        }

    }
}
