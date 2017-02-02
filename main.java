                        /*** PACKAGE, ACCESS, MODIFIERS ***/

/** these double asterisk comments are processed by Javadoc, a JDK tool, to generate API docs */
// members of named package cannot access members in the default package
package com.oca.sert;   // must be on top, only one statement will compile
import java.util.Date; import java.sql.Date;    // import both classes in the same class will not compile

import static com.oca.sert.ClassName.*; // import all public static members from OTHER package

package com.company;    // contents of Multiple.java
// compile error, public interface or class can only be defined in a source code file with a matching name
public interface Printable {}   // will not compile, have to remove access modif or full line
interface Moveable {}
public interface Multiple {}    // will compile if remove

// executable class must be public static void and accept args of String array or varargs of type String
public class ClassName { public static void main(String args[]) { } }   // any valid arg name is ok
public class ClassName { public static void main(String... args) { } }  // any valid arg name is ok

import packageName.className;   // packageName -> className -> innerClassName
class newClassName {
    ClassName a;    // will compile
    innerClassName b; } // will not compile
import packageName.*;   // import all public members, classes and interfaces. Previous will compile



                        /*** ACCESS MODIFIER ***/
// top-level class and interface camnnot have defined with protected and private access
// method parameters and local vars cannot be defined using explicit access modifiers
public final class ClassName extends SuperClass implements InterfaceName {}
// access modif optional, nonaccess modif optional, keyword, name, all others are optional
public; // can be accessed from everywere, different package and not derived classes
protected;  // cannot be accessed from not derived class in different package
default;    // access only from the same package
volatile int a; // var can be changed unexpectedly
strictfp class MyClass {}   // use origional floating point model 
class A {
    transient int a;    // contents of var will not be saved if obj written to a pesistent storage
    int b;  }   // will persist



                        /*** ABSTRACT MODIFIER ***/

// none of the different types of variable can be defined as abstract, will not compile
abstract class ClassName {} // cannot be instantiated, may not containe any abstract methods
interface InterfaceName {}  // abstract keyword is allowed but redundant



                        /*** FINAL MODIFIER ***/

// class, method or variable can be final. Cannot be used with the declaration of an interface
final class ClassName {}    // cannot be extended
final int i;    // val assigne once via declaration or in constructor calling methods that change its state
final methodName() {}   // cannot be overridden by a derived class



                        /*** STATIC MODIFIER ***/

// class, method (not top level), variable or interface (not top level) can be static. 
// nonprivate static vars and methods can be inherited, cannot be overrided but can be redefined
static int i;   // shared with all instances, can be accessed when no instances have been created
static void methodName(){}  // cannot access instance vars, only static.
ClassName name = null; name.staticVarName;  // can access static var and methods using null reference



                        /*** PRIMITIVE DATA TYPE ***/

Numetic; Signed; Integers; byte, short, int, long;  // byte -128 to 127 inclusive
Numetic; Signed; Floating-Point; float, double;
Numetic; Unsigned; Character; char; // only positive
Boolean; boolean;
int octal = 0413; int hex = 0x10B; int binary = 0b10010;
int octal = 04_13; int hex = 0x10_BA_75; int binary = 0b1_0000_10;  // valid literal values

byte, short, int, long varName; // width 8,16,32,64-bit
char = 'a'; // width 16-bit
float, double time = 1.2;   // width 32,64-bit
boolean oldy = (age > 35);  // width 8-bit
Object objName; // width 32-bit

byte b = 10; short s = b + b;   // will not compile, possible lossy conversion, b will be widened to int
final byte b = 10; short s = b + b; // will compile.

// postfix and prefix operators behave the same if not part of an expression
int a = 10; a = a++ + a + a-- - a-- + ++a;  // a = 10 + 11 + 11 - 10 + 10;

/* Precedence of operators
    exp++, exp--
    ++exp, --exp, +exp, -exp
    *, /, %
    +, -
    <, >, <=, >=
    ==, !=
    &&
    ||
    =, +=, -=, *=, /=, %=
*/



                        /*** WRAPPER CLASSES. IMMUTABLE OBJ ***/

