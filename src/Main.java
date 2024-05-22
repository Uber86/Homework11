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
        }
        if (a >= 2015 && b == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (a < 2015 && b == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (a >= 2015 && b == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ( b < 0 || b > 1) {
            System.out.println("Такой операционной системы нет");
        }
    }

    // Задача №3
    public static int deliveryDuration(int a) { // можно было бы и void  поставить
        if (a  > 100) {
            return -1 ;
        }
        int day = 1;
        if (a >= 20 ) {
            day++;
        }
        if (a >= 60) {
            day++;
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
        int clientDeviceYear = 2014;
        operatingSystem(clientDeviceYear , clientOS);


        System.out.println();

        // Задача №3

        int days = deliveryDuration(60);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }


    }

}