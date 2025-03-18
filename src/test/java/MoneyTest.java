import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    class Dollar {
        /*가장 쉽게 테스트를 통과하는 방법*/
//          int amount = 10;

//        int amount = 5 * 2;

        int amount;
        Dollar(int amount) {
            this.amount = amount;
        }
        /*
        * 올바른 금액을 갖는 new Dollar return
        * */
        Dollar times(int multiplier) {
            return new Dollar(amount * multiplier);
        }

        public boolean equals(Object object) {
//            return true;
            Dollar dollar = (Dollar) object;
            return amount == dollar.amount;
        }

    }

}
