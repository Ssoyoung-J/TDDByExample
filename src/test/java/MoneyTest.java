import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    class Dollar {
        Dollar(int amount) {

        }

        void times(int multiplier) {

        }

        int amount;
    }

}
