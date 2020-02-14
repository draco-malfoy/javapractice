



	
	
	
	
	
	
	
	
	
	
	
	
	
		cost = -1;
		cost = c;
		cost = c;
		depth = -1; // box
		depth = d;
		depth = ob.depth;
		height = -1; // an uninitialized
		height = h;
		height = ob.height;
		return width * height * depth;
		super();
		super();
		super(len);
		super(len, m);
		super(ob);
		super(w, h, d, m); // call superclass constructor
		weight = -1;
		weight = m;
		weight = ob.weight;
		width = -1; // use -1 to indicate
		width = height = depth = len;
		width = ob.width;
		width = w;
	// compute and return volume
	// construct clone of an object
	// construct clone of an object
	// construct clone of an object
	// constructor used when all dimensions specified
	// constructor used when cube is created
	// constructor used when cube is created
	// constructor used when cube is created
	// constructor used when no dimensions specified
	// constructor when all parameters are specified
	// default constructor
	Box() {
	Box(Box ob) { // pass object to constructor
	Box(double len) {
	Box(double w, double h, double d) {
	BoxWeight() {
	BoxWeight(BoxWeight ob) { // pass object to constructor
	BoxWeight(double len, double m) {
	double cost;
	double vol;
	double volume() {
	double weight; // weight of box
	private double depth;
	private double height;
	private double width;
	public static void main(String args[]) {
	Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
	Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
	Shipment() {
	Shipment(double len, double m, double c) {
	Shipment(double w, double h, double d,double m, double c) {
	Shipment(Shipment ob) { // pass object to constructor
	System.out.println("Shipping cost: $" + shipment1.cost);
	System.out.println("Shipping cost: $" + shipment2.cost);
	System.out.println("Volume of shipment1 is " + vol);
	System.out.println("Volume of shipment2 is " + vol);
	System.out.println("Weight of shipment1 is " + shipment1.weight);
	System.out.println("Weight of shipment2 is " + shipment2.weight);
	System.out.println();
	vol = shipment1.volume();
	vol = shipment2.volume();
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
// Add shipping costs.
// Add weight.
// Create a subclass by extending class A.
// Create a subclass by extending class A.
// Create a super classclass.
// Create another subclass by extending B.
// Create another subclass by extending B.
// Demonstrate when constructors are called.
// Extend BoxWeight to include shipping costs.
// Start with Box.
A() {
B() {
C() {
Chapter 8 Inheritance 175
class A {
class B extends A {
class Box {
class BoxWeight extends Box {
class C extends B {
class DemoShipment {
class Shipment extends BoxWeight {
Part I
System.out.println("Inside A's constructor.");
System.out.println("Inside B's constructor.");
System.out.println("Inside C's constructor.");
}
}
}
}
}
}
}
}
}
}
}