import java.io.*;
class Test
{
		int a;
		Test(int x)
	{
		a=x;
	}
}
class Sample 
{
		public static void main(String arg[])
	{ 
		Test obj= new Test(10);
		System.out.println(obj.a);
	}
}