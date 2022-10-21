package chord.com;

public class GoldSection extends Chord {
   public double GSS(double a, double b) {
        while (Math.abs(b - a) > epsilon) {
            double c = a + 0.618 * (b - a);
            if (x(a) * x(c) <= 0) b = c;
            else a = c;
        }
        return a;
    }
}
