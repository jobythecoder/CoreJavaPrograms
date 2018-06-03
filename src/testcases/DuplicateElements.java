package testcases;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String args[]) {
		
		String names[]= {"java","python","java","python"};
		
		//1.compare each element:0(nxn) worst solution
		
		for(int i =0;i<names.length;i++) {
			for (int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j]))
					System.out.println(names[j]);
			}
		}
		
	    //using HashSet:O(n)
		Set<String> store = new HashSet<String>();
		
		for(String name : names){
			if(store.add(name)==false) {
				System.out.println("duplicate is::"+name);
			}
			
		}
		
		//using HashMap:0(2n)
		
	Map<String, Integer> storeMap = new HashMap<String, Integer>();
	
	
	for(String name : names) {
		Integer count = storeMap.get(name);
		
		if(count==null) {
			
			storeMap.put(name, 1);
			
		}
		
		else {
			storeMap.put(name, ++count);
			
		}
		
		}
	
	//  get the values from the HashMap
	Set <Entry<String, Integer>> entrySet = storeMap.entrySet();
	for(Entry<String, Integer> entry: entrySet) {
		if(entry.getValue()>1) {
			System.out.println("duplicate element is::"+ entry.getKey());
			
		}
	
	}
	
		
	
	}
	


		
}
