import transaction.TransactionFactory;
import org.junit.Assert;
import org.junit.Test;

public class TransactionfactoryTest {

    @Test
    public void createDebitTest() {
        // Arange
        var dT1 = TransactionFactory.createDebit(10, "Testing transaction 1");
        var dT2 = TransactionFactory.createDebit(100, "Testing transaction 2");
        var dT3 = TransactionFactory.createDebit(1000, "Testing transaction 3");

        // Assert
        Assert.assertEquals(10, dT1.getDebitCash(), 0);
        Assert.assertEquals(100, dT2.getDebitCash(), 0);
        Assert.assertEquals(1000, dT3.getDebitCash(), 0);
    }

    @Test
    public void createCountableDebitTest() {
        // Arange
        var dT1 = TransactionFactory.createCountableDebit(10, 1,"Testing transaction 1");
        var dT2 = TransactionFactory.createCountableDebit(100, 2, "Testing transaction 2");
        var dT3 = TransactionFactory.createCountableDebit(1000, 3, "Testing transaction 3");

        // Assert
        Assert.assertEquals(10, dT1.getDebitCash(), 0);
        Assert.assertEquals(200, dT2.getDebitCash(), 0);
        Assert.assertEquals(3000, dT3.getDebitCash(), 0);
    }

    @Test
    public void createCreditTest() {
        // Arange
        var dT1 = TransactionFactory. createCredit(10, "Testing transaction 1");
        var dT2 = TransactionFactory. createCredit(100, "Testing transaction 2");
        var dT3 = TransactionFactory. createCredit(1000, "Testing transaction 3");

        // Assert
        Assert.assertEquals(10, dT1.getCreditCash(), 0);
        Assert.assertEquals(100, dT2.getCreditCash(), 0);
        Assert.assertEquals(1000, dT3.getCreditCash(), 0);
    }
}
