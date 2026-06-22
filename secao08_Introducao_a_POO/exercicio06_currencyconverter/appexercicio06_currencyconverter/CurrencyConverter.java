package appexercicio06_currencyconverter;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double totalAmount(double dollarPrice, double dollarQty) {
        return dollarPrice * dollarQty * (1.0 + IOF);
    }

}






