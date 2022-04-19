public class task2 {
    static String resultstr="";
    public static String func(int i)
    {
        if(i>1)
            func(i/2);
        resultstr+=i%2;
        return resultstr;
    }
}
