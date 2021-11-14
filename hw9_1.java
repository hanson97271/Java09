package Java09;

class CRectangle {
	int width;
	int height;

	public CRectangle(int w, int h) {
		width = w;
		height = h;
	}

	public CRectangle() {
		width = 10;
		height = 8;
	}

	public void show() {
		System.out.println("width="+width);
		System.out.println("height="+height);
	}

}

public class hw9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle rec=new CRectangle();
		rec.show();
	}

}
