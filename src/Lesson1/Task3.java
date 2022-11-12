package Lesson1;

/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class Task3 {
    public static int[] setsDifference(int[] first, int[] second) {
        if (first.length != second.length) {
            throw new RuntimeException("Sets doesn't have same length");
        }

        int[] res = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            res[i] = first[i] - second[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] diff = setsDifference(new int[]{1, 2, 3, 4}, new int[]{5, 4, 3, 2, 1});
    }
}
