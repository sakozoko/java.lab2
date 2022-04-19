public class task1 {
    public static void Example1(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            Example1(2 * x + 1);
        }
    }
    public static void Example2(int x) {
        if ((2*x+1) < 20) {
            Example2(2*x+1);
        }
        System.out.println("x="+x);
    }
    private static int step=0;
    public static void Example3(int x) {
        space();
        System.out.println(""+x+"-> ");
        step++;
        if ((2*x+1) <20) {
            Example3(2*x+1);
        }
        step --;
        space();
        System.out.println(""+x+" <-");
    }
    public static void space() {
        for (int i = 0; i<step; i++) {
            System.out.print(" ");
        }
    }

    public static int Example4fact(int n){
        int result;
        if (n==1)
            return 1;
        else{
            result=Example4fact(n-1)*n;
            return result;
        }
    }

    public static int Example5fibb(int n){
        if (n==0){
            return 0;
        }else
        if (n==1){
            return 1;
        } else {
            return Example5fibb(n-2)+Example5fibb(n-1);
        }
    }
}
