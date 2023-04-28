package Strings.coding;

public class SplitString {
   public static void main(String[] args) {
	   String str ="abc eg@d ash ahhd ji";
	   // char []ch=str.toCharArray();
	   String []words=str.split("@");
	    String rev;
	    for(int i=0;i<words.length;i++) {
	    	String str1=words[i];
	    	System.out.println(str1);
	    	
	    		
	    }
	
   }
}


