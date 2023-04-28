package Arrays.coding;

import java.util.Arrays;

public class DublicatePrintFromArray {
public static void main(String[] args) {
	int []a= {1,1,2,36,54,3,2,2,3};
	//Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				
				System.out.println(a[j]);
				
			}
			
		}
	}
}
}
