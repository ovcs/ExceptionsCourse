package Lesson2;

/*
 * Задание 2
 * try {
 *    int d = 0;
 *    double catchedRes1 = intArray[8] / d;
 *    System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *    System.out.println("Catching exception: " + e);
 * }
 */

public class Task2 {
    public static void firstVersion() {
        try {
            int d = 0;
            int[] intArray = new int[8];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void secondVersion() {
        int d = 0;
        int[] intArray = new int[8];

        if (d != 0 && intArray.length > 8) {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            System.out.println("Wrong values");
        }
    }
}
