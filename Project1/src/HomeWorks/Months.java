package HomeWorks;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        // 1. Создайте класс Months.
        // 2. Создайте точку входа.
        // 3. Вывод месяцев через switch case.
        // 4. Получить через Scanner номер месяца и вывести в консоль название месяца.
        // 6. Пропишите случай когда ввод неверный.

        Scanner MonthsNumber = new Scanner(System.in);
        int Number;
        String Months = null;


        System.out.println("Введи порядковый номер месяца 01-12:");
        Number = MonthsNumber.nextByte();


        switch (Number){
            case 1: {Months="Январь";System.out.println("Текущий месяц: " + Months);break;}
            case 2: {Months="Февраль";System.out.println("Текущий месяц: " + Months);break;}
            case 3: {Months="Март";System.out.println("Текущий месяц: " + Months);break;}
            case 4: {Months="Апрель";System.out.println("Текущий месяц: " + Months);break;}
            case 5: {Months="Май";System.out.println("Текущий месяц: " + Months);break;}
            case 6: {Months="Июнь";System.out.println("Текущий месяц: " + Months);break;}
            case 7: {Months="Июль";System.out.println("Текущий месяц: " + Months);break;}
            case 8: {Months="Август";System.out.println("Текущий месяц: " + Months);break;}
            case 9: {Months="Сентябрь";System.out.println("Текущий месяц: " + Months);break;}
            case 10: {Months="Октябрь";System.out.println("Текущий месяц: " + Months);break;}
            case 11: {Months="Ноябрь";System.out.println("Текущий месяц: " + Months);break;}
            case 12: {Months="Декабрь";System.out.println("Текущий месяц: " + Months);break;}
            default: {
                System.out.println("Номер месяца введен некорректно. Тебе придётся запустить этот код еще раз, потому что я еще не разобрался как сделать цикл!");
            }
        }



    }
}
