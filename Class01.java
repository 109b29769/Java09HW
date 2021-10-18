class CRectangle{
	int width;
	int height;
	public CRectangle(int w, int h) 
	{
		width=w;
		height=h;
	}
	public CRectangle() 
	{
		width=10;
		height=8;
	}
	public void show() 
	{
		System.out.println("width= "+width);
		System.out.println("height= "+height);
	}
	
}

public class Class01 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CRectangle Crl=new CRectangle(10,8);
		Crl.show();
	}

}
