public class Circle extends Shape {

	private int r; // r- radius

	public Circle (int nx, int ny, int nz, int nr) {
		super ("circle", nx, ny, nz);
		r = nr;
	}

	public void display() {
		super.display();
		System.out.println ("radius : " + r  + " ]"); 
	}

}