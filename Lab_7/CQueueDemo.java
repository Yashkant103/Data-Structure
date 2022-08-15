import java.util.Scanner;
class CQueue {
    private int [] a;
    private int front = -1;
    private int rear = -1;

    public CQueue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Queue :");
        int n=sc.nextInt();
        this.a = new int[n];
    }

    public void qInsert(int element){
        try{
            if(rear>=a.length-1 && front==0){
                throw new CQueueError("CQueue Overflow");
            }
            else{
                if(front-1==rear){
                    throw new CQueueError("CQueue Overflow");
                }
                else if(rear<a.length-1){
                    rear++;
                    a[rear] = element;
                    if(front==-1){
                        front++;
                    }
                }
                else{
                    rear = 0;
                    a[rear] = element;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public int qDelete(){
        if(front==rear){
            int extra = front;
            front = -1;
            rear = -1;
            return a[extra];
        }
        else if(front<a.length-1){
            front++;
            return a[front-1];
        }
        else{
            front=0;
            return a[a.length-1];
        }
        
    }

    public void displayQueue(){
        if(rear>front){
            for(int i = front; i<rear+1; i++){
                System.out.print(a[i]+" ");
            }
        }
        if(rear<front){
            for(int i = front;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            for(int i = 0;i<=rear;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
    
}

public class CQueueDemo{
    public static void main(String[] args) {
        CQueue q1 = new CQueue();
        q1.qInsert(25);
        q1.qInsert(26);
        q1.qInsert(27);
        q1.qInsert(52);
        q1.qInsert(62);
        q1.qInsert(72);

        q1.displayQueue();
    }
}
class CQueueError extends Exception {
    public CQueueError(String str){
        super(str);
    }
}