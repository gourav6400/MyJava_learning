package JavaCourse;

public class MaltiDimensionalArray {

	public static void main(String[] args) {
		//declaring and defining
		//data_type arrName[][] = {{},{},{}};
		int arr [][] = {{1,2,3},{5,6,7,},{8,9,10}};
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr.length;j++) {
    		   System.out.print(arr[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}