// Object -> Boolean, Character
// Object -> Number -> Byte, Short, Integer, Long, Float, Double
Double, Float, Long, Integer, Short, Byte, Character, Boolean;
Boolean bool = true; Byte b = 10;   // autoboxing
Boolean bool = new Boolean(true); Byte b = new Byte((byte)10);  // constructor with primitive values
Boolean bool = new Boolean("true"); Byte b = new Byte("10");    // constructor with string values
Boolean bool = Boolean.valueOf(true); Byte b = Byte.valueOf(10);    // static mehod
booleanValue(); charValue(); byteValue();   // retreive primitive value
parseBoolean(String s); parseByte(String s);    // get primitive val from string, EXEPT for Character
// all parse methods throws NumberFormat-Exception except Boolean.parseBoolean(), that returns false

Boolean bool;   // cached instance exist for the values true and false
Character ch;   // cached instance exist for the values 0 to 127
Byte, Short, Integer, Long; // cached instance exist for the values -128 to 127
Integer iOne = new Integer(10); // always create new instances (no cached values)
Integer iTwo = Integer.valueOf(10); // returns a cached copy (-128 to 127 range, exept for float and double)




                        /*** COMPARISON ***/

public boolean equals(Object obj); // compare primitive value stored by a wrapper class
public int compareTo(Double value); // indicates whether some other object is "equal to" this one
objOne == objTwo;   // compare obj reference only with same obj wrapper class, or will not compile
expressionOne ? expressionTwo : expressionThree;    // ternary operator


                        /*** MANUAL GC ***/

System.gc();
Runtime.getRuntime().gc
protected void finalize() throws Throwable  // method will be called before GC



                        /*** TYPE CASTING and INSTANCEOF ***/

if (objA instanceof ClassA) {;} // true or false, including inheritance

Object obj = new ChildObj();    // Object - GrandObj - ParentObj - ChildObj. Расширение типа.
GrandObj obj = (GrandObj) obj;  // type casting must be applied
ParetObj obj = (ParetObj) obj;

ParetObj obj = new ChildObj();  // Сужение типа. No type casting is needed
GrandObj obj = obj; Object obj = obj;



                        /*** CONTROL STATEMENT ***/

if (condition) statement;
if (condition)
    statement; statement;
else if (condition) statement;

final int i;
switch() {  // char, byte, short, int, String, Integer, Short, Byte, Character, enum, must not be null
    case 1*1: /*logic here*/ ; break;   // expression allowed, must be compile time constants
    case i+i: /*logic here*/ ; break;   // allowed
}

while (boolean_expression) { System.out.println("Logic here"); }
do { System.out.println("Logic here"); } while (boolean_expression);

for (int i = 0; i < arr.length(); ++i, methodName()) {} // increment block can call methods
for (int i = 0; i < 5; i++) System.out.println(i);
for (int item : arrayListName) System.out.println(item);
for (int x[]: ArrayList)    // multidimentional array
    for (int y : x) System.out.println("Logic here");

outer: for (;;) {       // named break and continue
    for (;;) {
        break outer;        // break will exit from inner loop, named break from outer loop
    } }



                        /*** ENUM CLASS TYPES ***/

// can be compared using == and used in switch statements
enum LootType {POTION, RING}    // enumeration constants, public static final obj of its type
LootType vaName = LootType.RING;
public static enum-type[] values();    // method returns an array of list of enum constants
public static enum-type valueOf(String str);    // method returns enum const whose value == str

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




                        /*** CLASSES ***/

// all top level types (classes, enums, interfaces) can be declared only public or default
// as soon as class is loaded, all of the static statements are run, from top to down
class ClassName {
    String name; int i; // instance variables or object fields

    static { int i; }   // static initialization block, will be executed first
    { int i; }  // initializtion block, will be executed second

    ClassName() {   // invokes constructor that accepts two args, will be executed last
        this(null, 0);  // MUST BE the first statement in constructor
    }
    ClassName(String s, int i) {    // overloaded constructor, will be executed last
        this.name = s; this.i = i; 
    }
    class InnerClass {      // nested class, has directly access to all outer vars / methods
        void display() {
            System.out.println("Logic here"); } 
    }
}



                        /*** CLASSES. ABSTRACT CLASSES ***/

