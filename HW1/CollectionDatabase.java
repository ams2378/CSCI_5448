import java.util.*;

public class CollectionDatabase {

	Collection squareDatabase;
	Collection circleDatabase;
	Collection triangleDatabase;

	ArrayList<Shape> shapes;

	public Collection () {
		this.shapes = new ArrayList<Shape>();
	}

	public void add (Shape item) {
		shapes.add(item);
	}

	public void sort(boolean sortX, boolean sortY) {

		if (sortX) {
			Collections.sort(shapes, new XComparator()); 
		} else if (sortY) {
			Collections.sort(shapes, new YComparator()); 
		}
	}

	public void display() {
		for(Shape str: shapes){
			System.out.println(str);
	   }
	}
}