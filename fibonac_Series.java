package train1;

import java.util.Scanner;

public class fibonac_Series {
	
	public int i,j,count,k;
	
	
	public void display(int n) {
		i = 0;
		j = 1;
		//System.out.println(i);
		//System.out.println(j);
		
		while(count<n) {
			
			System.out.println(i);
			k = i+j;
			i = j;
			j = k;
			count++;
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of terms : ");
		
		int m = sc.nextInt();
		sc.close();
		fibonac_Series obj = new fibonac_Series() ;
		obj.display(m);
	}

}
