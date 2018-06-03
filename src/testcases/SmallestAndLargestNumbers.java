package testcases;

public class SmallestAndLargestNumbers {
	public static void main(String args[]) {
		
		int numbers[]= {-10,2,3,4,5,222222};
		
		int smallest=numbers[0];
		int largest=numbers[0];
		
		//Time Complexity = O(n) single n bez of one for loop.
		
		for(int i=1;i<numbers.length;i++) {
			if (numbers[i]>largest) {
				largest = numbers[i];
					
			}
			else if(numbers[i]<smallest){
				smallest=numbers[i];
				
			}
		}
		
		System.out.println("The smallest number is ::"+smallest);
		System.out.println("The smallest number is ::"+largest);
		
		
	}

}
