from Shape import *

class Square (Shape):

  	def __init__(self, nx, ny, nz, nl, nw):
  		super(Square, self).__init__("square", nx, ny, nz)
  		self._w = nw
  		self._l = nl

  	def getArea(self):
  		return self._w * self._l;

	def display(self):
		super(Square, self).display()
		print("[ width : " + str(self._w) + " length : " + str(self._l) + " ]")
