
public class Square extends Shape{

	double length;
	Square(double l){
		length=l;
	}
	public double getArea(){
		return length*length;
	}
	public String toString(){
		return "I am a Square and my area is " + this.getArea();
	}
	
}
