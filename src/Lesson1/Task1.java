package Lesson1;

/*
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 * */

public class Task1 {
    private static int methodThrowArithmeticException() {
        return 33 / 0;
    }

    private static int methodThrowArrayIndexOutOfBoundsException() {
        int[] arr = new int[5];
        return arr[7];
    }

    private static String methodThrowNullPointerException() {
        return new String().toLowerCase(null);
    }

    public static void main(String[] args) {
        // System.out.println(methodThrowArithmeticException());
        // System.out.println(methodThrowArrayIndexOutOfBoundsException());
        // System.out.println(methodThrowNullPointerException());
    }
}



