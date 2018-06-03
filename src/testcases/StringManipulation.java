package testcases;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my name is joby";
		String str1 ="joseph km";
		
		System.out.println(str1.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('n'));
		
		System.out.println(str.indexOf(str, 6));
		
		System.out.println(str.indexOf(str)+1); //2nd occurance
		
		System.out.println(str.indexOf("joby"));
		
		//string comparison
		System.out.println(str.compareTo(str1));
		
		System.out.println(str.compareToIgnoreCase(str1)); //ignore cases entive
		
		//substring
		
		System.out.println(str.substring(2, 6));

		
		//trim
		System.out.println(str.trim()); //remove space on start and end
		
		System.out.println(str.replace(" ", "-")); // replace
		
		
		//split
		
		String starray[] = str.split(" ");
		for(int i=0;i<starray.length;i--) {
			System.out.println(starray[i]);
		}
		
		
	    String s2 = "cares";
		
		System.out.println(s2.concat("s));"
				+ "
		
				
		
	}

}
