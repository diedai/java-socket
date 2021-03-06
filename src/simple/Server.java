package simple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 * 
 * ---
 * 步骤
 * 1.启动服务器端
 * 2.接受客户端连接
 * 3.读写数据
 * 4.程序结束 
 * 这个例子 不能一直接受客户端的请求 因为没有while(true){} 处理一次 main方法就结束了
 * @author gongzhihao
 *
 */
public class Server {
	public static void main(String[] args) {
		try {
			//创建服务器端套接字
			ServerSocket ss = new ServerSocket(8888);
			System.out.println("启动服务器....");
			
			//接受客户端的连接
			Socket s = ss.accept(); //阻塞 直到有客户端连接进来
			System.out.println("客户端:" + s.getInetAddress().getLocalHost() + "已连接到服务器");

			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 读取客户端发送来的消息
			String mess = br.readLine();
			System.out.println("客户端：" + mess);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write(mess + "\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}