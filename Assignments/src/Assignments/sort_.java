package Assignments;

import java.util.Arrays;

public class sort_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {
	            89, 35, 99, 56, 13, 
	            58, 58, 54, 72, 65, 
	            14, 215, 141, 256};
	            
	    String[] array2 = {
	            "Apple",
				"Mango",
	            "Grapes",
	            "Orange",
	            "Pineapple",
	            "Strawberry"
	        };        
	    System.out.println("Original numeric array : "+Arrays.toString(array1));
	    Arrays.sort(array1);
	    System.out.println("Sorted numeric array : "+Arrays.toString(array1));
	    
	    System.out.println("Original string array : "+Arrays.toString(array2));
	    Arrays.sort(array2);
	    System.out.println("Sorted string array : "+Arrays.toString(array2));


	}

}
