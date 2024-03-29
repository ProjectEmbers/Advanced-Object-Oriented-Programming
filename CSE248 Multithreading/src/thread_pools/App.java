package thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App
{

	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i = 0; i < 5; i++)
		{
			executor.submit(new Processor(i));
		}
		executor.shutdown();
		System.out.println("All tasks have been submitted.");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All tasks completed.");

	}

}
