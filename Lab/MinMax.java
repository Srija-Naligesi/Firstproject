package Lab;
//class declaration
public class MinMax {

	public static void main(String[] args) {
		//declaring array elements
		int arr[]= {5,18,34,3,9,20};
		System.out.println("elements are:");
		for(int i=0;i<arr.length;i++) {
			//printing array elements
			System.out.println(arr[i]);
		}
		//variable declaration
		int min;
		int max;
		//initializing min and max with the first element of array
	    min=max=arr[0];
	    //using for loop
	    for(int i=0;i<arr.length;i++) {
	    	if(min>arr[i]) {
	    		min=arr[i];
	    	}
	    	if(max<arr[i]) {
	    		max=arr[i];
	    	}
			
		}
	    //printing minimum and maximum values from the array
	    System.out.println("minimum number:"+min);
	    System.out.println("maximum number:"+max);	    
	}

}
