package train1;

import java.util.Scanner;

public class countNumber {
	public int c;
	
	public int count(int n) {
		c = 0;
		//1234 , 123, 12, 1
		while(n > 1) {
			
			n = n/10;
			c+=1;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		countNumber obj = new countNumber();
		
		System.out.println("The number of digits is: ");
		System.out.println(obj.count(num));
		
		sc.close();
	}

}
