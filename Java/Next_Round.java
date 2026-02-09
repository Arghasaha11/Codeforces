import java.util.Scanner;
public class Next_Round {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n,k,t,c=0,km=0;
        n=ab.nextInt();
        k=ab.nextInt();
        
        ab.nextLine();
        for(int i=1;i<=n;i++)
        {
            t=ab.nextInt();
            if(i == k)
                km=t;
            if(i<k){
                if(t>0)
                c++;
            }
            else
            {
                if(t>0 && t>=km)
                c++;
            }
            
        }
        System.out.print(c);
        ab.close();
    }
}