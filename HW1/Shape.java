
import java.util.Comparator;

public abstract class Shape {
	
	private String name;
	private int x, y, z; // co ordinate on screen

	public Shape (String name, int nx, int ny, int nz) {
		this.x = nx;
		this.y = ny;
		this.z = nz;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void display() {
		System.out.print ("[ Location (x, y, z) = (" + x + ", " + y + ", " + z + ") ");
	}

    public String toString() {
        return "[ Location (x, Y, z) = (" + x + ", " + y + "," + z +  ")" + "]";
    }
}