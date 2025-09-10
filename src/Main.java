//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        System.out.println("ÜL 1");
        System.out.println("Jane doe");
        System.out.println();

        ///

        System.out.println("ÜL 2");
        System.out.println("Hello world!\n(And all the peoplee of the world)");
        System.out.println();

        ///

        System.out.println("Ül 3");
        System.out.println("⣿⣿⣿⠟⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢋⣩⣉⢻⣿⣿");
        System.out.println("⣿⣿⣿⠀⣿⣶⣕⣈⠹⠿⠿⠿⠿⠟⠛⣛⢋⣰⠣⣿⣿⠀⣿⣿");
        System.out.println("⣿⣿⣿⡀⣿⣿⣿⣧⢻⣿⣶⣷⣿⣿⣿⣿⣿⣿⠿⠶⡝⠀⣿⣿");
        System.out.println("⣿⣿⣿⣷⠘⣿⣿⣿⢏⣿⣿⣋⣀⣈⣻⣿⣿⣷⣤⣤⣿⡐⢿⣿");
        System.out.println("⣿⣿⣿⣿⣆⢩⣝⣫⣾⣿⣿⣿⣿⡟⠿⠿⠦⠀⠸⠿⣻⣿⡄⢻");
        System.out.println("⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣾⣿⣿⣿⣿⠇⣼");
        System.out.println("⣿⣿⣿⣿⣿⣿⡄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣰⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⠇⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⠏⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿");
        System.out.println("⣿⣿⣿⣿⠟⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿");
        System.out.println("⣿⣿⣿⠋⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⣿⣿");
        System.out.println("⣿⣿⠋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿");
        System.out.println();

        ///

        System.out.println("ül 4");
        int wholeNumber = 3;
        double decimalNumber = 5.5;
        String text = "There is none!";
        System.out.println("Chickens:\n" + wholeNumber);
        System.out.println("Bacon (kg)\n" + decimalNumber);
        System.out.println("A tractor:\n" + text);
        System.out.println();
        System.out.println("In a nutshell:\n" + wholeNumber + "\n" + decimalNumber + "\n" + text);
        System.out.println();

        wholeNumber = 9000;
        decimalNumber = 0.1;
        text = "Zetor";
        System.out.println("Chickens:\n" + wholeNumber);
        System.out.println("Bacon (kg)\n" + decimalNumber);
        System.out.println("A tractor:\n" + text);
        System.out.println();
        System.out.println("In a nutshell:\n" + wholeNumber + "\n" + decimalNumber + "\n" + text);
        System.out.println();

        ///

        System.out.println("Ül 5");
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        int result = days * hours * minutes * seconds;
        System.out.println("There are " + result + " seconds in a year.");
        System.out.println();

        ///

        System.out.println("Ül 6");
        int x = 5;
        int y = 4;
        int z = x+y;
        System.out.println(x + " + " + y + " = " + z);
        System.out.println();

        x = 73457;
        y = 12888;
        z = x+y;
        System.out.println(x + " + " + y + " = " + z);
        System.out.println();

        ///

        System.out.println("Ül 7");
        x = 2;
        y = 8;
        z = x*y;
        System.out.println(x + " * " + y + " = " + z);
        System.out.println();

        x = 277;
        y = 111;
        z = x*y;
        System.out.println(x + " * " + y + " = " + z);
        System.out.println();

        ///

        System.out.println("Ül 8");
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int second = Integer.parseInt(reader.nextLine());

        int sum = first + second;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println();

        ///

        System.out.println("Ül 9");
        System.out.print("Type a number: ");
        double a = Double.parseDouble(reader.nextLine());

        System.out.print("Type another number: ");
        double b = Double.parseDouble(reader.nextLine());

        double  divide = a  / b;
        System.out.println("Division: " + a +" / " + b + " = " + divide);
        System.out.println();

        ///

        System.out.println("Ül 10");
        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());

        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println();

        ///

        System.out.println("Ül 11");
        System.out.print("Type a number: ");
        first =  Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        second =  Integer.parseInt(reader.nextLine());

        int bigger = Math.max(first, second);

        System.out.println("The bigger number of the two numbers given was : " + bigger);
        System.out.println();

        ///

        System.out.println("Ül 12");
        System.out.print("Type your name: ");
        String namea = reader.nextLine();
        System.out.print("Type your age: ");
        int agea = Integer.parseInt(reader.nextLine());

        System.out.println("Type your name: ");
        String nameb = reader.nextLine();
        System.out.print("Type your age: ");
        int ageb = Integer.parseInt(reader.nextLine());

        int agecalc = agea + ageb;

        System.out.println(namea + " and " + nameb + "are  " + agecalc + " years old in total.");
        System.out.println();

        ///

        System.out.println("Ül 13");

        ///

        System.out.println("Ül 14");
        System.out.println("Type a number");
        int number = Integer.parseInt(reader.nextLine());
        if (number > 0) {
            System.out.println("Your number is positive");
        } else if (number < 0) {
            System.out.println("Your number is negative");
        } else {
        System.out.println("Your number is zero");
        }
        System.out.println();
    }
}