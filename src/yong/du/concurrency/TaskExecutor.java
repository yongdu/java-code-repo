package yong.du.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
	public static void main(String[] args) {
	
		// create thread task
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");
		
		//create excutorService  to manage threads
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		System.out.println("Starting Executor");
		
		// start the three PrinTasks
		executorService.execute(task1);
		executorService.execute(task2);
		executorService.execute(task3);
		
		executorService.shutdown();
		System.out.println("Tasks Started, main ends.");
		
	}
}
