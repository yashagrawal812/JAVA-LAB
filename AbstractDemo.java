package Abstract;
abstract class Shopkeeper { 
  abstract void sell() ;
	public void display()
	{
		System.out.println("this is shopkeeper class");
	}
}
class Retail extends Shopkeeper {
	void sell()
	{
		System.out.println("Shopkeeper si selling");
	}
}

public class AbstractDemo {
	public static void main (String []args)
	{ 
		Retail r = new Retail();
		r.display();
		r.sell();
	}

}
