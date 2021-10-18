class Power{
	double x;
	double n;
	public void power(int x,int n)
	{
		System.out.println(Math.pow(x,n));
		
	}

}
public class Class07 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Power pr=new Power();
		pr.power(2, 5);
		pr.power(3, 2);
	}

}
