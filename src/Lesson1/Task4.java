package Lesson1;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь
может увидеть - RuntimeException, т.е. ваше.*/

public class Task4 {
    public static int[] setsDivide(int[] first, int[] second) {
        if (first == null || second == null) {
            throw new RuntimeException("One of sets is nullable object");
        }

        if (first.length != second.length) {
            throw new RuntimeException("Sets doesn't have same length");
        }

        int[] res = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            if (second[i] == 0) {
                throw new RuntimeException("Divide by zero");
            }
            res[i] = first[i] / second[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] diff = setsDivide(new int[]{1, 2, 3, 4}, new int[]{5, 4, 3, 2, 1});
    }
}
