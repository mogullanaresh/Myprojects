package Strings.coding;

public class PlondrumString {
	
	public static void main(String[] args) {
		String str="madams";
		String rev="";
		//polidrumString(str);
		//String stringBuilder=new StringBuilder(str).reverse().toString();
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;// m
			
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("poli");
		}else {
			System.out.println("not poli");
		}
		System.out.println();
		
	}
	//this is one way other wise }
	public static void polidrumString(String str) {
	 int  i=0;
	 int j=str.length()-1;
	 while(i<j) {
		// boolean  b= true;
		 if(str.charAt(i)!=str.charAt(j)) {
			 System.out.println(" not poli");
			 break;
		 }
		 i++;
		 j--;
	 }
	 System.out.println("poli");
	 }
	
	}


