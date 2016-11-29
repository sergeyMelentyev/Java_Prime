/*** PRIMITIVE TYPES ***/
byte, short, long varName;
int age = 35;
double time = 1.2;
boolean oldy = (age > 35);

/*** STRINGS ***/
String name = "Name";
System.out.println("Name: " + name);

/*** TEST CONDITIONS ***/
if (age < 35) { 
	System.out.println("Logic here");
} else { System.out.println("Logic here"); }

/*** CLASSES ***/
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
/***  ***/
/***  ***/
