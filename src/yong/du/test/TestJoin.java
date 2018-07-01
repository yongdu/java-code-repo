package yong.du.test;

public class TestJoin {
	public static void main(String[] args) throws InterruptedException {
	      Thread th1 = new Thread(new Myclass(), "th1");
	      Thread th2 = new Thread(new Myclass(), "th2");
	      Thread th3 = new Thread(new Myclass(), "th3");
	         
	      th1.start();
	      //th1.join();
	      th2.start();
	      //th2.join();
	      th3.start();
	      //th3.join();
	   }
	
}
class Myclass implements Runnable{
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread started: "+t.getName());
		
		try {
            Thread.sleep(4000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		 System.out.println("Thread ended: "+t.getName());
	}
	
}
