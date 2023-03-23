

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Triangle number " + triangleNum(number));
        System.out.printf("Factorial number = %d", factNum(number));
        sc.close();
    }


    public static int triangleNum(int number) {
        int triangleNumber = (number * (number + 1)) / 2;
        return triangleNumber;
    }

    public static int factNum(int number) {
        if (number == 0) return 1;
        return number*factNum(number-1);

    }
}