// cannot be directly instantiate with the new operator
abstract absClassName {     // class must be abstract if contains abstruct methods
    abstract void methodName(int parameter);        // abstract method, subclass must override it
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
    public int a = getSum(); public int b = getSum() - a; public int c = getSum() - a - b;
    public getSum() { return a + b + c; }
}
// what will happend
class Cat {
    public int a = 0; public int b = 0; public int c = 0; public Cat() {
        super();
        a = getSum();       // (a + b + c) = 0;
        b = getSum() - a;       // (a + b + c) - a = b = 0;
        c = getSum() - a - b;       // (a + b + c) - a - b = c = 0;
    }
    public getSum() { return a + b + c; }
}



                        /*** CLASSES. METHODS ***/

// overloaded methods: same name, different method agr list, any return value, any access level
// overridden methods: same name, same method arg list, different method body
void methodName(int...days) {   // only one varargs in a perameter, must be last, it works like an array
    for (int i = 0; i < days.length; i++)
        System.out.println(days[i]);
}
public static void anyNewName();    // cannot access instance vars, connot use this.methodName
final void anyName(); // prevent overriding, method or class cannot be overridden
protected void finalize();  // runtime will call this method before destroy the obj

// method how it works
Cat cat = new Cat();        // Cat cat = new Cat();
String name = cat.getName();        // String name = Cat.getName(cat);
cat.setAge(17);     // Cat.setAge(cat, 17);
cat.setChildren(cat1, cat2, cat3);      // Cat.setChildren(cat, cat1, cat2, cat3);

// static method how it works
Cat cat1 = new Cat();       // Cat cat1 = new Cat();
int catCount = Cat.getAllCatsCount();       // int catCount = Cat.getAllCatsCount(null);




                        /*** CLASSES. INHERITANCE ***/

// derived class does not inherit private members, default access members if super class in separate package
// does not inherit constructors of the super class

// can implement 2+ interfaces with static methods, does not matter same name or signature or return type

// can implement 2+ interfaces with same constant name if call to these values is not ambiguous
interface Jump { int MIN = 10; } 
interface Move { int MIN = 10; }    // same constant name
class ClassName implements Jump, Move {}    // will compile, no ambiguous implicit refarence to MIN const
class ClassName implements Jump, Move { ClassName() { int i = MIN; } }  // will not compile, is ambiguous
class ClassName implements Jump, Move { ClassName() { int i = Jump.MIN; } } // will compile

// can implement 2+ interfaces with same method names if same signature or form an overloaded set of methods
interface Jump { String methodName(); } 
interface Move { void methodName(); }   // return value differ
class ClassName implements Jump, Move { String methodName() { return ""; } }    // will not compile

// must override default implementation of the same named DEFAULT methods in 2+ implemented interfaces
interface Jump { default void methodName() {;} } 
interface Move { default void methodName() {;} }    // same default methods
class ClassName implements Jump, Move {}    // will not compile
class ClassName implements Jump, Move { void methodName() {;} } // will compile



                        /*** CLASSES. INTERFACES ***/

// cannot define constructors
// can define the default implementation for its methods and static methods, cannot be instantiated
// members are vars, methods, inner interfaces, inner classes. Only public and default access
interface SharedConstants {
    int NO = 0;     // only as public final static
    int YES = 1;        // variables in interface, must be init, will be in scope as constants
}
// can extend 2+ interfaces with static methods, does not matter same name or signature or return type
// interface can extend 2+ interfaces with same abstruct method names ONLY without methods body
interface InterfaceOne { String getName(); }
interface InterfaceTwo { String getName(); }
interface InterfaceFinal extends InterfaceOne, InterfaceTwo {}
class ClassName implements InterfaceFinal { String getName() { return ""; } }   // will compile

// interface can extend 2+ interfaces with default methods name ONLY overridding these methods
interface InterfaceOne { default void getName() {;} }
interface InterfaceTwo { default void getName() {;} }
interface InterfaceFinal extends InterfaceOne, InterfaceTwo { default void getName() {;} }  // must override

// can access method in superinterface using super key word
interface InterfaceOne { default void getName() {;} }
interface InterfaceTwo { default void getName() {;} }
interface InterfaceFinal extends InterfaceOne, InterfaceTwo { InterfaceTwo.super.getName(); }

