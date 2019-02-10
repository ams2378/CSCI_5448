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

	def display(self):
		print ("[ Location (x, y, z) = (" + str(self._x) + ", " + str(self._y) + ", " + str(self._z) + ") ]")
