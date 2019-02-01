package pMaxThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试jvm最大线程数
 * 
 * @author gongzhihao
 *
 */
public class TestThread extends Thread {
	private static final AtomicInteger count = new AtomicInteger();

	public static void main(String[] args) {
		while (true)
			(new TestThread()).start();

	}

	@Override
	public void run() {
		System.out.println(count.incrementAndGet());

		//下面这段代码的作用是 不让线程结束(具体是睡眠 但不结束) 目的是线程不结束 就占用了内存空间 这样才可以测试jvm总共可以创建多少个线程 如果没有这段代码 那么可以无限创建新的线程 因为之前的线程已经结束销毁掉了
		while (true)
			try {
				Thread.sleep(Integer.MAX_VALUE); // 线程睡眠
			} catch (InterruptedException e) {
				break;
			}
	}
}
