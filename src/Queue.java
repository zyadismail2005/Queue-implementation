
public class Queue {
	
	//first off create the queue itself using Array
	int queue [] = new int[5];
	//The main variables
	int front;
	int rear;
	int size;
	
	//the enqueue method or in a simple way the insertion method
	public void enqueue(int data) {
		if(!isFull()) {
			queue[rear] = data;
			//we need to make the array circular that will be done by mod(%)
			//for ex. 1%5 = 1, 2%5 = 2 , 3%5 = 3 , .. 5%5=0
			rear = (rear + 1) % 5;
			//counter of the size
			size++;
		}else {
			System.out.println("the Queue is full");

		}
		
	}
	
	//the dequeue method or the deletion method
	public int dequeue() {
		int data = queue[front];
		
		if(!isEmpty()) {
			// same thing to make it circular 
			front = (front + 1) % 5;
			size--;	
		}else {
			System.out.println("the queue is empty");

		}
		return data;
	}
	
	public void show() {
		System.out.println("The elements of the queue are:-");
		//A loop to print all the elements of the queue
		for(int i = 0 ; i < size ; i++) {
			System.out.print(queue[(front+i) % 5] + " ");//front + i bcuz u wanna start from front not 0 or i 

		}
		
	}
	//get size method
	public int getSize() {
		return size;
	}
	//is Empty method
	public boolean isEmpty() {
		return getSize() == 0;
	}
	//is full method 
	public boolean isFull() {
		return getSize() == 5;
	}
	
	
	
	
	
	
}
