import java.util.Scanner;

public class Main {
    private static final int c=1;
    public static void task1(){
        System.out.println("-------------------Task1-------------------");

        System.out.println("------------------Example1-----------------");
        task1.Example1(c);

        System.out.println("------------------Example2-----------------");
        task1.Example2(c);

        System.out.println("------------------Example3-----------------");
        task1.Example3(c);

        System.out.println("------------------Example4-----------------");
        System.out.println(task1.Example4fact(5));

        System.out.println("------------------Example5-----------------");
        System.out.println(task1.Example5fibb(10));
    }
    public static void task2(){
        System.out.println("-------------------Task2-------------------");
        var sc = new Scanner(System.in,"cp1251");
        System.out.println(task2.func(sc.nextInt()));
    }
    public static void task3(){
        System.out.println("-------------------Task3-------------------");
        var sc=new Scanner(System.in,"cp1251");
        var ar = new task3(sc.nextInt());
        System.out.println("-------------------Write numbers");
        ar.initArray();
        System.out.println("-------------------Output");
        ar.outputArray();
    }
    public static void task4(){
        System.out.println("-------------------Task4-------------------");
        ///Bisection method
        System.out.println("Bisection method, accuracy 10^-7");
        System.out.println("Range [-10;1.9]");
        System.out.println(task4.bisection(-10,1.9,0.00000001));
        System.out.println("Range [-3.9;2.5]");
        System.out.println(task4.bisection(-3.9,2.5,0.00000001));
        System.out.println("Range [2.6;6.9]");
        System.out.println(task4.bisection(2.6,6.9,0.00000001));
        ///Newton method
        System.out.println("Newton method, accuracy 10^-5");
        System.out.println("Base -10");
        System.out.println(task4.newton(-10,0.00001));
        System.out.println("Base 0");
        System.out.println(task4.newton(0,0.00001));
        System.out.println("Base 8");
        System.out.println(task4.newton(8,0.00001));
    }
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task3.test(4);
        task4();
    }
}
