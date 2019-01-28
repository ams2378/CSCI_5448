import java.util.*;

class YComparator implements Comparator<Shape>{
   public int compare(Shape a1,Shape a2){
   		return a1.getY()-a2.getY();
  }
}