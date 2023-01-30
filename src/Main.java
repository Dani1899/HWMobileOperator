public class Main {
    public static void main(String[] args) {
        int account = 350;//Начальный счет
        int deposit = 1600;//Пополнение счета

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = account + deposit + bonus;

        System.out.println("Итоговый счёт:" + totalAmount + " рублей" + " (в том числе бонус за пополнение:" + bonus + " рублей" + ")");
    }
}
