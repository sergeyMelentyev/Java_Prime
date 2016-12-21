/*** PACKAGE, ACCESS, MODIFIERS ***/
package pcgName;        // statement defines a name space, must be stored in directory pcgName
import java.util.Date;
import java.io.*;
import static java.lang.Math.pow;       // now pow() method can be used without full class name

public;     // can be accessed from anywhere
private;        // cannot be seen outside of its class
protected;      // can be seen outside current package, but only for your subclasses
// no explicit access = visible to subclasses as well as to other classes in the same package

volatile;       // var can be changed unexpectedly
strictfp class MyClass {}       // use origional floating point model 
class A {
    transient int a;        // contents of var will not be saved if obj written to a pesistent storage
    int b;  }       // will persist


/*** TYPE CASTING and INSTANCEOF ***/
varName = (byte) varNewName;
if (objA instanceof ClassA) {;}     // true or false


/*** PRIMITIVE TYPE CALL-BY-VALUE ***/
byte, short, int, long varName;     // width 8,16,32,64-bit
char = 'a';     // width 16-bit
float, double time = 1.2;       // width 32,64-bit
boolean oldy = (age > 35);


/*** TYPE WRAPPERS BOXING/UNBOXING OBJECTS ***/
Double, Float, Long, Integer, Short, Byte, Character, Boolean;
Character(char ch);     // constuctor
char charValue();       // return the encapsulated char

Boolean(boolean boolValue);     // constructor, true or false only
Boolean(String boolString);     // constructor from String, takes "true" (upper or lower case)
boolean booleanValue();     // return boolean equivalent of the invoking obj

Integer(int num);       // constructor for all numeric values
Integer(String str);        // must contain valid num value or NumberFormatException is thrown
byte byteValue(); double doubleValue(); float floatValue();     // return value from obj wrapper
int intValue(); long longValue(); short shortValue();
Integer iOb = new Integer(100);
int i = iOb.intValue();

// autoboxing, works with increments and in regular expressions
Integer iOb = 100;      // modern way to construct an Integer object
int i = iOb;        // modern


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


/*** STREAMS ***/
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str[] = new String[100];
for (int i = 0; i < 100; i++) {
    str[i] = br.readLine();
    if (str[i].equals("stop"))
        break;
}


/*** ENUM CLASS TYPES ***/
// can be compared using == and in switch statements
enum LootType {POTION, RING}     // enumeration constants, public static final obj of its type
LootType vaName = LootType.RING;
public static enum-type [] values();        // method returns an array of list of enum constants
public static enum-type valueOf(String str);        // method returns enum const whose value == str

enum Apple {
    private int price;
    GoldenDel(9), RedDel(12), Cortland(8);      // each enum constant has its own copy of price
    Apple(int p) { price = p; }     // constructor called once for each enum constant
    int getPrice() { return price; }
}
for (Apple a : Apple.values()) {
    System.out.println("Logic here" + a.getPrice());   }
final int ordinal();        // return ordinal value of the invoking const, from 0 to ...
final int compareTo(enum-type e);       // compare the orginal values, both must from the same enum


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
    
    <T extends Number> ClassName(T arg) {       // generic constructor
        startLives = arg.intValue(); }

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
            System.out.println("Logic here"); } }

    static <T extends Comparable<T>, V extends T> boolean isInt(T x, V[] y) {   // static generic method...
        for (int i = 0; i < y.length; i++) {        // can be called independently with any obj...
            if (x.equals(y[i])) return true;        // with upper bound Comparable
        return false;
    }
}

// inheritens
public class SubClassName extends ClassName {       // cannot inherite private members
	SubClassName(String name, int lives) {		// call closest super class constructor
		super(name, lives);   }
    SubClassName(SubClassName ob) {     // passed obh SubClassName to super constr that receives ClassName
        super(ob);  }       // super class variable can be used to reference any obj derived from that class

	@Override
	public void methodName(int parameter) {		// override super class method, same name and type signature
		super.methodName(parameter / 2);  }
}

// this constructor
class NewClass {
    int a; int b;
    NewClass(int i, int i) {        // regular constructor, init a and b individually
        a = i; b = i; }
    NewClass(int i) {       // constructor invokes NewClass(i, i)
        this(i, i); }
    NewClass() {        // constructor invokes NewClass(0)
        this(0); }
}

ClassName name = new ClassName();		// create a new instance
ClassName newName = new ClassName("Name");
SubClassName anotherName = new SubClassName("Name", 5);

ClassName dmdName;       // declaration of reference of type ClassName
dmdName = newName; dmdName.methodName      // dynamic method dispatch
dmdName = anotherName; dmdName.methodName       // dynamic method dispatch


/*** ABSTRACT CLASS & METHOD ***/
// cannot be directly instantiate with the new operator
abstract absClassName {     // class must be abstract if contains abstruct methods
    abstract void methodName(int parameter);        // abstract method, subclass must override it
}


