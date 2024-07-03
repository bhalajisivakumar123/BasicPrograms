package train1;

import java.util.Scanner;

public class reverse_string {
	
		public int i;
		public String reverse;
		
	
	public String rev(String n) {
		
		reverse = "";
		for(i = n.length()-1; i>=0; i--) {
			reverse += n.charAt(i);
		}
		return reverse;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to find reverse: ");
		String m = scan.nextLine();
		scan.close();
		
		//creating object for calling method to reverse
		reverse_string obj = new reverse_string();
		
		//displaying output
		System.out.println(obj.rev(m));
			
	}

}
