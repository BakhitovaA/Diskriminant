/**
 * Created by ALEX on 14.09.2014.
 */
public class Diskriminant {
    public static void main(String[] args) {
        double a=10.0;
        double b=12.0;
        double c=3.0;
        double d=b*b-4*a*c;
        if (d<0) {
            System.out.println("вещественных корней нет");
        }
        if (d>0) {
            double x1=(-b+Math.sqrt(d)/(2*a));
            double x2=(-b-Math.sqrt(d)/(2*a));
            System.out.println("Корни уравнения: x1="+x1+", x2="+x2);
        }
        if (d==0) {
                double x=(-b/(2*a));
            System.out.println("Корень уравнения: x="+x);
        }
    }
}
