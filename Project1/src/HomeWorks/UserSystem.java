package HomeWorks;

import java.util.Objects;
import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {

        String username = "Admin";
        String password = "P@ssword";
        String username1;
        String password1;
        Scanner data = new Scanner(System.in);

        System.out.println("Введи Имя пользователя:");
        username1 = data.nextLine();

        if (!Objects.equals(username1, username)) {
            System.out.println("Нет пользователя с таким именем!");
        } else {

            System.out.println("Введи пароль:");
            password1 = data.nextLine();
            if (!Objects.equals(password1, password)) {
                System.out.println("Вы ввели неверный пароль!");
            }else {
                System.out.println("Здравствуйте, "+ username + ". Вы успешко вошли в систему!" );
            }

        }
    }
}


