public class Main {
    public static void main(String[] args) {
        // ЗАДАЧА 1.1
        int salary = 29000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i = i + 1;
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // ЗАДАЧА 1.2
        int f = 0;
        while (f < 10) {
            f = f + 1;
            System.out.print(f);
        }
        System.out.println();
        int d = 10;
        for (; d > 0; d--) {
            System.out.print(d);
        }
        System.out.println();

        // ЗАДАЧА 1.3
        int people = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double deathRate = (double) 8 / 1000;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            people = (int) (people + (people * birthRate) - (people * deathRate));
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        //  ЗАДАЧА 2.1 и 2.2
        int money = 15_000;
        int month = 0;
        while (money < 12_000_000) {
            month++;
            money = (int) (money * 1.07);
            if (month % 6 == 0) {
                System.out.println("Месяц" + month + ", сумма накоплений составляет " + money);
            }
        }

        // ЗАДАЧА 2.3
        int time = 0;
        int invest = 15_000;
        while (time < 9*12) {
            time = time + 1;
            invest = (int) (invest * 1.07);
            if (time % 6 == 0) {
                System.out.println("Месяц" + time + ", сумма накоплений составляет " + invest);
            }
        }

        // ЗАДАЧА 2.4
        int friday = 5;
        int day = 1;
        while (day < 31) {
            day++;
            if (day % 7 ==friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }

        // ЗАДАЧА 3.1
        int now = 2022;
        int start = now - 200;
        int end = now + 100;
        for (int l = 79; l < end;) {
            l = l + 79;
            if (l > start && l < end) {
                System.out.println(l);
            }
        }

        // ЗАДАЧА 3.2
        int dva = 2;
        for (int p = 1; p < 11; p++) {
            int result = dva * p;
            System.out.println(dva + "*" + p + "=" + result);
        }
    }
}