/*** METHOD ***/
static void anyMethodName (int ... args) {}     // variable-length argument, zero or more, as array of ints


/*** INTERFACE ***/
interface SharedConstants {
    int NO = 0;     // variables in interface, must be init, will be in scope as constants
    int YES = 1;
}
interface Callback extends SharedConstants {
    void callback(int parameter);       // interface method declaration, must be implemented in class
    default String getString() {return "Logic here";}        // default method with implementation
    static int getNumber() {return 0;}      // static method, no implementation required, not inherited
}
class Client implements Callback {
    public void callback(int parameter) {;}     // must be public
    public void newName(int parameter) {;}
    public String getString() {return "Logic here";}        // interface method overriding
}

// generic inteface
interface Min<T extends Comparable<T>> {    // type parameter is T, upper bound is Comparable
    T min();
}
class MyClass<T extends Comparable<T>> implements Min<T> {
    T[] vals;
    MyClass(T[] obj) { vals = obj; }
    public Y min() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) v = vals[i];
        return v;
    }
}

// interface reference variable
Callback call = new Client();       // call can be used to acces callback method in Client class
call.callback(42);      // but cannot access newName method, only methods declared by its interface
int defNum = Callback.getNumber();      // static interface method call

// nested interface
class A {
    public interface NestedIF {
        boolean isNotNefative(int x);
    }
}
class B implements A.NestedIF {     // class B implements the nested interface
    public boolean isNotNefative(int x) {
        return x < 0 ? false : true;
    }
}
A.NestedIF nif = new B();
if (nif.isNotNefative(10))
    System.out.println("Logic here");


/*** GENERICS PARAMETERIZED TYPES ***/
// generic class cannot extend Throwable
class Generics<Type> {      // Type is a parameter that will be replaced by a real type, can take two+ params
    static Type objWrong;       // wrong, no static vars of type Type
    static Type getWrong(){;}       // wrong, no static method can use Type
    // Type valsWrong[] = new Type[10]; wrong, cannot instantiate an array whose elem type is a type param
    Type valsCorrect[]; valsCorrect = nums;     // correct, assign reference to existent array
    // Generics<Integer> gensWrong[] = new Generics<>[10}; wrong, cannot create an array of type-specific gen
    Generics<?> gensCorrect = new Generics<?>[10];

    Type objName;
    Generics(Type obj) {
        objName = obj;
    }
    Type getObj() {     // pass the constructor a reference to an object of type Type
        return objName;
    }
    void showType() {
        System.out.println("Type is: " + objName.getClass().getName());
    }
}
public static void main(String args[]) {
    Generics<Integer> iOb;      // create a reference for Integers
    iOb = new Generics<Integer>(88);        // create a new obj, use autoboxing  to encapsulate int
    iOb.showType();
    int value = iOb.getObj();
}

// Bounded types
class Stats<T extends Number> {     // type argument must be either Number or a class derived from it
    T[] nums;
    Stats(T[] o) {      // pass the constructor a ref to an array of type Number or subclass
        nums = o;
    }
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
    boolean sameAvg(Stats<? extends Stats> ob) {      // wildcard argument, Stats<?> matches any Stats obj...
        if (average() == ob.average())      // or a class derived from Stats
            return true;
        return false;
    }
}
public static void main(String args[]) {
    Integer inums[] = {1, 2, 3};
    Stats<Integer> iOb = new Stats<Integer>(inums);
    double v = iOb.average();
}

class Gen<T extends MyClass & MyInterface> {;}      // T is bounded by a class MyClass and an inteface...
// MyInterface. Any type argument passed to T must be a subclass of MyClass and implement MyInterface

// generic superclass
class GenOne<T> {
    T obj;
    GenOne(T objArg) {
        obj = objArg; }
}
class GenTwo<T> extends GenOne<T> {
    GenTwo(T objArg) {
        super(objArg); }
}
GenTwo<Integer> num = new GenTwo<Integer>(100);

class GenThree<T, V> extends GenOne<T> {        // subclass add its own type parameter
    V objTwo;
    GenThree(T objArgOne, V objArgTwo) {
        super(objArgOne);
        objTwo = objArgTwo; }
}
GenThree<String, Integer> x = new GenThree<String, Integer>("Value is:", 99);
GenThree<String, Integer> x = new GenThree<>("Value is:", 99);      // short hand notation


/*** EXCEPTION HANDLING ***/
// Throwable (first branch) -> Exception -> RuntimeException
// Throwable (second branch) -> Error
try {
    // block of code to monitor for errors
    try {
        // nested block of code to monitor for errors
    } catch (ExceptionTypeZero exObj) {
        // nested exception handler
    }
} catch (ExceptionTypeOne exObj) {
    // exception handler
} catch (ExceptionTypeTwo exObj) {
    // exception handler
} finally {
    // block of code to executed after try block ends
}

