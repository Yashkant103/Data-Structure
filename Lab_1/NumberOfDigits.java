import java.util.Scanner;

public class NumberOfDigits {
    public static int Digit(int n){
        if(n/10==0){
            return 1;
        }
        else{
            return 1 + Digit(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        //int ans = Digit(n);
        System.out.println("The number of digits in "+n+" are "+Digit(n));
    }    
}