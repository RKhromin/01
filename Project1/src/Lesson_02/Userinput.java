package Lesson_02;

import java.util.Locale;
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {


        String name;
        int age;
        double grade;

        Scanner newcase = new Scanner(System.in);
        newcase.useLocale(Locale.US);

        System.out.println("Введи имя:");
        name = newcase.nextLine();

        System.out.println("Введи возраст:");
        age =  newcase.nextInt();

        System.out.println("Введи оценки:");
        grade =  newcase.nextDouble();

        System.out.println("Тебя зовут "+name);
        System.out.println("Твой возраст: "+age);
        System.out.println("Твой средний балл: "+grade);
        System.out.println("ЗБС");
    }
}
