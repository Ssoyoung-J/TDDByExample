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
        /*가장 쉽게 테스트를 통과하는 방법*/
//          int amount = 10;

//        int amount = 5 * 2;

        int amount;
        Dollar(int amount) {
            this.amount = amount;
        }

        void times(int multiplier) {
            amount *= multiplier;
        }

    }

}
