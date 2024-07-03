package train1;

import java.util.Scanner;

public class evenOdd {
	public int even,odd;
	public int m;
	
	public String task(int num) { //12345
		
		even = 0 ;
		odd = 0 ;
		
		//12345 
		while(num>=1) {
			
		m = num%10; // 5 , 4
		num=num/10; // 1234 , 123
		
		if(m%2 == 0)	{ // no	yes
		even+=1;
		}
		
		else {
		odd+=1;
		}
		}
		return  "No.of even : " + even + " No. of odd : " + odd;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		evenOdd obj = new evenOdd();
		
			System.out.println(obj.task(num));
		
		}
	}


