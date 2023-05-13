public class Main {
    public static void main(String[] args) {

        int initialAccount = 86;
        int paidMoney = 1500;
        boolean over1000 = true;

        int percent;
        if (over1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = paidMoney / 100 * percent;
        int finalAccount = initialAccount + paidMoney + bonus;

        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Количество бонусов: " + bonus);


    }

}