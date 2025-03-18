public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

/*    @Override
    String currency() {
        return currency;
    }*/

    @Override
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
