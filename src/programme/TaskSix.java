package programme;

import java.util.Scanner;

public class TaskSix {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number");
           int number = scanner.nextInt();


            //checking whether the number is even or odd

            if (number % 2 == 0)
                System.out.println(number + " is Even");
            else
                System.out.println(number + " is odd");


        }
    }

