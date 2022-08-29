public class Main {
    public static void main(String[] args) {
        //Задача 4
        int bottle = 8;
        bottle*=20;
        System.out.println("За 20 минут машина произвела бутылок "+ bottle + " штук ");
        bottle*=72;
        System.out.println("За сутки машина произвела бутылок "+ bottle + " штук ");
        bottle*=3;
        System.out.println("За 3 дня машина произвела бутылок "+ bottle + " штук ");
        bottle*=10;
        System.out.println("За 1 месяц (30 дней) машина произвела бутылок "+ bottle + " штук ");

        //Задача 5
        int jar = 120;
        int white = 2;
        int brown = 4;
        int classes = jar/(white + brown);
        System.out.println("В школе, где " + classes + " классов, нужно " + 2*classes + " банок белой краски и " + 4*classes + " банок коричневой краски");

        // Задача 6
        int banana = 80*5;
        int milk = 105*2;
        int ice = 100*2;
        int egg = 70*4;
        double gram = banana+milk+ice+egg;
        System.out.println("Вес такого спорт-завтрака - "+ gram + " грамм ("+gram/1000+" кг.)");

        //Задача 7

        int weight = 7;
        int day = 1000*weight/250;
        int day1 = 1000*weight/500;
        System.out.println("Чтобы сбросить 7 кг. по 250 грамм, потребуется " + day + " дней.");
        System.out.println("Чтобы сбросить 7 кг. по 500 грамм, потребуется " + day1 + " дней.");
        System.out.println("В среднем для похудения потребуется " + (day+day1)/2 + " день.");

        // Задача 8
        int masha = 67760;
        int den = 83690;
        int kris = 76230;
        System.out.println("Маша теперь получает "+(((masha*10)/100)+masha)+" рублей. Годовой доход вырос на "+((masha*10)/100)*12+" рублей.");
        System.out.println("Денис теперь получает "+(((den*10)/100)+den)+" рублей. Годовой доход вырос на "+((den*10)/100)*12+" рублей.");
        System.out.println("Кристина теперь получает "+(((kris*10)/100)+kris)+" рублей. Годовой доход вырос на "+((kris*10)/100)*12+" рублей.");
    }
}
