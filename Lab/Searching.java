package Lab;
//class declaration
public class Searching {

	public static void main(String[] args) {
		//variable declaration
		int i;
		boolean b=false;
		//declaring array elements
		int arr[]= {10,42,23,65,56,76,65};
		int num=42;
		for(i=0;i<arr.length;i++) {
			//checking condition
			if(num==arr[i]){
			System.out.println("number found at the position:"+i);
			b=true;
			break;
		}
		}
		if(!b)
			System.out.println("number not found");
	}	
}
