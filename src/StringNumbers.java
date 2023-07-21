import java.util.Scanner;

public class StringNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, height;
        System.out.print("Enter the age: ");
        age = scanner.nextInt();
        System.out.print("Enter the height: ");
        height = scanner.nextInt();
        if ((age >= 18 && age <= 60) && (height > 150 && height < 200)){
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }
}