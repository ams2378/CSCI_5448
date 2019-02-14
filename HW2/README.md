**Problem**:

*Revisit your Shape Program from Homework 1. Write this program again (with the
same requirements as the original) in a different OO language than you used the first time.
Consider anything from an OOAD perspective that you’ve learned or thought about that you
should change in this version. Include those changes in your code’s comments and your
README file.*

**Team Members** : Adil Sadik

**Compile & run instruction** :  
```
$ python Test.py  
```

**Classes**:  
- ```Shape``` : Abstract class with following methods:  

  | Methods        | Description           |
  | ------------- |:-------------:|
  | getName()      | return the name of the shape |
  | getX(), getY(), getZ()      | return X/Y/Z co-ordinate      |
  | display() | display the attributes (location xyz)      |
  | getArea() | return the area - not implemented in base class      |

```getArea()``` is the new method added in this implementation.

- ```Square```, ```Triangle```, ```Circle``` : Derived classes from ```Shape```. Each class implements the new ```getArea()``` method independently based on it's type (i.e. square, circle, triagle etc). 
- ```Collection``` : Class to hold a collection of ```Shape```-s'. Implements following methods:  

  | Methods        | Description           |
  | ------------- |:-------------:|
  | add()      | Add a new ```Shape``` in the collection |
  | sort(sortByX, sortByY, sortByZ)      | Sort the collection by X/Y/Z. The args should be one hot      |
  | display() | display the sorted Shapes      |
  | displayArea() | display the area of all Shapes in collection      |

```displayArea()``` is the new method which will call ```getArea()``` method using base class ```shape```

- ```Test```: A test script. (self explanatory). 
  
**Sample output**:
```
$ python Test.py 
--------------------------------------------------------------------
Type of Shape : circle
Sorted by X co-ordinate
[ Location (x, y, z) = (0, 1, 1) ] [ radius : 1 ]
[ Location (x, y, z) = (1, 12, 1) ] [ radius : 1 ]
[ Location (x, y, z) = (10, 10, 1) ] [ radius : 1 ]
--------------------------------------------------------------------
Type of Shape : square
Sorted by Y co-ordinate
[ Location (x, y, z) = (10, 1, 2) ] [ width : 13 length : 12 ]
[ Location (x, y, z) = (10, 10, 2) ] [ width : 13 length : 12 ]
[ Location (x, y, z) = (10, 11, 2) ] [ width : 13 length : 12 ]
[ Location (x, y, z) = (10, 41, 2) ] [ width : 13 length : 12 ]
[ Location (x, y, z) = (10, 51, 2) ] [ width : 13 length : 12 ]
[ Location (x, y, z) = (10, 100, 2) ] [ width : 13 length : 12 ]
--------------------------------------------------------------------
Type of Shape : triangle
Sorted by Z co-ordinate
[ Location (x, y, z) = (10, 100, 0) ] [ height : 12 base : 13 ]
[ Location (x, y, z) = (10, 100, 1) ] [ height : 12 base : 13 ]
[ Location (x, y, z) = (10, 100, 2) ] [ height : 12 base : 13 ]
[ Location (x, y, z) = (10, 100, 2) ] [ height : 12 base : 13 ]
[ Location (x, y, z) = (10, 100, 12) ] [ height : 12 base : 13 ]
[ Location (x, y, z) = (10, 100, 20) ] [ height : 12 base : 13 ]
[ Location (x, y, z) = (10, 100, 32) ] [ height : 12 base : 13 ]
[ Location (x, y, z) = (10, 100, 200) ] [ height : 12 base : 13 ]
```
