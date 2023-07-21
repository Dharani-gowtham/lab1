package TestPrograms;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Square\n2. Rectangle\n3. Circle\n4. Triangle\nEnter the Options: ");
        int options = scanner.nextInt();

        switch (options){
            case 1:
                System.out.print("Enter the side for the area: ");
                int area = scanner.nextInt();
                System.out.println("Area of Square is : " + area(area));
                break;
        }
    }

    public static int area(int side){
        return (side * side);
    }
}
