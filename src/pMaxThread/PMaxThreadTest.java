package pMaxThread;

/**
 * 一个进程包含的最大线程数量
 * 
 * @author gongzhihao
 *
 */
public class PMaxThreadTest {

	private static int i = 0;

	public static void main(String[] args) {
		try {

			while (true) {
				Thread thread = new Thread(new RunnableTask());
				thread.start();

				i++;
				System.out.println(i);
			}

		} catch (Error e) {
			System.exit(-1);
		}
	}

}
