package testcases;

public class RemoveJunk {
	
	public static void main(String[] args) {
		String s="$%$#### latinG string 0123456";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
