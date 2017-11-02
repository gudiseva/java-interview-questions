# Java Questions

## Avesta

### 1. What is Cloning?
Code: nag.arvind.gudiseva.singleton.Employee.java

Answer:
clone() is a method in the Java programming language for object duplication. 
In Java, objects are manipulated through reference variables, and there is no operator for copying an object—the assignment operator duplicates the reference, not the object.
The clone() method provides this missing functionality.
E.g. 	Object copy = obj.clone();
		MyClass copy = (MyClass) obj.clone();


### 2. How to prevent Cloning? Hint: throw CloneNotSupportedException
Code: nag.arvind.gudiseva.singleton.SingletonClone.java

Answer:
When writing a class using the Singleton pattern, only one instance of that class can exist at a time.
As a result, the class must not be allowed to make a clone. To prevent this, override the clone() method using the following code:
	public Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException(); 
	}


### 3. How to access Constructor of a Abstract Class from the Implemented Class?  Hint: abstract class super(); super(param);
Reference: https://stackoverflow.com/questions/260666/can-an-abstract-class-have-a-constructor

Code: nag.arvind.gudiseva.abstractclasses.GreetingAbstract and nag.arvind.gudiseva.abstractclasses.GreetingConcrete

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


### 4. How to access variable of the Interface? E.g. static final int id = 1;
Code: nag.arvind.gudiseva.interfaces.MyInterfaceADemo.java and nag.arvind.gudiseva.interfaces.MyInterfaceABDemo.java


### 5. Interface A has method a(); Interface B has method a(); Class C implements Interface A, B. Which method A.a() or B.a() should the Class C override?
Reference: https://stackoverflow.com/questions/2801878/implementing-two-interfaces-in-a-class-with-same-method-which-interface-method

Code: nag.arvind.gudiseva.interfaces.MyInterfaceCDDemo.java and nag.arvind.gudiseva.interfaces.MyInterfaceEF.java

Answer:
If a Class implements two interfaces, and each interface define a method that has identical signature, then in effect there is only one method, and they are not distinguishable.
If say, the two methods have conflicting return types, then it will be a compilation error.
This is the general rule of inheritance, method overriding, hiding, and declarations, and applies also to possible conflicts not only between 2 inherited interface methods,
but also an interface and a super class method, or even just conflicts due to type erasure of generics.


### 6. What is Diamond problem in Java?  How to take care of ambiguity?
Reference: https://www.journaldev.com/10081/javase8-interview-questions-part2

Code: nag.arvind.gudiseva.interfaces.MyInterfaceX, nag.arvind.gudiseva.interfaces.MyInterfaceY, nag.arvind.gudiseva.interfaces.MyInterfaceZ, nag.arvind.gudiseva.interfaces.MyInterfaceYZImpl

Answer:
A Diamond Problem is a Multiple Inheritance problem. It occurs when a Class extends more than one Interface which have same method implementation (Default method).

			MyInterfaceX
			^			^
			|			|
	MyInterfaceY		MyInterfaceZ
			^			^
			|			|
		MyInterfaceYZImpl

To avoid this problem, Java 7 and Earlier versions does not support methods implementation in interface and also doesn’t support Multiple Inheritance. Java 8 has introduced new feature: Default methods to support Multiple Inheritance with some limitations.
E.g. Class D inherits display() method from both interfaces B and C.  This B.super.display(); will solve this Diamond Problem.


### 7. How can you override static methods?
Reference: https://stackoverflow.com/questions/2223386/why-doesnt-java-allow-overriding-of-static-methods

Answer:
Overriding depends on having an instance of a class.
The point of polymorphism is that you can subclass a class and the objects implementing those subclasses will have different behaviors for the same methods defined in the superclass (and overridden in the subclasses).
A static method is not associated with any instance of a class so the concept is not applicable.

### 8. What is a Heap and Stack?  E.g. Object is stored in heap; Primitives are stored in Stack; String pool reference is stored in Stack
Reference: http://www.journaldev.com/4098/java-heap-space-vs-stack-memory

Answer:


### 9. What is a Map? Can two Objects be stored as Key and Value in Maps? 
Reference: https://www.mkyong.com/java/how-to-sort-a-map-in-java/

### 10. How to make Map Synchronized and ThreadSafe?

### 11. What is ConcurrentHashMap?

