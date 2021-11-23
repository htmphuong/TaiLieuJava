package Inheritance;

import java.util.Scanner;
import java.util.Vector;

public class HotelManage {
	Vector<Integer> vInt = new Vector<Integer>();
	Vector<Room> vRoom = new Vector<Room>();
	
	public HotelManage() {
		InputRoom();
		ViewRoom();
	}
	public void InputRoom() {
		int n=2;// so room se nhap
		for(int i=0;i<n;i++) {
			Scanner key = new Scanner(System.in);
			System.out.println("Num of beds=");
			int beds = Integer.parseInt(key.nextLine());
			System.out.println("Is tv");
			boolean tv = key.nextBoolean();
			System.out.println("Is tp");
			boolean telephone = key.nextBoolean(); 
			Room r = new Room(beds, tv, telephone);
			vRoom.add(r);			
		}
			
	}
	public void ViewRoom() {
		for(int i =0;i<vRoom.size();i++) {
			System.out.println("Beds is"+vRoom.get(i).getBeds());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HotelManage();
	}

}
