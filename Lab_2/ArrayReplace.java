/* Read number in array then read 2 different numbers the and replace first
number with second number & print the changed indexes and also print the final arrray */

import java.util.Scanner;
public class ArrayReplace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n =sc.nextInt();
        int[] ar = new int[n];
        
        for(int i = 0; i<n; i++){
            System.out.println("Enter the Elements ");
            ar[i] = sc.nextInt();
        }
        /*for(int i = 0; i<n; i++){
            System.out.println("Element "+(i+1)+" is "+ar[i]);
        }*/
        for(int i = 0; i<n; i++){
            System.out.print(ar[i] + "  ");
        }
        System.out.println("\n");

        System.out.println("Enter the number which you want to replace:");
        int x = sc.nextInt();
        System.out.println("Enter the number which you want to give");
        int y = sc.nextInt();
        
        for(int i = 0;i<n;i++){
            if(ar[i]==x){
                 ar[i]=y;
                 System.out.println("Index " +i+" is changed");
            }
        }
        System.out.println("Array after replacing Elements:");
        for(int i = 0; i<n; i++){
            System.out.print(ar[i] + "  ");
        }

    }
}
