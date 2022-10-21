package chord.com;

public class HalfDivision extends GoldSection {
    double halfDivision(double a, double b){
        double c = 0;
        while (Math.abs(a - b) > epsilon ){
            c = (a + b)/2;
            if (x(a)*x(c) < 0)
                b = c;
            else a = c;
        }
        return c;
    }
}
