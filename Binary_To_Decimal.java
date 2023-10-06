import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int binary_num=sc.nextInt();

        int ans=0;
        int n=1;

        while(binary_num > 0){
            int unit_digit=binary_num%10;
            ans+=(unit_digit*n);
            binary_num/=10;
            n*=2;
        }
        System.out.println(ans);
    }
}
