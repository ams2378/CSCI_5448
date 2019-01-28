import java.util.*;

class XComparator implements Comparator<Shape>{
   public int compare(Shape a1,Shape a2){
   		return a1.getX()-a2.getX();
  }
}