public class Main {
    public static void main(String[] args) {

        int priceTicket = 15385; //цена билета
        int priceMiles = 20; //стоимость мили

        int countMiles = priceTicket / priceMiles;

        System.out.println("Количество бонусных миль: " + countMiles);


        int account = 100; // сумма на счету
        int amount = 1500; // сумма пополнения

        if (amount >= 1000) {
            int newSum = amount / 100; //количество бонусов
            int newAccount = account + newSum + amount; // сумма на счету + количество бонусов + сумма пополнения
            System.out.println("Количество бонусных рублей = " + newSum);
            System.out.println("Итоговая сумма на счету: " + newAccount);
        } else {
            int totalAccount = account + amount;
            System.out.println("Итоговая сумма на счету: " + totalAccount);
        }
    }
}
