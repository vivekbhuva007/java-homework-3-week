package programme;

//import java.util.Scanner;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales id:       ");
        int salesId = scanner.nextInt();

        System.out.println("Enter seller's name:   ");
        String sellerName = scanner.next();

        System.out.println("Enter sales amount:   ");
        double salesAmount = scanner.nextDouble();

        System.out.println("Enter basic salary:          ");
        float basicSalary = scanner.nextFloat();

        if (salesAmount >= 50000) {
            System.out.println("Commission is   " + salesAmount * 35 / 100);
        } else if (salesAmount >= 30000) {
            System.out.println("Commission is   " + salesAmount * 20 / 100);

        } else if (salesAmount >= 20000) {
            System.out.println("Commission is   " + salesAmount * 10 / 100);


        } else if (salesAmount >= 10000) {
            System.out.println("Commission is   " + salesAmount * 5 / 100);
        } else
            System.out.println("Commission is   " + salesAmount * 2 / 100);
    }
}

