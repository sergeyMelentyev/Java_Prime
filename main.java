/*** LOGGING OUT DATA ***/
private static final String TAG = "ClassName";
Log.d(TAG, "methodName: information" + varName);
Log.e(TAG, "methodName: error information");


/*** TYPE CASTING ***/
varName = (byte) varNewName;


/*** PRIMITIVE TYPE ***/
byte, short, int, long varName;     // width 8,16,32,64-bit
char = 'a';     // width 16-bit
float, double time = 1.2;       // width 32,64-bit
boolean oldy = (age > 35);


/*** STRING OBJECT ***/
// strings are not arrays of chars
String name = "Name";
System.out.println("Name: " + name);


/*** ENUM ***/
enum LootType {POTION, RING, ARMOR}


/*** TEST CONDITION ***/
if (age < 35) { 
	System.out.println("Logic here");
} else { System.out.println("Logic here"); }

expressionOne ? expressionTwo : expressionThree;        // ternary operator


/*** ARRAY ***/
int arrName[] = new int[10];        // declaration and allocation of array
int[] arrName = new int[10];        // declaration and allocation equivalent
int[] arrOne, arrTwo, arrThree;     // several array declaration
int arrOne[], arrTwo[], arrThree[];     // several array declaration equivalent
int month[] = {31,28,31,30};        // a new array initializer

int multi[][] = new int[2][3];      // alloc of array of arrays of int, 2 dimentions whith 3 values
int[][] multi = new int[2][3];      // declaration and allocation equivalent
int multi[][] = {{2,3},{3,4}};      // array of arrays initializer

ArrayList<int> arrName = new ArrayList<>();		// initialize a new array list


/*** CONTROL STATEMENT ***/
if (condition) statement;
if (condition) {
    statement; statement;
} else if (condition) statement;

switch (expression) {       // switch statements can be nested
    case valeOne:       // can be of type byte, short, int, char, String
        statement; break;
    default:
        statement;
}

while (boolean_expression) {		// use break/continue
	System.out.println("Logic here"); }

do { System.out.println("Logic here"); 		// do-while
	} while (boolean_expression);

for(int i = 0; i < 5; i++) {		// for-in loop
	System.out.println(i); }
for (int i = 0, int x = 10; i < x; i++, x--) {
    System.out.println(i); }

for (int item : arrayListName) {		// for-each loop
	System.out.println(item); }
for (int x[]: ArrayList) {      // multidimentional array
    for (int y : x) {
        System.out.println("Logic here"); } }

outer: for (;;) {       // named break and continue
    for (;;) {
        break outer;        // break will exit from inner loop, named break from outer loop
    } }


/*** CLASS ***/
public class ClassName {		// defining a class
	private String handleName;		// instance variables
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
    protected void finalize() {}        // runtime will call this method before destroy the obj
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
