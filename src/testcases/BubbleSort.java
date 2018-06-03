package testcases;

public class BubbleSort {
	//compare first element with second element and then swap the elements when the first element is higher.
	//every iteration will sort a big number

	public static void main(String[] args) {
		int list[]= {4,1,2,6,3};
		int i,j,tmp =0;
		
		System.out.println("Before Sort");
		for(int num : list) {
			System.out.print(num+" ");
		}
	
		
		for(i=0;i<list.length-1;i++) {
			for (j=0;j<list.length-1-i;j++) {
				if ( list[j]>list[j+1]) {   // compare 1st digit with 2nd digit
					tmp = list[j];
					list[j]=list[j+1];
					list[j+1]=tmp;
				}
			}
	}
	
	System.out.println("\n\n" + "After sort");
		for( int num: list) {
			System.out.print(num+" ");
		}
	
	}
	
}
