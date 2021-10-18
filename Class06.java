class Cadd
{
	void add2n(int n) 
	{
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		System.out.println("1+2+...+n="+sum);
		
	}
	
}
public class Class06 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Cadd Cad=new Cadd();
		Cad.add2n(5);
		Cad.add2n(10);
	}

}
