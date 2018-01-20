abstract public class Person 
{
	protected String strName;
	protected String strPass;
	public Person(){}
	public Person(String username,String password)
	{
		this.strName = username;
		this.strPass = password;
	}
}