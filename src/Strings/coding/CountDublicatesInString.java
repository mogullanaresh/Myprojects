 package Strings.coding;

import java.util.HashMap;
import java.util.Map;

public class CountDublicatesInString {
	public static void main(String[] args) {
		
      String str="deeff"; //  using forloops 
      int []count=new int[256];
      for(int i=0;i<str.length();i++) {
    	  count[str.charAt(i)]++;
    	  
      }
      for(int i=0;i<256;i++) {
    	  if(count[i]>0) {
    		 System.out.println((char)(i)+"="+count[i]); 
    	  }
      }
      
      //program to count dublicates in string
      
      String str1="aavsgeh"; // converting to map for count  dublicates 
       char []ch=str1.toCharArray();
       Map<Character,Integer> map=new HashMap<>();
       for(Character chr:ch) {
    	   if(map.containsKey(chr)){
    		   map.put(chr, map.get(chr)+1);
    	   }else {
    		   map.put(chr, 1);
    	   }
       }
      System.out.println(map);
}
}