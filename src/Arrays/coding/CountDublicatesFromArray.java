package Arrays.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDublicatesFromArray {
	public static void main(String[] args) {
		int []a= {1,2,2,2,3,3,4};
		countfreq(a);
		int []arr= {1,1,2,3,4,1,1,2,2,5};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					count++;
				else
					break;
				
			}
			if(count>0) {
				//System.out.println(arr[i]+"="+count);
				i+=count-1;
			}
		}
	}
	// with using  map count the dublicates  from array
	
	public static void countfreq(int a[]) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		
      for(int i=0;i<a.length;i++) {
    	  if(map.containsKey(a[i])) {
    		  map.put(a[i],map.get(a[i])+1);
    	  }else {
    		  map.put(a[i], 1);
    	  }
      }
      for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
    	  
    	  System.out.println(entry.getKey()+"======"+entry.getValue());
      }
	}

}
