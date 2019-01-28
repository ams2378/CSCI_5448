**Team Members** : Adil Sadik

**Compile & run instruction** :  
  $ javac Shape.java Square.java Circle.java Triangle.java Collection.java XComparator.java YComparator.java ZComparator.java Test.java  
  $ java Test

**Reference**:
  - Used concept from following site to implement comparator  
  https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/

**Classes**:  
- Shape : Abstract class with following methods:  
*getName()* : Returns the name of object  
*getX(), getY(), getZ()* : get X,Y,Z co-ordinates (location of the shape on screen)  
*display()* : display the attributes (location xyz)  

- Square, Triangle, Circle : Derived classes from *Shape*  
- Collection : Class to hold a collection of *Shape*-s'. Implements following methods:  
*add()* : Add a new *Shape* in the collection  
*sort(sortByX, sortByY, sortByZ)* : Sort the collection by X/Y/Z. The args should be one hot  
*diplay()* : display the sorted Shapes  
- XComparator, YComparator, ZComparator: Class implements *Comparator\<T\>* interface. Used to sort the shapes.
- Test: A test class. (self explanatory). 

