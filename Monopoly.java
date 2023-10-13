import java.util.Scanner;
public class mono{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int l=1;l<=x;l++)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int o=sc.nextInt();
            int c=0;
            if((m+n)<o)
            {
                c+=1;
            }
            if((n+o)<m)
            {
                c+=1;
            }
            if((o+m)<n)
            {
                c+=1;
            }
            if(c>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}