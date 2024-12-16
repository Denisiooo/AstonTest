package test1;

import java.util.Scanner;

// Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
// - сравнивает эти два числа и возвращает результат сравнения путем вывода в
// консоль одного из вариантов: "a > b", "a < b" или "a = b";
// - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.


public class NumberCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        sc.close();

        if (a > b) {
            System.out.println("Результат: a > b");
        } else if (a < b) {
            System.out.println("Результат: a < b");
        } else {
            System.out.println("Результат: a = b");
        }
        System.out.println("\nАрифметические действия:\n");
        System.out.println("Результат сложения a + b = " + (a + b));
        System.out.println("Результат вычитания a - b = " + (a - b));
        if (b == 0) {
            System.out.println("Нельзя делить на ноль");
        } else {
            System.out.println("Результат деления a / b = " + (a / b));
        }
        System.out.println("Результат умножения a * b = " + (a * b));
    }
}
