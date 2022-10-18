package programme;

import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {
        String result;
        char grade;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student name");
        String name = s.nextLine();
        System.out.println("Enter Roll number");
        int rollNo = s.nextInt();
        System.out.println("Enter Maths marks");
        double maths = s.nextDouble();
        System.out.println("Enter English marks");
        double english = s.nextDouble();
        System.out.println("Enter Science marks");
        double science = s.nextDouble();
        double total = maths + english + science;
        double percentage = (total / 300) * 100;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "fail";
        }
        if ((maths >= 0 && maths <= 100) && (english >= 0 && english <= 100) && (science >= 0 && science <= 100)) {
            if (percentage >= 80) {
                grade = 'A' + '+';
            } else if (percentage >= 60) {
                grade = 'A';
            } else if (percentage >= 50) {
                grade = 'B';
            } else {
                grade = 'C';
            }
            System.out.println("|------------------------|");
            System.out.println("|       Mark Sheet       |");
            System.out.println("|------------------------|");
            System.out.println("|    Name:" + name + "       |");
            System.out.println("|    Roll No:" + rollNo + "  |");
            System.out.println("|------------------------|");
            System.out.println("|    Subject: Marks      |");
            System.out.println("|------------------------|");
            System.out.println("|    Maths:" + maths + "     |");
            System.out.println("|    Science:" + science + " |");
            System.out.println("|    English:" + english + " |");
            System.out.println("|------------------------|");
            System.out.println("|    Total:" + total + "     |");
            System.out.println("|------------------------|");
            System.out.println("|    Percentage:" + percentage + " ");
            System.out.println("|    Result:" + result + "      |");
            System.out.println("|    Grade:" + grade + "        |");
            System.out.println("|---------------------------|");
        }else
        {
            System.out.println("Invalid input, Marks should be between 0 to 100");
        }

    }
}


