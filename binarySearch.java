package train1;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5,8};
		
		int search = 5;	
		int low = 0;
		int high = a.length-1;
		
		boolean flag = false;
		
		// 	Case 1	: 	search == mid , then element found
		// 	Case 2	: 	Low value = mid + 1 if search > mid
		//	Case 3	: 	High value = mid - 1 if search < mid
		
		
		while(low<=high) {
			int mid = (low + high)/2;
			
			if(search == a[mid]) {
				System.out.println("Element " + search + " found at position " + mid );   
				flag = true;
				break;
			}
			
			else if(search>a[mid]) {
				low = mid + 1;			// low = 5
			}
			
			else if(search<a[mid]) {
				high = mid - 1;			//
			}
		}
		
		if(flag == false) {
			System.out.println("Element not found");
		}
		
	
		/*
		if(a.length%2 != 0 ) {
			mid = a.length/2 + 1;
		}
		if(search>a[mid]) {
			
		}
		*/
				}
		
}
	
