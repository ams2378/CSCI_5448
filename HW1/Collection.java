import java.util.*;

public class Collection {

	ArrayList<Shape> shapes;
	int numShapes;
	boolean sortX, sortY, sortZ;

	public Collection () {
		this.numShapes = 0;
		this.shapes = new ArrayList<Shape>();
	}

	public void add (Shape item) {
		sortX = sortY = sortZ = false;
		numShapes++;
		shapes.add(item);
	}

	public void sort(boolean nsortX, boolean nsortY, boolean nsortZ) {
		sortX = nsortX;
		sortY = nsortY;
		sortZ = nsortZ;
		if (sortX) {
			Collections.sort(shapes, new XComparator()); 
		} else if (sortY) {
			Collections.sort(shapes, new YComparator()); 
		} else if (sortZ) {
			Collections.sort(shapes, new ZComparator()); 			
		}
	}

	private void displaySortOrder() {
		if (sortX)
			System.out.println ("Sorted by X co-ordinate"); 
		else if (sortY)
			System.out.println ("Sorted by Y co-ordinate"); 
		else if (sortY)
			System.out.println ("Sorted by Z co-ordinate"); 
		else
			System.out.println ("Shapes not sorted"); 
	}

	public void display() {
		System.out.println ("Type   of Shape : " + shapes.get(0).getName()); 
		System.out.println ("Number of Shape : " + numShapes); 
		displaySortOrder();
		for(Shape str: shapes){
			str.display();
	   }
		System.out.println ("------------------------------------------------------"); 
	}
}