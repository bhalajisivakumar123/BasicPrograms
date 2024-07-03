package train1;
import java.util.Scanner;

public class palindrome {
	String a,b ; 
	int i;
	
	public void check(){
		for(i = a.length() - 1; i >= 0; i--) {
			b += a.charAt(i);
	}
	
			if (a.equalsIgnoreCase(b)) {
	            System.out.println(a + " is a palindrome.");
	        } 
			else {
	            System.out.println(a + " is not a palindrome.");
	        	}
	        }
		
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputStr = sc.nextLine();
		
		palindrome palindromeObj = new palindrome();
        palindromeObj.a = inputStr.toLowerCase(); 
        palindromeObj.check();

        sc.close();
		
	}

}
