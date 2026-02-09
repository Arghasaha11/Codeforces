import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,c1=0;
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int j=1;j<=3;j++){
                x=s.nextInt();
                if(x==1)
                    c++;
            }
            if(c>1)
                c1++;
        }
        System.out.println(c1);
        s.close();
    }
}

	