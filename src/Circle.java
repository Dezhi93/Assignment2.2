
public class Circle extends Shape {

	double radius;
	Circle(double r){
		radius=r;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	public String toString(){
		return "I am a Circle and my area is " + this.getArea();
	}

}
