import java.util.Scanner;
public class Room {
int roomNo;
String roomType;
float area;
boolean acMachine;
public void getData()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Provide Room Number \n");
	roomNo=s.nextInt();
	s.nextLine();
	System.out.println("Enter Room Type \n");
	roomType=s.nextLine();
	System.out.println("Enter Room Area \n");
	area=s.nextFloat();
	System.out.println("Enter AC Machine\n");
	acMachine=s.nextBoolean();
}
public void setData(int rN,String rT,float area,boolean acMachine)
{
  this.roomNo=rN;
  this.roomType=rT;
  this.area =area;
  this.acMachine =acMachine;
  
}
public void displayData()
{
	System.out.println("The room is "+roomNo);
    System.out.println("The room type is"+roomType);
	System.out.println("The room area is"+area);
	System.out.println("The AC Machine "+acMachine);
}

public static void main(String[] args)
{
	Room rm=new Room();
	rm.setData(1,"Normal", 25.25f, true);
	rm.getData();
	rm.displayData();
}
}
