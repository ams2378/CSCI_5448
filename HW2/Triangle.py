from Shape import *

class Triangle (Shape):

  	def __init__(self, nx, ny, nz, nh, nb):
  		super(Triangle, self).__init__("triangle", nx, ny, nz)
  		self._h = nh
  		self._b = nb

  	def getArea(self):
  		return 0.5*self._h * self._b;

	def display(self):
		super(Triangle, self).display()
		print("[ height : " + str(self._h) + " base : " + str(self._b) + " ]")