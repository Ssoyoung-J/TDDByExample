public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

}
