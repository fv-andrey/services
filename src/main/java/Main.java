public class Main {

    public static void main(String[] args) {

        ru.netology.services.services service = new ru.netology.services.services();

        System.out.println(service.calcMonthsRest(10_000, 3_000, 20_000));

        System.out.println(service.calcMonthsRest(100_000, 60_000, 150_000));
    }
}
