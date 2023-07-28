import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReadWriteLock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        int cashValue = 1000;
        RewardValue rewardValue = new RewardValue(cashValue);

        double actualConversion = 1000 / 0.0035;
        assertEquals(actualConversion, rewardValue.milesConversion(cashValue));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        RewardValue rewardValue = new RewardValue(milesValue);
        double actualConversion = 1000 * 0.0035;

        assertEquals(actualConversion, rewardValue.cashConversion(milesValue));
    }
}
