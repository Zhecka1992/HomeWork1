package HomeWork4_1;

import java.util.Scanner;

public class FloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three float numbers: ");
        float float1 = scanner.nextFloat();
        float float2 = scanner.nextFloat();
        float float3 = scanner.nextFloat();

        boolean allInRange = checkFloatRange(float1) && checkFloatRange(float2) && checkFloatRange(float3);
        System.out.println("Do all float numbers belong to the range [-5, 5]? " + allInRange);
    }

    public static boolean checkFloatRange(float num) {
        return  num >= -5 && num <= 5;
    }
}
