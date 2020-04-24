package Assignments;

public class string_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"python","Mango","java","Strawberry"};
        String[] arr2 = {"c++","c","python","java","js"};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
}


	}

}
