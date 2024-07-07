package Lab;
//class declaration
public class Shapes {
	//method to calculate area of a square
	void area(int a) {
		int area=a*a;
		System.out.println("area of square is:"+area);
	}
	// method to calculate area of a rectangle
	void area(int l,int b) {
		int area=l*b;
		System.out.println("area of rectangle is:"+area);
	}
	//method to calculate area of a triangle
	void area(int b,float h) {
		float area=b*h/2;
		System.out.println("area of triangle is:"+area);
	}

	public static void main(String[] args) {
		//creation of objects
		Shapes s=new Shapes();
		s.area(7);
		s.area(9,4);
		s.area(3,9.5f);
		
	}

}

