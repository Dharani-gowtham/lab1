import java.util.Scanner;

public class Testarray{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        float a[][]=new float[2][2];//declaration and instantiation


        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print("Enter Value for a["+i+"]["+j+"]: ");
                a[i][j] = scanner.nextFloat();
            }
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}