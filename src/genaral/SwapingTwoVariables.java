package genaral;

public class SwapingTwoVariables {
  public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("b=="+b+"a=="+a);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("b=="+b+"a=="+a);
	
	int x=20;
	int y=30;
	
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println(x+","+y);
	 String s="abc";
	 String s1="xyz";
	 s=s+s1;
      s1=s.substring(0, s.length()-s1.length());
      s=s.substring(s1.length());
      System.out.println(s+"     "+ s1);
	 
}
}
