import company.*;
import logger.ConsoleLogger;
import logger.GUILogger;


public class Main {
    public static void main(String args[]) throws InterruptedException {
        Company myCompany = new Company(
                "Производство хлеба",
                new Account(1, "Мой краман"),
                new Account(2, "Мой склад"),
                new Account(3, "Банк")
        );

        myCompany.setLogger(new ConsoleLogger());

        myCompany.moveMoney(3, 1, 100, "Занял у банка сотку");
        myCompany.buyToAccount(1, 25, 4, "Купил 4 теста по 25 рублей, положил на склад", 2);

        myCompany.setLogger(new GUILogger());

        myCompany.sellFromAccont(2, 25, 50, 4, "Сделал из 4 тестов, 4 хлеба, и продаю с наценкой 50%", 1);
        myCompany.moveMoney(1, 3, 100, "Отдал сотку банк");
        System.out.println("Моя компания растет: " + myCompany.toString());
    }
}
