package programme;

import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {
        String city;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character from A to F: ");
        city = scanner.nextLine();

        switch (city) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Chotila");
                break;
            case "D":
                System.out.println("Daman");
                break;
            case "E":
                System.out.println("Edingburgh");
                break;
            case "F":
                System.out.println("Florance");
                break;


            default:
                System.out.println("Invalid entry");
                scanner.close();


        }

    }
}
