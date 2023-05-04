// 4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.util.Scanner;
import java.time.LocalTime;

public class program4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите ваше имя: ");
        String name = iScanner.nextLine();
        int time = LocalTime.now().getHour();
        if (time >= 5 && time < 12) {
            System.out.printf("Доброе утро, %s!%n", name, "!");
        } else if (time >= 12 && time < 18) {
            System.out.printf("Добрый день, %s!%n", name, "!");
        } else if (time >= 18 && time < 23) {
            System.out.printf("Добрый вечер, %s!%n", name, "!");
        } else {
            System.out.printf("Добрый ночи, %s!%n", name, "!");
        }

    }

}
