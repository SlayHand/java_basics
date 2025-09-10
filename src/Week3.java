import java.util.Scanner;
public class Week3 {

    public static void main(String[] args) {
        System.out.println("ÜL 43");
        ul43();

        System.out.println("Ül 44");
        ul44();

        System.out.println("Ül 45");
        ul45();

        System.out.println("Ül 46");
        ul46();





    }
    public static void ul43() {
        int answer = sum(4, 3, 6, 1);
        System.out.println("sum: " + answer);
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
/// ///

    public static int least(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public static void ul44() {
        int answer =  least(2, 7);
        System.out.println("Least: " + answer);
    }

    /// ///

    public static int greatest(int number1, int number2, int number3) {
        return Math.max(number1, Math.max(number2, number3));
    }

    public static void ul45() {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

    /// ///

    public static double average(int number1, int number2, int number3, int number4) {
        return (double) (number1 + number2 + number3 + number4) / 4;
    }

    public static void ul46() {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }

}