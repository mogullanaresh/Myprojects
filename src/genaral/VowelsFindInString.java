package genaral;

import java.util.HashMap;
import java.util.Map;

public class VowelsFindInString {
	
public static void main(String[] args) {

	String str="bbcdf";
	checkVowelsInString(str);
	String str1="aabbccde";
	CountEachVowel(str1);
}
public static void checkVowelsInString(String str) {
	int count=0;

  boolean b=false;
	for(int i=0;i<str.length();i++) {
		char ch=Character.toLowerCase(str.charAt(i));
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
	   b=true;
		System.out.println(ch);
		
			
		}
	}System.out.println(str+"  "+count+"  "+b);
	
}
public static void CountEachVowel(String str1) {

    int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
    for (int i = 0; i < str1.length(); i++) {
        char ch = Character.toLowerCase(str1.charAt(i));
        if (ch == 'a') {
            aCount++;
        } else if (ch == 'e') {
            eCount++;
        } else if (ch == 'i') {
            iCount++;
        } else if (ch == 'o') {
            oCount++;
        } else if (ch == 'u') {
            uCount++;
        }
    }

    System.out.println("The string \"" + str1 + "\" has:");
    System.out.println(aCount + " 'a' vowels");
    System.out.println(eCount + " 'e' vowels");
    System.out.println(iCount + " 'i' vowels");
    System.out.println(oCount + " 'o' vowels");
    System.out.println(uCount + " 'u' vowels");

}
}