interface InterfaceName {   // all methods and vars are implicitly public
    static final int CONST = 1; // must be initialized
    static methodName() {}; // can be accessed as InterfaceName.methodName or by name of implemented class
    default methodName() {};
}
class ClassName implements InterfaceName {
    public methodName() {};     // must implement interface methods using public access
}
// this access to current object, super access to superClass object (both excluded static fields and methods)
interface InterfaceName {
    int MIN = 9999; 
    String printFunc();
    default void status() {
        System.out.println(this);
        System.out.println(this.MIN);
        System.out.println(this.printFunc());
    }
}
class ClassName implements InterfaceName {
    public String printFunc() { return ("anyText" + this); }
}
InterfaceName refVal = new ClassName();
refVal.status();    // ClassName@19e0bfd 9999 anyTextClassName@19e0bfd

// nested interface
class A {
    public interface NestedIF { boolean isNotNefative(int x); }
}
class B implements A.NestedIF {     // class B implements the nested interface
    public boolean isNotNefative(int x) { return x < 0 ? false : true; }
}
A.NestedIF nif = new B(); if (nif.isNotNefative(10)) System.out.println("Logic here");



                        /*** CLASSES. REFERENCE VARIABLES ***/

interface InterfaceName {}
class SuperClass {}
class SubClass extends SuperClass implements InterfaceName {}
class SubNewClass extends SuperClass implements InterfaceName {}

// access using its own class, can access all vars and methods in SuperClass and InterfaceName
SubClass refVar = new SubClass();   // var of type SubClass can be used to refer to its object

// access using refVar of type SuperClass, cannot access vars and methods in SubClass and InterfaceName
SuperClass refVar = new SubClass(); // reference var of type SuperClass can be used to refer to its object

// access using refVar of type InterfaceName, cannot access vars and methods in SubClass and SuperClass
InterfaceName refVar = new SubClass();  // reference var of type InterfaceName can be used

// array of objects grouped by a common base class or an interface
InterfaceName[] arr = new InterfaceName[2];
InterfaceName[0] = new SubClass(); InterfaceName[1] = new SubNewClass();



                        /*** CLASSES. CASTING ***/

interface InterfaceName { void methodName(); }
class SuperClass {}
class SubClass extends SuperClass implements InterfaceName { int field; void methodName() {;} }
InterfaceName refVar = new SubClass();
// next line will not compile, refVar is of type InterfaceName and that interface does not define field
refVar.field = 10;
((SubClass)refVar).field = 10;  // will compile



                        /*** CLASSES. POLYMORPHISM ***/

// method with the same signature (name and method parameters)
// works only with overridden methods (same number and type of method arguments)



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



                        /*** GENERICS. CLASSES ***/

// generic cannot extend Throwable, static vars / methods cannot be of type T
class GenericObj<T> {  // parameter will be replaced by a real type, can take 2+ params
    T objName;
    GenericObj(T obj) { objName = obj; }  // pass the constructor a ref to an obj of type T
    T getObj() { return objName; }
    boolean sameAvg(GenericObj<?> gObj) { ; }   // compare two obj with different parameterized type
}
GenericObj<Integer> iOb = new GenericObj<>(88); int value = iOb.getObj();    // no type casting
GenericObj<Double> dOb = new GenericObj<>(8.8); boolean sameVal = iOb.sameAvg(dOb);

// bounded types, argument must be of type Number or a class derived from it
class GenericObj<T extends Number> { }
// any args passed to T must be a subclass of Number and implement MyInterface
class GenericObj<T extends Number & MyInterface> { }  

