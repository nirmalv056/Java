import java.util.Scanner;

public class Raise_Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int a= sc.nextInt(), b=sc.nextInt();

        int ans=1;
        for(int i=1; i<=b; i++){
            ans*=a;
        }
        System.out.print(ans);
    }
}
