package FileStream;

import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
	public ServerTCP() {
		try {
			ServerSocket serverSK = new ServerSocket(6000);
			Socket skServer = serverSK.accept();
			InetSocketAddress address =(InetSocketAddress)skServer.getRemoteSocketAddress();
			System.out.println("IP client connected:"+address);
			DataInputStream inputServer = new DataInputStream(skServer.getInputStream());
			PrintWriter outServer = new PrintWriter(skServer.getOutputStream());
			
			while(true) {
				String chuoiNhan = inputServer.readLine();
				System.out.println("Client at"+address+":"+chuoiNhan);
				
				StringBuilder sb = new StringBuilder(chuoiNhan);
				String chuoiGui = sb.reverse().toString();
				outServer.println(chuoiGui);
				outServer.flush();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ServerTCP();
	}

}
