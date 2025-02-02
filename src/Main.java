public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Task # 1
        byte car = 4;
        System.out.println("Значение переменной с типом byte равно " + car);
        short apple = 150;
        System.out.println("Значение переменной с типом short равно " + apple);
        int stars = 1000000;
        System.out.println("Значение переменной с типом int равно " + stars);
        long dayYear = 365L;
        System.out.println("Значение переменной с типом long равно " + dayYear);
        float a = 21.85f;
        System.out.println("Значение переменной с типом float равно " + a);
        double b = 177.9447;
        System.out.println("Значение переменной с типом double равно " + b);

        // Task # 2
        float c = 27.12f;
        System.out.println("Переменная типа float равна " + c);
        long c1 = 987678965549L;
        System.out.println("Переменная типа long равна " + c1);
        float c2 = 2.786f;
        System.out.println("Переменная типа float равна " + c2);
        short c3 = 569;
        System.out.println("Переменная типа short равна " + c3);
        short c4 = -159;
        System.out.println("Переменная типа short равна " + c4);
        short c5 = 27897;
        System.out.println("Переменная типа short равна " + c5);
        byte c6 = 67;
        System.out.println("Переменная типа byte равна " + c6);

        // Task # 3
        byte totalStudent1 = 23;
        byte totalStudent2 = 27;
        byte totalStudent3 = 30;
        short totalSheet = 480;
        byte totalStudents = (byte) (totalStudent1 + totalStudent2 + totalStudent3);
        short sheetForOneStudent = (short) (totalSheet / totalStudents);
        System.out.println("На каждого ученика рассчитано по " + sheetForOneStudent + " листов бумаги");

        // Task # 4
        byte bottle = 16;
        byte bottleIn2Min = 2;
        byte bottleIn1Min = (byte) (bottle / bottleIn2Min);
        System.out.println("В минуту производительность бутылок составляет " + bottleIn1Min + " штук");

        short minInDay = 24 * 60;
        System.out.println("В 1 сутках " + minInDay + " минут");
        int totalBottleIn1Day = bottle * minInDay;
        System.out.println("За 1 сутки изготовят " + totalBottleIn1Day + " бутылок");

        int minIn3Day = minInDay * 3;
        System.out.println("В 3 сутках " + minIn3Day + " минут");
        int totalBottleIn3Days = minIn3Day * bottle;
        System.out.println("За трое суток произведут " + totalBottleIn3Days + " бутылок");

        byte dayIn1Mounth = 30;
        int minIn1Mounth = dayIn1Mounth * minInDay;
        System.out.println("В 1 месяце " + minIn1Mounth + " минут");
        int bottleIn1Mounth = minIn1Mounth * bottle;
        System.out.println("В месяц производительность бутылок составит " + bottleIn1Mounth + " штук");

        // Task # 5
        byte totalProduct = 120;
        byte white = 2;
        byte brown = 4;
        byte for1ClassProduct = (byte) (white + brown);
        System.out.println("Всего " + for1ClassProduct + " требуется для покраски 1 класса");
        byte totalClass = (byte) (totalProduct / for1ClassProduct);
        System.out.println("Всего в школе " + totalClass + " классов");
        byte totalWhite = (byte) (totalClass * white);
        System.out.println("Всего необходимо " + totalClass * white + " банок белой краски");
        byte totalBrown = (byte) (totalClass * brown);
        System.out.println("Всего необходимо " + totalClass * brown + " банок коричневой краски");
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        // Task # 6
        byte banana = 5;
        byte weight1Banana = 80;
        int totalWeightBananas = banana * weight1Banana;
        System.out.println("Вес " + banana + " бананов составляет " + totalWeightBananas + " грамм");

        short milk = 200;
        short weight100Milk = 105;
        short totalWeightMilk = (short) (weight100Milk + weight100Milk);
        System.out.println("Вес 200 грамм молока составляет " + totalWeightMilk + " грамм");

        byte iceCream = 2;
        byte weight1IceCream = 100;
        int totalWeightIceCream = iceCream * weight1IceCream;
        System.out.println("Вес 2 пломбиров составляет " + totalWeightIceCream + " грамм");

        byte eggs = 4;
        byte weight1eggs = 70;
        short totalWeightEggs = (short) (eggs * weight1eggs);
        System.out.println("Вес " + eggs + " яиц составляет " + totalWeightEggs + " грамм");

        int totalWeightProduct = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        System.out.println("Общий вес продуктов составляет " + totalWeightProduct + " грамм");

        float kg1 = 1000f;
        float totalWeightProductKg = totalWeightProduct / kg1;
        System.out.println("Общий вес продуктов составляет " + totalWeightProductKg + " килограмм");

        // Task # 7
        float kg = 1000f;
        short weightLoss1 = 250;
        float weightLoss1InKg = weightLoss1 / kg;
        System.out.println("Похудение в день на " + weightLoss1InKg + " кг");

        short weightLoss2 = 500;
        float weightLoss2InKg = weightLoss2 / kg;
        System.out.println("Похудение в день на " + weightLoss2InKg + " кг");

        byte totalWeightLoss = 7;
        byte totalDayOnWeightLoss1 = (byte) (totalWeightLoss / weightLoss1InKg);
        System.out.println("Всего потребуется " + totalDayOnWeightLoss1 + " дней для похудения на " + totalWeightLoss + " килограмм, при условии похудения по " + weightLoss1 + " грамм в день");

        byte totalDayOnWeightLoss2 = (byte) (totalWeightLoss / weightLoss2InKg);
        System.out.println("Всего потребуется " + totalDayOnWeightLoss2 + " дней для похудения на " + totalWeightLoss + " килограмм, при условии похудения по " + weightLoss2 + " грамм в день");

        int onAverageDaysToWeightLoss = (totalDayOnWeightLoss1 + totalDayOnWeightLoss2) / 2;
        System.out.println("Для похудения на " + totalWeightLoss + " килограмм потребуется в среднем " + onAverageDaysToWeightLoss + " день");

        // Task # 8
        byte monthInYear = 12;
        float promotionPayInYear = 0.1f;
        int payMariaInMonth = 67760;
        int payDenisInMonth = 83690;
        int payKrisInMonth = 76230;

        int payMariaInYear = payMariaInMonth * monthInYear;
        System.out.println("Мария зарабатывает в год " + payMariaInYear + " рублей");

        int payDenisInYear = payDenisInMonth * monthInYear;
        System.out.println("Денис зарабатывает в год " + payDenisInYear + " рублей");

        int payKrisInYear = payKrisInMonth * monthInYear;
        System.out.println("Кристина зарабатывает в год " + payKrisInYear + " рублей");

        int mariaPromotion = (int) (payMariaInYear * promotionPayInYear);
        System.out.println("Заработная плата у Марии увеличится на " + mariaPromotion + " рублей, что составляет разницу между годовым доходом сотрудника после повышения");
        int mariaPayWithPromotionInYear = payMariaInYear + mariaPromotion;
        System.out.println("После повышения заработная плата Марии составит " + mariaPayWithPromotionInYear + " рублей в год");
        int payMariaWithPromotionInMonth = mariaPayWithPromotionInYear / monthInYear;
        System.out.println("Заработная плата Марии, после повышения, составит " + payMariaWithPromotionInMonth + " рублей в месяц");

        int denisPromotion = (int) (payDenisInYear * promotionPayInYear);
        System.out.println("Заработная плата у Дениса увеличится на " + denisPromotion + " рублей, что составляет разницу между годовым доходом сотрудника после повышения");
        int denisPayWithPromotionInYear = payDenisInYear + denisPromotion;
        System.out.println("После повышения заработная плата Дениса составит " + denisPayWithPromotionInYear + " рублей в год");
        int payDenisWithPromotionInMonth = denisPayWithPromotionInYear / monthInYear;
        System.out.println("Заработная плата Дениса, после повышения, составит " + payDenisWithPromotionInMonth + " рублей в месяц");

        int krisPromotion = (int) (payKrisInYear * promotionPayInYear);
        System.out.println("Заработная плата у Кристины увеличится на " + krisPromotion + " рублей, что составляет разницу между годовым доходом сотрудника после повышения");
        int krisPayWithPromotionInYear = payKrisInYear + krisPromotion;
        System.out.println("После повышения заработная плата Кристины составит " + krisPayWithPromotionInYear + " рублей в год");
        int payKrisWithPromotionInMonth = krisPayWithPromotionInYear / monthInYear;
        System.out.println("Заработная плата Кристины, после повышения, составит " + payKrisWithPromotionInMonth + " рублей в месяц");

    }
}