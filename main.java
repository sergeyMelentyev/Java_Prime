                        /*** PACKAGE, ACCESS, MODIFIERS ***/

package pcgName;        // statement defines a name space, must be stored in directory pcgName
import java.util.Date;
import java.io.*;
import static java.lang.Math.pow;       // now pow() method can be used without full class name

final int FILE_NEW = 1;     // constant
public;     // can be accessed from anywhere
private;        // cannot be seen outside of its class
protected;      // can be seen outside current package, but only for your subclasses
// no explicit access = visible to subclasses as well as to other classes in the same package

volatile int a;       // var can be changed unexpectedly
strictfp class MyClass {}       // use origional floating point model 
class A {
    transient int a;        // contents of var will not be saved if obj written to a pesistent storage
    int b;  }       // will persist



                        /*** MANUAL GC ***/

System.gc();
Runtime.getRuntime().gc
protected void finalize() throws Throwable      // method will be called before GC



                        /*** TYPE CASTING and INSTANCEOF ***/

Object objName = "string";        // no type casting
String strName = (String) objName;
if (objA instanceof ClassA) {;}     // true or false, including inheritance

Object obj = new ChildObj();        // Object - GrandObj - ParentObj - ChildObj. Расширение типа.
GrandObj obj = (GrandObj) obj;      // type casting must be applied
ParetObj obj = (ParetObj) obj;

ParetObj obj = new ChildObj();      // Сужение типа. No type casting is needed
GrandObj obj = obj; Object obj = obj;



                        /*** PRIMITIVE TYPE CALL-BY-VALUE ***/

byte, short, int, long varName;     // width 8,16,32,64-bit
char = 'a';     // width 16-bit
float, double time = 1.2;       // width 32,64-bit
boolean oldy = (age > 35);      // width 8-bit
Object objName;     // width 32-bit



                        /*** OBJECT CALL-BY-REFERENCE ***/

// all objects are subclasses of one super class named Object
// object of specific type can be saved in variable with any of its parent type 
Object clone();     // creates a new same obj
String toString();      // returns a string that describes the obj



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



                        /*** TEST CONDITION ***/

boolean equals(Object obj);     // if one obj is equal to another
expressionOne ? expressionTwo : expressionThree;        // ternary operator



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

while (boolean_expression) {        // use break/continue
    System.out.println("Logic here"); 
}
do { System.out.println("Logic here");      // do-while
    } while (boolean_expression);
for(int i = 0; i < 5; i++) {        // for-in loop
    System.out.println(i); }
for (int i = 0, int x = 10; i < x; i++, x--) {
    System.out.println(i); }

for (int item : arrayListName) {        // for-each loop
    System.out.println(item); }
for (int x[]: ArrayList) {      // multidimentional array
    for (int y : x) {
        System.out.println("Logic here"); } }

outer: for (;;) {       // named break and continue
    for (;;) {
        break outer;        // break will exit from inner loop, named break from outer loop
    } }



                        /*** STRING IMMUTABLE OBJECT ***/

// strings are not arrays of chars
String name = "Name";       // will be saved in special string pull
String name = new String("Name");     // will not be saved in pull
String str = String.format("text %d text %s", intVar, strVar);      // string format

String s ="very .... long string from file";        // will take 1Mb (for example)
String sub1 = s.substring(2,4);     // will use the same memory (1Mb) as first string
String sub2 = new String(s.substring(2,4));     // will use distinct array of 4 chars

compareTo(String anotherString) // лексиграфическое сравнение строк
compareToIgnoreCase(String str) // лексиграфическое сравнение строк без учета регистра символов
concat(String str) // возвращает соединение двух строк
contains(CharSequence s) // проверяет, входит ли указанная последовательность символов в строку
endsWith(String suffix) // проверяет завершается ли строка указанным суффиксом
startsWith(String prefix) // проверяет, начинается ли строка с указанного префикса
startsWith(String prefix, int toffset) // начинается ли строка в указанной позиции с указанного префикса
equals(Object anObject) // проверяет идентична ли строка указанному объекту
getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) // символьное представление участка строки
indexOf(int ch) // поиск первого вхождения символа в строке
indexOf(int ch, int fromIndex) // поиск первого вхождения символа в строке с указанной позиции
indexOf(String str) // поиск первого вхождения указанной подстроки
indexOf(String str, int fromIndex) // поиск первого вхождения указанной подстроки с указанной позиции
lastIndexOf(int ch) // поиск последнего входения символа
lastIndexOf(int ch, int fromIndex) // поиск последнего входения символа с указанной позиции
lastIndexOf(String str) // поиск последнего вхождения строки
lastIndexOf(String str, int fromIndex) // поиск последнего вхождения строки с указанной позиции
replace(char oldChar, char newChar) // замена в строке одного символа на другой
replace(CharSequence target, CharSequence replacement) // замена одной подстроки другой
substring(int beginIndex, int endIndex) // возвратить подстроку как строку
toLowerCase() // преобразовать строку в нижний регистр
toUpperCase() // преобразовать строку в верхний регистр
trim() // отсечь на концах строки пустые символы



                        /*** STRING_BUFFER STRING_BUILDER ***/



                        /*** STREAMS ***/

