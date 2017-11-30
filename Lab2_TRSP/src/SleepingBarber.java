import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SleepingBarber {

	static boolean state = true;

	public static void main(String a[]) {
		
		Bshop shop = new Bshop();
		Barber barber = new Barber(shop);
		Visitor visitor = new Visitor(shop);

		Thread threadBarber = new Thread(barber);
		Thread threadVisitor = new Thread(visitor);
	
		System.out.println("Barber started.." + "\n");

		for (int i = 0; i < 3; i++) {
			
			threadVisitor.run();
			threadBarber.run();
		
		}
		System.out.println("Barber closed! Find another place for cutting hair!");
	}
}

class Barber implements Runnable {
	Bshop shop;

	public Barber(Bshop shop) {
		this.shop = shop;
	}

	public void run() {

		shop.cutHair();

	}
}

class Customer implements Runnable {
	String name;
	Date inTime;

	Bshop shop;

	public Customer(Bshop shop) {
		this.shop = shop;
	}

	public String getName() {
		return name;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public void run() {
		goForHairCut();
	}

	private synchronized void goForHairCut() {
		shop.add(this);

	}
}

class Visitor implements Runnable {
	Bshop shop;

	public Visitor(Bshop shop) {
		this.shop = shop;
	}

	public void run() {

		Customer customer = new Customer(shop);
		customer.setInTime(new Date());

		Thread thcustomer = new Thread(customer);
		customer.setName("Customer: " + thcustomer.getId());
		thcustomer.start();

		try {
			TimeUnit.SECONDS.sleep((long) (Math.random() * 10));
		} catch (InterruptedException iex) {
			iex.printStackTrace();
		}
	}

}

class Bshop {
	int nchair;
	List<Customer> listCustomer;

	public Bshop() {
		nchair = 3;
		listCustomer = new LinkedList<Customer>();
	}

	public void cutHair() {
		Customer customer;

		synchronized (listCustomer) {

			 if (listCustomer.size() == 0) {
				System.out.println("Barber is waiting for customer." + "\n");
				try {
					
					listCustomer.wait();
				} catch (InterruptedException iex) {
					iex.printStackTrace();
				}
			}
			System.out.println("\n" + "Barber found a customer in the queue.");
			customer = (Customer) ((LinkedList<?>) listCustomer).poll();
		}
		long duration = 0;
		try {
			System.out.println("Cuting hair of " + customer.getName());
			duration = (long) (Math.random() * 10);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException iex) {
			iex.printStackTrace();
		}
		System.out.println(
				"Completed Cuting hair of " + customer.getName() + " in " + duration + " seconds.");
		System.out.println("---------------------------------"+"\n");

	}

	public void add(Customer customer) {
		System.out.println( customer.getName() + " entering the shop at " + customer.getInTime());

		synchronized (listCustomer) {
			if (listCustomer.size() == nchair) {
				System.out.println("\n" + "No chair available for " + customer.getName());
				System.out.println(customer.getName() + "Waiting for a chair...");
				return;
			}

			((LinkedList<Customer>) listCustomer).offer(customer);
			System.out.println(customer.getName() + " got the chair.");

			if (listCustomer.size() == 1)
				listCustomer.notify();
		}
	}
}
