public class Main {
    public static void main(String[] args) {
        // task1 1//
        for (int i = 0; i <= 10; i++)
            System.out.println("1 iteration " +i);
        System.out.println(" ");
        // task 2//

        for(int i= 10; i > 0; i--)
            System.out.println("2 iteration " +i);
        System.out.println(" ");
        //task 3//

        for (int i = 0; i < 18; i=i+2)
            System.out.println("3 iteration" + i);
        System.out.println(" ");
        //task 4//
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("4 iteration " + i);
            System.out.println(" ");
        }
        //task 5//
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
            System.out.println(" ");
        }
        //task 6//
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("6 iteration " + i);
            System.out.println(" ");
        }
        //task 7//
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println("7 iteration " + i);
            System.out.println(" ");
        }
        //task 8//
        int salary = 29000;
        int total = 0;
        int i = 0;
        for (i = 0; i < 12; i++) {
            total = total + salary;

            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
        }
        System.out.println(" ");

        //task 9//
        int salary_1 = 29000;
        int total_1 = 0;
        int i_1 = 0;
        for (i_1 = 0; i_1 < 12; i_1++) {
            total_1 = total_1 + total_1 / 100;
            total_1 = total_1 + salary_1;

            System.out.println("Месяц " + i_1 + " сумма накоплений равна " + total_1 + "рублей");
        }
        System.out.println("  ");
        System.out.println("lesson 1.2");

        //lesson 1 is compite//

        //lesson 2//
        //task 1//

        int salary_2 = 15_000;
        int total_2 = 0;
        int i_2 = 0;
        while (total_2 < 2_459_000) {
            total_2 = total_2 + total_2 / 100;
            total_2 = total_2 + salary_2;
            i_2 = i_2 + 1;

            System.out.println("Месяц " + i_2 + " сумма накоплений равна " + total_2 + " рублей");
        }
        System.out.println(" ");

        //task 2//
        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number = number + 1;
        }
        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println(" ");

        //task 3//
        int y = 12_000_000;
        int birth_rate = 17;
        int death_rate = 8;
        int year = 1;
        int rate = y + birth_rate - death_rate;
        while (year < 11) {
            System.out.println("Год " + year + ", численность населения составляет " + rate);
            rate = rate + birth_rate - death_rate;
            year = year + 1;
        }
        System.out.println(" ");

        //task 4//




    }
}
