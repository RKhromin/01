package homeworks.previous;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        int border1 = 0;
        int border2 = 14;

        int border3 = 15;
        int border4 = 35;

        int border5 = 36;
        int border6 = 50;

        int border7 = 50; // Число 50 будет попадать в две группы, кажется ошибка, но делаю по ТЗ
        int border8 = 100;

        Scanner input = new Scanner(System.in);
        System.out.println("Задайте число от 0 до 1000:");
        int number = input.nextInt();

        if (number >= border1 && number <= border2) {
            System.out.println(" Число входит в группу #1 от " + border1 + " до " + border2);
        }
        if (number >= border3 && number <= border4) {
            System.out.println(" Число входит в группу #2 от " + border3 + " до " + border4);
        }
        if (number >= border5 && number <= border6) {
            System.out.println(" Число входит в группу #3 от " + border5 + " до " + border6);
        }
        if (number >= border7 && number <= border8) {
            System.out.println(" Число входит в группу #4 от " + border7 + " до " + border8);
        }
        if (number < border1 || number > border8) {
            System.out.println("Указанное число не входит ни в одну из заданных групп");
        }
        input.close();
    }
}
