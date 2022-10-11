import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {
    @Test
    public void OverAThousand() {
        int amount = 1850;
        int expected = 150;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void Thousand() {
        int amount = 1000;
        int expected = 0;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void LessThanAThousand() {
        int amount = 851;
        int expected = 149;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void Null() {
        int amount = 0;
        int expected = 1000;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void One() {
        int amount = 999;
        int expected = 1;
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}