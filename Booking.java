import java.util.Scanner;
import java.util.ArrayList;
public class Booking{
	public static void main (String [] arg){
		Scanner scan = new Scanner(System.in);
		String fjala = "";
		String [] dhoma = {"A","B","C"};
		int count=0;
		int rezervuar=0;
		
		ArrayList<String> arrlist = new ArrayList<>();
		
		while(count < dhoma.length){ 
			
		System.out.print("Type A-B-C to book your room: ");
		fjala = scan.nextLine();
		count++;
		
		while(gabim(fjala)){
			System.out.print("Room name is invalid, please type again: ");
			fjala = scan.nextLine();
			if(!gabim(fjala)){
				System.out.println();
			}
		}
		for(int i =0; i<arrlist.size();i++){
			
			while(arrlist.contains("A") && fjala.equals("A")){
			if(!arrlist.contains("B") && !arrlist.contains("C") ){
				System.out.println("A is currently booked, but room B and C are free.");
			}
				else if(!arrlist.contains("B") ){
					System.out.println("A is currently booked, but room B is free.");
				}
				else if(!arrlist.contains("C") ){
					System.out.println("A is currently booked, but room C is free.");
				}

			System.out.print("Please type again: ");
			fjala = scan.nextLine();

			}
			while(arrlist.contains("B") && fjala.equals("B")){
				if(!arrlist.contains("A") && !arrlist.contains("C") ){
				System.out.println("B is currently booked, but room A and C are free.");
			}
				else if(!arrlist.contains("A") ){
					System.out.println("B is currently booked, but room A is free.");
				}
				else if(!arrlist.contains("C") ){
					System.out.println("B is currently booked, but room C is free.");
				}
				System.out.print("Please type again: ");
				fjala = scan.nextLine();
			} 
			while(arrlist.contains("C") && fjala.equals("C")){
				if(!arrlist.contains("B") && !arrlist.contains("A") ){
				System.out.println("C is currently booked, but room B and C are free.");
				}
				else if(!arrlist.contains("B") ){
					System.out.println("C is currently booked, but room B is free.");
				}
				else if(!arrlist.contains("A") ){
					System.out.println("C is currently booked, but room A is free.");
				}
				System.out.print("Please type again: ");
				fjala = scan.nextLine();
			}	
		}
			
		for(int i =0; i < dhoma.length ;i++){
			if(fjala.equals(dhoma[i]) && !arrlist.contains(fjala)){
				System.out.println("\nRoom "+fjala+" is now booked!");
				arrlist.add(fjala);
				System.out.println("Booked rooms -->"+arrlist);
				System.out.println();
				if(arrlist.contains("A") && arrlist.contains("B") && arrlist.contains("C")){
					System.out.print("----All rooms are booked!----");
					}
				}
			}
		}
	}
	public static boolean gabim (String fjala){
		return (!(fjala.equals("A") || fjala.equals("B") || fjala.equals("C")));
	}
}