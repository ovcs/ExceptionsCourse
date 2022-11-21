package Lesson2;

/*
* public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
*/

public class Task3 {
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static void firstVersion() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void secondVersion() {
        int a = 90;
        int b = 3;
        int[] abc = { 1, 2 };

        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Делить на ноль нельзя!");
        }

        printSum(23, 234);

        if (abc.length > 3) {
            abc[3] = 9;
        } else {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
}
