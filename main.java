/*** PRIMITIVE TYPE ***/
byte, short, long varName;
int age = 35;
double time = 1.2;
boolean oldy = (age > 35);

/*** STRING ***/
String name = "Name";
System.out.println("Name: " + name);

/*** ENUM ***/
enum LootType {POTION, RING, ARMOR}

/*** TEST CONDITION ***/
if (age < 35) { 
	System.out.println("Logic here");
} else { System.out.println("Logic here"); }

/*** ARRAY ***/
ArrayList<int> arrName = new ArrayList<>();		// initialize a new array list

/*** LOOP ***/
while (boolean_expression) {		// use break/continue
	System.out.println("Logic here"); }

do { System.out.println("Logic here"); 		// do-while
	} while (boolean_expression);

for(int i = 0; i < 5; i++) {		// for-in loop
	System.out.println(i); }

for (int item : arrayListName) {		// for-each loop
	System.out.println(item); }

/*** CLASS ***/
public class ClassName {		// defining a class
	private String handleName;		// class fields
	private int startLives;
	
	public ClassName() {		// constructor
		this("Unknown player");
	}
	public ClassName(String name) {		// constructor with different signature
		this(name, 3);
	}
	public ClassName(String name, int lives) {		// constructor with different signature
		this.handleName = name;
		this.startLives = lives;
	}
	public String getHandeName() {		// getter method for every field
		return handleName;
	}
	public void setHandleName(String name) {		// setter method for every field
		this.handleName = name;
	}
}
public class SubClassName extends ClassName {
	public SubClassName(String name, int lives) {		// call super class constructor
		super(name, lives); }
	@Override
	public void methodName(int parameter) {		// override method
		super.methodName(parameter / 2); }
}
ClassName name = new ClassName();		// create a new instance
ClassName newName = new ClassName("Name");
ClassName anotherName = new ClassName("Name", 5);

/***  ***/
/***  ***/
/***  ***/
/***  ***/
/***  ***/
/***  ***/
/***  ***/
/***  ***/
