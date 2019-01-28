**Problem**:

*Write a simple OO program that implements the Shape
example discussed in Lecture 2 on slide 6 but using an OO
design rather than the presented functional
decomposition solution. Your program should simply print
out (to the console) the number of shapes in the
“database” and then ask each shape to “display itself”
which will also cause a line of output to be generated to
the console, one for each shape. The word “database” is
in quotes in the previous sentence because you should
not actually use a database to write this program. It is
perfectly acceptable for your main program to create a
collection of shapes before moving on to sorting that
collection and displaying the shapes. Your program should
support circles, triangles, and squares but should use
polymorphism so that the main program doesn't know
the type of shape it is dealing with, but instead treats
shapes uniformly (similar to the example program in
Lecture 2 that involved different types of students). You
may use any OO language that you'd like to write this
program, just be aware that the grader may have to meet
with you if you use a language that they don’t have access
to.*

**Team Members** : Adil Sadik

**Compile & run instruction** :  
  $ javac Shape.java Square.java Circle.java Triangle.java Collection.java XComparator.java YComparator.java ZComparator.java Test.java  
  $ java Test

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

**Reference**:
  - Used concept from following site to implement comparator  
  https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
