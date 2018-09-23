
class Room{
	double length,breadth,height;
	
	Room(){	//default construcor for class Room
		length=-1;
		breadth=-1;
		height=-1;
	}

	//overloading the constructor
	//3 Parameterised constructor for the class Room
	Room(double l,double b,double h) {
		length=l;
		breadth=b;
		height=h;
	}
	
	Room(double len) {	// Single parametrised constructor
		length=breadth=height=len;
	}

	double volume() {
		return length*breadth*height;
	}
}