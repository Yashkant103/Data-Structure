// Write a program to swap two numbers using user-defines method.s

import java.util.Scanner;

class Swap{    
    Scanner sc = new Scanner(System.in);
    int n1,n2;
    public Swap(){
        System.out.println("Enter the number 1 : ");
        n1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        n2 = sc.nextInt();
    }
    public Swap(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void swapNumbers(){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public void printNumbers(){
        System.out.println("the number 1 is "+n1);
        System.out.println("the number 2 is "+n2);
    }
}
public class SwapMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Swap s1 = new Swap();
        //Swap s2 = new Swap(32,21);    By passing Argument
        s1.swapNumbers();
        s1.printNumbers();
        /*s2.swapNumbers();
        s2.printNumbers();*/
    }
}