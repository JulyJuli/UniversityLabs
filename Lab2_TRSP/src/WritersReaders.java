import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WritersReaders {

	private static final int ITERATION_NUMBER = 3;

	private static final int READERS_NUMBER = 3;

	private static final StringBuffer BUFFER = new StringBuffer();

	private static final int BUFFER_LENGTH = 5;

	private static final int PAUSE = 5;

	private static boolean stop;

	private static Lock lock = new ReentrantLock();
	private static Condition cond = lock.newCondition();

	private static boolean emp[] = new boolean[READERS_NUMBER];

	static {
		resetEmpty(true);
	}

	private static void resetEmpty(boolean key) {
		for (int i = 0; i < emp.length; i++) {
			emp[i] = key;
		}
	}

	// reader
	private static class Reader extends Thread {

		private int num;

		public Reader(int num) {
			this.num = num;
		}

		public void run() {
			while (!stop) {
				try {
					lock.lock();

					// readers waiting for...
					while (emp[num]) {
						System.out.println("Thread-" + Integer.valueOf(num + 1) + " waiting for poem..." + "\n");
						sleep(1500);
						cond.await();
						
					}

					cond.signal();

					read(getName());				
					emp[num] = true;
	
					System.out.println("Want re-read!");
				} catch (InterruptedException e) {
					System.out.println(e);
				} finally {
					System.out.println("Not allowed...");
					lock.unlock();
				}
			}
		}
	}

	private static class Writer extends Thread {
		public void run() {
			int tact = 0;
			
			while (!stop) {
				try {
					lock.lock();
					
				
					while (true) {

						boolean key = true;
						for (int i = 0; i < emp.length; i++) {
							
							//emp[i] = false  if readers not sleep...
							if (!emp[i] == true) {
								key = false;
							}
						}
						if (!key) {
							cond.await();
						} else {
							break;
						}
					}

					write();
					resetEmpty(false);

					cond.signal();

				} catch (InterruptedException e) {
					System.out.println(e);
				} finally {
					System.out.println();
					lock.unlock();
					if (++tact == ITERATION_NUMBER) {
						stop = true;
					}
				}
			}
		}
	}

	private static void read(String threadName) throws InterruptedException {
		System.out.printf("Reader %s:", threadName);
		for (int j = 0; j < BUFFER_LENGTH; j++) {
			Thread.sleep(PAUSE);
			System.out.print(BUFFER.charAt(j));
		}
		 System.out.println("  " + "I read!");
		Thread.sleep(1000);
	}

	private static void write() throws InterruptedException {

		BUFFER.setLength(0);

		System.err.print("\n" + "Writter:"+"Composite!" +  "\n");

		
		Random random = new Random();
		for (int j = 0; j < BUFFER_LENGTH; j++) {
			Thread.sleep(PAUSE);
			char ch = (char) ('A' + random.nextInt(26));
			System.err.print(ch);
			BUFFER.append(ch);
		}
		System.err.println();
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {

		Writer writer = new Writer();

		List<Thread> readers = new ArrayList<>();
		for (int j = 0; j < READERS_NUMBER; j++) {
			readers.add(new Reader(j));
		}

		
		writer.start();

		for (Thread reader : readers) {
			reader.start();
		}
		
	

	}
}
