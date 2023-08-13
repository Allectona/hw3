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
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

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

        byte weightOf1Banana = 80;
        byte weightOf1MilkPortion = 105;
        byte weightOf1IceCreamPortion = 100;
        byte weightOf1Egg = 70;
        int weightOf5Bananas = weightOf1Banana * 5;
        int weightOf2MilkPortion = weightOf1MilkPortion * 2;
        int weightOf2IceCreamPortion = weightOf1IceCreamPortion * 2;
        int weightOf4Eggs = weightOf1Egg * 4;
        int breakfastWeightInGrams = weightOf5Bananas + weightOf2MilkPortion + weightOf2IceCreamPortion + weightOf4Eggs;
        float breakfastWeightInKg = breakfastWeightInGrams / 1000f;
        System.out.println("Завтрак спортсмена весит " + breakfastWeightInGrams + " грамм, или " + breakfastWeightInKg + " кг");

        /* 7 задание */

        byte weightLossGoal = 7;
        short atLeastLoseWeightInGrams = 250;
        float atLeastLoseWeightInKg = atLeastLoseWeightInGrams / 1000f;
        short maxLoseWeightinGrams = 500;
        float maxLoseWeightInKg = maxLoseWeightinGrams / 1000f;
        float maxWeightLossDays = weightLossGoal / atLeastLoseWeightInKg;
        float minWeightLossDays = weightLossGoal / maxLoseWeightInKg;
        float averageNumberOfDays = (maxWeightLossDays + minWeightLossDays) / 2f;
        System.out.println("Для похудения на " + weightLossGoal + " кг спортсмену нужно минимум " + minWeightLossDays + " дней, и максимум " + maxWeightLossDays + " дней. В среднем спортсмену нужно " + averageNumberOfDays + " день.");

        /* 8 задание */

        int salaryMasha = 67760;
        float newSalaryMasha = salaryMasha * 1.1f;
        int annualIncomeMasha = salaryMasha * 12;
        float newAnnualIncomeM = newSalaryMasha * 12f;
        float differenceInAnnualIncomeM = newAnnualIncomeM % annualIncomeMasha;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeM + " рублей");

        int salaryDenis = 83690;
        float newSalaryDenis = salaryDenis * 1.1f;
        int annualIncomeDenis = salaryDenis * 12;
        float newAnnualIncomeD = newSalaryDenis * 12f;
        float differenceInAnnualIncomeD = newAnnualIncomeD % annualIncomeDenis;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeD + " рублей");

        int salaryKristina = 76230;
        float newSalaryKristina = salaryKristina * 1.1f;
        int annualIncomeKristina = salaryKristina * 12;
        float newAnnualIncomeK = newSalaryKristina * 12f;
        float differenceInAnnualIncomeK = newAnnualIncomeK % annualIncomeKristina;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeK + " рублей");









    }
}