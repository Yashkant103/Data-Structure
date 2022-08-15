import java.util.Scanner;

public class FactorialRecursion{
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    //Main class 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        //int ans = fact(n);
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
}