import java.time.LocalDate;

public class Main {
    // Задача №1
    public static void leapYear (int a){
        if (a % 4 ==0 && a % 100 != 0 || a % 400 == 0 )
            System.out.println(a+ " год — високосный год");
        else {
            System.out.println(a+ " год — невисокосный год");
        }
    }

    // Задача №2
    public static void operatingSystem(int a, int b) {
        if (a < 2015 && b == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (a >= 2015 && b == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (a < 2015 && b == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (a >= 2015 && b == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    // Задача №3
    public static int deliveryDuration(int a) { // можно было бы и void  поставить
        int day = 0;
        if (a >= 0 && a <= 20 ) {
            day += 1;
            System.out.println("Потребуется дней: " + day);
        } else if (a > 20 && a <= 60) {
            day += 2;
            System.out.println("Потребуется дней: " + day);
        } else if (a > 60 && a <= 100) {
            day += 3;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
        return day;
    }



    public static void main(String[] args) {
        // Задача №1
        int year = 1900;
        leapYear(year);

        System.out.println();

        // Задача №2
        int clientOS = 1;
        //int clientDeviceYear = 2016;
        int currentYear = LocalDate.now().getYear();
        //operatingSystem(clientDeviceYear , clientOS);
        operatingSystem(currentYear , clientOS);

        System.out.println();

        // Задача №3
        int deliveryDistance = 95;
        deliveryDuration(deliveryDistance);


    }

}