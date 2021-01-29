package 线程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable mc1 = new MyCallable(100);
		FutureTask<Integer> ft1 = new FutureTask<>(mc1); 
		MyCallable mc2 = new MyCallable(36);
		FutureTask<Integer> ft2 = new FutureTask<>(mc2);
		
		Thread th1 = new Thread(ft1);
		th1.start();
		Thread th2 = new Thread(ft2);
		th2.start();
		
		Integer sum1 = ft1.get();
		Integer sum2 = ft2.get();
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
