class Shape(object):

  	def __init__(self, name, nx, ny, nz):
  		self.name = name
  		self.x = nx
  		self.y = ny
  		self.z = nz

	def getName(self):
		return self.name

	def getX(self):
		return self.x

	def getY(self):
		return self.y

	def getZ(self):
		return self.z

	def display(self):
		print ("[ Location (x, y, z) = (" + str(self.x) + ", " + str(self.y) + ", " + str(self.z) + ") ]")
