//User_Defined Stack

import java.util.Scanner;

class Stack {
    Scanner sc = new Scanner(System.in);
    int[] Stack;
    int top = -1;

    public Stack() {
        System.out.println("Enter the size of Stack:");
        int z = sc.nextInt();
        Stack = new int[z];
    }

    public void push(int n) {
        if (top > Stack.length) {
            System.out.println("Sorry! you cant enter the number(Stack_Overflow!!)");
        } else {
            top++;
            Stack[top] = n;
        }
    }

    /*
     * public void push(){
     * if(top>Stack.length){
     * System.out.println("Sorry! you cant enter the number");
     * }else{
     * for(int i=0; i<; i++){
     * System.out.println("Enter the number you want to store int Stack :");
     * int m = sc.nextInt();
     * top++;
     * Stack[top] = m;
     * }
     * }
     * System.out.println("The value of top is : "+top);
     * }
     */
    public int pop() {
        if (top < 0) {
            System.out.println("Sorry! no element to remove");
            return top;
        } else {
            top--;
            return Stack[top + 1];
        }
    }

    public void displayStack() {
        System.out.println("Stack :");
        for (int i = 0; i < top; i++) {
            System.out.print(Stack[i] + " ");
        }
        System.out.println("\nThe value of top is : " + top);
    }

    public void change(int n, int number) {
        if (top - n + 1 <= top && top - n + 1 > -1) {
            Stack[top - n + 1] = number;
            System.out.println("The number has being changed");
        } else {
            System.out.println("Enter the correct index:");
        }
    }

    public int peep() {
        if (top == -1) {
            System.out.println("The Stack is empty");
            return top;
        } else {
            return Stack[top];
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(90);
        s.push(5);
        s.push(10);
        s.pop();

        // int n = s.pop();
        // n =s.pop();
        System.out.println("The removed element is");
        // s.peep();
        s.displayStack();
    }
}