### 12. What models are available in Queue?

### 13. What modes are available in ActiveMQ?

### 14. What Interfaces does String Class implements?  E.g. Comparable

### 15. What are enums?

### 16. What is call / pass by reference and call / pass by value?
Answer:
Java is Pass by Value and Not Pass by Reference

### 17. What is java.lang.OutOfMemoryError:Java heap space and java.lang.StackOverflowError?

### 18. How to force Garbage Collection in Java?  What does System.gc() do?  Does Garbage Collector in System.gc() make request to JVM?
Answer:
In Java, the JVM manages the memory.  So, we don't have that kind of fine grained control.
If you set objects you're no longer using to null, or loose all references, they will get cleaned up.
If you are on a unix box, and force a thread dump (kill -3), it'll pretty much force garbage collection.
System.gc(); and Runtime.gc(); is a hint to the garbage collector to do GC.

### 19. What is finalize?
Answer:
The java.lang.Object.finalize() is called by the garbage collector on an object when garbage collection determines that there are no more references to the object. A subclass overrides the finalize method to dispose of system resources or to perform other cleanup.

### 20. What is a finally block?
Answer:
Java finally block is a block that is used to execute "cleanup" code such as closing a file, closing connection, stream etc.
Java finally block is always executed whether exception is handled or not. Java finally block follows try or catch block.
Note: If you don't handle exception, before terminating the program, JVM executes finally block(if any).
Rule: For each try block there can be zero or more catch blocks, but only one finally block.
Note: The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).

### 21. What is Inner Class?

### 22. What is Immutable?  How do you make Object immutable?

### 23. What is Serialization / Serializable?

### 24. When was Strings in Case Statements introduced? Hint: Java 7

### 25. What is the use of Executors Framework?

### 26. Difference between HashMap, LinkedHashMap and TreeMap
Reference: https://stackoverflow.com/questions/2889777/difference-between-hashmap-linkedhashmap-and-treemap

Answer:
All three classes implement the Map interface and offer mostly the same functionality. The most important difference is the order in which iteration through the entries will happen:

HashMap makes absolutely no guarantees about the iteration order. It can (and will) even change completely when new elements are added.
TreeMap will iterate according to the "natural ordering" of the keys according to their compareTo() method (or an externally supplied Comparator). Additionally, it implements the SortedMap interface, which contains methods that depend on this sort order.
LinkedHashMap will iterate in the order in which the entries were put into the map
"Hashtable" is the generic name for hash-based maps. In the context of the Java API, Hashtable is an obsolete class from the days of Java 1.1 before the collections framework existed. It should not be used anymore, because its API is cluttered with obsolete methods that duplicate functionality, and its methods are synchronized (which can decrease performance and is generally useless). Use ConcurrrentHashMap instead of Hashtable.

### 27. Count Total Number Of Times Each Alphabet Appears In The String
Code: nag.arvind.gudiseva.AlphabetCount.java

## Saggezza

### Hibernate
(1) Multiple tables
(2) Child tables not to be deleted;

### Locating and traversing keys in Hashmap - 1st middle or last

### Big(0) for Hashmap and List

### Runtime, Checked and Unchecked Exceptions
Answer:

                   +-----------+
		   				| Throwable |
                   +-----------+
                    /         \
		   				/           \
          +-------+          +-----------+
          | Error |          | Exception |
          +-------+          +-----------+
	   		/  |  \           / |        \
         \________/		  \______/    	 \
			                		+------------------+
			unchecked	 checked	| RuntimeException |
									+------------------+
					  				/   |    |      \
					 				\_________________/
					   
					   					unchecked


#### Class Throwable
 - java.lang.Object
  - java.lang.Throwable

##### All Implemented Interfaces:
Serializable

##### Direct Known Subclasses:
Error, Exception

#### Class Exception						#### Class Error
 - java.lang.Object							 - java.lang.Object							
  - java.lang.Throwable						  - java.lang.Throwable								
   - java.lang.Exception					   - java.lang.Error					

##### All Implemented Interfaces:				##### All Implemented Interfaces:
Serializable								Serializable

