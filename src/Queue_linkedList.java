
public class Queue_linkedList {
	
	//the main pointers
	Node front = null;
	Node rear = null;
	Node n = new Node();
	
	//the enqueue method
	public void enqueue(int data) {
		
		n.data = data;
		
		if(n != null) {
			//checking if the rear is empty
			if(rear == null) {
				rear = n;
				front = n;
				n.next = null;
			
			}else {
				//connect the current node with n
				rear.next = n;
				//moves the rear pointer to n
				rear = n;
			}
		}
	}
	//the dequeue method
	public int dequeue() {
		n = front;
		
		if(front != null) {
			front = front.next;
		}
		if(front == null) {
			rear = null;
		}
		return n.data;
		
		
	}
	  
	
	
	
	
	
}
