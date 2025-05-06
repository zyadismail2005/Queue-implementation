
public class Main {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(2);
		q.enqueue(7);
		q.enqueue(9);
		q.dequeue();
		q.enqueue(14);
		q.show();

	}

}
