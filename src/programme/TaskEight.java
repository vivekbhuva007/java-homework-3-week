package programme;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character from A to F");
        char ch = scanner.next().charAt(0);

        if ('A' == ch) {
            System.out.println("Ahmedavad is my city");

        } else if (ch == 'B') {
            System.out.println("Baroda is my city");

        } else if (ch == 'C') {
            System.out.println("Chotila is my city");
        } else if (ch == 'D') {
            System.out.println("Daman is my city");
        } else if (ch == 'E') {
            System.out.println("Edinbrugh is my city");

        } else if (ch == 'F') {
            System.out.println("Florance is my city");

        }
        else {
            System.out.println("Invalid city name");

        }


    }
}
