package FileStream;

import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;


public class ClientTCP {
	public ClientTCP() {
		try {
			Socket skClient = new Socket("10.21.17.252", 6000);
			InetSocketAddress address =(InetSocketAddress)skClient.getRemoteSocketAddress();
			System.out.println("IP client connected:"+address);
			//tao luong gui du lieu
			PrintWriter outClient = new PrintWriter(skClient.getOutputStream());
			DataInputStream inputClient = new DataInputStream(skClient.getInputStream());
			while(true) {
				Scanner key = new Scanner(System.in);
				System.out.println("Client:");
				String chuoiGui = key.nextLine();
				//gui du lieu di
				outClient.println(chuoiGui);
				outClient.flush();
				
				//nhan du lieu ve
				
				String chuoiNhan = inputClient.readLine();
				System.out.println("Server at"+address+":"+chuoiNhan);
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientTCP();
	}

}
