package homeworks.previous;

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

       // while (Number != 1 | Number != 2) {
       //     System.out.println("Номер месяца введен некорректно.\nПожалуйста, введи порядковый номер месяца 01-12:  ");
        //    Number = MonthsNumber.nextByte();
       // }

        switch (Number){
            case 1: {Months="Январь";break;}
            case 2: {Months="Февраль";break;}
            case 3: {Months="Март";break;}
            case 4: {Months="Апрель";break;}
            case 5: {Months="Май";break;}
            case 6: {Months="Июнь";break;}
            case 7: {Months="Июль";break;}
            case 8: {Months="Август";break;}
            case 9: {Months="Сентябрь";break;}
            case 10: {Months="Октябрь";break;}
            case 11: {Months="Ноябрь";break;}
            case 12: {Months="Декабрь";break;}
            default: {
                System.out.println("Номер месяца введен некорректно. Тебе придётся запустить этот код еще раз, потому что я еще не разобрался как сделать цикл");
            }
        }

        System.out.println("Текущий месяц: " + Months);

    }
}
