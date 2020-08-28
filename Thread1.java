
public class Thread1 extends Thread{
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	public void run() {
		synchronized(lock1){
			System.out.println("Thread 1: Hold lock 1 ...");
			try {
				Thread.sleep(15);
			}
			catch(InterruptedException exp) {}
		System.out.println("Thread 1: wait lock 2 ...");
		synchronized(lock2) {
			System.out.println("Thread 1: Hold lock 1 & 2 ...");
			}	
		}
		
	}

}

 class Thread2 extends Thread{
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	public void run() {
		synchronized(lock2){
			System.out.println("Thread 2: Hold lock 2 ...");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException exp) {}
		System.out.println("Thread 2: wait lock 1 ...");
		synchronized(lock1) {
			System.out.println("Thread 2: Hold lock 1 & 2 ...");
			}	
		}
		
	}

}