##### Direct Known Subclasses (Exception):
AclNotFoundException, ActivationException, AlreadyBoundException, ApplicationException, AWTException, BackingStoreException, BadAttributeValueExpException, BadBinaryOpValueExpException, BadLocationException, BadStringOperationException, BrokenBarrierException, CertificateException, CloneNotSupportedException, DataFormatException, DatatypeConfigurationException, DestroyFailedException, ExecutionException, ExpandVetoException, FontFormatException, GeneralSecurityException, GSSException, IllegalClassFormatException, InterruptedException, IntrospectionException, InvalidApplicationException, InvalidMidiDataException, InvalidPreferencesFormatException, InvalidTargetObjectTypeException, IOException, JAXBException, JMException, KeySelectorException, LastOwnerException, LineUnavailableException, MarshalException, MidiUnavailableException, MimeTypeParseException, MimeTypeParseException, NamingException, NoninvertibleTransformException, NotBoundException, NotOwnerException, ParseException, ParserConfigurationException, PrinterException, PrintException, PrivilegedActionException, PropertyVetoException, ReflectiveOperationException, RefreshFailedException, RemarshalException, RuntimeException, SAXException, ScriptException, ServerNotActiveException, SOAPException, SQLException, TimeoutException, TooManyListenersException, TransformerException, TransformException, UnmodifiableClassException, UnsupportedAudioFileException, UnsupportedCallbackException, UnsupportedFlavorException, UnsupportedLookAndFeelException, URIReferenceException, URISyntaxException, UserException, XAException, XMLParseException, XMLSignatureException, XMLStreamException, XPathException

##### Direct Known Subclasses (Error):
AnnotationFormatError, AssertionError, AWTError, CoderMalfunctionError, FactoryConfigurationError, FactoryConfigurationError, IOError, LinkageError, ServiceConfigurationError, ThreadDeath, TransformerFactoryConfigurationError, VirtualMachineError

#### Class RuntimeException
 - java.lang.Object
  - java.lang.Throwable
   - java.lang.Exception
    - java.lang.RuntimeException

##### All Implemented Interfaces:
Serializable

##### Direct Known Subclasses:
AnnotationTypeMismatchException, ArithmeticException, ArrayStoreException, BufferOverflowException, BufferUnderflowException, CannotRedoException, CannotUndoException, ClassCastException, CMMException, ConcurrentModificationException, DataBindingException, DOMException, EmptyStackException, EnumConstantNotPresentException, EventException, FileSystemAlreadyExistsException, FileSystemNotFoundException, IllegalArgumentException, IllegalMonitorStateException, IllegalPathStateException, IllegalStateException, IllformedLocaleException, ImagingOpException, IncompleteAnnotationException, IndexOutOfBoundsException, JMRuntimeException, LSException, MalformedParameterizedTypeException, MirroredTypesException, MissingResourceException, NegativeArraySizeException, NoSuchElementException, NoSuchMechanismException, NullPointerException, ProfileDataException, ProviderException, ProviderNotFoundException, RasterFormatException, RejectedExecutionException, SecurityException, SystemException, TypeConstraintException, TypeNotPresentException, UndeclaredThrowableException, UnknownEntityException, UnmodifiableSetException, UnsupportedOperationException, WebServiceException, WrongMethodTypeException

## Aditazz

### 28. Type Annotations in Java 8.
Website: https://www.javatpoint.com/java-8-type-annotations-and-repeating-annotations

Answer:
In early Java versions, you can apply annotations only to declarations. From Java SE 8 , annotations can be applied to any type use.
It means that annotations can be used anywhere you use a type. For example, if you want to avoid NullPointerException in your code, you can declare a string variable like this:
@NonNull String str;

Following are the examples of type annotations:
	@NonNull List<String>  
	List<@NonNull String> str  
	Arrays<@NonNegative Integer> sort  
	@Encrypted File file  
	@Open Connection connection  
	void divideInteger(int a, int b) throws @ZeroDivisor ArithmeticException  


### 29. Size of int and long?  Size of int and long in bytes.
Reference: http://cs-fundamentals.com/java-programming/java-primitive-data-types.php

Answer:

Java Eight Primitive Data Types
-------------------------------
Type					Size in Bit			Size in Bytes				Range
----					------------		-------------				-----
byte					8-bit				1 byte						-128 to 127
short					16-bit				2 bytes						-32,768 to 32,767
int			Signed		32-bit				4 bytes						-2,147,483,648 to 2,147,483, 647
long		Signed		64-bit				8 bytes						-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float										4 bytes						approximately ±3.40282347E+38F 
																		(6-7 significant decimal digits) 
																		Java implements IEEE 754 standard
