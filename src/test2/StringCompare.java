package test2;

import java.util.Scanner;

//Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в
// консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"


public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s1 = sc.nextLine();
        System.out.println("Введите вторую строку");
        String s2 = sc.nextLine();
        sc.close();

        if (s1.equals(s2)) {
            System.out.println("Результат: Строки идентичны");
        } else {
            System.out.println("Результат: Строки не идентичны");
        }
    }
}
