package exercise.p03_1_code;

public class OrdinaryPricePolicy implements PricePolicy {

    @Override
    public int calcPrice(int price, int n) {
        return price * n;
    }
}
