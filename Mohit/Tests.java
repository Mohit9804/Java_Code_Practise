class person 
{
	int unique_id;
	String name; 
	int age;
	String city;
	String gender;

	public void person_info()
	{
		unique_id=12346;
		name="Mohit";
		age=26;
		city="Ghaziabad";
		gender="male";
		System.out.println(unique_id+" "+name+" "+age+" "+city+" "+gender);
	}
	
}
class Tests 
{
	public static void main(String arg[]) 
	{
		person p=new person();
		p.person_info();	
	}
}
