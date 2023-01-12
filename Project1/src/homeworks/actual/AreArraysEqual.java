package homeworks.actual;

import java.util.Arrays;
import java.util.Scanner;

public class AreArraysEqual {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Задайте длину первого массива:");
        int a1length = input.nextInt();
        System.out.println("Задайте длину второго массива:");
        int a2length = input.nextInt();

        int[] A1 = new int[a1length];
        int[] A2 = new int[a2length];

        System.out.println("Задайте значения первого массива, разделяя их Enter");
        for (int i = 0; i < a1length; i++) {

            A1[i] = input.nextInt();
        }

        System.out.println("Задайте значения второго массива, разделяя их Enter");
        for (int i = 0; i < a2length; i++) {
            A2[i] = input.nextInt();

        }
        System.out.println("Результат метода Arrays: " + equalMethod(A1, A2));
        System.out.println("Результат моего метода: " + myEqualMethod(A1, A2));

        input.close();

    }
    public static boolean equalMethod (int[] X, int[] Y) {
        return Arrays.equals(X, Y);
    }
    public static boolean myEqualMethod (int[] X, int[] Y) {
        if (X.length == Y.length) {
            for (int i = 0; i < X.length; i++) {
                if (X[i] == Y[i]) {continue;}
                    else break;
            }
            return true;

        } else return X.length == Y.length;
    }
}
