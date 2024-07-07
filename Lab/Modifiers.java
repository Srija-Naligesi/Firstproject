package Lab;
//base class
public class Modifiers {
	//public can accessible from anywhere
	public int a=10;
	//private can accessible only with in the class
	private int b=20;
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
