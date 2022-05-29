import company.Account;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    @Test
    public void transferToTest() {
        // Arange
        Account a1 = new Account(1, "Счёт №1");
        Account a2 = new Account(2, "Счёт №2");

        // Act
        a1.transferTo(100, "Переводим 100 на второй счет", a2);

        // Assert
        Assert.assertEquals(100, a1.getCurrentCredit(), 0);
        Assert.assertEquals(100, a2.getCurrentDebit(), 0);
    }

    @Test
    public void buyAndSellTest() {
        // Arange
        Account a1 = new Account(1, "Карман");
        Account a2 = new Account(2, "Склад");

        // Act
        a1.buy(25, 4, "Купили 4 товара по 25", a2);

        // Assert
        Assert.assertEquals(100, a1.getCurrentCredit(), 0);
        Assert.assertEquals(0, a1.getCurrentDebit(), 0);
        Assert.assertEquals(0, a2.getCurrentCredit(), 0);
        Assert.assertEquals(100, a2.getCurrentDebit(), 0);

        // Act
        a2.sell(25, 100, 4, "Продали 4 товара по 50", a1);

        // Assert
        Assert.assertEquals(0, a1.getLastTransaction().getCreditCash(), 0);
        Assert.assertEquals(200, a1.getLastTransaction().getDebitCash(), 0);
        Assert.assertEquals(100, a2.getLastTransaction().getCreditCash(), 0);
        Assert.assertEquals(0, a2.getLastTransaction().getDebitCash(), 0);
    }
}
