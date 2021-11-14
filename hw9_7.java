package Java09;
import java.util.*;
class rec{
	long power(int x,int y){
		if(y<=0)
			return 1;
		return x*power(x,y-1);
	}
}

public class hw9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec r=new rec();
		Scanner sc=new Scanner(System.in);
		System.out.print("¿é¤J¾ã¼Æ x y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(r.power(x, y));
	}

}
