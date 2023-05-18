package HomeWork4_2;


import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integer numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maximum = findMaximum(num1, num2, num3);
        int minimum = findMinimum(num1, num2, num3);

        System.out.println("Maximum value: " + maximum);
        System.out.println("Minimum value: " + minimum);
    }

    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static int findMinimum(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}