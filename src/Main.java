public class Main {
    public static void main(String[] args) {

        /* 1 задание */

        int A = 1000000000;
        System.out.println("Значение переменной A с типом int равно " + A);

        byte B = 120;
        System.out.println("Значение переменной B с типом byte равно " + B);

        short C = 15000;
        System.out.println("Значение переменной C с типом short равно " + C);

        long D = 587123698875L;
        System.out.println("Значение переменной D с типом long равно " + D);

        float E = 3.08f;
        System.out.println("Значение переменной E с типом float равно " + E);

        double F = 81.00578959;
        System.out.println("Значение переменной F с типом double равно " + F);

        /* 2 задание */

        float a = 27.2f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        /* 3 задание */

        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        short totalPaper = 480;
        int totalStudent = ludmilaP + annaS + ekaterinaA;
        int sheetsPerStudent = totalPaper / totalStudent;
        System.out.println("На каждого ученика расчитано " + sheetsPerStudent + " листов бумаги");

        /* 4 задание*/

        byte bottlesIn2Min = 16;
        int bottlesIn1Min = bottlesIn2Min / 2;
        int bottlesIn20Min = bottlesIn1Min * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок");
        int bottlesIn1Hour = bottlesIn1Min * 60;
        int bottlesIn1Day = bottlesIn1Hour * 24;
        System.out.println("За сутки машина произвела " + bottlesIn1Day + " штук бутылок");
        int bottlesIn3Days = bottlesIn1Day * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        /* если в месяце 30 дней*/
        int bottlesIn30Days = bottlesIn1Day * 30;
        System.out.println("За месяц (30 дней) машина произвела " + bottlesIn30Days + " штук бутылок");
        /* если в месяце 31 день*/
        int bottlesIn31Days = bottlesIn1Day * 31;
        System.out.println("За месяц (31 день) машина произвела " + bottlesIn31Days + " штук бутылок");

        /* 5 задание */
        byte totalCansOfPaint = 120;
        byte whiteCansFor1Class = 2;
        byte brownCansFor1Class = 4;
        int totalCansFor1Class = whiteCansFor1Class + brownCansFor1Class;
        int totalNumberOfClasses = totalCansOfPaint / totalCansFor1Class;
        int totalWhiteCansForSchool = totalNumberOfClasses * whiteCansFor1Class;
        int totalBrownCansForSchool = totalNumberOfClasses * brownCansFor1Class;
        System.out.println("В школе, где " + totalNumberOfClasses + " классов, нужно " + totalWhiteCansForSchool + " банок белой краски и " + totalBrownCansForSchool + " банок коричневой краски");

        /* 6 задание */



    }
}