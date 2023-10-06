import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to convert: ");
        int decimal_num=sc.nextInt();
        int ans=0;

        int n=1;

        while(decimal_num>0){
            int parity=decimal_num%2;
            ans +=(parity*n);
            n*=10;
            decimal_num/=2;
        }
        System.out.println(ans);
    }
}
