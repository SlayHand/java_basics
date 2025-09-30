import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {
        System.out.println("ÜL 32");
        ul32();

        System.out.println("Ül 37");
        ul37();
    }

    public static void ul32() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Until what? ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum is " + sum);

        scanner.close();
    }
///  ///
    public static void ul37() {
        printText();
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}