// read line from console
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String num1 = reader.readLine();
int a = Integer.parseInt(num1);
// read line from console
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int[] list = new int[10];
for (int i = 0; i < list.length; i++) {
    String s = reader.readLine(); list[i] = Integer.parseInt(s);
}

// read from file and write to file
InputStream inStream = new FileInputStream("c:/source.txt");
OutputStream outStream = new FileOutputStream("c:/result.txt");
while (inStream.available() > 0) {
    int data = inStream.read(); outStream.write(data);      // read and write one byte at a time
}
inStream.close(); outStream.close();

// custom class for read and write streams
class CustomReadWriteStreams {
    private ArrayList<Integer> list;
    public void write(int data) {
        list.add(data);
    }
    public int read() {
        int first = list.get(0);
        list.remove(0);
        return first;
    }
    public int available() {
        return list.size();
    }
}
CustomReadWriteStreams myObject = new CustomReadWriteStreams();     // write to file
OutputStream outStream = new FileOutputStream ("c:/my-object-data.txt");
while (myObject.available() > 0) {
    int data = myObject.read(); outStream.write(data); }
outStream.close();

InputStream inStream = new FileInputStream("c:/my-object-data.txt");        // read from file
CustomReadWriteStreams myObject = new CustomReadWriteStreams();
while (inStream.available() > 0) {
    int data = inStream.read();
    myObject.write(data); }
inStream.close();



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
for (Apple a : Apple.values())
    System.out.println("Logic here" + a.getPrice());
final int ordinal();        // return ordinal value of the invoking const, from 0 to ...
final int compareTo(enum-type e);       // compare the orginal values, both must from the same enum



                        /*** ARRAY ***/

// cannot change its length
int arrName[] = new int[10];        // declaration and allocation of array of int 10 elements
int[] arrName = new int[10];        // declaration and allocation equivalent of array of int 10 elements
arrName = new int[5];       // the same var but with new length
int[] arrOne, arrTwo, arrThree;     // several array declaration
int arrOne[], arrTwo[], arrThree[];     // several array declaration equivalent
int count = month.length;       // array length
Point p = new Point(1,3); Point[] arr = {p, new Point(2,2), null, p};     // array initializer

int multi[][] = new int[2][3];      // alloc of array of arrays of int, 2 dimentions whith 3 values
int[][] multi = new int[2][3];      // declaration and allocation equivalent
int multi[][] = {{2,3},{3,4}};      // array of arrays initializer



                        /*** COLLECTIONS SET, HASHSET ***/

// unordered collection of unique items
HashSet<String> set = new HashSet<>(); set.add("Mama"); set.add("Mila");
size(), add(), addAll(), remove(), removeAll(), contains(), containsAll();

for (String text : set)     // iteration
    System.out.println(text);

Iterator<String> iterator = set.iterator();     // get iterator for set
while (iterator.hasNext())      // check if next element is exist
    String text = iterator.next();      // iterator.remove() current item

for (Iterator<Integer> i = set.iterator(); i.hasNext();)    // using for loop for iteration over set
    Integer element = i.next();     // logic omitted

Iterator<Cat> iterator = cats.iterator(); cats.remove(iterator.next()); // remove first element

Set<Object> result = new HashSet<>();       // add and remove all specific elements
result.addAll(Set<Cat> obj1); result.addAll(Set<Dog> obj2);     // data type should be omitted
result.removeAll(Set<Cat> obj1);



                        /*** COLLECTIONS SET, TREESET ***/



                        /*** COLLECTIONS SET, SORTEDSET ***/



                        /*** COLLECTIONS MAP, HASHMAP ***/

// key-value pairs
HashMap<String, String> map = new HashMap<>(); map.put("first", "Mama");
entrySet(), keySet(), values(), put(key, value), get(key), containsKey(key)
containsValue(value), isEmpty(), clear(), remove(key)

Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<String, String> pair = iterator.next();
    String key = pair.getKey();
    String value = pair.getValue();
}
for (Map.Entry<String, String> pair : map.entrySet()) {     // iteration
    String key = pair.getKey();
    String value = pair.getValue();
}



                        /*** COLLECTIONS MAP, TREEMAP ***/



                        /*** COLLECTIONS MAP, HASHTABLE ***/



                        /*** COLLECTIONS LIST, ARRAYLIST ***/

