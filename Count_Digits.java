import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n=sc.nextInt();
        int numOfDigits=0;
        int original_n=n;

        while(n>0){
            n=n/10;
            numOfDigits++;
        }
        System.out.print("Number of digits in "+ original_n + "="+ numOfDigits);
    }
}
