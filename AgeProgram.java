import java.util.Scanner;

public class AgeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your age is " + age);
        if (age < 18) {
    System.out.println("You are under 18.");
} else {
    System.out.println("You are an adult.");
}

        scanner.close();
    }
}
