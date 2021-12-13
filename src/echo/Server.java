package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket= new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.69", 10001));
		
		System.out.println("<서버 시작>");
		System.out.println("======================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		
		
		
		while(true) {
			Socket socket= serverSocket.accept();
			
			Thread thread= new ServerThread(socket); // 출장회선강화, 메세지 주고받기, 종료코드..
			thread.start();
			
 		}

		/*
		System.out.println("====================================");
		System.out.println("<서버 종료>");
		*/
 
		//192.168.0.69
	}

}
