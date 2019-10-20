package Roman_Romanov_IX;

import Roman_Romanov_IX.service.NumberService;

public class ApplicationRunner {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();

        System.out.println( numberService.getSumByDivision(12345));

        numberService.getSumByTypeConversion(54321);

    }
}
