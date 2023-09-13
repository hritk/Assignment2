package d2;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = new int[20] ;
		
		for(int i=0;i<20;i++) {    // adding elements
			arr[i]=i;
		}
		
		
		for(int i=0;i<arr.length;i++) {       //printing elements
			System.out.print (arr[i] + " "); 
		}
		
		int size= arr.length -1;
		
	    System.out.println(" ");
		System.out.println("first element :  " + arr[0]);
		System.out.println("last element : " + arr[size]);
		
		
		arr[2]= 33;
		arr[7]= 77;
		
		
		for(int i=0;i<arr.length;i++) {       //printing elements
			System.out.print (arr[i] + " "); 
		}
		
		
		
		
		
		
		
		
		
		

	}

}
