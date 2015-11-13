/* Rectangle class */
public class Rectangle extends Shape{

	double height,width;
	Rectangle(double h,double w){
		height=h;
		width=w;
	}
	public double getArea(){
		return height*width;
	}
	public String toString(){
		return "I am a Rectangle and my area is " + this.getArea();
	}
	
}