// call superclass constructor in generics
class GenSuperObj<T> { T obj; GenOne(T obj) { this.obj = obj; } }
class GenChildOne<T> extends GenSuperObj<T> { GenChildOne(T obj) { super(obj); } }
class GenChildTwo<T, V> extends GenSuperObj<T> {
    V objTwo; GenChildTwo(T argOne, V argTwo) { super(argOne); this.objTwo = argTwo; }
}



                        /*** GENERICS. INTERFACES ***/

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
// typesafe sorting ArrayList using custom generic comparator class
class Person { private int age; int getAge(){ return this.age; } }
class customCompare implements Comparator<Person> {
    int compare(final Person left, final Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
Person objOne = new Person(20); Person objTwo = new Person(25);
List<Person> list = new ArrayList<>(); list.add(objOne); list.add(objTwo);
Collections.sort(list, new customCompare());



                        /*** GENERICS. METHODS ***/
                        /*** GENERICS. CONSTRUCTORS ***/
                        /*** GENERICS. INTERFACES ***/




                        /*** STRING IMMUTABLE OBJECT ***/

// store value in fixed size, private final char[] value;
public final class String extends Object implements Serializable, Comparable<String>, CharSequence {}
static String format(String format, Object... args);
static String valueOf(Object obj);  // return str representation of the obj arg
static String valueOf(char[] data, int offset, int count);
String intern();    // return str with the same content, guaranteed to be from a pool of unique strs

// overloaded String constructor can accept char array, StringBuiler and StringBuffer objects
char[] c = new char[]{'s'}; String strOne = new String(c);
StringBuilder sb = new StringBuilder("s"); String strOne = new String(sb);
StringBuffer sb = new StringBuffer("s"); String strOne = new String(sb);

int length(); boolean isEmpty();
String toLowerCase(); String toUpperCase();
int indexOf(int ch); int indexOf(int ch, int fromIndex);
int indexOf(String subStr); int indexOf(String subStr, int fromIndex);
int lastIndexOf(int ch); int lastIndexOf(int ch, int fromIndex);
int lastIndexOf(String str); int lastIndexOf(String str, int fromIndex);
char charAt(int i);
void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin);  // copies chars into new char array

boolean equals(Object arg); boolean equalsIgnoreCase(String arg); // true if same sequence of chars
boolean contentEquals(CharSequence arg);    // CharBuffer, Segment, String, StringBuffer, StringBuilder
boolean contains(CharSequence s);   // true if this str contains the specified sequence of chars
int compareTo(String arg);  // 0 if equals, -1 if str < arg (lexicographically), 1 if str > arg
int compareToIgnoreCase(String str);    // compares 2 strs lexicographically, ignoring case differences

boolean regionMatches(int toffset, String other, int ooffset, int len); // substring compare
boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len);
boolean startsWith(String prefix); boolean startsWith(String prefix, int toffset);
boolean endsWith(String suffix);

String substring(int beginI); String substring(int beginI, int endI); // new str, endIndex not included
String concat(String str);  // concatenates the specified string to the end of this string
String replace(char oldChar, char newChar); // new str resulting from replacing oldChar with newChar
String replace(CharSequence target, CharSequence replacement);
String trim();  // returns a copy of the st, with no leading and trailing whitespace

String toString(); char[] toCharArray();

// string comparison
String strOne = new String("s"); String strTwo = new String("s");   // create new Str obj not pooled
strOne == strTwo;   // false, compares the addresses of the objects
String strOne = "s"; String strTwo = "s";   // initialize new Str obj and store in a str pool
strOne == strTwo;   // true



                        /*** STRINGBUILDER MUTABLE OBJECT ***/

// store value in none fixed size, char[] value; int count;
abstract class AbstractStringBuilder implements Appendable, CharSequence {}
StringBuilder sb = new StringBuilder(); // StringBuilder() { val = new char[16]; }
StringBuilder sb = new StringBuilder(""); // StringBuilder(String s) { val = new char[s.length() + 16]; }

StringBuilder append(Object obj); // String, StringBuffer, CharSequence, char[], boolean, char, int...
StringBuilder append(CharSequence s, int start, int end);
StringBuilder append(char[] str, int offset, int len);

StringBuilder insert(int index, char[] str, int offset, int len);
StringBuilder insert(int offset, Object obj); // String, char[], CharSequence, boolean, char, int...

StringBuilder delete(int start, int end); StringBuilder deleteCharAt(int index); // not included end pos

StringBuilder reverse();    // sequence will be replaced by the reverse of the sequence

StringBuilder replace(int start, int end, String str);  // not included end pos
CharSequence subSequence(int start, int end);   // does not modify existing value
/* STRINGBUFFER MUTABLE OBJECT WITH SYNCHRONIZED METHODS */



                        /*** ARRAY IMMUTABLE OBJECT ***/

// arr of objs stores a collection of heap-memory addresses or pointers
public class Arrays extends Object {}
String[] arr = new String[2];   // array allocation with size, cannot expend or reduce
String[] arr = new String[] {"", ""};   // arr declaration, allocation and initialization
String[] arr = {"", ""};

