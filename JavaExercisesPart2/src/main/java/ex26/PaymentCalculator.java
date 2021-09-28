package ex26;
import java.lang.*;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double b, double i, double p)
    {
        i=(i/100)/365;
        double exp = Math.pow(1+i,30);
        double months = -(Math.log(1+((b*(1-exp))/p)));
        months = months/(30*(Math.log(1+i)));
        months = Math.ceil(months);

        return months;
    }
}

