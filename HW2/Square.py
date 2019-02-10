from Shape import *

class Square (Shape):

  	def __init__(self, nx, ny, nz, nl, nw):
  		super(Square, self).__init__("square", nx, ny, nz)
  		self.w = nw
  		self.l = nl

	def display(self):
		super(Square, self).display()
		print("[ width : " + str(self.w) + " length : " + str(self.l) + " ]")
