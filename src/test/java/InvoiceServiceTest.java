import com.bl.invoicegenerator.InvoiceGenerator;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare() {
        InvoiceGenerator ig = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = ig.calculateFare(distance, time);
        double expected = 25;
        Assert.assertEquals(expected, fare, 0.0);
        System.out.println("givenDistanceAndTimeShouldReturnTotalFare: " + fare);
    }
}
