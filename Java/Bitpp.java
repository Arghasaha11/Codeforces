import java.util.Scanner;
public class Bitpp {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n,x=0;
        String s="";
        n=ab.nextInt();
        ab.nextLine();
        for(int i=0;i<n;i++)
        {
            s=ab.nextLine();
            if(s.charAt(1) == '+')
            {
            x++;
            }
            else 
            x--;
        }
        System.out.print(x);
        ab.close();
    }
} 