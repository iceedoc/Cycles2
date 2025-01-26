public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы 2");
        System.out.println("\nTask 1");
        int desiredSum = 2_459_000;
        int sum = 0;
        int save = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < desiredSum) {
            sum += save;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ",сумма накоплений равна" + sum + "рублей");
        }
        System.out.println("\nTask 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + "");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + "");
        }
        System.out.println("\nTask 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * birthRate / 1000 - population * deathRate / 1000;
            System.out.println(" Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("\nTask 4");
        percent = 7D / 100;
        desiredSum = 12_000_000;
        sum = save;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ",сумма накопления равна " + sum + " рублей");
        }
        System.out.println("\nTask 5");
        sum = save;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ",сумма накопления равна " + sum + " рублей");
            }
        }
        System.out.println("\nTask 6");
        sum = save;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ",сумма накопления равна " + sum + " рублей");
            }
        }
        System.out.println("\nTask 7");
        int firstFriday = 3;
        int daysInMonth = 31;
        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("\nTask 8");
        int period = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}
