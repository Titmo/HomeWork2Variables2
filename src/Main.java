public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte b = 23;
        short s = 134;
        int i = 5363;
        long l = 62386L;
        float f = 43.65F;
        double d = 645.936;
        System.out.println("byte:"+ b + " short:"+ s + " int:"+ i +" long:" + l + " float:" + f + " double:" + d);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float one = 27.12F;
        long two = 987678965549L;
        double three =2.786;
        short four = 569;
        short five = -159;
        int six = 27897;
        byte seven = 67;
        System.out.println(one +" "+two+" "+ three +" "+ four +" " + five + " " + six + " "+ seven);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte catherineAndreyevna = 30;
        short totalSheet = 480;
        int sheet = totalSheet/(lyudmilaPavlovna+annaSergeevna+catherineAndreyevna);
        System.out.println("На каждого ученика рассчитано " + sheet+ " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottleOneMinute=16/2;
        int twentyMinutes = 20*bottleOneMinute;
        int day = bottleOneMinute*(24*60);
        int threeDay = day*3;
        int month28 = day * 28;
        int month30 = day * 30;
        int month31 = day * 31;
        System.out.println("За 20 минут произвела " +twentyMinutes+ " штук бутылок");
        System.out.println("За сутки произвела " +day+ " штук бутылок");
        System.out.println("За 3 дня произвела " +threeDay+ " штук бутылок");
        System.out.println("За месяц с 28 днями произвела " +month28+ " штук бутылок");
        System.out.println("За месяц с 30 днями произвела " +month30+ " штук бутылок");
        System.out.println("За месяц с 31 днями произвела " +month31+ " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        int clas = totalPaint/(2+4);
        int white = clas*2;
        int brown = clas*4;
        System.out.println("В школе, где " +clas+" классов, нужно " +white+ " банок белой краски " +brown+" банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCreamSundae = 2 * 100;
        int rawEggs = 4*70;
        int totalGrams = banana+milk+iceCreamSundae+rawEggs;
        float totalKg =totalGrams/1000F;
        System.out.println("Вес такого спортзавтрака в граммах " +totalGrams);
        System.out.println("Вес такого спортзавтрака в килограммах " +totalKg);

    }
    public static void task7 () {
        System.out.println("Задача 7");
        short kilogram = 7000;
        int maxDay = 500;
        int minDay = 250;
        int weightMinDay = kilogram/250;
        int weightMaxDay = kilogram/500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то нужно "+weightMinDay+" дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то нужно "+weightMaxDay+" дней");
        float average = (minDay+maxDay)/2F;
        float weightAverage =  kilogram/ average;
        System.out.printf("Если спортсмен будет терять каждый день по среднее количество грамм, то нужно %.2f%n", weightAverage);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float index = 1.1F;
        int masha10 = (int) (masha*index);
        int denis10 = (int) (denis*index);
        int kristina10 = (int) (kristina*index);
        int yearMasha = masha*12;
        int yearMasha10 = masha10*12;

        System.out.println("Маша теперь получает " +masha10+ " рублей. Годовой доход вырос на " +(yearMasha10-yearMasha)+" рублей");
        int yearDenis = denis*12;
        int yearDenis10 = denis10*12;
        System.out.println("Денис теперь получает " +denis10+ " рублей. Годовой доход вырос на " +(yearDenis10-yearDenis)+" рублей");
        int yearKristina = kristina*12;
        int yearKristina10 = kristina10*12;
        System.out.println("Кристина теперь получает " +kristina10+ " рублей. Годовой доход вырос на " +(yearKristina10-yearKristina)+" рублей");

    }
}