// throw exception explicitly
class ThrowDemo {
    static void demoroc() throws IlligalAccessException {       // must include throws if...
        try {       // method is capable of causing an exception, except of type Error or RuntimeExeption
            throw new NullpointerException("demo");
        } catch (NullpointerException e) {
            System.out.println("This will be printed first");
            throw e;
        }
    }
}
public static void main(String args[]) {
    try {
        demoroc();
    } catch (NullpointerException e) {
        System.out.println("This will be printed second");
    }
}


/*** LAMBDA EXPRESSION & CLOSURES ***/
// can use and modify an instance var from invoking class, cannot use local vars of its enclosing scope
interface NumericTest {     // function interface
    boolean test(int n); }
public static void main(String args[]) {        // lambda expression
    NumericTest isEven = (n) -> (n % 2) == 0;
    if (isEven.test(10)) System.out.println("Logic here");
    NumericTest isNonNeg = (n) -> n >= 0;
    if (isNonNeg.test(10)) System.out.println("Logic here");
}

interface NumericFunc {     // function interface
    int func(int n); }
public static void main(String args[]) {        // block lambda
    NumericFunc factorial = (n) -> {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    };
}

interface SomeFunc<Type> {     // generic function interface
    Type func(Type arg); }
public static void main(String args[]) {
    SomeFunc<String> reverse = (str) -> {        // block lambda with String arg
        String result = ""; int i;
        for (i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    };
    SomeFunc<Integer> factorial = (n) -> {        // block lambda with Integer arg
        int result =1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    };
}

interface StringFunc {
    String func(String n); }
class LambdaAsArg {
    static String stringOperation(StringFunc sf, String s) { return sf.func(s); }       // method has a...
    // func interface as the type of its first param 
}
public static void main(String args[]) {
    String inStr = "Lambda";
    String outStr = stringOperation((str) -> str.toUpperCase(), inStr);        // expression lambda
    
    String outStr = stringOperation((str) -> {      // block lambda
                                    String result = ""; int i;
                                    for (i = str.length()-1; i >= 0; i--)
                                        result += str.charAt(i);
                                    return result;
                                    }, inStr);
    
    StringFunc reverse = (str) -> {     // pass an instance created by an earlier lambda exp
        String result = ""; int i;
        for (i = str.length()-1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    };
    String x = stringOperation(reverse, inStr);
}



/*** ANNOTATION ***/



/*** JAVA NATIVE INTERFACE ***/
// include C/C++ libs



/*** MULTITHREADING ***/
// extending Thread superclass
class NewThread extends Thread {
    NewThread() {
        super("Second Thread");
        start(); }
    public void run() {
        try {
            for (int i = 5; i > 0; i--)
                Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Error logic here"); }
    }
}
public static void main(String args[]) {
    new Thread();       // create a new thread
    try {
        for (int i = 5; i > 0; i--)
            Thread.sleep(1000);
    } catch (InterruptedException e) {
        System.out.println("Error logic here"); }
}

// implementing Runnable interface
class NewThread implements Runnable {
    String name;
    Thread t;
    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        t.start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--)
                Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Error logic here");
        }
    }
}
public static void main(String args[]) {
    NewThread objOne = new NewThread("One");        // create a new thread
    NewThread objTwo = new NewThread("Two");
    System.out.println("Is alive: " + objOne.t.isAlive());      // true if thread is still running
    try {
        objOne.t.join();        // wait for a thread to finish
        objTwo.t.join();
        System.out.println("Main thread logic here");
    } catch (InterruptedException e) {
        System.out.println("Error logic here");
    }
}

// synchronized methods, cannot be access by different threads at one time
class Callme {
    synchronized void call(String msg) {
        try {
            System.out.println("Logic here");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error logic here");
        }
    }
}
class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {     // class Callme with method definition with the keyword synchronized 
        target.call(msg);
    }
    public void run() {     // synchronized block if Callme class without the keyword synchronized
        synchronized(target) {
            target.call(msg);
        }
    }
}
public static void main(String args[]) {
    Callme target = new Callme();
    Caller objOne = new Caller(target, "Hello");
    Caller objTwo = new Caller(target, "World");
    try {
        objOne.t.join();
        objTwo.t.join();
    } catch (InterruptedException e) {
        System.out.println("Error logic here");
    }
}

// interthread communication
class Q {
    int n;
    boolean valueSet = false;
    synchronized int get() {
        while(!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error logic here");
            }
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n) {
        while(valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error logic here");
            }
            this.n = n;
            valueSet = true;
            notify();
    }
}
class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while(true)
            q.put(i++);
    }
}
class Consumer implements Runnable {
    Q q;
    Consumer (Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while(true)
            q.get();
    }
}
public static void main(String args[]) {
    Q q = new Q();
    new Producer(Q);
    new Consumer(Q);
}

