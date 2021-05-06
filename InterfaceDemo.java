package Interface;
interface Values
{
	final int a = 10;
	final int b = 20;
	void display();
}
class Addition implements Values {
	int c = a+b ;
	public void display()
	{
		System.out.println("Addition is :" +c);
	}
}

public class InterfaceDemo {
 public static void main (String []args)
 {
	 Addition add = new Addition();
	 add.display();
 }
}