// ordered collection, can change its length
ArrayList<String> list = new ArrayList<String>();
int n = list.size(); String s = list.get(3); list.set(3, s);
list.add(s); list.add(15, s); list.remove(3);

ArrayList<String> list = new ArrayList<String>(); list.add("Mama"); list.add("Mila");
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String text = iterator.next();

for (String text : list)        // iteration
    System.out.println(text);

Arrays.sort(array); Arrays.sort(array, Collections.reverseOrder());     // array sorting



                        /*** COLLECTIONS LIST, LINKEDLIST ***/



                        /*** COLLECTIONS LIST, VECTOR ***/



                        /*** COLLECTIONS LIST, STACK ***/



                        /*** CLASSES ***/

// as soon as class is loaded, all of the static statements are run, from top to down
public class ClassName {
    static int a = 3;      // one static var for all instances exist as long as ClassName exist
    private String handleName;      // private instance variable, remain private to ClassName
    private int startLives;
    
    public ClassName() {        // constructor
        this("Unknown player"); }
    public ClassName(String name) {     // constructor with different signature
        this(name, 3);  }
    public ClassName(String name, int lives) {      // constructor with different signature
        this.handleName = name;
        this.startLives = lives; }
    public ClassName(ClassName ob) {        // pass object to constructor
        this.handleName = ob.name;
        this.startLives = ob.lives; }
    <T extends Number> ClassName(T arg) {       // generic constructor
        startLives = arg.intValue(); }

    public static void anyNewName(){;}      // cannot access instance vars, connot use this

    final void anyName(){;}     // prevent overriding, method or class cannot be overridden

    static {
        System.out.println("Logic here"); }     // static block executed once when the class is first loaded

    public String getHandeName() {      // getter method for every field
        return handleName; }
    public void setHandleName(String name) {        // setter method for every field
        this.handleName = name; }
    protected void finalize() {}        // runtime will call this method before destroy the obj

    class InnerClass {      // nested class, has directly access to all outer vars / methods
        void display() {
            System.out.println("Logic here"); } 
    }

    static <T extends Comparable<T>, V extends T> boolean isInt(T x, V[] y) {   // static generic method...
        for (int i = 0; i < y.length; i++) {        // can be called independently with any obj...
            if (x.equals(y[i])) return true;        // with upper bound Comparable
        return false;
    }
}


                        /*** CLASSES. INITIALIZATION ORDER ***/

class Pet {
    int x = 5, y = 5;       // <--- #2 variable initialization in base class
    Pet(int x, int y){
        this.x = x; this.y = y; }     // <--- #3 base class constructor work
}
class Cat extends Pet {
    int tail = 8; int age;      // <--- #4 fields initialization
    Cat(int x, int y, int age) {
        super(x, y);        // <--- #1 call base class constructor
        this.age = age; }    // <--- #5 class constructor work
}
Cat cat = new Cat (50, 50, 5);      // <--- #0 new instance created

// fields initialization order
class Cat {
    public int a = getSum();
    public int b = getSum() - a;
    public int c = getSum() - a - b;
    public getSum() { return a + b + c; }
}
// what will happend
class Cat {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public Cat() {
        super();
        a = getSum();       // (a + b + c) = 0;
        b = getSum() - a;       // (a + b + c) - a = b = 0;
        c = getSum() - a - b;       // (a + b + c) - a - b = c = 0;
    }
    public getSum() { return a + b + c; }
}




                        /*** CLASSES. INHERITENS ***/

public class SubClassName extends ClassName {       // cannot inherite private members
    SubClassName(String name, int lives) {      // call closest super class constructor
        super(name, lives);   }
    SubClassName(SubClassName ob) {     // passed obj SubClassName to super constr that receives ClassName
        super(ob);  }       // super class variable can be used to reference any obj derived from that class

    @Override
    public void methodName(int parameter) {     // override super class method, same name and type signature
        super.methodName(parameter / 2);  }
}



                        /*** CLASSES. METHODS ***/

static void anyMethodName (int ... args) {}     // variable-length argument, zero or more, as array of ints

Cow cow = new Whale();      // Whale extends Cow, var cow of type Whale now can call onle Cow's methods
if (cow instanceof Whale) { Whale whale = (Whale) cow; }        // type casting
Whale whale = (Whale) cow;  // type casting without type checking, will generate InvalidClassCastException

Cat cat = new Cat();        // Cat cat = new Cat();
String name = cat.getName();        // String name = Cat.getName(cat);
cat.setAge(17);     // Cat.setAge(cat, 17);
cat.setChildren(cat1, cat2, cat3);      // Cat.setChildren(cat, cat1, cat2, cat3);

// static method how it works
Cat cat1 = new Cat();       // Cat cat1 = new Cat();
int catCount = Cat.getAllCatsCount();       // int catCount = Cat.getAllCatsCount(null);



