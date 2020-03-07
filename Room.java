class Room
{
javafx.application.Application;
float lenght;
float breadth;
void getdata(float a,float b)
{
lenght = a;
breadth = b;
}
}
class RoomArea
{
public static void main (String args [])
{
float area;
Room room1 = new Room( );
room1.getdata(14,10);
area = room1.lenght * room1.breadth;
System.out.println("Area = " + area);
}
}
