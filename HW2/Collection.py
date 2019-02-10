
from Shape import *
from Circle import *
from Square import *
from Triangle import *

class Collection:

	def __init__ (self):
		self.numShapes = 0;
		self.shapes = []
		self.sortX = False
		self.sortY = False
		self.sortZ = False

	def add (self, item):
		self.numShapes = self.numShapes+1
		self.shapes.append(item)

	def sort (self, nsortX, nsortY, nsortZ):
		self.sortX = nsortX;
		self.sortY = nsortY;
		self.sortZ = nsortZ;

		if (self.sortX): 
			self.shapes = sorted(self.shapes, key=lambda shape: shape.getX())
		if (self.sortY): 
			self.shapes = sorted(self.shapes, key=lambda shape: shape.getY())
		if (self.sortZ): 
			self.shapes = sorted(self.shapes, key=lambda shape: shape.getZ())

	def displaySortOrder(self):
		if (self.sortX):	
			print ("Sorted by X co-ordinate"); 
		if (self.sortY):
			print ("Sorted by Y co-ordinate"); 
		if (self.sortZ):
			print ("Sorted by Z co-ordinate"); 			

	def display(self):
		print ("Type of Shape : " + self.shapes[0].getName())
		self.displaySortOrder()
		for i in self.shapes:
			i.display()