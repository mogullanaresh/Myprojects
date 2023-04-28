package Strings.coding;

public class ReverseWordsFromSentance {
	public static void main(String[] args) {
		String str="halo madam garu";
		reverseSentance(str);
	}
	public static void reverseSentance(String str) {
		
		String []words=str.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			//System.out.println(words[i]);
			sb.append(words[i]).append(" ");
		}
		
		String revword=sb.toString();
		System.out.println(revword);
		
	}

}
