import java.util.Scanner;
public class temp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        float t;
        t=32+((float)(a*9)/5);
        System.out.format("%.2f",t);
    }
}