MyInterface[] arr = new MyInterface[obj];   // null or obj that implement the relevant interface type
MyAbsClass[] arr = new MyAbsClass[obj]; // null or obj that extends the relevant abstract class
Object[] arr = new Object[new MyClass(), null, new Integer[7]]; // any data type

static void sort(int[] a);  // ascending, any array data type
static void sort(int[] a, int fromIndex, int toIndex);

static boolean equals(int[] a, int[] b);    // any data type, elem1.equals(elem2), same size
static boolean deepEquals(Object[] a1, Object[] a2);    // use with nested arrays of arbitrary depth

static void fill(int[] a, int val); // fill arr with val, any data type
static void fill(int[] a, int fromIndex, int toIndex, int val);

static int[] copyOf(int[] original, int newLength); // copy array, truncating or padding with zeros
static int[] copyOfRange(int[] original, int from, int to); // copy specified range into a new array

static <T>List<T> asList(T... a);   // returned list is serializable and implements RandomAccess
static String toString(int[] a);    // string representation
static String deepToString(Object[] a); // use with nested arrays of arbitrary depth



                        /*** COLLECTION. ARRAYLIST MUTABLE OBJECT ***/

class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable {}
// size(), isEmpty(), get(), set(), iterator(), listIterator() run in constant time
// add() runs in amortized constant time, adding n elements requires O(n) time, all of other linear time
int size(); boolean isEmpty(); void clear(); Object[] toArray(); boolean contains(Object o);

boolean add(E e); void add(int index, E elem);  // append at the end or inserts at the specified position
boolean addAll(Collection<? extends E> c); boolean addAll(int i, Collection<? extends E> c);    // collection

E remove(int index);    // removes the element at the specified position in this list
boolean remove(Object o);   // removes the first occurrence of the specified element from this list
boolean removeAll(Collection<?> c); // removes from this list all elems from the specified collection
Object clone(); // returns a shallow copy of this ArrayList instance, objects will stay the same

E set(int index, E element); // replace elem at the specified position with the specified element

void ensureCapacity(int minCapacity);   // increases the capacity of this ArrayList instance

void forEach(Consumer<? super E> action); // performs action for each element of the Iterable
E get(int index);   // get elem at position
int indexOf(Object o);  // returns the index of the first occurrence of the specified element
int lastIndexOf(Object o);  // returns the index of the last occurrence

Iterator<E> iterator(); // returns an iterator over the elements in this list in proper sequence
ListIterator<E> listIterator(); // returns a list iterator over the elements in this list
void sort(Comparator<? super E> c); // sorts list according to the order induced by the comparator

ArrayList<String> arr = new ArrayList<>();
ListIterator<String> iter = arr.listIterator(); while (iter.hasNext()) { iterator.next(); }



                        /*** DATE IMMUTABLE OBJECT, THREAD SAFE ***/

final class LocalDate extends Object implements Temporal,TemporalAdjuster,ChronoLocalDate,Serializable {}
LocalDate d = LocalDate.of(2017, 01, 27); LocalDate.of(2017, Month.JANUARY, 27);
LocalDate d = LocalDate.now(); LocalDate.parse("2017-01-27");   // current, only two digits vals xxxx-XX-XX
d.getDayOfMonth(); d.getDayOfWeek(); d.getDayOfYear(); d.getMonth(); d.getMonthValue(); d.getYear();
d.minusDays(long); d.minusMonths(long); d.minusWeeks(long); d.minusYears(long); // d.plusXXX(long);
boolean isAfter(ChronoLocalDate other); // checks if this date is after the specified date
boolean isBefore(ChronoLocalDate other);    //checks if this date is before the specified date

final class LocalTime extends Obj implements Temporal,TemporalAdjuster,Comparable<LocalTime>,Serializable {}
LocalTime d = LocalTime.of(120, 12);    // hh,mm; hh,mm,ss; hh,mm,ss,ns;
LocalTime d = LocalTime.now(); LocalDate.parse("15:08:23"); // 00-23 hours time standard, only two digits
d.getHour(); d.getMinute(); d.getSecond(); d.getNano();
d.minusHours(long); d.minusMinutes(long); d.minusSeconds(long); d.minusNanos(long); // d.plusXXX(long);
boolean isAfter(LocalTime other);   // checks if this time is after the specified time
boolean isBefore(LocalTime other);  // checks if this time is before the specified time

