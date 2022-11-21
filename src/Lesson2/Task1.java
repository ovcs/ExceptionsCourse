package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static float takeFloatNumber(String header) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s", header);
        while(sc.hasNext()) {
            if(sc.hasNextFloat()) {
                return sc.nextFloat();
            } else {
                sc.next();
                System.out.printf("%s", header);
            }
        }
        sc.close();
        return 0;
    }

    public static void main(String[] args) {
        float x = takeFloatNumber("Введите число: ");
    }
}
