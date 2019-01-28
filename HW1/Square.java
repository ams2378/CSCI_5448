public class Square extends Shape {

	private int w, l;

	public Square (int nx, int ny, int nz, int nl, int nw) {
		super ("square", nx, ny, nz);
		w = nw;
		l = nl;
	}

	public void display() {
		super.display();
		System.out.println ("width : " + w + " length : " + l + " ]"); 
	}
}