package Strings.coding;

public class PrintDublicatesFromString {
public static void main(String[] args) {
	String str="aabbeeccd";
	PrintDublicatesFromString pd=new PrintDublicatesFromString();
	pd.printDublicatesFromString(str);;
	
}
public void printDublicatesFromString(String str) {
	
	char []ch=str.toCharArray();

	for(int i=0;i<str.length();i++) {//a

		int count=1;
		for(int j=i+1;j<str.length();j++) {//a
			if(ch[i]==ch[j]) { //true
				count++;//2
				ch[j]=' ';
			}
			
		}
		if(count>1&&ch[i]!=' ') {
			System.out.println(ch[i]);
		}
	}
}
}
