public class Main {
    public static void main(String[] args) {
        // task1 1//
        for (int i = 0; i <= 10; i++)
            System.out.println("1 iteration " +i);
        // task 2//

        for(int i= 10; i > 0; i--)
            System.out.println("2 iteration " +i);
        //task 3//

        for (int i = 0; i < 18; i=i+2)
            System.out.println("3 iteration" + i);
        //task 4//
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("4 iteration " + i);
        }
        //task 5//
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
        //task 6//
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("6 iteration " + i);
        }
        //task 7//
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println("7 iteration " + i);
        }
        //task 8//
        int salary = 29000;
        int total = 0;
        int i = 0;
        for (i = 0; i < 12; i++) {
            total = total + salary;

            System.out.println("Месяц " + i +" сумма накоплений равна "+ total + "рублей");}
        //task 9//
        int salary1 = 29000;
        int total1 = 0;
        int i1 = 0;
        for (i1 = 0; i1 < 12; i1++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;

            System.out.println("Месяц " + i1 +" сумма накоплений равна "+ total1 + "рублей");}



    }
}
