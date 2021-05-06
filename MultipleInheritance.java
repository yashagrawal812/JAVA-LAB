package MultipleInheritance;
interface Car
{
	public void display();
}
interface Bike
{
	public void display();
}
class Vehicle implements Car,Bike
{
	public void display()
	{
		System.out.println("Show Car And Bike");
	}
}
	public class MultipleInheritance {
		public static void main(String args[])
		{
			Vehicle v=new Vehicle();
			v.display();
		}


}
