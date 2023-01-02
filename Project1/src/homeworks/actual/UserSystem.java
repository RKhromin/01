package homeworks.actual;

import java.util.Objects;
import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "Password";
        String username1;
        String password1;
        int count = 0;
        Scanner data = new Scanner(System.in);


        while (count != 5) {
            System.out.println("Введи Имя пользователя:");
            username1 = data.nextLine();
            System.out.println("Введи пароль:");
            password1 = data.nextLine();

            if (Objects.equals(username1, username) && Objects.equals(password1, password)) {
                System.out.println("Поздравляем, вы успешно вошли в систему как "+username);
                break;
            } else {
                count++;
                System.out.println("Данные введены неверно. Вы использовали " + count + " из 5 попыток");



            }
        }
    }}



