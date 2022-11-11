public class Main {
    public static void main(String[] args) {
        //lesson 1//
        // home work 1, task1 1//
        for (int i = 0; i <= 10; i++)
            System.out.println("1 iteration " +i);
        System.out.println(" ");
        System.out.println("ДЗ 1, Задание 2");
        System.out.println("  ");

        // home work 1, task 2//

        for(int i= 10; i > 0; i--)
            System.out.println("2 iteration " +i);
        System.out.println(" ");
        System.out.println("ДЗ 1, Задание 3");
        System.out.println("  ");

        // home work 1, task 3//

        for (int i = 0; i < 18; i=i+2)
            System.out.println("3 iteration" + i);
        System.out.println(" ");
        System.out.println("ДЗ 1, Задание 4");
        System.out.println("  ");

        // home work 1, task 4 //

        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("4 iteration " + i);
            System.out.println(" ");
            System.out.println("ДЗ 2, Задание 1");
            System.out.println("  ");
        }
        // home work 2, task 1//

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
            System.out.println(" ");
            System.out.println("ДЗ 2, Задание 2");
            System.out.println("  ");
        }
        // home work 2, task 2//

        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("6 iteration " + i);
            System.out.println(" ");System.out.println("ДЗ 2, Задание 3");
            System.out.println("  ");
        }
        // home work 2, task 3//

        for (int i = 1; i < 513; i = i * 2) {
            System.out.println("7 iteration " + i);
            System.out.println(" ");System.out.println("ДЗ 3, Задание 1");
            System.out.println("  ");
        }
        // home work 3, task 1//

        int salary = 29000;
        int total = 0;
        int i = 0;
        for (i = 0; i < 12; i++) {
            total = total + salary;

            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
        }
        System.out.println(" ");System.out.println("ДЗ 3, Задание 2");
        System.out.println("  ");

        // home work 3, task 2//

        int salary_1 = 29000;
        int total_1 = 0;
        int i_1 = 1;
        for (i_1 = 1; i_1 < 12; i_1++) {
            total_1 = total_1 + total_1 / 100;
            total_1 = total_1 + salary_1;

            System.out.println("Месяц " + i_1 + " сумма накоплений равна " + total_1 + "рублей");
        }
        System.out.println("  ");
        System.out.println("lesson 1.2");
        System.out.println("ДЗ 1, Задание 1");
        System.out.println("  ");
        //lesson 1 is compite//

        //lesson 2//
        // home work 1, task 1//

        int salary_2 = 15_000;
        int total_2 = 0;
        int i_2 = 0;
        while (total_2 < 2_459_000) {
            total_2 = total_2 + total_2 / 100;
            total_2 = total_2 + salary_2;
            i_2 = i_2 + 1;

            System.out.println("Месяц " + i_2 + " сумма накоплений равна " + total_2 + " рублей");
        }
        System.out.println(" ");System.out.println("ДЗ 1, Задание 2");
        System.out.println("  ");

        /// home work 1, task 2//

        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number = number + 1;
        }
        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
        System.out.println("ДЗ 1, Задание 3");
        System.out.println("  ");

        // home work 1, task 3//

        int y = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 1;
        int rate = y + birthRate - deathRate;
        while (year < 11) {
            System.out.println("Год " + year + ", численность населения составляет " + rate);
            rate = rate + birthRate - deathRate;
            year = year + 1;
        }
        System.out.println(" ");
        System.out.println("ДЗ 2, Задание 1");
        System.out.println("  ");

        // home work 2, task 1//

        int check = 15_000;
        int month = 1;
        int totalCheck = 0;
        int totalMonth = 0;
        while (check < 12_000_000) {
            check = check + check * 7 / 100;
            month = month + 1;
            if (check < 12_000_000) {
                totalMonth = month + 1;
                totalCheck = check + check * 7 / 100;
                System.out.println("Месяц " + totalMonth + ", счет в банке: " + totalCheck);
            }
        }
        System.out.println(" ");
        System.out.println("ДЗ 2, Задание 2");
        System.out.println("  ");

        // home work 2, task 2//

        int check_1 = 15_000;
        int month_1 = 1;
        int totalCheck_1 = 0;
        int totalMonth_1 = 0;
        while (check_1 < 12_000_000) {
            check_1 = check_1 + check_1 * 7 / 100;
            month_1 = month_1 + 1;
            if (check_1 < 12_000_000) {
                totalMonth_1 = month_1 + 1;
                totalCheck_1 = check_1 + check_1 * 7 / 100;
                if (totalMonth_1 % 6 == 0) {
                    System.out.println("Месяц " + totalMonth_1 + ", счет в банке: " + totalCheck_1);
                }
            }
        }
        System.out.println(" ");
        System.out.println("ДЗ 2, Задание 3");
        System.out.println("  ");

        // home work 2, task 3//

        int check_2 = 15_000;
        int timePeriod = 0;
        int totalCheck_2 = 0;
        while (timePeriod < 109) {
            timePeriod = timePeriod + 1;
            check_2 = check_2 + check_2 * 7 / 100;
            if (timePeriod <109){
                timePeriod = timePeriod + 1;
                totalCheck_2 = check_2 + check_2 * 7 / 100;
            }
            if (timePeriod % 6 == 0) {
                System.out.println("Месяц " + timePeriod + ", счет в банке: " + totalCheck_2);
            }
        }
        System.out.println(" ");
        System.out.println("ДЗ 2, Задание 4");
        System.out.println("  ");

        // home work 2, task 4//

        int day = 1;
        int friday = 5;
        while (day <32) {
            day = day + 1;
            if (friday <= day){
                System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет.");
                friday = friday +7;
            }
        }
        System.out.println(" ");
        System.out.println("ДЗ 3, Задание 1");
        System.out.println("  ");

        // home work 3, task 1//

        int cometTraectory = 79;
        int stertPeriod = -200;
        int finishPeriod = 100;
        do-while ()










    }
}
