import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt(); // Number of rows to print

        for (int i = 0; i < rows; i++) {
            // Printing spaces
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
