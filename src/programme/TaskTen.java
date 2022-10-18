package programme;
import java.util.Scanner;
public class TaskTen {

        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Input first number:");
            int num1=s.nextInt();
            System.out.println("Input second number");
            int num2=s.nextInt();
            System.out.println("Enter your symbol:");
            char ch=s.next().charAt(0);
            if(ch=='+')
            {
                int sum=num1+num2;
                System.out.println("Addition of two numbers: " +sum);
            }else if(ch=='-')
            {
                int sub=num1-num2;
                System.out.println("Difference of two numbers: " +sub);
            }else if(ch=='*')
            {
                int mul=num1*num2;
                System.out.println("Division between two numbers: " +mul);
            }else if(ch=='/')
            {
                int div=num1/num2;
                System.out.println("Division of two numbers: " +div);
            }

        }
    }