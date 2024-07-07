package Lab;
//class declaration
public class Duplication {

	public static void main(String[] args) {
		//declaring array elements
		int arr[]= {56,73,24,42,65,56,24};
		//variable declaration
		int count=0;
		System.out.println("dulicate elements:");
		//using two for loops to compare two elements in the array and check duplicate elements
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//checking the condition using 'if'
				if(arr[i]==arr[j]) {
					//printing the duplicate elements	
					System.out.println(arr[j]);
					count++;
				}
			}
		}
		//printing number of duplicate elements in the array
		System.out.println("Count:"+count);
	}

}
