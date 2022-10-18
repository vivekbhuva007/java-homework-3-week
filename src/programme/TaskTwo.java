package programme;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("INPUT YEAR");
        year = in.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("LEAP YEAR");
            } else if (year % 400 == 0) {
                System.out.println("LEAP YEAR");
            } else
                System.out.println("REGULAR YEAR");
        } else
            System.out.println("REGULAR YEAR");
    }
}

