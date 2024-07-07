package Lab;
//base class
class Modifiers { 
	//public can accessible from anywhere
	public int a=10;
	//private can accessible only with in the class
	private int b=20;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b=b;
	}
	//protected can accessible with in the same package and subclasses
	protected int c=30;
	//default can accessible with in the same package
	int d=40;
	//public method
	public void publicdisplay() {
		System.out.println("public method");
	}
	//private method
	private void privatedisplay() {
		System.out.println("private method");
	}
	//protected method
	protected void protecteddisplay() {
		System.out.println("protected method");
	}
	//default method
	void defaultdisplay() {
		System.out.println("default method");
	}	
}
//derived class
public class Derived extends Modifiers {
	public void display() {
		//accessing public members
		System.out.println("public value:"+a);
		//accessing protected members
		System.out.println("protected value:"+c);
		//accessing default members
		System.out.println("default value:"+d);
		//calling public method
		publicdisplay();
		//calling protected method
		protecteddisplay();
		//calling default method
		defaultdisplay();	
	}
	//private can accessible only with in the class
	private void privatedisplay() {
		System.out.println("private method");
	}
	public static void main(String args[]) {
		//creating object for derived class
		Derived dev=new Derived();
		dev.setB(20);
		System.out.println("private value:"+dev.getB());
		dev.display();
		dev.privatedisplay();
	}

}
