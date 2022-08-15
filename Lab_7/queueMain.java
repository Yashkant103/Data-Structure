import java.util.Scanner;

class Queue{

	private int [] a;
	private int front = -1;
	private int rear = -1;

	public Queue(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Queue :");
		int n=sc.nextInt();
		this.a = new int[n];

		/*System.out.println("1.Enqueue\n2.Dequeque\n3.Display\n4.Exit");
		int op = sc.nextInt();
		switch(op){
			case 1 :
				System.out.println("Enter Your Number:");
				int temp = sc.nextInt();
				enqueue(temp);
				break;
		}*/
	}

	public void enqueue(int m){
		try{
    		if(rear==-1){
    			front++;
    			rear ++;
    			a[rear] = m;
    		}
    		else if(rear >= a.length-1){
    			throw new QueueError("Queue Overflow");
    		}
    		else{
    			rear ++;
    			a[rear] = m;
    		}
		}
		catch(Exception e){
		    e.printStackTrace();
		}
	}
	public int dequeue(){
	    try{
		if(front == -1 || front > rear){
			throw new QueueError("Queue Underflow");
		}
		else{
			int y;
			y = a[front]; 
			front++;
			return y;
		}
	    }
	    catch (Exception e){
	        e.printStackTrace();
	        return 0;
	    }
	}
	public void display(){
	    System.out.print("Queue : ");
		if(rear == -1){
			System.out.println("Queue is Empty");
		}
		else{
			for(int i = front; i <= rear; i++){
				System.out.print(a[i]+" ");
			}
		}
	}
}
class queueMain{

	public static void main(String[] args) {


		Queue q = new Queue();

	    q.enqueue(2);
	    q.enqueue(2);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.dequeue();
	    
	    System.out.println("Front = " + q.front + "\n" + "Rear = " + q.rear);
		q.display();
	}
}
class QueueError extends Exception {
	public QueueError(String str){
		super(str);
	}
}