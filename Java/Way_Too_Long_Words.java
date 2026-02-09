import java.util.Scanner;
public class Way_Too_Long_Words  {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int t=ab.nextInt();
        for(int i=0; i<=t;i++) {
            String S=ab.nextLine();
            int n=S.length();
            if(n>10){
                char first=S.charAt(0);
                char last=S.charAt(n-1);
                int mid=n-2;
                System.out.println(String.valueOf(first)+String.valueOf(mid)+String.valueOf(last));
            }
            else{
                System.out.println(ab);
            }
        }
        ab.close();
    }
}