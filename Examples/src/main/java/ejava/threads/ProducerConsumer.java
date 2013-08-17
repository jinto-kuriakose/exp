/**
 * 
 */
package ejava.threads;

import java.util.LinkedList;

/**
 * @author jinto.kuriakose 15-Aug-2013
 * 
 */
public class ProducerConsumer {

	public static void main(String[] args) {

		LinkedList<Integer> set = new LinkedList<Integer>();
		Runnable producer = new Producer(set, 21);
		Runnable consumer = new Consumer(set);
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	}
}

class Consumer implements Runnable {
	LinkedList<Integer> list;

	int g =(int) 88L;
	public Consumer(LinkedList<Integer> list) {
		this.list = list;
	}

	public void run() {

		while (true) {
			while (list.isEmpty()) {
				synchronized (list) {
					System.out.println("Queue is empty.Not consuming.Waiting");
					try {
						list.wait();
						// wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
					// }
				}
				synchronized (list) {
					try {
						list.notifyAll();
						// notifyAll();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consuming " + list.remove(0));
			}
		}
	}
}

class Producer implements Runnable {
	LinkedList<Integer> list;
	int size;

	public Producer(LinkedList<Integer> list, int size) {
		this.list = list;
		this.size = size;
	}

	public void run() {
		int i = 1;
		while (i < size) {
			while (list.size() == size) {
				synchronized (list) {
					System.out
							.println("Queue is Full.Not able to Produce.Going to wait");
					try {
						list.wait();
						// wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			synchronized (list) {
				list.add(i);
				System.out.println("Produced " + i + " Calling notifyall");
				list.notifyAll();
				// notifyAll();
				i++;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
