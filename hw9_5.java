package Java09; 
class CCount{
	private static int cnt=0;
	private double box;
	
	public CCount() {
		this(1.0);
	}
	public CCount(double x) {
		box=x;
		cnt++;
	}
	public void show() {
		System.out.println("num"+box*cnt);
	}
	public void show_count() {
		System.out.println("count="+cnt);
	}

}

public class hw9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount cun1=new CCount();
		cun1.show_count();
		CCount setZero=new CCount(0.0);
		cun1.show_count();
		setZero.show();
		CCount setValue=new CCount();
		setValue.show();

	}

}
//(d)類別變數,實例變數為獨立不在同個記憶體內
//(e)兩者皆可