                        /*** CLASSES. THIS CONSTRUCTOR ***/

class NewClass {
    int a; int b;
    NewClass(int i, int i) {        // regular constructor, init a and b individually
        a = i; b = i; }
    NewClass(int i) {       // constructor invokes NewClass(i, i)
        this(i, i); }
    NewClass() {        // constructor invokes NewClass(0)
        this(0); }
}



                        /*** CLASSES. EXAMPLES ***/

ClassName name = new ClassName();       // create a new instance
ClassName newName = new ClassName("Name");
SubClassName anotherName = new SubClassName("Name", 5);

ClassName dmdName;       // declaration of reference of type ClassName
dmdName = newName; dmdName.methodName      // dynamic method dispatch
dmdName = anotherName; dmdName.methodName       // dynamic method dispatch



                        /*** CLASSES. SINGLETON PATTERN ***/

public class Singleton {
    static Singleton INSTANCE = null;
    private Singleton() {}
    static Singleton getInstance() {
        if (INSTANCE==null) 
            INSTANCE = new Singleton();
        return INSTANCE;
    }
}
// singleton pattern lazy initialization
public class Moon {
    private static Moon instance;
    private Moon(){}
    public static Moon getInstance(){
        if(instance == null)
            instance = new Moon();
        return instance;
    }
}


                        /*** CLASSES. ABSTRACT CLASSES & METHODS ***/

// cannot be directly instantiate with the new operator
abstract absClassName {     // class must be abstract if contains abstruct methods
    abstract void methodName(int parameter);        // abstract method, subclass must override it
}



                        /*** INTERFACES ***/

interface SharedConstants {
    int NO = 0;     // only as public final static
    int YES = 1;        // variables in interface, must be init, will be in scope as constants
}
interface Callback extends SharedConstants {    // interface can only inherit from interface (multiple)
    void callback(int parameter);       // interface method declaration, must be implemented in class
    default String getString() {return "Logic here";}        // default method with implementation
    static int getNumber() {return 0;}      // static method, no implementation required, not inherited
}
class Client implements Callback, AnothreInterfaceName {        // multiple inheritance
    public void callback(int parameter) {;}     // must be public
    public void newName(int parameter) {;}
    public String getString() {return "Logic here";}        // interface method overriding
}



                        /*** CLASSES. GENERIC INTERFACE ***/

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
    // Generics<Integer> gensWrong[] = new Generics<>[10]; wrong, cannot create an array of type-specific gen
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
    iOb = new Generics<Integer>(88);        // create a new obj, use autoboxing to encapsulate int
    iOb.showType();
    int value = iOb.getObj();
}



                        /*** GENERICS. BOUNDED TYPES ***/

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

catch (ArithmeticException e) {}      // divided by zero
catch (NullPointerException e) {}       // access null pointer
catch (ArrayIndexOutOfBoundsException e) {}     // access array out of bounds
catch (IndexOutOfBoundsException e) {}      // access ArrayList out of bounds
catch (FileSystemException e) { method(e); throw e; }        // throw exception further

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
NumericTest isEven = (n) -> (n % 2) == 0;   // lambda expression
if (isEven.test(10)) System.out.println("Logic here");
NumericTest isNonNeg = (n) -> n >= 0;
if (isNonNeg.test(10)) System.out.println("Logic here");

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



                        /*** DATE OBJECT ***/

Date currentTime = new Date();
Date newTime = new Date();
long msDelay = newTime.getTime() - currentTime.getTime();



                        /*** MULTITHREADING ***/

class Printer implements Runnable {     // interface
    private String name;
    public Printer(String name) { this.name = name; }
    public void run() { System.out.println("I’m " + this.name); }
}
public static void main(String[] args) {
    Printer printer = new Printer("Принтер");
    Thread thread = new Thread(printer); 
    thread.start();
}

class Printer extends Thread {      // class extension
    private String name;
    public Printer(String name) { this.name = name; }
    public void run() { System.out.println("I’m " + this.name); }
}
public static void main(String[] args) {
    Printer printer = new Printer("Принтер");
    printer.start();
}

class Clock implements Runnable {   // interapt thread, instanceName.interrupt();
    public void run() {
        Thread current = Thread.currentThread();    // return pointer to a current thread
        while (!current.isInterrupted()) {
            boolean isCurrentThreadInterrupted = currentThread.isInterrupted(); // get current status
            String threadName = cuurentThread.getName() // get current name
            Thread.sleep(1000);
            System.out.println("Tik"); }
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

