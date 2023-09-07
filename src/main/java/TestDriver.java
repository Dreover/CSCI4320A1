import edu.clayton.csit.antlab.person.*;

public class TestDriver
{
	public static void main(String args[])
	{
		Person4 myPerson = new Person4("Robert");
		System.out.println(myPerson.toString("abc123"));
	}
}