package Java09;

class CRectangle02 {
	int width;
	int height;

	public CRectangle02() {
		this.width = 10;
		this.height = 8;

	}
	public void show() {
		System.out.println("width="+width);
		System.out.println("height="+height);
	}

}

public class hw9_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle02 rec=new CRectangle02();
		rec.show();
	}

}
