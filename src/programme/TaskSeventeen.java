package programme;

import java.util.Arrays;

public class TaskSeventeen {
    public static void main(String[] args) {
        int[] num={4,5,6,7,8};
        String[] obj={"Vivek", "Dhara"};

        Arrays.toString(num);
        Arrays.toString(obj);


        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(obj));

        Arrays.sort(num);
        Arrays.sort(obj);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(obj));

    }
}