final class LocalDateTime implements Temporal,TemporalAdjuster,ChronoLocalDateTime<LocalDate>,Serializable{}
final class Period extends Object implements ChronoPeriod, Serializable {} // can be negative
final class DateTimeFormatter extends Object {}



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
    int data = inStream.read(); outStream.write(data);  // read and write one byte at a time
}
inStream.close(); outStream.close();

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



                        /*** COLLECTIONS SET, TREESET ***/
                        /*** COLLECTIONS SET, SORTEDSET ***/
                        /*** COLLECTIONS SET, HASHSET ***/

// unordered collection of unique items
Set<String> set = new HashSet<>(); set.add("Mama"); set.add("Mila");
size(), add(), addAll(), remove(), removeAll(), contains(), containsAll();

for (String text : set)     // iteration
    System.out.println(text);

Iterator<String> iterator = set.iterator();     // get iterator for set
while (iterator.hasNext())      // check if next element is exist
    String text = iterator.next();      // iterator.remove() current item

for (Iterator<Integer> i = set.iterator(); i.hasNext();)    // using for loop for iteration over set
    Integer element = i.next();     // logic omitted

Iterator<Cat> iterator = cats.iterator(); cats.remove(iterator.next()); // remove first element



                        /*** COLLECTIONS MAP, TREEMAP ***/
                        /*** COLLECTIONS MAP, HASHTABLE ***/
                        /*** COLLECTIONS MAP, HASHMAP ***/

// key-value pairs
Map<String, String> map = new HashMap<>(); map.put("first", "Mama");
entrySet(), keySet(), values(), put(key, value), get(key), containsKey(key)
containsValue(value), isEmpty(), clear(), remove(key)

for (String s : map.keySet()) // return Set of all keys
for (String s : map.values()) // return Set of all values
for (Map.Entry<String, String> entry : map.entrySet())  // return each pair from Map

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



                        /*** COLLECTIONS LIST, LINKEDLIST ***/
                        /*** COLLECTIONS LIST, VECTOR ***/
                        /*** COLLECTIONS LIST, STACK ***/
                        /*** COLLECTIONS LIST, ARRAYLIST ***/

// ordered collection, can change its length
List<String> list = new ArrayList<>();    // List<> interface name, new ArrayList<>() implementation
int n = list.size(); String s = list.get(3); list.set(3, s);
list.add(s); list.add(15, s); list.remove(3);

List<String> list = new ArrayList<>(); list.add("Mama"); list.add("Mila");
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String text = iterator.next();

for (String text : list)        // iteration
    System.out.println(text);

Arrays.sort(list); Arrays.sort(list, Collections.reverseOrder());     // list sorting



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

// will work only with functional interface, that defines exactly one abstruct method
(paramName) -> paramName.methodName() >= value;
(paramType paramName) -> { return (paramName.methodName() >= value); };

interface Validate { boolean check(Emp emp); }  // functional interface with one abstruct method
public interface Predicate<T> { boolean check(T t); }   // functional, generic interface

class Emp {
    String name; int performanceRating; double salary;
    Emp (String nm, int r, double sl) { this.name = nm; this.performanceRating = r; this.salary = sl; }
    String getName() { return this.name; }
    int getPerformanceRation() { return this.performanceRating; }
    String getSalary() { return this.salary; }
}

static void filterWithFunctional(ArrayList<Emp> list, Validate rule) {
    for (Emp e : list)
        if (rule.check(e))
            System.out.println(e);
}
static void filterWithPredicate(ArrayList<Emp> list, Predicate<Emp> rule) {
    for (Emp e : list)
        if (rule.check(e))
            System.out.println(e);
}


Emp e1 = new Emp("Sergey", 5, 9999.00); Emp e2 = new Emp("Olga", 6, 10000.00);
ArrayList<Emp> arr = new ArrayList<>(); arr.add(e1); arr.add(e2);

Validate validPerfor = e -> e.getPerformanceRation() >= 5;
filterWithFunctional(arr, validPerfor);

Predicate<Emp> predicate = e -> e.getPerformanceRation() >= 5;
filterWithPredicate(arr, predicate);



                        /*** ANNOTATION ***/



                        /*** JAVA NATIVE INTERFACE ***/
// include C/C++ libs




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
