
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ProducersAndConsumers {

	static Boolean p = true;
	public static char[] resource = new char[8];
	static final Semaphore SEMAPHORE = new Semaphore(1);

	public static void main(String[] args) throws InterruptedException {

		long duration;

		Thread t = new Thread(new EncryptionThread());
		Thread t2 = new Thread(new DecryptionThread());

		for (int i = 0; i < 5; i++) {

			System.out.println(t.getName() + t.getId() + "\n" + "Let's generate some symbols!........");
			duration = (long) (Math.random() * 10);
			TimeUnit.SECONDS.sleep(duration);
			t.run();

			System.out.println("\n" + t2.getName() + t2.getId() + "\n" + "Let's see symbols number representation...");
			t2.run();
			Thread.sleep(1000);
			System.out.println("---------------------------------------" + "\n");
		}
	}

}

class EncryptionThread implements Runnable {
	Random x = new Random();

	@Override
	public void run() {
		try {
			if (ProducersAndConsumers.p) {
				ProducersAndConsumers.SEMAPHORE.acquire();

				for (int i = 0; i < 8; i++) {
					ProducersAndConsumers.resource[i] = (char) (x.nextInt(26) + 'a');
					System.out.print(ProducersAndConsumers.resource[i] + "   ");
				}

				System.out.println();
				ProducersAndConsumers.p = false;
				ProducersAndConsumers.SEMAPHORE.release();
			}
		} catch (InterruptedException e) {
		}
	}
}

class DecryptionThread implements Runnable {

	@Override
	public void run() {
		try {
			ProducersAndConsumers.SEMAPHORE.acquire();

			for (int i = 0; i < 8; i++) {
				System.out.print((int) ProducersAndConsumers.resource[i] + " ");
			}
			System.out.println("\n");

			ProducersAndConsumers.p = true;
			ProducersAndConsumers.SEMAPHORE.release();
		} catch (InterruptedException e) {

		}
	}
}
