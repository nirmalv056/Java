import java.util.Scanner;

public class Reverse_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n=sc.nextInt();
        int ans=0;
        int original_n=n;

        while(n>0){
            ans=ans*10+n%10;
            n=n/10;
        }
        System.out.print(ans);
    }
}
