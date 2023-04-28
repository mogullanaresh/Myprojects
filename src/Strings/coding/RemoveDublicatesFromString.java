package Strings.coding;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicatesFromString {
public static void main(String[] args) { 
	
	String str="aabbccde";
	Set<Character> set=new LinkedHashSet<>();
	for(char c:str.toCharArray()) {
		set.add(c);
	}
	StringBuilder sb=new StringBuilder();
	for(Character character:set) {
		sb.append(character);
		
	}
	System.out.println(sb);

}

}