double										8 bytes						approximately ±1.79769313486231570E+308
																		(15 significant decimal digits)
char										2 byte						0 to 65,536 (unsigned)
boolean										not precisely defined*		true or false
*boolean represents one bit of information, but its "size" isn't something that's precisely defined.


### 30. How to traverse a TreeSet?  What is Big O for TreeSet?
Website: http://javahungry.blogspot.com/2015/10/how-treeset-works-internally-in-java-interview-questions.html

Answer:

What is TreeSet?
TreeSet is like HashSet which contains the unique elements only but in a sorted manner. The major difference is that TreeSet provides a total ordering of the elements. The elements are ordered using their natural ordering, or by a Comparator typically provided at sorted set creation time. The set's iterator will traverse the set in ascending element order.

How TreeSet works in Java?
You can look into the TreeSet API in rt.jar. According to TreeSet Oracle doc:
TreeSet is a NavigableSet implementation backed by TreeMap instance. 

What is the runtime performance of the TreeSet and HashSet?
-Note: n represents the number of elements

According to TreeSet Oracle doc:
TreeSet implementation provides guaranteed log(n) time cost for the basic operations (add, remove and contains) method.

According to HashSet Oracle doc:
HashSet provides constant time performance O(1) for basic operations (add, remove and contains) method assuming the hash function disperses the elements properly among the buckets.

One-liner:
 TreeSet: O(log(n))
 HashSet: O(1)

Why do we need TreeSet when we already had SortedSet?
SortedSet is an interface while TreeSet is the class implementing it. As we know, in java, we can not create the objects of the interface. The class implementing the interface must fulfill the contract of interface, i.e., concrete class must implement all the methods present in the interface. TreeSet is such an implementation.

Which data structure you will prefer  in your code : HashSet and TreeSet?
TreeSet contains the elements in the sorted order while HashSet is faster.
If you want to maintain the order of the elements then TreeSet should be used because the result is alphabetically sorted.
If you do not want to sort the elements and avoid duplicate elements. Your task involves mainly insert and retrieve operations then prefer HashSet.
While iterating HashSet there is no ordering of elements while TreeSet iterates in the natural order.

What happens if the TreeSet is concurrently modified while iterating the elements?
The iterator's returned by the TreeSet class iterator method are fail-fast.  Fail-fast means if the set is modified at any time after the iterator is created, in any way except the iterator's own remove method, the iterator will throw a ConcurrentModificationException. Thus, the iterator fails quickly and cleanly.

Which copy technique (deep or shallow) is used by TreeSet clone() method?
According to Oracle docs , clone() method returns the shallow copy of the TreeSet instance.  In shallow copy , Both objects A and B shared the same memory location.

How to convert HashSet to TreeSet object ?
E.g. Set treeObject = new TreeSet(hashSetObject);

### 30. What is a Maven Artifact?
Reference: https://stackoverflow.com/questions/2487485/what-is-a-maven-artifact

Answer:
An artifact is a file, usually a JAR, that gets deployed to a Maven repository.  A Maven build produces one or more artifacts, such as a compiled JAR and a "sources" JAR.
Each artifact has a group ID (usually a reversed domain name, like com.example.foo), an artifact ID (just a name), and a version string. The three together uniquely identify the artifact.
A project's dependencies are specified as artifacts.


### 31. How to add tertiary dependencies in Maven?
Website: https://stackoverflow.com/questions/19678460/how-to-add-install-to-maven-dependency-of-newly-created-third-party-jar-in-pom-x

Answer:
You need to install this JAR into your own repository. 
C:\> mvn install:install-file -Dfile=<path-to-file> -DgroupId=<group-id> -DartifactId=<artifact-id> -Dversion=<version> -Dpackaging=jar

Now include this installed artifact into your project as a regular dependency.


## Cisco

### 32. What are Immutable Classes in Java?  Give examples.

### 33. What are Atomic variables?

### 34. How to prevent multi-threading in Singleton classes?

### 35. Strategy Pattern

### 36. How to avoid try, catch and finally block

### 37. How to handle Out of Memory error?  Is it recoverable?

### 38. Difference between "Class Not Found" and "No Class Def" errors


