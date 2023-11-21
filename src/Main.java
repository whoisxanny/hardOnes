import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        taks2();
    }


    public static void task1() {
        System.out.println("Task 1");
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": " + "ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": " + "ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": " + "pong");
            } else {
                System.out.println(i + ": ");
            }
        }
        System.out.println();
    }


    public static void taks2() {
        System.out.println("Task 2");
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;


        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

    }


}