public class Franc extends Money{
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

/*    @Override
    String currency() {
        return currency;
    }*/

    @Override
    Money times(int multiplier) {

        return Money.franc(amount * multiplier);
    }

}
