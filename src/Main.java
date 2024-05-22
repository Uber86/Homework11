import java.time.LocalDate;

public class Main {
    // Задача №1
    public static void leapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
            System.out.println(a + " год — високосный год");
        else {
            System.out.println(a + " год — невисокосный год");
        }
    }

    // Задача №2
    public static void operatingSystem(int a, int b) {
        int currentYear = LocalDate.now().getYear();
        if (b == 0 || b == 1) {
            if (a < currentYear && b == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            if (a == currentYear && b == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            if (a < currentYear && b == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (a == currentYear && b == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Такой операционной системы нет");
        }
    }

    // Задача №3
    public static int deliveryDuration(int a) { // можно было бы и void  поставить
        if (a > 100) {
            return -1;
        }
        int day = 0;
        if (a >= 0) {
            ++day;
        }
        if (a >= 20) {
            ++day;
        }
        if (a >= 60) {
            ++day;
        }
        return day;
    }


    public static void main(String[] args) {
        // Задача №1
        int year = 1900;
        leapYear(year);

        System.out.println();

        // Задача №2
        int clientOS = 2;
        int clientDeviceYear = 2023;
        operatingSystem(clientDeviceYear, clientOS);


        System.out.println();

        // Задача №3
        int distans = deliveryDuration(10);
        var deliviry = distans > 0 ? "Потребуется дней: " + distans : "Доставки нет";
        System.out.println(deliviry);

    }

}