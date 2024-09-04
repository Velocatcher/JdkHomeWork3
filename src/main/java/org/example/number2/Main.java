package org.example.number2;
/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую
длину и содержать элементы одного типа по парно по индексам.
*/

public class Main {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        System.out.println(compareArrays(array1, array2)); // Output: true

        String[] array3 = {"a", "b", "c"};
        String[] array4 = {"a", "b", "d"};
        System.out.println(compareArrays(array3, array4)); // Output: false
    }
}
