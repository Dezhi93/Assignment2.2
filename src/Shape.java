/* Shape class */
public abstract class Shape implements Comparable<Shape> {

	public abstract double getArea();
	public abstract String toString();
	public int compareTo(Shape T)
	{
		return (int)(this.getArea()-T.getArea());  //return positive,0,negative 
	}												//express larger,equal and smaller
	
}

