package yong.du.concurrency;
import java.security.SecureRandom;
public class PrintTask implements Runnable{
	private final static SecureRandom generator = new SecureRandom();
	private  int sleepTime;//random sleep time for thread
	private String taskName;

	public PrintTask(String taskName) {
		this.taskName = taskName;
		//pick random sleep time between 0 and 5 seconds
		sleepTime = generator.nextInt(5000);
	}
	// thread.start() will invoke this run method
	public void run() {
		System.out.printf("%s going to sleep for %d millisenconds,%n", taskName,sleepTime);
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();// re-interrupt the thread
		}
		
		System.out.printf("%s done sleeping %n", taskName);
	}
}
