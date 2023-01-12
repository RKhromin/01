package homeworks.previous;

import java.util.Scanner;

public class Arithmetic_mean {
    public static void main(String[] args) {
        double summ = 0;
        Scanner input = new Scanner(System.in);
        System.out.println ("Введи конечное число:");
        int end = input.nextInt();
        for (int a = 0; a <= end; a++) {
            summ = a + summ;
        }
            System.out.println("Сумма всех чисел от 0 до " + end + " = " + summ);
            System.out.println("Среднее арифметическое этих чисел = " + summ/(end+1));

            input.close();
        }
    }
