package pMaxThread;

/**
 * 任务
 * @author gongzhihao
 *
 */
public class RunnableTask implements Runnable{

	@Override
	public void run() {
		System.out.println("current thread name:" + Thread.currentThread().getName() + ", current thread id:" + Thread.currentThread().getId());
	}

}
