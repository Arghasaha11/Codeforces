import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        int w;
        Scanner ab = new Scanner(System.in);
        w=ab.nextInt();
        if(w>2)
        {
        if((w%2)==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
        else
            System.out.println("NO");
        ab.close();
    }
}