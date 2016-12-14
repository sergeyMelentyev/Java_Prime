/*** LOGGING OUT DATA ***/
private static final String TAG = "ClassName";
Log.d(TAG, "methodName: information" + varName);
Log.e(TAG, "methodName: error information");


/*** TYPE CASTING ***/
varName = (byte) varNewName;


/*** PRIMITIVE TYPE CALL-BY-COPY ***/
byte, short, int, long varName;     // width 8,16,32,64-bit
char = 'a';     // width 16-bit
float, double time = 1.2;       // width 32,64-bit
boolean oldy = (age > 35);


/*** CONSTANTS ***/
final int FILE_NEW = 1;


/*** OBJECT CALL-BY-REFERENCE ***/
// all objects are subclasses of one super class named Object
Object clone();     // creates a new same obj
boolean equals(Object obj);     // if one obj is equal to another
String toString();      // returns a string that describes th obj


/*** STRING IMMUTABLE OBJECT ***/
// strings are not arrays of chars
String name = "Name";
System.out.println("Name: " + name);


/*** STRING_BUFFER STRING_BUILDER ***/


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
        statement; }

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
// as soon as class is loaded, all of the static statements are run, from top to down
public class ClassName {		// defining a class
	static int a = 3;
    private String handleName;		// private instance variable, remain private to ClassName
	private int startLives;
	
	public ClassName() {		// constructor
		this("Unknown player"); }
	public ClassName(String name) {		// constructor with different signature
		this(name, 3);	}
	public ClassName(String name, int lives) {		// constructor with different signature
		this.handleName = name;
		this.startLives = lives; }
    public ClassName(ClassName ob) {        // pass object to constructor
        this.handleName = ob.name;
        this.startLives = ob.lives; }

    final void anyName(){;}     // prevent overriding, method or class cannot be overridden

    static {
        System.out.println("Logic here"); }     // static block executed once when the class is first loaded

	public String getHandeName() {		// getter method for every field
		return handleName; }
	public void setHandleName(String name) {		// setter method for every field
		this.handleName = name; }
    protected void finalize() {}        // runtime will call this method before destroy the obj

    class InnerClass {      // nested class, has directly access to all outer vars / methods
        void display() {
            System.out.println("Logic here"); }
    }
}

public class SubClassName extends ClassName {       // cannot inherite private members
	SubClassName(String name, int lives) {		// call closest super class constructor
		super(name, lives);   }
    SubClassName(SubClassName ob) {     // passed obh SubClassName to super constr that receives ClassName
        super(ob);  }       // super class variable can be used to reference any obj derived from that class

	@Override
	public void methodName(int parameter) {		// override super class method, same name and type signature
		super.methodName(parameter / 2);  }
}

ClassName name = new ClassName();		// create a new instance
ClassName newName = new ClassName("Name");
SubClassName anotherName = new SubClassName("Name", 5);

ClassName dmdName;       // declaration of reference of type ClassName
dmdName = newName; dmdName.methodName      // dynamic method dispatch
dmdName = anotherName; dmdName.methodName       // dynamic method dispatch


/*** ABSTRACT CLASS / METHOD ***/
// cannot be directly instantiate with the new operator
abstract absClassName {     // class must be abstract if contains abstruct methods
    abstract void methodName(int parameter);        // abstract method, subclass must override it
}


/*** METHOD ***/
static void anyMethodName (int ... args) {}     // variable-length argument, zero or more, as array of ints



/***  ***/
