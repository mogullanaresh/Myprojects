package Arrays.coding;

public class ReverseOfNumber {
	public static void main(String[] args) {
		
	
	int a=1233;
	int remainder;
	int sum=0;
	
	while(a>0) {
		remainder=a%10;
		sum=(sum*10)+remainder;
		a=a/10;
	}
	System.out.println(sum);
}
}
