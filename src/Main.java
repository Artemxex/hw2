public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte a = 69;
        short b = 32_360;
        int c = 1_918_171_615;
        long d = 363_636;
        float e = 3.6f;
        double f = 3.6;
        char g = 363;
        boolean h = true;

        //Задача 2
        double boxerOne = 78.2;
        double boxerTwo = 82.7;
        double boxersWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес бойцов " + boxersWeight);

        double boxerDif = boxerTwo - boxerOne;
        System.out.println("Разница в весе бойцов " + boxerDif);

        //Задача 3
        byte bananas = 5;
        int bananaWeight = bananas * 80;
        short milk = 200;
        double milkWeight = milk * 1.05;
        byte icecream = 2;
        int icecreamWeight = icecream * 100;
        byte eggs = 4;
        int eggWeight = eggs * 70;
        double breakfastWeight = bananaWeight + milkWeight + icecreamWeight + eggWeight;
        double breakfastWeightKG = breakfastWeight / 1000;
        System.out.println("Вес завтрака " + breakfastWeightKG + " КГ");

        //Задача 4
        byte weightLoose = 7;
        int weightLooseGR = weightLoose * 1000;
        short one250 = 250;
        short tho500 = 500;
        int days250 = weightLooseGR / one250;
        int days500 = weightLooseGR / tho500;
        int avgWeight =(one250 + tho500) / 2;
        int avgDays = weightLooseGR / avgWeight;
        System.out.println(avgDays + " ней для похудения на 7 кг в среднем потребуется");

        //Задача 5
        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;

        double Masha10 = Masha * 1.1;
        double Denis10 = Denis * 1.1;
        double Kristina10 = Kristina * 1.1;

        int MashaYear = Masha * 12;
        int DenisYear = Denis * 12;
        int KristinaYear = Kristina * 12;

        double MashaYear10 = Masha10 * 12;
        double DenisYear10 = Denis10 * 12;
        double KristinaYear10 = Kristina10 * 12;

        double MashaYearDif = MashaYear10 - MashaYear;
        double DenisYearDif = DenisYear10 - DenisYear;
        double KristinaYearDif = KristinaYear10 - KristinaYear;

        System.out.println("Маша теперь получает " + Masha10 + " рублей. " + "Доход Маши за год вырос на " + MashaYearDif + " рублей.");
        System.out.println("Денис теперь получает " + Denis10 + " рублей. " + "Доход Дениса за год вырос на " + DenisYearDif + " рублей.");
        System.out.println("Кристина теперь получает " + Kristina10 + " рублей. " + "Доход Кристины за год вырос на " + KristinaYearDif + " рублей.");

    }
}