package serverMaxConnMultiThread;

/**
 * 客户端
 * @author gongzhihao
 *
 */
public class Client {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			Thread thread = new Thread(new Task1());
			thread.start();
		}
	}
}