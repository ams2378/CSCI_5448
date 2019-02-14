
from Shape import *
from Circle import *
from Square import *
from Triangle import *
from Collection import *

cirCollection = Collection()
cirCollection.add(Circle(10, 10, 1, 1))
cirCollection.add(Circle(1, 12, 1, 1))
cirCollection.add(Circle(0, 1, 1, 1))

cirCollection.sort(True,False,False);
cirCollection.display() 

# Uncomment to find out the area
#cirCollection.displayArea()

sqCollection = Collection()
sqCollection.add(Square(10,100,2,12,13))
sqCollection.add(Square(10,1,2,12,13))
sqCollection.add(Square(10,41,2,12,13))
sqCollection.add(Square(10,11,2,12,13))
sqCollection.add(Square(10,51,2,12,13))
sqCollection.add(Square(10,10,2,12,13))
sqCollection.sort(False, True, False)
sqCollection.display()
#sqCollection.displayArea()


triCollection = Collection()
triCollection.add(Triangle(10,100,200,12,13))
triCollection.add(Triangle(10,100,20,12,13))
triCollection.add(Triangle(10,100,2,12,13))
triCollection.add(Triangle(10,100,12,12,13))
triCollection.add(Triangle(10,100,32,12,13))
triCollection.add(Triangle(10,100,1,12,13))
triCollection.add(Triangle(10,100,0,12,13))
triCollection.add(Triangle(10,100,2,12,13))
triCollection.sort(False, False, True)
triCollection.display()
#triCollection.displayArea();