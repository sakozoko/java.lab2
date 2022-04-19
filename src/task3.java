import java.util.Scanner;

public class task3 {
    private final int size;
    private int current=0;
    private final int[] ar;
    public task3(int s){
        size=s;
        ar=new int[s];
    }
    public void initArray(){
        if(current<size) {
            var sc = new Scanner(System.in, "cp1251");
            ar[current]=sc.nextInt();
            current++;
            initArray();
        }
        current=0;
    }
    public void outputArray(){
        if(current<size){
            System.out.print(ar[current]+" ");
            current++;
            outputArray();
        }
        current=0;
    }
    public static void test(int si){
        int val;
        if(si>0)
        {
            var sc = new Scanner(System.in, "cp1251");
            val=sc.nextInt();
            test(--si);
            System.out.println(val);
        }
    }
}
