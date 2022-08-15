import java.util.Scanner;

public class FactoriaLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int ans = 1;
        
        for(int i = n;i>0;i--){
            ans *= i;
        }
        System.out.println("Factorial of "+n+" is "+ans);
    }
}