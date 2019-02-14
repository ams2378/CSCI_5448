class Shape(object):

  	def __init__(self, name, nx, ny, nz):
  		self._name = name
  		self._x = nx
  		self._y = ny
  		self._z = nz

	def getName(self):
		return self._name

	def getX(self):
		return self._x

	def getY(self):
		return self._y

	def getZ(self):
		return self._z

	""" Define a method to find out area of any given shape. 
		Method definition only- the derived classes will implement 
		the method
	"""
	def getArea(self):
		pass

	def display(self):
		print "[ Location (x, y, z) = (" + str(self._x) + ", " + str(self._y) + ", " + str(self._z) + ") ]",
