class CCount
{
	public static int cnt=0;
	
	public void count() 
	{
		cnt++;
	}
	public void setZero() 
	{
		cnt=0;
	}
	public void setValue(int n) 
	{
		cnt=n;
	}
	public void show() 
	{
		System.out.println(cnt);
	}
	
}
public class Class05 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCount Ct1=new CCount();
		CCount Ct2=new CCount();
		Ct1.setZero();
		Ct1.setValue(1);
		Ct1.show();
		Ct2.count();
		Ct2.show();
	}

}
