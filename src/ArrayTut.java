
import java.util.*;
public class ArrayTut {
	public static void main(String[] args) {
		int[][] arr1, arr2;
		arr1 = new int[][]{{1,2}, {3,4}};
		arr2 = arr1.clone();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter a number"+2);
		int i = in.nextInt();
		
		System.out.println(" value ="+i);

		
		System.out.println(arr1 == arr2);
		System.arraycopy(arr1, 0, arr2, 0, 2);
		System.out.println(arr1 == arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		
		printArray(new int[]{1,2});
		
		String str = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = str.split("t", -1);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);



	}
	static void printArray(int[] arr) {
		for(int i:arr)
			System.out.print(i+"\t");
	}
	
	
}
