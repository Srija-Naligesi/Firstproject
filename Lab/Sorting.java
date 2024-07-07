package Lab;
//class declaration
public class Sorting {

	public static void main(String[] args) {
		//declaring array elements
		int arr[]= {56,89,1,34,78};
		System.out.println("Array Elements:");
	 	for(int i=0;i<arr.length;i++)
	 		//printing array elements
	 	System.out.println(arr[i]);
	 	//temporary variable declaration
	 	int temp=0;
		for(int i=0;i<arr.length;i++) {
			//for loop for swapping elements
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//printing sorted elements
		System.out.println("sorted elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
		
		
