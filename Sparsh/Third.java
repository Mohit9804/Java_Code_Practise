class Test
{
	int a;
	Test()
	{
		System.out.print("I am a  Constuctor");
	}
}
class Third
{
	public static void main(String args[])
	{
		Test T=new Test();
		System.out.print(T.a);
	}
}