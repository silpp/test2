
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
	public static void main(String[] args) {
		// test git 1
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		q1.add(10);
		q1.add(20);
		q1.add(30);

		try {
			q1.add(40);

		} catch (IllegalStateException e) {
			System.out.println("Queue full: Try to add too many items");
		}
		System.out.println(q1.element());
		System.out.println(q1.element());
		for (Integer value : q1) {
			System.out.println("value in q1 is " + value);
		}

		for (Integer value : q1) {
			System.out.println("remove value " + q1.remove() + " from queue");
			System.out.println(q1);
		}

		try {
			System.out.println("remove value from empty queue" + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Cannot remove empty queue");
		}

		/////////////////////////////////////////////////////////////////
		System.out.println();
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		System.out.println("Queue2 peek is "+q2.peek());
		q2.offer(10);
		q2.offer(20);
		q2.offer(30); // offer does not throw an error
	
		if(q2.offer(30) == false){
			System.out.println("fail to add this item: queue is full");
		}
		
		System.out.println(q2);
		System.out.println("After assign value Queue2 peek is "+q2.peek());
		
		for(Integer value:q2){
			System.out.println("Queue2 value is "+value);
		}
		
		System.out.println("Queue2 poll: "+q2.poll());
		System.out.println("Queue2 poll: "+q2.poll());
		System.out.println("Queue2 poll: "+q2.poll());
		System.out.println("Queue2 poll: "+q2.poll());
		
		
	}
}
