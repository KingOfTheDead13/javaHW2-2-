public class Main {
    public static void main(String[] args) {
        int currentBalance = 3000; // начальная сумма на счету
        int topUpAmount = 4000; // сумма пополнения
        int bonusRubles = 0; // количество бонусных рублей

        if (topUpAmount > 1000) {
            bonusRubles = (topUpAmount - 1000) / 100;
        }

        int totalBalance = currentBalance + topUpAmount + bonusRubles;

        System.out.println("Итоговый счет: " + totalBalance);
        System.out.println("Количество бонусных рублей: " + bonusRubles);
    }
}