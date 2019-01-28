import java.util.*;

class ZComparator implements Comparator<Shape>{
   public int compare(Shape a1,Shape a2){
   		return a1.getZ()-a2.getZ();
  }
}