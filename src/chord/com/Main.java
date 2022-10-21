package chord.com;

public class Main {
    final static double a = 1;
    public static void main(String[] args) {
        HalfDivision chord = new HalfDivision();
        System.out.println("Chord method");
        System.out.println(chord.chord(a));     // рассматриваем промежуток от 1 до 2

        System.out.println("\nCombinated chord method");
        System.out.println(chord.mixChord(-3, -2));      //рассматриваем интервалы [-3;-2], [-2;-1], [0;1]
        System.out.println(chord.mixChord(-2, -1));
        System.out.println(chord.mixChord(0, 1));

        System.out.println("\nGold section method\n");
        System.out.println(chord.GSS(-3,-2));
        System.out.println(chord.GSS(-2,-1));
        System.out.println(chord.GSS(0,1));

        System.out.println("\nHalf division method\n");
        System.out.println(chord.halfDivision(-3,-2));
        System.out.println(chord.halfDivision(-2,-1));
        System.out.println(chord.halfDivision(0,1));
    }
}