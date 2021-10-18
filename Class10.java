class CRational
{
	public int n;
	public int d;
	public void setN(int num) 
	{
		n=num;
	}
	public void setD(int num) 
	{
		d=num;
	}
	public void show()
	{
		System.out.println(n+"/"+d);
	}
	public void setND(int num,int den) 
	{
		n=num;
		d=den;
	}

}
public class Class10 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CRational aaa=new CRational();
		aaa.setN(2);
		aaa.setD(5);
		aaa.show();
		aaa.setND(5, 2);
		aaa.show();
	}

}
