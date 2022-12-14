package chord.com;

public class Chord {
final static double epsilon = 0.001;   //погршность
final static double a = 1; //начало интеравла для метода хорд
final static double b = 2; //конец интервала для метода хорд


    ///функция для метода хорд
    public double func(double x){
        return 1/Math.tan(x) - x/4;
    }

    //метод для подсчета ответа методом хорд
    public double chord(double x){
        double pastX = 0;
        while (Math.abs(func(x)) > epsilon || Math.abs(x - pastX) > epsilon){
            pastX = x;
            x = pastX - func(pastX)* func(b - pastX)/(func(b) - func(pastX));
        }
        return x;
    }

    //просто фунцкция для метода комбинированных хорд
    public double x(double x){
        return x*x*x + 3*x*x - 3;
    }

    //функция первой производной
    public double diff(double x){
        return 3*x*x + 6*x;
    }


    //функция второй производной
    public double sqrtDiff(double x){
        return 6*x + 6;
    }

    //подсчитаыем корни методом комбинированных хорд
    public double mixChord(double a, double b){
        double aver = (a + b)/2;
        if (diff(aver) * sqrtDiff(aver) < 0){   //определяем приближение метода комбинированных хорд(с избытком или с недостатком)
            while (b - a > epsilon){
                b = a - (x(a)*(b - a))/(x(b) - x(a));
                a = a - x(a)/diff(a);
            }
        }   else {
            while (b - a > epsilon){
                a = a - (x(a)*(b - a))/(x(b) - x(a));
                b = b - x(b)/diff(b);
            }
        }
        return a;
    }
}
