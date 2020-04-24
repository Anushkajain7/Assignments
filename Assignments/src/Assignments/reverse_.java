package Assignments;

import java.util.Arrays;

public class reverse_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {
	            19, 25, 19, 45, 13, 
	            18, 28, 54, 72, 65, 
	            46, 15, 57, 26, 10};
	  System.out.println("Original array : "+Arrays.toString(array1));  
	   for(int i = 0; i < array1.length/2; i++)
	  {
	    int temp = array1[i];
	    array1[i] = array1[array1.length-i-1];
	    array1[array1.length-i-1] = temp;
	  }
	    System.out.println("Reverse array : "+Arrays.toString(array1));


	}

}
