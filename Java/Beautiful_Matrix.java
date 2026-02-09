import java.util.*;
public class Beautiful_Matrix {
    public static void main(String args[])
    {
        
    int a,i,t,j,r=0,c=0;
    Scanner ab=new Scanner(System.in);
    for(i=1;i<=5;i++)
    {
        for(j=1;j<=5;j++)
        {
            t=ab.nextInt();
            if(t!=0)
            {
                r=i;
                c=j;
            }
        }
    }
    a=Math.abs(r-3)+Math.abs(c-3);
    System.out.println(a);
    ab.close();
    }
}