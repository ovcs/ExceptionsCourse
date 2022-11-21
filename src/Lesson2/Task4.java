package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void takeString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        while (str.isEmpty()) {
            System.out.println("Введена пустая строка!");
            System.out.print("Введите строку: ");
            str = sc.nextLine();
        }
    }

    public static void main(String[] args) {
        takeString();
    }
}
