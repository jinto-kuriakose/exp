/**
 * 
 *//*
package ejava.threads;

import java.util.Vector;

*//**
 * @author jinto.kuriakose 15-Aug-2013
 * 
 *//*
public class ProducerConsumerSolution {

	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		Vector sharedQueue = new Vector();
		int size = 4;
		Thread prodThread = new Thread(new Producer(sharedQueue, size),
				"Producer");
		Thread consThread = new Thread(new Consumer(sharedQueue),
				"Consumer");
		prodThread.start();
		consThread.start();
	}
}
@SuppressWarnings("rawtypes")
class Producer implements Runnable {

	private final Vector sharedQueue;
	private final int SIZE;

	public Producer(Vector sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.SIZE = size;
	}

	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("Produced: " + i);
			try {
				produce(i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}

	private void produce(int i) throws InterruptedException {

		// wait if queue is full
		while (sharedQueue.size() == SIZE) {
			synchronized (sharedQueue) {
				System.out.println("Queue is full "
						+ Thread.currentThread().getName()
						+ " is waiting , size: " + sharedQueue.size());

				sharedQueue.wait();
				//wait();
			}
		}

		// producing element and notify consumers
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			sharedQueue.notifyAll();
			//notifyAll();
		}
	}
}
@SuppressWarnings("rawtypes")
class Consumer implements Runnable {

	private final Vector sharedQueue;

	public Consumer(Vector sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + consume());
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}

	private int consume() throws InterruptedException {
		// wait if queue is empty
		while (sharedQueue.isEmpty()) {
			synchronized (sharedQueue) {
				System.out.println("Queue is empty "
						+ Thread.currentThread().getName()
						+ " is waiting , size: " + sharedQueue.size());

				sharedQueue.wait();
				//wait();
			}
		}

		// Otherwise consume element and notify waiting producer
		synchronized (sharedQueue) {
			sharedQueue.notifyAll();
			//notifyAll();
			return (Integer) sharedQueue.remove(0);
		}
	}
}*/