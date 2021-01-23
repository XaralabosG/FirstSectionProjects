import static java.lang.Math.PI;
public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0){
            System.out.println(-1);
            return -1.0;
        }
        double a = PI*radius*radius;
        System.out.println(a);
        return a;
    }
    public static double area(double x,double y){
        if (x < 0 || y < 0){
            System.out.println(-1);
        return -1.0;
        }
        double a = x*y;
        System.out.println(a);
        return a;
    }
}
