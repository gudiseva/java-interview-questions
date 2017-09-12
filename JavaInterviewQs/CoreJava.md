# Java Questions

### 1. What is Cloning?
Code Reference: nag.arvind.gudiseva.singleton.Employee.java

### 2. How to prevent Cloning? Hint: throw CloneNotSupportedException
Code Reference: nag.arvind.gudiseva.singleton.SingletonClone.java
 
### 3. How to access Constructor of a Abstract Class from the Implemented Class?  Hint: abstract class super(); super(param);
Website: https://stackoverflow.com/questions/260666/can-an-abstract-class-have-a-constructor

Answer:
Abstract constructors will frequently be used to enforce class constraints or invariants such as the minimum fields required to setup the class.

NOTE: As there is no default (or no-arg) constructor in the parent abstract class, the constructor used in subclass must explicitly call the parent constructor.
 - An abstract class is a class that is declared abstract — it may or may not include abstract methods.
 - Abstract classes cannot be instantiated, but they can be subclassed.
 - An abstract method is a method that is declared without an implementation.
 - If a class includes abstract methods, then the class itself must be declared abstract.
 - When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.
 - However, if it does not, then the subclass must also be declared abstract.
 Note: Methods in an interface that are not declared as default or static are implicitly abstract, so the abstract modifier is not used with interface methods.

Code Reference: nag.arvind.gudiseva.abstractclasses.GreetingAbstract and nag.arvind.gudiseva.abstractclasses.GreetingConcrete

### 4. How to access variable of the Interface? E.g. static final int id = 1;
Code Reference: nag.arvind.gudiseva.interfaces.MyInterfaceADemo.java and nag.arvind.gudiseva.interfaces.MyInterfaceABDemo.java

### 5. Interface A has method a(); Interface B has method a(); Class C implements Interface A, B. Which method A.a() or B.a() should the Class C override?
Website: https://stackoverflow.com/questions/2801878/implementing-two-interfaces-in-a-class-with-same-method-which-interface-method

Answer:
If a Class implements two interfaces, and each interface define a method that has identical signature, then in effect there is only one method, and they are not distinguishable.
If say, the two methods have conflicting return types, then it will be a compilation error.
This is the general rule of inheritance, method overriding, hiding, and declarations, and applies also to possible conflicts not only between 2 inherited interface methods,
but also an interface and a super class method, or even just conflicts due to type erasure of generics.

Code Reference: nag.arvind.gudiseva.interfaces.MyInterfaceCDDemo.java and nag.arvind.gudiseva.interfaces.MyInterfaceEF.java

### 6. What is Diamond problem in Java?  How to take care of ambiguity?

### 7. How can you override static methods?

### 8. What is a Heap and Stack?  E.g. Object is stored in heap; Primitives are stored in Stack; String pool reference is stored in Stack

### 9. What is a Map? Can two Objects be stored as Key and Value in Maps? 

### 10. How to make Map Synchronized and ThreadSafe?

### 11. What is ConcurrentHashMap?

### 12. What models are available in Queue?

### 13. What modes are available in ActiveMQ?

### 14. What Interfaces does String Class implements?  E.g. Comparable

### 15. What are enums?

### 16. What is call / pass by reference and call / pass by value?

### 17. What is java.lang.OutOfMemoryError:Java heap space and java.lang.StackOverflowError?

### 18. How to force Garbage Collection in Java?  What does System.gc() do?  Does Garbage Collector in System.gc make request to JVM?

### 19. What is finalize?

### 20. What is a finally block?

### 21. What is Inner Class?

### 22. What is Immutable?  How do you make Object immutable?

### 23. What is Serialization / Serializable?

### 24. When was Strings in Case Statements introduced? Hint: Java 7

### 25. What is the use of Executors Framework?

### 26. Difference between HashMap, LinkedHashMap and TreeMap
Website: https://stackoverflow.com/questions/2889777/difference-between-hashmap-linkedhashmap-and-treemap

Answer:
All three classes implement the Map interface and offer mostly the same functionality. The most important difference is the order in which iteration through the entries will happen:

HashMap makes absolutely no guarantees about the iteration order. It can (and will) even change completely when new elements are added.
TreeMap will iterate according to the "natural ordering" of the keys according to their compareTo() method (or an externally supplied Comparator). Additionally, it implements the SortedMap interface, which contains methods that depend on this sort order.
LinkedHashMap will iterate in the order in which the entries were put into the map
"Hashtable" is the generic name for hash-based maps. In the context of the Java API, Hashtable is an obsolete class from the days of Java 1.1 before the collections framework existed. It should not be used anymore, because its API is cluttered with obsolete methods that duplicate functionality, and its methods are synchronized (which can decrease performance and is generally useless). Use ConcurrrentHashMap instead of Hashtable.

