public class Main {
    public static void main(String[] args) {
        int remainder = 200;

        int replenishment = 1100;

        int bonus = replenishment / 100;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый бонус " + bonus);
        System.out.println("Итоговый счет " + (replenishment + remainder));
    }
}
