from Shape import *
from Circle import *
from Square import *
from Triangle import *

class Collection:

	def __init__ (self):
		self._numShapes = 0;
		self._shapes = []
		self._sortX = False
		self._sortY = False
		self._sortZ = False

	def add (self, item):
		self._numShapes = self._numShapes+1
		self._shapes.append(item)

	def sort (self, nsortX, nsortY, nsortZ):
		self._sortX = nsortX;
		self._sortY = nsortY;
		self._sortZ = nsortZ;

		if (self._sortX): 
			self._shapes = sorted(self._shapes, key=lambda shape: shape.getX())
		if (self._sortY): 
			self._shapes = sorted(self._shapes, key=lambda shape: shape.getY())
		if (self._sortZ): 
			self._shapes = sorted(self._shapes, key=lambda shape: shape.getZ())

	def displaySortOrder(self):
		if (self._sortX):	
			print ("Sorted by X co-ordinate")
		if (self._sortY):
			print ("Sorted by Y co-ordinate") 
		if (self._sortZ):
			print ("Sorted by Z co-ordinate") 			

	def display(self):
		print ("--------------------------------------------------------------------")
		print ("Type of Shape : " + self._shapes[0].getName())
		self.displaySortOrder()
		for i in self._shapes:
			i.display()

	def displayArea(self):
		for i in self._shapes:
			print ("area : " + str(i.getArea()))