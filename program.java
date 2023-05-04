// 1. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, 
// каждая ячейка которого равна initialValue;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int len = iScanner.nextInt();
        System.out.printf("Введите значение массива: ");
        int initialValue = iScanner.nextInt();
        int[] arr = new int[len];
        for (int i : arr) {
            i = initialValue;
            System.out.print(i + " ");
        }
    }
}
