package programme;

public class TaskSixteen {
    static  void checkNumber(int num){
        if(num>0)
            System. out. println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System. out. println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");



}

    public static void main(String[] args) {
        checkNumber(20);
        checkNumber(-15);
        checkNumber(0);
    }

    }


