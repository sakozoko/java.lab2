public class task4 {
    public static double f(double x){
        return Math.pow(x,3)-4*Math.pow(x,2)-20*x+48;
    }
    public static double prf(double x){
        return 3*x*x-8*x-20;
    }
    public static double bisection(double a, double b, double e)
    {
        if(b>a && f(a)*f(b)<0) {
            double c = (a + b) / 2;
            if (b - a <= e) return c;

            if (f(a) * f(c) > 0) return bisection(c, b, e);
            else if (f(a) * f(c) < 0) return bisection(a, c, e);
            else return c;
        }
        return 0;
    }

    public static double newton(double x, double e) {
        double v = f(x) / prf(x);
        if (Math.abs(v) < e) {
            return x - v;
        }
        return newton(x - v, e);
    }
}
