class Person
{
 	int unique_id;
	String name;
	int age;
	String city;
	String gender;
	Person()
  {
	unique_id=0;
	name=" ";
	age=" ";
	city=" ";
	gender=" ";
  }
Person(int _id, String _name, int _age, String _city, String _gender)
{
	unique_id=_id;
	name=_name;
	age=_age;
	city=_city;
	gender=_gender;
	System.out.println(unique_id+" "+name+" "+age+" "+city+" "+gender)
  }
}
class T
{
	Public static void main(String arg[])
	{
	Person obj1=new Person(1,"Sparsh",25,"Ghaziabad","male")
	Person obj2=new PersonI(2,"Mohit",25,"Ghaziabad","male")
	}
}