from Shape import *

class Triangle (Shape):

  	def __init__(self, nx, ny, nz, nh, nb):
  		super(Triangle, self).__init__("triangle", nx, ny, nz)
  		self.h = nh
  		self.b = nb

	def display(self):
		super(Triangle, self).display()
		print("[ height : " + str(self.h) + " base : " + str(self.b) + " ]")