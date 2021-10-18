class CWin
{
	public static int cnt=0;
	public static String color;
	public static int width;
	public static int height;
	public void count()
	{
		cnt=cnt+1;
	}
	public CWin(String str,int w,int h) 
	{
		color=str;
		width=w;
		height=h;
		count();
	}
	public CWin() 
	{
		color="Red";
		width=2;
		height=2;
		count();
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
		System.out.println("cnt="+cnt);
	}
	
}
public class Class08 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CWin CW1= new CWin("Red",2,2);
		CW1.show();
		CWin CW2= new CWin();
		CW2.show();

	}

}
