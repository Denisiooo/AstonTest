package test3;

//Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]  необходимо написать программу,
// которая выведет в консоль все чётные числа.

public class EvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (Integer a : array) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
    }
}
