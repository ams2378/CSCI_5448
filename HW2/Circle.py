from Shape import *

class Circle (Shape):

  	def __init__(self, nx, ny, nz, nr):
  		super(Circle, self).__init__("circle", nx, ny, nz)
  		self._r = nr

  	def getArea(self):
  		return 3.1416*self._r * self._r;

	def display(self):
		super(Circle, self).display()
		print("[ radius : " + str(self._r) + " ]")
