package mine;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		 System.out.println("Enter string array size");
	        Scanner sc = new Scanner(System.in);
	        int i = sc.nextInt();

	        String[] arr = new String[i];
	        for (int j = 0; j < i; j++) {
	          System.out.println("Enter next element");
	          arr[j] = sc.next();
	        }
	        
	        String x;
	    System.out.println("Enter the key String");
	     x=sc.next();
	     
	     int result=searchString(arr,x);
	     if(result==-1)
	    	 System.out.println("String not found");
	     else
	    	 System.out.println("String found at"+result);
	     
	    
		
	}

	public static int search(int[]a, int first, int last, int key)
   {
       int result = 0;

       if (first > last)
           result = -1;
       else
       {
           int mid = (first + last)/2;

           if (key == a [mid])
               result = mid;
           else if (key < a[mid])
               result = search(a, first, mid - 1, key);
           else if (key > a[mid])
               result = search(a, mid + 1, last, key);
       }
       return result;
   }


   public static int searchString(String[] names, String key) {
   int first = 0;
   int last  = names.length;

   while (first < last) {
       int mid = (first + last) / 2;
       if (key.compareTo(names[mid]) < 0) {
           last = mid;
       } else if (key.compareTo(names[mid]) > 0) {
           first = mid + 1;
       } else {
           return mid;
       }
   }
   return -(first + 1);
}


}
   




