public class Triangle extends Shape {

	private int h, b; // h- height, b-base

	public Triangle (int nx, int ny, int nz, int nh, int nb) {
		super ("triangle", nx, ny, nz);
		h = nh;
		b = nb;
	}

	public void display() {
		super.display();
		System.out.println ("height : " + h + " base : " + b  + " ]"); 
	}

}