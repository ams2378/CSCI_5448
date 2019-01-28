import java.util.*;

public class Test  {

	public static void main(String args[]){

	   Collection squareCollection = new Collection();
	   Collection circleCollection = new Collection();
	   Collection triangleCollection = new Collection();

	   squareCollection.add(new Square(10, 1, 1, 1, 1));
	   squareCollection.add(new Square(2, 2, 1, 1, 1));
	   squareCollection.add(new Square(1, 32, 1, 1, 1));

	   // sort(SortX, SortY, SortZ) - args should be one hot
	   squareCollection.sort(false,true,false);
	   System.out.println ("------------------------------------------------------"); 
	   squareCollection.display();

	   circleCollection.add(new Circle(10, 1, 1, 1));
	   circleCollection.add(new Circle(1, 1, 1, 1));
	   circleCollection.add(new Circle(100, 1, 1, 1));
	   circleCollection.add(new Circle(20, 1, 1, 1));   
	   
	   // sort(SortX, SortY, SortZ) - args should be one hot
	   circleCollection.sort(true,false,false);
	   circleCollection.display();

	   triangleCollection.add(new Triangle(10, 20, 3, 3, 4));
	   triangleCollection.add(new Triangle(9, 21, 30, 3, 4));
	   triangleCollection.add(new Triangle(17, 12, 13, 3, 4));
	   triangleCollection.add(new Triangle(90, 2, 1, 3, 4));
	   triangleCollection.add(new Triangle(1, 2, 30, 4, 4));
	   triangleCollection.add(new Triangle(100, 15, 3, 11, 4));

	   // sort(SortX, SortY, SortZ) - args should be one hot
	   triangleCollection.sort(false,false,false);
	   triangleCollection.display();

	}
}