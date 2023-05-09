
public class ClasB {
	int a=10;
	public String testMethod()
	{
		new ClasB(100,200,"java");
		System.out.println(40);
		return new ClasB().testMethod3(new ClasB(50).testMethod2())+new ClasB().testMethod4("hi");
	}
	ClasB()
	{
		System.out.println("hi");
	}
	ClasB(int a)
	{
		System.out.println("java is awesome");
	}
	public int testMethod2()
	{
		System.out.println(50);
		return 10+15;
	}
	public String testMethod3(int a)
	{
		System.out.println(18);
		return "is";
	}
   ClasB(int a,int b,String s)
   {
	   System.out.println(a+b);
	   System.out.println(s);
   }
   public String testMethod4(String s)
   {
	   System.out.println(88);
	   return "good";
   }
   public static void main(String []agrs)
   {
	   ClasB t1=new ClasB();
	   t1.a=10;
	   ClasB t2=new ClasB(50);
	   t2.a=30;
	   System.out.println("java"+t1.testMethod()+" "+(t1.a+t2.a-30));
   }
}
