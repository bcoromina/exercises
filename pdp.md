Table of Contents**

[Scala OOP Components	7](#__refheading___toc7483_276329720)

[Abstract class and trait	7](#__refheading___toc7485_276329720)

[override vs overload	7](#__refheading___toc7487_276329720)

[Access modifiers	7](#__refheading___toc7489_276329720)

[Self type annotation	8](#__refheading___toc7491_276329720)

[Diamond problem	8](#__refheading___toc7493_276329720)

[ Linearization	8](#__refheading___toc7495_276329720)

[Sealed trait	9](#__refheading___toc7497_276329720)

[SAM: Single Abstract Method	10](#__refheading___toc7499_276329720)

[private\[this\]	10](#__refheading___toc7501_276329720)

[Scala type system	10](#__refheading___toc7503_276329720)

[Value type	10](#__refheading___toc7505_276329720)

[Reference type	10](#__refheading___toc7507_276329720)

[Value classes	10](#__refheading___toc7509_276329720)

[ Nothing	11](#__refheading___toc7511_276329720)

[ Null	11](#__refheading___toc7513_276329720)

[ Unit	11](#__refheading___toc7515_276329720)

[Type erasure	12](#__refheading___toc7537_276329720)

[Type bounds and type variance	12](#__refheading___toc7517_276329720)

[Covariance	13](#__refheading___toc7519_276329720)

[Contravariance	13](#__refheading___toc7521_276329720)

[Structural types and disadvantages in scala 2	14](#__refheading___toc7523_276329720)

[Abstract types	14](#__refheading___toc7525_276329720)

[Path dependant types	15](#__refheading___toc7527_276329720)

[Type variables	16](#__refheading___toc7529_276329720)

[Existencial types	18](#__refheading___toc7531_276329720)

[Singleton type and literal singleton	20](#__refheading___toc7533_276329720)

[Type evidences	21](#__refheading___toc8453_2607706102)

[Higher kinded types	23](#__refheading___toc8406_2607706102)

[F-bound polymorfism	24](#__refheading___toc7535_276329720)

[ADT case class	25](#__refheading___toc22655_2675006907)

[Added methods	25](#__refheading___toc25083_2963167111)

[Unnaply and unaplySeq	26](#__refheading___toc25085_2963167111)

[Functional Programming	27](#__refheading___toc7568_276329720)

[Tail recursion	27](#__refheading___toc7570_276329720)

[Closures	28](#__refheading___toc7572_276329720)

[Partial functions	28](#__refheading___toc7574_276329720)

[Referential transparency	28](#__refheading___toc7576_276329720)

[Functional Data Structures	29](#__refheading___toc7578_276329720)

[Currying	29](#__refheading___toc7679_276329720)

[Corecursion & LazyList	30](#__refheading___toc7795_276329720)

[Polymorphism	31](#__refheading___toc10913_1739821362)

[Type classes	32](#__refheading___toc10915_1739821362)

[Functional lifting	33](#__refheading___toc11541_1739821362)

[Basic Monads	34](#__refheading___toc11543_1739821362)

[IO	34](#__refheading___toc11545_1739821362)

[Writer	34](#__refheading___toc11547_1739821362)

[Reader	35](#__refheading___toc11549_1739821362)

[State	35](#__refheading___toc7968_904507452)

[Monad laws	36](#__refheading___toc8157_904507452)

[Kleisli	36](#__refheading___toc16306_1974857902)

[Software Design	37](#__refheading___toc16318_1974857902)

[GoF patterns	37](#__refheading___toc16320_1974857902)

[Creational	37](#__refheading___toc16322_1974857902)

[Singleton	37](#__refheading___toc16324_1974857902)

[FactoryMethod	37](#__refheading___toc16326_1974857902)

[AbstractFactory	38](#__refheading___toc16328_1974857902)

[Builder	39](#__refheading___toc16330_1974857902)

[Prototype	39](#__refheading___toc16332_1974857902)

[Behavioral patterns	39](#__refheading___toc16334_1974857902)

[Chain of responsibility	39](#__refheading___toc16336_1974857902)

[Command	40](#__refheading___toc16338_1974857902)

[Iterator	40](#__refheading___toc16340_1974857902)

[Mediator	41](#__refheading___toc16342_1974857902)

[Memento	41](#__refheading___toc16344_1974857902)

[Observer	41](#__refheading___toc25087_2963167111)

[State	42](#__refheading___toc25089_2963167111)

[Strategy	43](#__refheading___toc22564_88264807)

[Template	43](#__refheading___toc25091_2963167111)

[Visitor	43](#__refheading___toc25093_2963167111)

[Structural	46](#__refheading___toc25095_2963167111)

[Adapter	46](#__refheading___toc25097_2963167111)

[Bridge	46](#__refheading___toc25099_2963167111)

[Composite	47](#__refheading___toc25101_2963167111)

[Decorator	47](#__refheading___toc25103_2963167111)

[Facade	49](#__refheading___toc25105_2963167111)

[Flyweight	49](#__refheading___toc25107_2963167111)

[Proxy	49](#__refheading___toc25109_2963167111)

[SOLID principles	50](#__refheading___toc22566_88264807)

[Single Responsibility Principle	50](#__refheading___toc22568_88264807)

[Open/Closed Principle	50](#__refheading___toc22570_88264807)

[Liskov Substitution Principle	50](#__refheading___toc22572_88264807)

[Interface Segregation Principle	50](#__refheading___toc22574_88264807)

[Dependency Inversion	51](#__refheading___toc22576_88264807)

[DRY	51](#__refheading___toc25685_325327998)

[YAGNI	51](#__refheading___toc25687_325327998)

[KISS	52](#__refheading___toc25804_1747409186)

[Data structures & Algorithms	53](#__refheading___toc22578_88264807)

[Quicksort	59](#__refheading___toc29291_3312526517)

[Merge sort	60](#__refheading___toc29293_3312526517)

[Pattern matching	60](#__refheading___toc22580_88264807)

[Composition over inheritance	61](#__refheading___toc25689_325327998)

[GRASP patterns	62](#__refheading___toc25662_325327998)

[Testing	62](#__refheading___toc25843_1747409186)

[Test Levels	62](#__refheading___toc25845_1747409186)

[Test Types	63](#__refheading___toc25847_1747409186)

[Change related tests	64](#__refheading___toc25854_1747409186)

[Mocks vs Stubs vs Dummies	64](#__refheading___toc25866_1747409186)

[TDD vs BDD	64](#__refheading___toc25878_1747409186)

[Software Architecture	65](#__refheading___toc25880_1747409186)

[Architecture patterns	65](#__refheading___toc25882_1747409186)

[Layered (N-Tier) architecture	65](#__refheading___toc25884_1747409186)

[Client-Server	65](#__refheading___toc25962_1747409186)

[Microservices Architecture	66](#__refheading___toc25964_1747409186)

[Clean Architecture	66](#__refheading___toc25966_1747409186)

[Hexagonal Architecture	67](#__refheading___toc25968_1747409186)

[EDA: Event Driven Architecture	68](#__refheading___toc25970_1747409186)

[Concurrency & Parallelism	70](#__refheading___toc25972_1747409186)

[Atomic	70](#__refheading___toc28954_2462428895)

[volatile (visibility problem)	71](#__refheading___toc28956_2462428895)

[Synchronized	71](#__refheading___toc28958_2462428895)

[Fork-Join pool	72](#__refheading___toc27098_3482476484)

[Locking	73](#__refheading___toc27100_3482476484)

[Optimistic locking	73](#__refheading___toc27102_3482476484)

[Pessimistic locking	73](#__refheading___toc27104_3482476484)

[Monitor	73](#__refheading___toc27106_3482476484)

[Semaphore	74](#__refheading___toc27108_3482476484)

[ReentrantLock	74](#__refheading___toc27110_3482476484)

[FairLock	74](#__refheading___toc27112_3482476484)

[Future vs IO	74](#__refheading___toc27276_2130932612)

[JVM	74](#__refheading___toc28027_14989605)

[Concepts	74](#__refheading___toc28029_14989605)

[Garbage collection algorithms:	76](#__refheading___toc28031_14989605)

[KPI	76](#__refheading___toc28033_14989605)

[Algorithms Oracle	76](#__refheading___toc28035_14989605)

[GC event causes:	77](#__refheading___toc28037_14989605)

[Generation in garbage collection algorithms	78](#__refheading___toc28039_14989605)

[Class Loaders	78](#__refheading___toc28948_1000696367)

[JVM cold start	79](#__refheading___toc29295_3312526517)

[Akka	80](#__refheading___toc29297_3312526517)

[Message Delivery Guarantees	81](#__refheading___toc29299_3312526517)

[Collections	81](#__refheading___toc29756_1013244755)

[Seq	82](#__refheading___toc29758_1013244755)

[Set	83](#__refheading___toc29760_1013244755)

[Map	83](#__refheading___toc29779_1013244755)

[Scala implicits	84](#__refheading___toc30630_252999171)

[Types of implicits	85](#__refheading___toc30632_252999171)

[Implicit conversion	85](#__refheading___toc30634_252999171)

[Implicit parameters	85](#__refheading___toc30636_252999171)

[View bound	85](#__refheading___toc30638_252999171)

[Context bound	85](#__refheading___toc30640_252999171)

[Implicit scope	86](#__refheading___toc30642_252999171)

[Recursive implicit resolution	86](#__refheading___toc30644_252999171)

[List example	88](#__refheading___toc30646_252999171)

3




|**Group**|**Topic**|**Completeness**|
| :-: | :-: | :-: |
|OOP|Abstract class vs trait|OK|
|OOP|Self type annotation|OK|
|OOP|Acces modifiers|OK|
|OOP|Sealed trait and usecases|OK|
|OOP|Diamond problem + linearization|OK|
|OOP|Inner andanonymous classers. SAM|OK|
|OOP|Private vs private[this]|OK|
|Type System|Type system basics|OK|
|Type System|Generic type. Type constructor. Type erasure|OK|
|Type System|Type bounds and type variance|OK|
|Type System|Structural types|OK|
|Type System|Abstract types. Path dependant types|OK|
|Type System|Existencial Types (forSome)|OK|
|Type System|Singleton Type|OK|
|Type System|Higher kinded types|OK|
|Type System|Type lambdas|OK|
|Type System|F-bound polymorfism|OK|
|Type System|Type evidences <:< and =:=|OK|
|ADT case class|Case class vs simple class (all methods)|OK|
|ADT case class|Unnaply (returns Option) and unnaplySeq||
|Pattern Matching|Pattern matching use cases. Pattern guard||
|Pattern Matching|Cases where pattern matching can’t be used||
|FP|Tail recursion. Closures, partial functions. Referencial transparency. Functional data structures|OK|
|FP|Currying|OK|
|FP|Lazy evaluation and Corecursion|OK|
|FP|Type classes|OK|
|FP|Functional lifting (to/from curried, to/from partial, to/from tupled)|OK|
|FP|Monads: IO,Reader, Writer, State|OK|
|FP|Monadic Laws and monad impl|8/10|
|Collections|<p>LinkedHashMap, SeqMap, WeakHashMap</p><p></p>||
|Collections|List implementation||
|Collection|Implement custom collection in hierarchiy||
|Algo & Data Structures|` `searching, sorting, and data structure traversal and retrieval algorithms like bubble sort, binary search...||
|Algo & Data Strucctures|<p>` `Big O and different time/space complexit</p><p></p>||
|Algo & Data Strucctures|<p>space and time tradeoffs of the basic data structures</p><p></p>||
|Algo & Data Strucctures|<p>Easy level LeetCode tasks like TwoSum problem</p><p></p>||
|Algo & Data Strucctures|<p>explain how works HashMap can be implemented and can handle collisions</p><p></p>||
|Algo & Data Strucctures|<p>Tree, Graph, simple greedy, and divide and conquer algorithms</p><p></p>||
|Algo & Data Structures|<p>DFS, BFS. Iunderstand the relevance of the choosing algorithm</p><p></p>||
|Algo & Data Structures|Priority queues and ways to implement them||
|Algo & Data Structures|<p>Dynamic programming.</p><p></p>||
|Algo & Data Structures|<p>Medium level LeetCode task (like #53. Maximum Subarray) in optimal way</p><p></p>||
|Concurrency & Parallelism|<p>Atomic/volatile/synchronized</p><p></p>|OK|
|Concurrency & Parallelism|Future vs IO monad|OK|
|Concurrency & Parallelism|Fork-join pool|OK|
|Concurrency & Parallelism|Optimistic lock, pessimiistic lock, monitor and semaphore|OK|
|Software Design|<p>SOLID principles, DRY, YAGNI, KISS</p><p></p>|OK|
|Software Design|<p>OOP principles:</p><p>Abstraction</p><p>Incapsulation</p><p>Inheritance</p><p>Polymorphism</p><p></p>||
|Software Design|<p>Low coupling and High Cohension</p><p></p>||
|Software Design|<p>GoF patterns</p><p></p>||
|Software Design|<p>composition over inheritance</p><p></p>||
|Software Design|<p>GRASP patterns</p><p></p>||
|Software Design|<p>approaches how to reduce dependencies across system components(hex architecture)</p><p></p>|OK|
|Testing|<p>Test Levels: Unit, Contract, Component, Integration, System, Acceptance</p><p></p>|OK|
|Testing|<p>Test Types: Functional, Non-functional (performance, security, configuration, accessibility) and Change-related (confirmation, smoke, sanity, regression).</p><p></p><p></p>|OK|
|Testing|<p>Testing Pyramid strategy</p><p></p>|OK|
|Testing|<p>difference between mock, stub, etc.</p><p></p>|OK|
|Testing|TDD vs BDD|OK|
|CI/CD Practices|Blue/green, rolling update, canary, etc...||
|UML|<p>` `model complex system from different viewpoint in UML.</p><p></p>||
|JVM|<p>difference between JVM, JDK, JRE, and javac</p><p></p>|OK|
|JVM|<p>HEAP Run-Time Data Areas, Stack Frames, Garbage Collection approaches(Generational Hypothesis, Mark and Sweep, Stop the World). Know what is ByteCode,  JIT(AOT) compiler, ClassLoader.</p><p></p>|OK|
|JVM|<p>` `profiling of JVM application</p><p></p>||
|JVM|<p>different GC pros and cons(G1GC, ZGC, SerialGC, etc.)</p><p></p>|OK|
|Scala implicits|<p>implicit scope :</p><p></p><p>1\. local + inherited.</p><p>2\. imported.</p><p>3\. companion of a generic type + companion of a type parameter.</p><p></p>||
||||
|Scala implicits|Recursive implicit resolution|OK|
|Software Architecture|<p>architecture patterns: Layer based (Abstraction layers), Database-centric, Client-server, Component-based.</p><p></p>|OK|
|Software Architecture|Architecture vs design||
|Software Architecture|Monolitic vs modular architectures||
|Software Architecture|<p>microservices aspects, isolation, autonomy, data ownership, stateless vs stateful difference etc.</p><p></p>||
|Software Architecture|<p>Architecture patterns: Event-driven, Pipes and Filters, Rule based, Shared Nothing, n-tier, DAL.</p><p></p>||
# <a name="__refheading___toc7483_276329720"></a>**Scala OOP Components**

1. ## <a name="__refheading___toc7485_276329720"></a>**Abstract class and trait**

   `	  `- Traits support multiple inheritance: can inherit from multiple traits

   `	  `- Traits mixin: you can mix in multiple traits in a class

   `	  `- abstract classes can have constructor with parameters. Traits have no constructor

	  

   `		  `trait <--> behavior

   `		  `class <--> thing

   ## <a name="__refheading___toc7487_276329720"></a>**override vs overload**
		

   `	  `- **override**: Provide new implementation for a method that is already defined in a 			         superclass or trait

   `	 `- **overload**: Define multiple methods with the same name but different parameter list

   ` 	 `- **overwrite**: When shadowing happens

	
1. ## <a name="__refheading___toc7489_276329720"></a>**Access modifiers**

   `	`- **private**: accessible only within the class or object where it is defined. Cannot be accessed 	in subclasses.

   `		 `Purpose: restrict access to internal implementation details that should not be exposed

	             

   `	`- **protected**: accessible inside the class or object and its subclasses. Not accessible from 		             other classes or objects in the same package.

   `	  	       `Purpose: allow member access in subclasses.

	  

   `	`- **public**: accessible from anywhere. It is the default.

   `	  	    `Purpose: allow access from any context

	 	       	

   `	`- **packages**: Organize and structure code

   `		  `Hierarchical grouping of classes forming a namespace

		  

   `	`- **package object**: Can contain variables, functions and type definitions that will be available 		                  everywhere in the package.

   `		  `Each package can have at most one package object.

		  

   `		`**package** **object** **utilities** {

   `		  	`**def** greet(): **String** = "Hello from utilities!"

   `  			`**val** defaultGreeting = "Hi!"

   `		  `}

	

   `	`**- package level privat**e: Method is accesible inside the specified package and its derived 			                   packages

		

   `			`**class** **Example**{

   `				`**private**[example] **def** aMethod()

   `			`}

			

   `	`- **package level protected**: Method is accessible from inside the package and derived packages and the derived subclasses of its class.

	

   `		`Once compiled, the class files are placed in a directory structure that mirrors the package hierarchy

	

   `	`It's a good practice that folder structure containing source file matches the package hierarchy and the namespace structure	


1. ## <a name="__refheading___toc7491_276329720"></a>**Self type annotation**

   `	`Indicates that a trait (or class) have to be mixed in together. So from trait A you can use trait B methods if

   `	`**trait** **A** { self: **B** => }

   `	`Is better to use self type annotation vs inheritance if types has nothing in common. self type annotation defines more flexible relation than inheritance.

   ## <a name="__refheading___toc7493_276329720"></a>**Diamond problem**

   Related to multiple inheritance. When a class inherits from two classes that have a common base class forming a diamond class diagram


   `	     `A

   `	    `/  \	

   `              `B   C

   `               `\   /

   `                `D

	

   `	 `If B and C overrides a method from A there's an ambiguity in D about which method it will inherit.

	
   ### <a name="__refheading___toc7495_276329720"></a>	 **Linearization**

   `	`A process to determine the method resolution order.

   `	                `Scala linearization takes into account the Mix-in order.

   `	                `In the example, if D extends B with C the linearization of class D will be D -> C -> B -> A. Thus D will use me method defined in C.

   `	 `The method from the trait that appears first in the linearization order will be used.

	

   `	 `In other words, scala will use the method of the last trait mixed in

	

   `	 `D extends B with C the linearization of class D will be D -> C -> B -> A

   `	 `if method calls super.method(), super will refer to the next element of the linearization  

	

   `	 `This can be used to implement Chain of Responsability design pattern:

   `	 	`Create one BaseTrait with handleMethod and several Handlers deriving from it

   `	 	`class Chain extends Handle3 with Handle2 with Handle1

	 	

   `	 	`then the chain of responsability will be Handle1 -> Handle2 -> Handle3

	 	

   `	 	`Each handle can pass responsability to the next by calling super.handleMethod()





1. ## <a name="__refheading___toc7497_276329720"></a>**Sealed trait**
   `	`Indicates that all subclasses must be defined in the same file.

   ` 	      `This restriction allows the scala compiler to be aware of all possible subclasses of the trait.

   ` 	      `1- allows exhaustivity of a pattern matching to be checked at compile time

   ` 	      `2- allows definition of Union type (or of types) ADT (Algebraic Data Types) 	

   ` 	      `3- domain model: specify a limited amount of subtypes

   **Inner classes**: Defined within another element. Defines scope of implementation detail.	


   ` 	`- Member inner classes: defined inside the body of another class. Can be instanciated from outside. Can access outer's members

   ` 		`Inner class needs an instance of outer's class to be instanciated.

   ` 		`Inner class is created in the context of an outer's class instance.

   ` 	`- Local classes: defined inside a method

   ` 	`- Anonymous class: new Trait{ //implementing trait method }

   ` 	`- Nested classes: Inner class do not need and instance of the outer class to be instanciated

   ` 		`Encapsulates relationship between classes i.e: Student only exist in the context of School

 	

 	

   ` 	`Ex: class Graph with inner classes Node and Edge

   ` 		`- Encapsulation: Node and Edge are an implementation detail we don't want to expose.

   - Tightly coupling: Put all related elements together. Node and Edge only makes sense in the context of Graph



1. ## <a name="__refheading___toc7499_276329720"></a>**SAM: Single Abstract Method**
   `	`Scala allows you to use lambda expressions to implement SAM traits

   `	`SAM facilitates functional programming by allowing single method traits to be treated as functional interfaces


1. ## <a name="__refheading___toc7501_276329720"></a>**private[this]**
   [this] puts the name of the class

   `    `Object private variable

   `	`- companion object doesn't have access to the variable/method

   ` 	`- Only the current instance of the class can access this member

 	

   `	`**class** **A** {

   `		`**private**[this] **val** t = 1

   `		`**val** tt = **new** **A**().t *//Does not compile*

   `	`}
   # <a name="__refheading___toc7503_276329720"></a>**Scala type system**

1. ## <a name="__refheading___toc7505_276329720"></a>**Value type**
   scala primitive types that hold their value directly, not as a reference. i.e: Int Boolean, Byte, Char, etc..

   ` 	`Efficient in tesms of memory and performance.

   ` 	`Stored directly on the stack or as part of an object.

 	

 
1. ## <a name="__refheading___toc7507_276329720"></a>**Reference type**
   Used to refer objects in memory.

   ` 	`String, List[T], user defined classes such are Person, Car, etc...

   ` 	`Are Heap allocated and variables hold references to the heap memory.

 	

1. ## <a name="__refheading___toc7509_276329720"></a>**Value classes**

   Inherits from AnyVal.

   `      `Designed to provide a way to create lightweight wrappers for classes without incurring to overhead of creating heap allocations

   `      `They must have single parameter	

   `      `The parameter must be a value type, not a reference type.

   `      `If used in pattern matching (and others) you will have a heap allocation.

   Alternative in Scala3 using opaque types. 	


   `                 	        `Any

   `                            `/           \

   `                 `AnyVal	     AnyRef

   `                `/	                       \

   Int Short...Boolean Unit   List Option ... Your class

   `               `\                           \	        /           /

   `	    `\                            \        /  ......   /

   `                 `\                            Null

   `                  `\                             /

   `	             `Nothing

1. ## <a name="__refheading___toc7511_276329720"></a>  **Nothing**
   `	`Bottom type if a subtype of every other type in the hierarchy. No value has type Nothing

   `           `A common use is to signal non-termination like throwing exception or infinite loop

           
1. ## <a name="__refheading___toc7513_276329720"></a>  **Null**
   `	`Subtype of all reference type. The type has only one possible value: null.

   `        `Used for interoperability with other JVM languages but should not be used in scala code.     

   `        `Represents a missing object reference.      

        
1. ## <a name="__refheading___toc7515_276329720"></a>  **Unit**

   `        `Indicates no meaningful value.

   `        `Used as return value in methods where the primary purpose of it is to produce side effects

   `        `Like Null it has only one possible value called unit


















1. ## <a name="__refheading___toc7537_276329720"></a>**Type erasure**

   `	`In the JVM, generic type information is not preserved at runtime.

   `	`Type parameters used in generic types are erased and replaced with their bounds or default type (Object) during compilation.

   `	`Resulting Bytecode does not include generic type information.

   `	`This simplifies the runtime but affects type information.

   `	`Type safety is preserved at compile time but not at runtime.

	

   `	`Reason for this is backward compatibility. Code with generics can run in older JVM that not support it.

	

   `	`**Limitations**:

   - cannot check the type of a generic type parameter at runtime. isnstanceOf checks involving generics will not work as expected
1.
1. ## <a name="__refheading___toc7517_276329720"></a>**Type bounds and type variance**

   Function F : A => B

   Return type is a covariant position because F' : A => B' is subtype  of F if B' subtype of B

   Parameter type is contravariant porition because F': A' => B is subtype of F is A' supertype of A

   Orange => Animal      Animal

   `      `^			 ^	

   `      `|			 |

   Orange => Cat           Cat


   Orange => Animal         Fruit

   `       `^		                  ^

   `       `|		                   |

   Fruit => Orange          Orange

   1. ### <a name="__refheading___toc7519_276329720"></a>**Covariance**

      `	   `**trait** **Lista**[+**A**]{ *//List is covariant with type A <: B then List[A] <: List[B]*

      `	     `**def** --[**B** >:**A** ](e: **B**): **Lista**[**B**] = **Cons**(e, this)

      `	   `}

      `	   `**case** **class** **Cons**[**T**](head: **T**, tail: **Lista**[**T**]) **extends** **Lista**[**T**]

      `	   `**case** **object** **Fin** **extends** **Lista**[**Nothing**]

      `	  `**object** **Lista**{

      `	    `**implicit** **def** cnv[**T**](v: **T**): **Lista**[**T**] = **Cons**(v, **Fin**)

      `	  `}	

      **A return type is in a covariant position**: If you ask me for a bag of fruits (List[Fruit]), I can give you a bag of apples because what I expected is the result to have the property I can extract fruits out of it, and so can I with a bag of apples.

      If new treat a List[Cats] as List[Animal] in  runtime, types make sense when I extract objects from the list because I will get Cats’s which I can treat like generic Animal’s. But if I try to call add method on my list of Animals, it receives Animal as a parameter so I could accept Dogs as well so I would have a list of mixed Cats and Dogs in run time, breaking type consistency.

      A read only list can be covariant.


   1. ### <a name="__refheading___toc7521_276329720"></a>**Contravariance**

      `	`**trait** **Animal**

      `	  `**case** **class** **Cat**(name: **String**) **extends** **Animal**{

      `	    `**override** **def** toString: **String** = name

      `	  `}


      `	  `**trait** **Printer**[-**T** <: **Animal**]{

      `	    `**def** print(a: **T**): **Unit**

      `	  `}

      `	  `**def** pprint(printer: **Printer**[**Cat**], cat: **Cat**): **Unit** = printer.print(cat)

      `	  `**val** animalPrinter = **new** **Printer**[**Animal**] {

      `	    `**override** **def** print(a: **Animal**): **Unit** = println(s"Animal " + a)

      `	  `}

      `	  `**val** catPrinter = **new** **Printer**[**Cat**] {

      `	    `**override** **def** print(a: **Cat**): **Unit** = println(s"Cat " + a)

      `	  `}

      `	  `pprint(animalPrinted, **Cat**("piula")) *// so Printer[Animal] is subclass of Printer[Cat]*


      If you ask me for a machine that can make orange juice out of oranges and I give you a machine that can make juice out of any kind of fruit, it will work.

      **Function argument is a contravariant position**: So a method expecting a Juicer[Orange] can accept a Juicer[Fruit] means Juicer[Fruit] is a subtype of Juicer[Orange], even though Orange is a subtype of Fruit.    


      ![](data:image/png;base64,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4rYn9/nnnzNhwgTv3w0bNuTOO++sNs3IkSP5+OOPeeWVV2jSpEm1sy7T0tLYsGED8+bN83mWU7C6dOnCkiVLeP/991m4cCEpKSnVdm1WSklJwePxUFBQQH5+PhdccEHIny2SiEpLS1m8eDFDhgwhKyuLPXv2eM8g7NKlCwCTJk3iqquu4u233wY4qk6eeOKJ9OjRg7feeos+ffqwcOFCpkyZwqJFi7jkkktISUlh1qxZtGvXjpdffplt27bx4Ycf1lq2pKQknnjiCX7729/Ss2dPfv3rX7N//37efPNNGjVq5Pfyhf379wOwe/duFi5cyMcffww44Zibm4vH4+GJJ54gOTmZp556qtr3OOWUU1iwYAGDBg1i+fLlvPfee8yYMcMbjvEscqfI1IPKsyuPHFJSUsys+tmVW7dutQEDBljjxo0tPT3devfubWvWrDEzs1dffdUyMjKsXbt2tmHDhqDOrqx6tmSlTz75xI4//njLzMy0J5980nr06OGd/8jpb7rpJmvUqJENGDDAzGLvzKdgoLMrY1WkV51aHThwwK6//npr2rSpZWVl2TXXXGP79u0zM7NDhw7ZsGHDrFGjRnb22Wfb5MmTDbCPPvroqLMrN27caP369bOMjAxr06aNvfHGG97PmD9/vnXv3t1SU1PtlFNOscWLF5vZ0XV6586dR7UhZmZz5861s846y1JTUy0rK8sGDhxoq1ev9r5/5HIOHDhgl156qaWmptp5551nn3/+ubVp08aaNWtmZmZPPvmkNWvWzNq2bWtPP/20Afbwww+bmdn69estNzfX0tPTrU2bNjZp0iTv58RaG0OQ7Uakyxv1/K2g4RJrK2Awgl1ZJWpEetWJKeFqQ3788UfbvXu3mZmtWLHCAHv++edrnS/W2hh0CUH9+P7771mxYgWHDh0K22cWFhaydu3asH2eiNSf+mxDduzYQfPmzRkwYADLli1j/PjxNGzYkIsuuqjG+RKhjYl0KEe9yq2wyqG4uDhsn1314vBY2coKBurJxapIrzoxJVxtyDvvvGOdO3e21NRU69atm73zzju1zhOLbQxBtBueipW1XmqBSG08Hg8466HEFrUbEjHBtBvaXSkiInFLISciInFLISciInFLISciInGrYVpa2naPx9My0gWRxJSWlra9pKQk0sWQIKndkEgKtt3QKVISSVr/YpN+N4kk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p3rjAoVcaBRygVFPTiR48Vhvwn6dHM2bN/97xYdq0BD2oWL9kzil9kVDJIfmzZv/3QOYmSFSX6ZPn85f/vIXXnvttaPe83g84GzdSXxS+yJef//737nhhhv48ssvw/J5Ho9Huyul/qWkpFBaWhrpYohIAlLISb1LTk7m4MGDkS6GiCQghZzUO/XkRCRSFHJS79STE5FIUchJvVPIiQiAmVWebBY2Cjmpd9pdKSKRopCTeqeenIhESkyGXEZGBr169fL53osvvojH42HZsmW1Luell17i66+/BuDWW2/F4/Hg8XgYOXIkADt37mTEiBEcd9xxJCcn07FjR/7v//4vahrs77//3ltmj8fDrl27Il0kn9STk1g0evRob93q1KlTrdOvX78ej8fDY4895loZdu3aVa2Ob9++nYyMjGrjKoeNGzcGvfwj28vFixezYMECADp16uRd9pw5c1z7TuHWMNIFcFu/fv2YPXs23bp1q3G6vXv3MmrUKN566y1OOukkABo0aMCyZcvIzs5m//799O7dm6+//pqBAwdy0kknsWTJEsaOHcvatWt59913j1pmeXk5SUnh22449thjKSgo4M0332TKlClh+9xgqScnsah///5kZGQwfvz4gKZv3bo1s2fP5uSTT3atDOXlzl0D8/LyuPbaa2nWrBkAxx9/PLfddlu1aZs3b+5z/prapCPbywceeIBevXpxySWXMGfOHFatWsWNN97o1teJGIs16enpds455/h874UXXjDA8vPzzcxs/Pjx1rZtW0tNTbUzzjjD8vPzbevWrdVu/XLffffZqFGjrEGDBt7lPPfccwbYgw8+6B13+PBh69u3rwG2bNkyW716tQH20EMPWadOnWzs2LF26NAhGzVqlDVr1swyMzPt6quvtgMHDpiZWVZWlv3mN7+xW2+91dLT0+3UU0+1b775xszMDh06ZHl5edakSRM7+eST7bHHHjPAFi1aZGZmCxcutFNPPdVSU1Pt3HPPtY0bN3rLNW7cOANs586d7v5Du2Tz5s3Wrl07n+9V/AYSv8K7stWDdu3aWceOHc3MbMyYMQZYUVGRmf3c3ixZssTWrVtngI0dO9bMnPX+4osvtiZNmli7du1s6tSp3mX6q8/PPPOMAfbss89aZmamzZ8/v9oyzWpu/46cPz8/3wAbPny4d5rs7GzLycmpVv78/Hzr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)

















1. ## <a name="__refheading___toc7523_276329720"></a>**Structural types and disadvantages in scala 2**

   **	Allows to define types based on the methods and fields they contain rather than their exact class or trait hierarchy.

	

   `	`Method can receive any type that has quack method defined:

	

   `		`**def** makeItQuack(duck: { **def** quack(): **Unit** }): **Unit** = {

   `		  `duck.quack()

   `		`}

   `	`- Enables AdHoc polimorfism: polymorfism without requiring a common supper class

   `	`- Enables interoperatibility withdynamically typed languages

	

   `	`- Often implemented using reflection to check at runtime if object has the desired method

   `	     `--> Performance penalty

   `	`- Less Explicit contracts than traits or classes

   `	`- Can lead to hard to understand code

1. ## <a name="__refheading___toc7525_276329720"></a>**Abstract types**

   ` 	`Abstract type: They are path dependant types.

   ` 	     `Define type member without specifying concrete type

   ` 	     `Defined in a base trait (can have type bounds). Type gets value in derived classes

   ` 		`**trait** **Food**

   ` 		`**class** **Grass** extands **Food**

   ` 		`**class** **Meat** **extends** **Food**

 		

   ` 		`**trait** **Animal** {

   ` 		 	`**type** **SuitableFood** <: **Food**

   ` 		 	`**def** eat(f: **SuitableFood**): **Unit**

   ` 		`}

 		

   ` 		`**class** **Cow** **extends** **Animal**{

   ` 		 	`**type** **SuitableFood** = **Grass**

   ` 		 	`**def** eat(f: **Grass**) : **Unit** = ??? 	

   ` 		`}

 		

   ` 	    `- Abstract common logic with types that are not known beforehand

   ` 	   `Similar than type parameters but more useful when complex type hierarchies



1. ## <a name="__refheading___toc7527_276329720"></a>**Path dependant types**
	

   `	`A type whose definition depends on a value.

   `	`Parent of all Instance dependant types

	

   `	`**class** **Outer** {

   `	   `**class** **Inner**

   `	`}

	

   `	`**val** outerA = **new** **Outer**

   `	`**val** outerB = **new** **Outer**

	

   `	`**val** innerA: outerA.**Inner** = **new** outerA.**Inner**

   `	`**val** innerB: outerB.**Inner** = **new** outerB.**Inner**

	

   `	`The base class of all instance dependent types (outerA.Inner and outerB.Inner)

   `	`is a path dependant type Outer#Inner

	

   `	`**class** **Outer** {

   `	   `**class** **Inner**

   `	   `**def** process(inner: **Inner**): **Unit** = ???

   `	   `**def** processgeneral(inner: **Outer**#**Inner**): **Unit** *// Can receive outerA.Inner and outerB.Inner*	

   `	`}

	

   `	`outerA.process(innerA) *//correct*

   `	`outerA.process(innerB) *// incorrect, type mismatch*

   `	`outerA.processGeneral(innerA) *// correct because innerA is instance of Outer#Inner*

   `	`outerA.processGeneral(innerB) *// correct because innerB is instance of Outer#Inner*

	

	

   `	`- type-cheching and type inference. e.g Akka streams Flow[Int,Int, NotUsed]#Repr

   `	`- Type lambdas scala 2. { type T[A] = List[A] }#T

   `	               `scala 3 [A] =>> List[A]

   `	`- type-level programming use-case

	

   Abstract types

1. ## <a name="__refheading___toc7529_276329720"></a>**Type variables**

   Type aliases

   `	`**type** **F**[**A**] = **SomeClass**[**A**]

	

	

   `	`**SomeClass**("hello"): **F**[**String**]

   `	`**SomeClass**(1: **Int**): **F**[**Int**]

   `	`**SomeClass**(**true**): **F**[**Boolean**]

   `	`**SomeClass**("hello"): **F**[**Int**] *// does not compile*

   Type aliases which takes parameters

   **type** **T**[**A**] = **Option**[**Map**[**Int**, **A**]]

   **val** t: **T**[**String**] = **Some**(**Map**(1 -> "abc", 2 -> "xyz"))

   Sometimes type aliases are used as a convenience to keep code clean but some times they are necessary:

   **trait** **Functor**[**F**[\_]]

   **type** **F1** = **Functor**[**Option**] *// OK*

   **type** **F2** = **Functor**[**List**]   *// OK*

   **type** **F3** = **Functor**[**Map**]    *// !!*

   **type** **IntKeyMap**[**A**] = **Map**[**Int**, **A**]

   **type** **F3** = **Functor**[**IntKeyMap**] *// OK*

   However, partial application does not work for type constructors:

   **type** **F4** = **Functor**[**Map**[**Int**, \_]]

   *// error: Map[Int, \_] takes no type parameters, expected: one*

   In this case \_ implies no partial application at all, but rather “I don’t care what this type is”. This is known as an *existential type*.

   This lack of scala syntax for partially applied type constructors can be resolved with a type lambda:

   ({ **type** **T**[**A**] = **Map**[**Int**, **A**] })#**T**

   Structural type definition:

   { **type** **T**[**A**] = **Map**[**Int**, **A**] }

   Type projecttion: #**T**

   So it can be used like

   <a name="__ddelink__30653_252999171"></a>**type** **F5** = **Functor**[({ **type** **T**[**A**] = **Map**[**Int**, **A**] })#**T**] *// OK*

   so its similar to **type** **IntKeyMap**[**A**] = **Map**[**Int**, **A**]

   To have cleaner code, it's recomended to use type alias instead of type lambda. However, type lambda is the only alternative in some specific cases.

   Composing types of different kinds:

   **trait** **MyFunctor**[**F**[\_]]{
   `  `**def** map[**A**,**B**](a: **F**[**A**])(f: **A** => **B**): **F**[**B**]
   }

   **type** **EitherFunctor**[**L**] = **MyFunctor**[({**type** **T**[**A**] = **Either**[**L**, **A**]})#**T**]

   **val** a: **EitherFunctor**[**String**] = **new** **EitherFunctor**[**String**] {
   `  `**override** **def** map[**A**, **B**](a: **Either**[**String**, **A**])(f: **A** => **B**): **Either**[**String**, **B**] = ???
   }
   *//this is not partially application of types. It is "I don`t care abaout t¡his type at all" existencial types*
   **type** **EFAlias**[**B**] = **MyFunctor**[**Either**[**B**,\_]]


   Playing with type lambdas:

   **type** **IntMap** = ({ **type** **T**[**A**] = **Map**[**Int**, **A**]})#**T** *//IntMap this is a type constructor*

   **type** **MapIntString** = **IntMap**[**String**]

   <a name="__ddelink__30660_252999171"></a>**type** **BaseMap**[**K**] = ({ **type** **T**[**V**] = **Map**[**K**, **V**]})#**T** *//BaseMap[K][V] = Map[K,V], so is a curried type constructor*

   <a name="__ddelink__30662_252999171"></a>**type** **IntMap2** = **BaseMap**[**Int**]

   **type** **MapIntDouble** = **IntMap**[**Double**]

   **type** **MapIntString2** = **BaseMap**[**Int**][**String**] *// same as Map[Int, String], so is a curried type constructor*


   **type** **BaseMap2**[**K**] = ({ **type** **T**[**V**] = **Map**[**K**, **V**]})#**T**

   **type** **BaseMapInt** =  ({ **type** **T**[**V**] = **Map**[**Int**, **V**]})#**T**       *//BaseMapInt[V] = Map[Int, V]*
   **type** **BaseMapString** =  ({ **type** **T**[**V**] = **Map**[**String**, **V**]})#**T** *//BaseMapInt[V] = Map[String, V]*

   **type** **BaseMap3**[**V**] = ({ **type** **T**[**V**] = **Map**[**Int**, **V**]})#**T**[**V**] *//This returns concrete type, not type constructor this is equivalent to Map[Int, V]*



1. ## <a name="__refheading___toc7531_276329720"></a>**Existencial types**

   `	`Existential types are a way of abstracting over types. They let you “acknowledge” that there is a type involved without specifying exactly what it is, usually because you don’t know what it is and you don’t need that knowledge in the current context.

   `	`**type** **F** = **SomeClass**[**A**] forSome { **type** **A** } *// `A` appears only on the right, existential case*

   `	`*// type F will not change regardless of what A is.*

	

   `	`If A is only at the left => phantom type

      

   `	`**def** processContainer(c: **Container**[\_ <: **Animal**]): **Unit** = {

   `	  `println(s"Processing container with item: **${**c.item**}**")

   `	`}	

	

	

   `	`**def** processContainer(c: **Container**[**T**] forSome { **type** **T** <: **Animal** }): **Unit** = {

   `	  `println(s"Processing container with item: **${**c.item**}**")

   `	`}

   `	`*// you don't need to know or use the exact type of the item inside the container*

   `	`vs

   `	`**def** processContainer[**T** <: **Animal**](c: **Container**[**T**])

   `	`*// type T is infered and can be used inside the method*

   `	`-----------------------------------------------------------------------

   `	`<a name="__ddelink__15258_1974857902"></a>**sealed** **trait** **Existential** {

   `	  `**type** **Inner**

   `	  `**val** value: **Inner**

   `	`}

   `	`<a name="__ddelink__15260_1974857902"></a>final case class MkEx[A](value: A) extends Existential { type Inner = A }

	

   `	`**MkEx**(“hello”): **Existential**

   `	`**MkEx**(1: **Int**): **Existential**

   `	`**MkEx**(user): **Existential**

	

   `	`We could think of MkEx as a type eraser: it doesn't matter what type of data we choose to put into MkEx, it will erase the type and always return Existential.

	

   `	`val ex: Existential = getSomeExistential(…)

   `	`ex.value: ???

	

   `	`The original type defined in MkEx has been erased from compilation but we know it still exists as ex.Inner (EXISTENCIAL)

	

   `	`**Existencial types have the interesting property of unifying different types into a single one with shared restrictions**. Like

   `	`These restrictions could be anything: from upper bounds to type classes or even a combination.


   Example creating heterogeneous List whose elements has some restrictions:

	

   *//type class to be implemented by elements in List*
   **trait** **CustomSerializable**[**T**]{
   `  `**def** toJson(a: **T**): **String**
   }
   **implicit** **val** intJson: **CustomSerializable**[**Int**] = **new** **CustomSerializable**[**Int**] {
   `  `**override** **def** toJson(a: **Int**): **String** = s"""integer: **$**a"""
   }

   **implicit** **val** stringJson: **CustomSerializable**[**String**] = **new** **CustomSerializable**[**String**] {
   `  `**override** **def** toJson(a: **String**): **String** = s"""string: **$**a"""
   }

   **implicit** **val** doubleJson: **CustomSerializable**[**Double**] = **new** **CustomSerializable**[**Double**] {
   `  `**override** **def** toJson(a: **Double**): **String** = s"""double: **$**a"""
   }

   **implicit** **val** bigDecimalJson: **CustomSerializable**[**BigDecimal**] = **new** **CustomSerializable**[**BigDecimal**] {
   `  `**override** **def** toJson(a: **BigDecimal**): **String** = s"""BigDecimal: **$**a"""
   }


   *// Encapsulates the underlying type of each list element and its type class instance*
   **sealed** **trait** **ElementType** {
   `  `**type** **Inner**           *// Existential type: we know it exist but is not accessible* 
   `  `**val** value : **Inner**    *// Hold the value of that type*
   `  `**val** evidence : **CustomSerializable**[**Inner**] *// Holds instance of type class implementation for inner type*
   }

   *//Acts as type erasure for type A. It always gets type ElementType as result.*  
   **final** **case** **class** **MakeElementType**[**A**](value: **A**)(**implicit** e: **CustomSerializable**[**A**]) **extends** **ElementType** { 
   `  `**type** **Inner** = **A** 
   `  `**val** evidence = e
   }


   *//Build instance of Allowed type for any type of type class CustomSerializable*
   **implicit** **def** buildElementType[**A**](a: **A**)(**implicit** e: **CustomSerializable**[**A**]): **ElementType** = **MakeElementType**(a)


   *// We create heterogeneous list of different types but we don't see them. All we see is  Seq[ElementType]
   // However types are there and appropriate type class instance will be called according to the underlying type*
   **val** list: **Seq**[**ElementType**] = **List**(1, "two", 2.34, **BigDecimal**(0))


   **def** doSomething(l: **Seq**[**ElementType**] ): **Seq**[**String**] =
   `  `l.map{ e=> e.evidence.toJson(e.value) }

   doSomething(list)

   *//this would only work with list of elements of the same type*
   **def** doSomethingElse[**A**](l: **List**[**A**])(**implicit** e: **CustomSerializable**[**A**]): **Seq**[**String**] =
   `  `l.map( element => e.toJson(element))



   `	`https://dzone.com/articles/existential-types-in-scala

   `	`<https://pjrt.medium.com/existential-types-in-scala-6321f19c4a57>


1. ## <a name="__refheading___toc7533_276329720"></a>**Singleton type and literal singleton**

   `	`Singleton Type vs Literal Types

	

   `	`Singleton Types:

	

   `	        `MyObject.type A type that has one single instance, the object itself.

		

   `		`**object** **MyObject** {

		

   `		`}

		

   `		`**MyObject**.**isInstanceOf**[**Any**] == **true**

   `		`**MyObject**.**isInstanceOf**[**AnyRef**] == **true**

		

   `		`**MyObject**.**isInstanceOf**[**MyObject**.**type**] === **true**

		

   `	`Literal based singleton types: number 42 has its singleton type

	

   `		`**import** **shapeless**.\_

   `		`**def** only42(x: **Witness**.`42`.**T**) = x

		

   `		`only42(42) *// OK*

   `		`only42(99) *// compile error*

		

   `		`*// in scala 2.13*

   `		`**def** only42(x: 42) = x *// achieve the same than above*

		

   `	`Singleton upper bond:

	

   `		`**case** **class** **Wide**[**T**](t: **T**)

   `		`**val** l: **Wide**[**Int**] = **Wide**(42)

		

   `		`**case** **class** **Narrow**[**T** <: **Singleton**](t: **T**)

   `		`**val** l: **Narrow**[42] = **Narrow**(42)

		

   `		`Ex: def onlyLiteralStrings[T <: String with Singleton](t: T) = t // function that accepts only literal strings, no runtime values

		

   `		  `**val** some = "deVariable"     

   `		  `**var** other = "deVariable"

   `		  `onlyLiteralStrings("hola")  *// OK*

   `		  `onlyLiteralStrings(some)     *// OK*

   `		  `onlyLiteralStrings(other)    *// compile error*

		  

   `	`Inferring values from type: Jump from the type level to value level

   `		`**val** v: 42 = valueOf[42]

  			

   `  	`Use case:

   - Refinements Types


   <a name="__ddelink__30669_252999171"></a>**class** **Builder** {

   `	`**def** withVal1(): this.**type**

   `	`**def** withVal2(): this.**type**

   }

   builder.withVal1(...).withVal1(....)

   It prevents to return new instance of builder in withValN


1. ## <a name="__refheading___toc8453_2607706102"></a>**Type evidences**

   A way to provide additional checks on types in compile time. They are implemented using implicit parameters so the compiler has to resolve the implicit so find an evidence regarding that type

   Use cases:

   - Provide relation between types

   - Constraining generic types

   - Providing type class instances

   <:< Subtype evidence:

   **def** foo[**A**, **B**](a: **A**)(**implicit** ev: **A** <:< **B**): **B** = a

   =:= Equality evidence: A =:= B, A has the same type as B

   **Context bounds**: Syntactic sugar for type evidences

   **def** show[**T**: **Show**](value: **T**): **String** = implicitly[**Show**[**T**]].show(value)

   Requires implicit value of type Show[T]. implicitly is used to summon the evidence.

   Used with Phantom types to model state transitions. Phantom types: types that do not correspond to the data but to the state of an object:

   *// Phantom types representing the different states of an order*

   **sealed** **trait** **Draft**

   **sealed** **trait** **Confirmed**

   **sealed** **trait** **Shipped**

   *// Order class with a phantom type to track its state*

   **class** **Order**[**S**] **private**(**val** id: **String**) {

   `  `*// Only orders in the Draft state can be confirmed*

   `  `**def** confirm(**implicit** ev: **S** =:= **Draft**): **Order**[**Confirmed**] = {

   `    `println(s"Order **$**id has been confirmed.")

   `    `**new** **Order**[**Confirmed**](id)

   `  `}

   `  `*// Only orders in the Confirmed state can be shipped*

   `  `**def** ship(**implicit** ev: **S** =:= **Confirmed**): **Order**[**Shipped**] = {

   `    `println(s"Order **$**id has been shipped.")

   `    `**new** **Order**[**Shipped**](id)

   `  `}

   }

   *// Companion object to create an order in the Draft state*

   **object** **Order** {

   `  `**def** create(id: **String**): **Order**[**Draft**] = **new** **Order**[**Draft**](id)

   }

   *// Example usage*

   **val** order = **Order**.create("12345")  *// Creates a new order in the Draft state*

   **val** confirmedOrder = order.confirm()  *// Order can be confirmed*

   **val** shippedOrder = confirmedOrder.ship()  *// Order can be shipped*

   *// The following would not compile:*

   *// order.ship() // ERROR: Can't ship an order that is still in the Draft state*

   *// shippedOrder.confirm() // ERROR: Can't confirm an order that has already been shipped*


1. ## <a name="__refheading___toc8406_2607706102"></a>**Higher kinded types**

   Types of second order.

   Just as types classify values, kinds classify types. Essentially the number and structure of type parameters.

   \*: Type that doesn’t take any parameters. Int, String, etc...

   \* → \*: a type constructor that takes one type argument and returns a concrete type. List, Option

   \* → \* → \*: A type constructor that takes two type arguments and returns a type when fully applied. Either

   Types that take other types as type parameters.

   They allow you to write classes or traits that abstracts over type constructors:

   **trait** **Functor**[**F**[\_]] {

   `  `**def** map[**A**, **B**](fa: **F**[**A**])(f: **A** => **B**): **F**[**B**]

   }

   **F[\_]** is the higher kinded type, F is the type constructor that takes a single type argument.

   Useful to define generic abstractions like Functor, Monad, Applicative, etc...

   ## <a name="__refheading___toc7535_276329720"></a>**F-bound polymorfism**

   Technique in type systems to express that a type must be a subtype of some type that depends on itself. Used to indicate restrictions regarding a subtype.

   `	`Ensure a certain animal breeds animals of the same kind:

   `	`**trait** **Animal**[**A** <: **Animal**[**A**]]{ self => *// F-Bounded polymorfism with self type*

   `		`**def** breed: **List**[**Animal**[**A**]]

   `	`}

	

   `	`**class** **Cat** **extends** **Animal**[**Cat**] {

   `		`**override** **def** breed: **List**[**Animal**[**Cat**]]

   `	`}

	

   `	`*// self type in trait animal will make the following to not compile*

   `	`**class** **Crocodile** **extends** **Animal**[**Cat**]{  

   `		`**override** **def** breed: **List**[**Animal**[**Cat**]]	

   `	`}

	

   `	`// LIMITATION OF F-BOUNDED POLIMIRFISM: Once we go one level deeper in the class hierarchy

   `	`// F-boud polymorfism stops being effective

   `	`**trait** **Fish** **extends** **Animal**[**Fish**]

   `	`**class** **Shark** **extends** **Fish** {

   `		`**override** **def** breed: **List**[**Animal**[**Fish**]] = **List**(**new** **Cod**)

   `	`}

	

   `	`**class** **Cod** **extends** **Fish**


   **Corecursion**

- **Recursion** consumes input and reduces the problem until it terminates.
- **Corecursion** generates output, possibly indefinitely, by expanding or unfolding.

*// A simple Stream definition*

**sealed** **trait** **Stream**[+**A**]

**case** **object** **Empty** **extends** **Stream**[**Nothing**]

**case** **class** **Cons**[**A**](head: **A**, tail: () => **Stream**[**A**]) **extends** **Stream**[**A**]

**object** **Stream** {

`  `*// Corecursive definition of an infinite stream of natural numbers starting from `n`*

`  `**def** from(n: **Int**): **Stream**[**Int**] = **Cons**(n, () => from(n + 1))



`  `*// Helper function to take the first n elements from the stream*

`  `**def** take[**A**](stream: **Stream**[**A**], n: **Int**): **List**[**A**] = stream **match** {

`    `**case** **Empty** => **Nil**

`    `**case** **Cons**(h, t) **if** n > 0 => h :: take(t(), n - 1)

`    `**case** \_ => **Nil**

`  `}

}

*// Example usage*

**val** naturals = **Stream**.from(0)

**val** firstTen = **Stream**.take(naturals, 10)  *// Generates the first 10 natural numbers*

println(firstTen)  *// Output: List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)*

|**Aspect**|**Recursion**|**Corecursion**|
| :- | :- | :- |
|Focus|Consumes input|Produces output|
|Data Handling|Breaks down problem|Builds up solution|
|Termination|Usually finite and must terminate|Can be infinite (lazy evaluation)|
|Base Case|Needs a base case to stop|Continuously produces values|


1. # <a name="__refheading___toc22655_2675006907"></a>**ADT case class**

   1. ## <a name="__refheading___toc25083_2963167111"></a>**Added methods**   
      `   `- apply: Factory method.

      `   `- unapply: Extract method

      `   `- equals: Structural equality (not reference equality). Compare element by element

      `   `- hash code: It can have collisions

      `   `- copy: Create copies introducing modifications

      `   `- Product Methods: Inherited from Product. productAriry, productIterator, etc...

      - Serializable
   1. ## <a name="__refheading___toc25085_2963167111"></a>**Unnaply and unaplySeq**

      - unapply returns option:

      **class** **Person**(**val** name: **String**, **val** age: **Int**)

      **object** **Person**{
      `  `**def** apply(name: **String**, age: **Int**) = **new** **Person**(name, age)

      `  `**def** unapply(p: **Person**): **Option**[(**String**, **Int**)] =
      `    `**Some**(p.name, p.age)
      }


      - unapplySeq:

      **class** **Elements**(**val** a: **Int**\*)

      **object** **Elements** {
      `  `**def** apply(elements: **Int**\*):**Elements** = **new** **Elements**(elements :\_\*)
  
      `  `**def** unapplySeq(e: **Elements**): **Option**[**Seq**[**Int**]] = **Some**(e.a)
      }

      **Elements**(1,2,3,4,5) **match**{
      `  `**case** **Elements**(1,2) => println("Result: 2")
      `  `**case** **Elements**(1,2,3,4,5) => println("Result: 5")
      `  `**case** \_ => println("other")
      }




1. # <a name="__refheading___toc7568_276329720"></a>**Functional Programming**

   ## <a name="__refheading___toc7570_276329720"></a>**Tail recursion**

   Technique that allows to execute recursive function in stack save manner. @tailrec annotation in a function instructs the compiler to transform recursive calls to a foor loop so no stackoverflow will occur.

   Inside a recursive function we can find:

   - Base case: Case that stops recursion returning some kind of accumulated result

   - Recursive case: Case that performs recursive call (function call it self)

   Example of recursive function:

   **def** factorial(n: **Int**): **Int** = {

   `	`**if** (n == 0)  1 *// Base case*

   `	`**else** n \* factorial(n - 1) *// Recursive case*

   }

   For the compiler to perform this transformation, the recursive call must be the last call in the recursive case. To transform a recursive function to a tailrec recursive function, using a helper function with a accumulator is a common technique:

   import scala.annotation.tailrec

   **def** factorial(n: **Int**): **Int** = {

   `  `@tailrec

   `  `**def** loop(n: **Int**, acc: **Int**): **Int** = {

   `    `**if** (n == 0) acc

   `    `**else** loop(n - 1, n \* acc)  *// Tail recursion: the recursive call is the last operation*

   `  `}

   `  `loop(n, 1)  *// Start the accumulator with 1*

   }

   1. ## <a name="__refheading___toc7572_276329720"></a>**Closures**

      Refers to a inner function that retains access to variables from its outer scope. Even if the outer has finished executing.

      Closures provide a way to maintain state and encapsulate data similar than an object. Closures are more lightweight and provide a functional approach.

      ## <a name="__refheading___toc7574_276329720"></a>**Partial functions**

      Functions that are not defined for all input values.

      Useful to  write functions that handle specific cases decoupled from error handling for inputs for which the function is not defined.

      With *isDefinedAt* method you can check if function is defined for specific input.

      Multiple partial functions can be composed with *andThen* method.

   1. ## <a name="__refheading___toc7576_276329720"></a>**Referential transparency**

      Property of an expression that evaluates to a value thus the expression can be substituted for the value it evaluates to without changing the behavior of the program.

      This implies that the expression has no side effects.

      When the expression is a function call, we call this a pure function. That means that function has no side effects outside its scope. The only thing a pure function does it’s compute its output using its input.

   1. ## <a name="__refheading___toc7578_276329720"></a>**Functional Data Structures**

      Data structures that adhere to the functional programming principles of immutability and referential transparency.

      So no in place updates (mutations) are allowed in functional data structure. Instead a new data structure with desired changes is created keeping the original one without change.

      To create modified versions of functional data structures in a efficient way Structural Sharing technique is applied: Instead of copying the entire structure to create the new one, only the changed parts are created while unchanged ones remain unchanged and are shared between the old and the new version of the data structure.

      ![](data:image/png;base64,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)

      This is known to be a **Persistent Data Structure** because you can access all versions of the data structure vs Ephemeral Data Structures where only the last version is available.

   1. ## <a name="__refheading___toc7679_276329720"></a>**Currying**

      Technique to transform a function with multiple arguments to al chain of functions receiving only one parameter.

      **def** func(a: **Int**, b: **String**, c: **Double**): **Char** = ???
      **val** a: (**Int**, **String**, **Double**) => **Char** = func

      **val** g: **Int** => **String** => **Double** => **Char** = (func \_).curried

 

      Allows partially applied functions: Apply some arguments to the function and get as result a function waiting for the rest of the arguments.

      This enables the creation of specialized functions from more general ones. Good for function composability and reusability

      **def** multiply(x: **Int**)(y: **Int**): **Int** = x / y

      **val** ab: **Int** => **Int** => **Int** = multiply


      **val** multiplyBy10 = multiply(10)(\_)

      **val** result: **Int** = multiplyBy10(2)

      Real world example with High Order Functions:

      **def** filter[**A**](list: **List**[**A**], predicate: **A** => **Boolean**): **List**[**A**] = list.filter(predicate)

      **def** filter[**A**](predicate: **A** => **Boolean**)(list: **List**[**A**]): **List**[**A**] = list.filter(predicate)

      **val** isEven: **Int** => **Boolean** = \_ % 2 == 0

      **val** filterEven = filter(isEven) \_

      **val** numbers = **List**(1, 2, 3, 4, 5)

      println(filterEven(numbers)) *// Output: List(2, 4)*



   1. ## <a name="__refheading___toc7795_276329720"></a>**Corecursion & LazyList**

      Concept in Computer Science that is dual to recursion. While recursion breaks a calculation down to small steps and combines result of all steps, corecursion incrementally generates data or data structure. Example: generating streams

      **def** from(n: **Int**): **LazyList**[**Int**] = n #:: from(n + 1)

      **val** naturals = from(1)
      println(naturals.take(10).toList)  *// Output: List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)*


      More generic function:

      **def** unfold[**S**, **A**](z: **S**)(f: **S** => **Option**[(**A**, **S**)]): **LazyList**[**A**] = f(z) **match** {
      `  `**case** **Some**((a, s)) => a #:: unfold(s)(f)
      `  `**case** **None** => **LazyList**.empty[**A**]
      }


      Where S is type for state and f is a function that given the current state, optionally produces the next state and the next element. If f returns None the Stream/Lazylist stops.  


   1. ## <a name="__refheading___toc10913_1739821362"></a>**Polymorphism**

      Refers to the capability of a function, method or object to take on different forms according to different data types.


      **Add-hoc polymorphism**: A function or operator can take arguments of different types but different implementation is chosen based on the type of the arguments.

      Example: method overloading

      **class** **Example** {
      `  `**def** print(x: **Int**): **Unit** = {
      `    `**System**.out.println(x)
      `  `}

      `  `**def** print(x: **String**): **Unit** = {
      `    `**System**.out.println(x)
      `  `}
      }


      **Subtype polymorphism**: Inheritance and method overriding

      Often referred as runtime polymorphism. Occurs when subtype provide specific implementation of method that is defined in the superclass.


      **Parametric polymorphism:** Generics

      Ability of functions or classes to be written generically so they can uniformly handle values regardless of its type

      **Coercion polymorphism**: Type conversion

      A language automatically convert one type to another to make it match with a function argument. As a result the function can be called on the range of types that can be converted to the target type by which the function is implemented.
   1.
   1. ## <a name="__refheading___toc10915_1739821362"></a>**Type classes**

      Technique to define generic operations that can be applied to a set of unrelated types by allowing each type to provide its own implementation of it.

      Like in method overriding, a specific implementation of an operation will be called based on the type we provide. In scala, an implicit implementation of the behavior for the provided type must be on the scope for implicit resolution.

      **Type classes vs subtype polymorphism**

      Adding functionality to types without modifying them allows decoupled code.

      Add functionality to types that are not under your control. i.e. types in an external library

      **object** **ShowTypeclass**{
      `  `**trait** **ShowBehavior**[**A**] {
      `    `**def** show(a: **A**): **String**
      `  `}

      `  `**object** **ShowInstances**{
      `    `**implicit** **val** showInt = **new** **ShowBehavior**[**Int**] {
      `      `**override** **def** show(a: **Int**): **String** = ???
      `    `}


      `    `**implicit** **val** showString = **new** **ShowTypeclass**.**ShowBehavior**[**String**] {
      `      `**override** **def** show(a: **String**): **String** = ???
      `    `}
      `  `}
  
      `  `**object** **ShowSyntax**{
      `    `**implicit** **class** **ShowOps**[**A**](a: **A**){
      `      `**def** show(**implicit** showInstance: **ShowBehavior**[**A**]) = showInstance.show(a)
      `    `}
      `  `}
  
      }

      **import** **ShowTypeclass**.**ShowSyntax**.\_
      **import** **ShowTypeclass**.**ShowInstances**.\_

      **val** l: **String** = 34.show


   1. ## <a name="__refheading___toc11541_1739821362"></a>**Functional lifting**

      Transformation of functions from one shape to another: Curried, Partial Applied, Tupled

      **def** func(a: **Int**, b: **String**, c: **Double**): **Float** = ???
      **val** curried = (func \_).curried

      **val** unCurried = **Function**.uncurried(curried)

      **val** tupled: ((**Int**, **String**, **Double**)) => **Float** = **Function**.tupled(func)

      **val** untuppled: (**Int**, **String**, **Double**) => **Float** = **Function**.untupled(tupled)

      **val** partiallyApplied: (**String**, **Double**) => **Float** = func(23, \_, \_)

      **def** customCurry[**A**,**B**,**C**,**D**](f: (**A**, **B**, **C**) => **D**) : **A** => **B** => **C** => **D** = {
      `  `a:**A** => b: **B** => c: **C** => f(a,b,c)
      }

      **def** customUnCurry[**A**,**B**,**C**,**D**](f: **A** => **B** => **C** => **D**): (**A**,**B**,**C**) => **D** = {
      `  `**case** (a ,b, c) => f(a)(b)(c)
      }

      **def** customTuppled[**A**,**B**,**C**,**D**](f: (**A**,**B**,**C**) => **D**): ( (**A**,**B**,**C**) ) => **D** = {
      `  `**case**  (a ,b, c) => f(a,b,c)
      }

      **def** customUntuppled[**A**,**B**,**C**,**D**](f: ((**A**,**B**,**C**)) => **D**): (**A**,**B**,**C**) => **D** = (a,b,c) => f((a,b,c))

      **def** customPartialApplied[**A**,**B**,**C**,**D**](f: (**A**,**B**,**C**) => **D**, a: **A**): (**B**,**C**) => **D** = (b,c) => f(a,b,c)








   1. ## <a name="__refheading___toc11543_1739821362"></a>**Basic Monads**

      1. ### <a name="__refheading___toc11545_1739821362"></a>**IO**

         Used to handle side effects in a pure, referential transparent way. It contains suspended effectful computations so side effect execution is deferred until the end of the program.

         As being a monad, IO are composable creating a sequence of effectful operations.

         **trait** **IO**[+**A**] {

         `  `**def** flatMap[**B**](f: **A** => **IO**[**B**]): **IO**[**B**]

         `  `**def** map[**B**](f: **A** => **B**): **IO**[**B**]

         `  `*// run the effect*

         `  `**def** run(): **A**

         }

         **object** **IO** {

         `   `**def** effect[**A**](a: => **A**): **TIO**[**A**] = ???

         }

         [](https://medium.com/wix-engineering/demystifying-functional-effect-systems-in-scala-14419039a423)

         [**https://medium.com/wix-engineering/demystifying-functional-effect-systems-in-scala-14419039a423**](https://medium.com/wix-engineering/demystifying-functional-effect-systems-in-scala-14419039a423)

      1. ### <a name="__refheading___toc11547_1739821362"></a>**Writer**

         Allows to compute a result while also accumulate an auxiliary output next to it. A usual use case is logging.

         The type used to accumulate must have a monoidal structure (empty element and append function).

         Useful to gather statistics, accumulate logging, tack function calls, etc….


         Use tell method to add logs while keeping the value unchanged:

         **case** **class** **Writer**[**L**, **A**](value: **A**, log: **L**)

         **val** tellExample = **Writer**("tell example", 1).tell("log append")

      1. ### <a name="__refheading___toc11549_1739821362"></a>**Reader**

         Represents a computation that reads from a shared environment. The shared context or dependency is passed through the chain of computations.

         **case** **class** **Reader**[**R**, **A**](run: **R** => **A**)

         R is the environment and A is the produced result of the computation.

         R can be DbConfig and actions to chain :

         **def** getUserProfileAndAuth(userId: **Int**): **Reader**[**DbConfig**, (**UserProfile**, **Boolean**)] =

         **for** {

         `	`profile <- fetchUserProfile(userId)

         `	`isAuthenticated <- authenticateUser(userId)

         } **yield** (profile, isAuthenticated)

      1. ### <a name="__refheading___toc7968_904507452"></a>**State**

         Encapsulates a function S => (S,A) where A is the computed value and S is some state. As a monad, it provides the possibility to chain some of this functions passing the output state of one function as the input state of another.

         **case** **class** **State**[**S**,**A**](**S** => (**S**,**A**))

         It constitute the functional alternative to state mutation. Composing State monad you build a final composed function that you execute passing the initial state. So State Monad should have some method like:

         **def** run(state: **State**): (**S**,**A**)

         that actually executes the function.
   1. ## <a name="__refheading___toc8157_904507452"></a>**Monad laws**

      - Associativity:

      **def** f(i: **Int**): **Option**[**Int**] = ???
      **def** g(i: **Int**): **Option**[**Int**] = ???

      **def** h(i: **Int**): **Option**[**Int**] = ???

      **Some**(1).flatMap(f).flatMap(g).flatMap(h) *// (h º(g º f))*
      **Some**(1).flatMap(x => f(x).flatMap(y => g(y).flatMap(h))) *// ((h º g) º f)*


      Ensures that the order of operations in a chain of monadic computations doesn’t matter. This is essential for composing computations in a flexible way without worrying about the order in which flatMap calls are nested

      - Left Identity: pure(a).flatMap(f) == f(a)

      - Right Identity: m.flatMap(pure) == m

   1. ## <a name="__refheading___toc16306_1974857902"></a>**Kleisli**

      Function composition in the context of a monad. Kleisli arrow A => F[B] where F is a monad.

      **val** f: **Int** => **Option**[**String**] = x => **Some**(x.toString)
      **val** g: **String** => **Option**[**Double**] = s => **Some**(s.length.toDouble)

      **val** composed: **Int** => **Option**[**Double**] = x => f(x).flatMap(g)
      *// Alternatively, using Kleisli:*
      **val** kf: **Kleisli**[**Option**, **Int**, **String**] = **Kleisli**(f)
      **val** kg: **Kleisli**[**Option**, **String**, **Double**] = **Kleisli**(g)
      **val** composedKleisli = kf.andThen(kg)


1. # <a name="__refheading___toc16318_1974857902"></a>**Software Design**

   ## <a name="__refheading___toc16320_1974857902"></a>**GoF patterns**

   1. ### <a name="__refheading___toc16322_1974857902"></a>**Creational**

      #### <a name="__refheading___toc16324_1974857902"></a>***Singleton***
      A class with only one instance and a global way to access that instance.

      Make the constructor private and invoke it from a static method of the class.

      Be aware that it will make testing harder.
      1. #### <a name="__refheading___toc16326_1974857902"></a>***FactoryMethod***

         You want to extract the creation of classes because it involve some business logic. Could be that some constructor parameters have to be calculated or you want to create new base class but delegate to the factory which concrete class will be created.

         Additionally, you might want to swap factories in some scenario so extracting the creation of objects to a Factory give you that flexibility.

         Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. So we will have an AbstractFactory with ConcreteFactories as different ways or strategies of creating the same objects.

         If a Factory is creating objects of type Base but it creates objects of Base subtypes base of some business logic, in unit testing you might want to use a TestFactory that always creates objects of the same subtype in order to test specific situations related to this subtype.

         ![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAeUAAACmCAYAAADki5cUAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAOxAAADsQBlSsOGwAAIABJREFUeJzt3Xl8TOf+wPHPLNk3kkgim6WCSBD81FZ7S2/R0sVyq5tLe2mrqptqUV201NJNl6vocqml9l5UuVXbbVHEEoLYJQjZJWIyc35/PBN7NEGcmcz3/Xr1VZnMmfOdc06e73me8ywGhBCi/GgBAQF6xyB0kp2dnQVU1jsOZ2LWOwAhRMUVEBBAVlaW3mEInRgMBr1DcDpGvQMQQgghhCJJWQghhHAQkpSFEEIIByFJWQghhHAQkpSFEEIIByFJWQghSnD48GH++c9/0qpVK7p168aPP/54U59ns9nYtm0be/fuvUURiopGhkQJIcQ1ZGRk0KpVKzw8PLj//vs5cOAA/fr1Q9M0unbtitVqBcBoNOLh4UFBQQFFRUW4u7vj5eUFQEFBARaLBaPRiLe3N1lZWbz//vt06NCBmjVrYjAYKCgowGq1Yjab8fb2xmazUVBQgMlk4vz58/j4+GA2S1HtKuRMCyHENfzwww9kZmayZMkSOnTogM1mY+LEiQQGBvLuu+/y3//+l/DwcDp06ED16tX56KOPMBgMhISEMGrUKDw8PHjmmWfIzs7GZDIxatQo/ve//7F06VK2b99OmzZt2LlzJ5MnT8ZgMGA2m3n77bcJDQ3lH//4B1FRURw/fpwpU6ZQs2ZNvQ+HuE3MwCS9gxC6KgCG6x2EEI5m9+7duLm50bx5c0DViF9++WUAVq9ezcGDBxkzZgzBwcGMHj2auLg4hg4dypAhQ1i5ciV33XUX7dq1o2PHjkyYMIFZs2bx9ttvM2fOHJ555hmCg4N56aWXeOihh+jfvz8vvfQSr7zyCt9//z1GoxGLxcLHH39MeHi4nodB3GZmX1/fIWvXrtU7DqGTRo0aZSFJWYireHh4oGkahYWFeHt7A1BUVHShKTkyMpL27duTnJxMamoqW7Zs4ffff+fQoUPUqlWLu+66iz///JP58+dz6NAhWrVqhZ+fH2azmYCAAFJTU0lPT6d58+bExcWRkJDAV199RX5+PgBt2rQhPj5et+8v9GE2mUwkJCToHYcQQjiUVq1a8cUXXzB//nz69OlDUVERXbt2pVOnTmiahoeHBwCenp74+vryxBNP0KdPHwoLCwkODuaVV15h48aNrF+/npEjR3L69Gk0TQNUcg8KCsJgMJCenk5hYSEnT57E39//wvNoT09P3b670I88UxZCiGvo0qULPXv2ZPz48SxatIiMjAzOnz9P27ZtWbFixYX3hYWFcffdd7Ns2TLMZjPbt2+nf//+hIeHU1hYyPTp0zl16hSHDx8mKSmJwMBAFi5cSPv27enfvz8//vgjBw8eZNu2bYwcOVLmi3ZxhoCAAE0mjHddBoNBVnER5cbZy5ecnBx+/fVXjh8/jpeXF02bNiU+Pp4NGzZw7NgxevbsCcCZM2f47bffSE1N5Y477qBVq1ZkZ2ezbNkyAgICqFmzJomJiTRp0oScnBySk5Pp1q0b3t7e/PLLL2RkZBAdHU3Hjh3Jz89n5cqV1K1bl7i4OJ2PwM2R8qXsJCm7OPmjEeVJyhfXJuVL2cnkIUIIIYSDcNpnyrt27WLfvn0AmEwmQkJCqF+//oVekmVx8uRJdu3axZ133omvr2+Ztj18+DBVqlS5of0KIYQQl3LamvK3337Lk08+yfTp0/nkk08YNGjQVVPg2Wy2Un3Wli1bGDJkCCdOnChTDOfOneP5559n//79ZdpOCCGEuBanTcoAERERTJkyhWnTptGgQQOmTZtGbm4u3bt3Z8iQIQwaNAir1crChQvp0qULf/vb35g5cyaapnH8+HEGDRpE+/btWb58+YUejx9//DH//Oc/yc3N5ZdffqFly5bs37+fI0eOMHjwYFq2bMmIESNISUmhd+/e/Oc//2Ho0KFs3bpV56MhhBDC2Tlt8zWA2WwmKCgITdMICgpiy5Yt2Gw21q9fT0FBAf379yclJYVnn32Wp59+GqPRyIABAwgMDOT3339n0aJFfPXVV3zzzTcXBuynpaWRkpKC1WolKyuL7du3k5mZyfTp09myZQujRo1ixIgRVKlShYceeoiff/6Z/v37ExMTo/PREMLxaJqGdPQSovScOilnZGQwdepU0tPTWblyJV27dgXUoPtHH32URx55hA8//JCoqCgee+wxoqOj+eijj1i6dCmZmZl06tSJLl26YLVaSUpKKnE/qampJCUl8dhjj9G5c2diY2MxGo0cOHAAo9FIdHR0mZ9FC+EKcnJyLJUrV/6P3nEI3bTTOwBn49RJuaCggD/++AOz2Uzfvn159NFHAZWUfXx8ADVzjtFoxGhULfVGoxGr1YqmaRdeu5TJZMJqtVJUVERubi6g7vYvfX/x74tn5xFClOgs0EPvIIRuMvUOwNk4dVKuWrUqEydOxGAw4OXlhdlsJicn57L33HfffXz11VcsWLAAUIm8S5curFu3jtmzZ7Nq1Srmzp1LUVERADVq1GD27NksWbKERYsWARASEkKtWrWYM2cO9erVY+zYsXTt2pUGDRpQVFTEpk2biIuLIyAg4PYeACGEEBWK0yZlLy8vAgICrkqEBoMBf39/3NzcAIiLi+Pdd99l3LhxGAwGJk+ezH333UedOnVITExk4MCBdOvWjbCwMAwGAz179mTBggV88skn9OnTh82bN+Pj48OwYcMYPnw4ffr0oXv37jzyyCP4+vrSvHlz5s+fT6tWrfi///s/PQ6FEI4sAKktCVFqMqOXi5MZd0Q5y0SuL1cm57+MnHpIlBBCCFGRSFIWQgghHIQkZSGEEMJBSFIWQgghHIQkZSGEEMJBmHNzc0lISNA7DiGEEEIgYwhdnZx/UZ7k+nJtcv7LSJqvhRBCCAdhBryASXoHIoRwGeFAL2AzsLaU20QDp4H8G9xnDyAI+PqS1+4B2gNvANeayN4ANAD2AF2ADUDZFl2HUcCHqLibApFAEbAVOFbCNj5ATyDOHlcO8AuwCbDexP5Lww11rFPKuB9xi5iB88A3Osch9POk3gEIl1MPiALmlGGbnsBiYO9fvM8I2K54zQC0AroB36HKPAPwD9QqRm9y7aRcDXgeeBGVvPdQ9qT8D+AzwB14CXgdlZy7AlMByzW28QbuApYAB4AYYKB934cu+U6lWRGneP+lTcpxQAdgYinfL8qBtPm7Njn/ojxdeX15A78Ch1E3hJ2A34EtQD/7e6KBKcBO4F9AayAJSEQl86dQtdbfUTXgSsB4YBbwE/BvoI79s/qgaooTgPnAI/bX44FPUbVvE5CASvq/A+8CVew/pwNjgI/tn5EILABqomqV41E12P/YP8MNlXj/BMYBR1A19N7Aq/Z932H/XRTgh7o5qXrJMaoCfAXE2n92Az5H3Vi8bP8eX9u3L83+awGfAHXt33UQ8DiqUvYhsB341h7XXmAf6gbmVpDypYzMqJP4gN6BCCFcQj4qkdQHZgDvAQOAQmA6qtWuE6p5dxAqkZmA/6ISdBGqKflhVI14NdAdNb/yUuAHVI20ESrB9EIl1PtRyexJVFJthbo56Av421//CNWc/iKqtvgJqlb9vv1364FhwCtAc/t/EUBLoLM93reBO4F7UTcGA7iY9Jfaj8FxVLkbCqSims9PX+eYBQAeQAGqdpwJDLZ/79LsvyQP2mO4E3XTEAG8hUriS66znShHZtQFUV3nOPT0KuqO0lW9rncAwqUtQCVAT1QN2Yx65rwJ1bQ71v7aw/b31wDyUMkMVPNuLft7t9r/vx2VaGJRiWYjKinvQiW1Zqia6a/2zwgEwlC1w7tQNUorcOlKPYXAH/bX01F9ceJQz3otqJr8i/b4Mu3vOYO6ifBBtRAUJ95z9s8ORz1X33eN4+KDSv5n7MfmCKrp2oq62cgH/q+U+y9JU/sxOAd8bz82va/zfnEbmFF3ka7qYcAXOIlq+hJC3D6BqGbZ51C1wKfsr1u5uKysNyopFStE1TKLedpfs3CxE9ReVM3xCWAhF5+n2lDJ55/ANuDUJfs7jarJHre/dhpoeMl+rFz9DLfwktiK++dYLondzf5v0yX7L2ZBPWcuSSEXnylbUM+Ts+wxFJZx/9olsRtQte48+/Ze9te9cOKlfCsSVx4SZQZeQyXm9sgFKcTtFoBKuntQnap87a8dQNXiQoEvUbVXKxCM6hVsRjVPN7K/Z8cVn3sIlZz6oprEL7Xcvl06F2vCJ4FcVO00FdW0XgdVg6xsf/1aVqCeUQejOoxtRt0QVEbVov9uj7sQlQwvTcJ+QDYqcbbhYnIsVgQko2r9u1G13ytvCkq7/3OoG4II1PP3FvbtV6Ka9yNRLWYd7bFW4vo3DKIcmf76LRVWX9Td8AzUReqJ+iMQQtw6w1BN0JfyRyWJ/6HKoIdRw4N2o56P/oBqkn4U1fFqJiq59EI1USfb/50ADAfSUMk5CTV8yIZqnnbnYlKOQCX/TOAsKoGdQiXgufbPvBfVv+YcsAqVoIuHMR2+5PMDUQn9V/u++tr38S9Uk/F5VAez4/aflwG1UQl4F6rjV0f7PnLt3yUR1VoA6qYjBHWzkXPFsati/w577TGVZv/L7cfoAVQHt0T7tr+hEv3j9p/noWrk96Jq0ge4edc6/0JcJQTVcaOR/ee7UT0uK+kWkRAVkx69bz1QyaC7DvsuSRNgGirhtkCNH3aF8kZ6X5eRqzZfN0bdCRbXjP9ENVGF6haREOJWcEf1QA5HDZtyFImopuiXUJWA1ajmayFcnidqSEaHK15/GJlERYhbTWpKrk3Ofxm5Yk05DvVc5n9XvL4c1dmiwW2PSAghhHBRq1G9Oa+lMxcH+Ashbp7UlFybnP8ycrWa8sOoHpW/l/D7VajejjKAXgghxG1n0DuA28iMarLuQcmrs4CaBWgI8CzXnw1HCPHXpKbk2rJx7Rkjy8yVJsz4O2rS9uslZFBj87KA+1AT0gshblxlvQOoICJQM5PJTU4F5yrN1yGoYVCLSvHeQtR8snfiGuMIhXAmA1Azf7mae1FzK/REzdMtKihXScpXjkv+KzJuWQjH4o+acvMt1NScrqZ4EYwmqFkIn+PqqTlFBeAKzdceqNVf2nDtJSr9UFPdXakSKin/vfxCE0L8BSNqOs2PUGsst9I3HN3sRE2pOQy1UEZfVB+Zj4AfUVN0WkvcWjgNV+joZUCNSy7JXtS8tNeSgXT2EkIvnqiREPcAc1B9Qrai5o0+dZ3tKiJf1Pdve8lrTVFTiYagRpRs5OrFOYSTcYWk/Fcykc4oQjiauqjnp0bUghR77a/vwDWTMqg+MUOAg1e8Xg21SlQ0qra8CrU0ZSFCOCHpzSiE4zCgpsBdBjzG1csm7kDVDF3Ri6hnyddiQi3h2Bn4BLVi1JVTCQvhFCQpC+EY3IEHUQn5/0p4jysn5cbAT6V4nxeqWft34GvUco3CSbhCRy8hhGMzATVR6/oGAM8AR3SNyDEdRDVRl9Q5tdh51LrNm1Gdw65ck1k4MEnKQgg9GYFOwEPAemC6vuE4tExUgq2G6o19LXI8nZzTJ2VN03yBtTe6/fbt2/0aNGiw9Ua3NxgMjW50WyEEzwLNgMnAJp1jcQYbgDsoOSk/hBr6KcdT6EPTtID8/HwtKytLy87O1rKzs7Xc3FytqKhIu1JRUdE1Xy+NgoIC7fz581e9rvf3F8KJJaCeEc9B9bZ2K8U2O1EdmlxVJ+Dda7zuAXyAGrvsysfH6Tl9TXnu3Lns2LGDzZs3Ex0dDUBUVBRPPfUU4eHhl7133bp1+Pn50bhx4zLvZ+LEiTRr1oyOHTvekriFEGxDjUG+Fxhj/3kdqoZX0jPTCOD0bYnOMe1DdYbzBM6heqvHA0+ghoqNwbWPj9Nz+qQMEBAQwKBBg+jateuF1/bt28e8efPo0aMHmzdv5tSpU8yZM4fAwEAqVarEgQMH2LdvHwDdu3cnKyuLpKQkLBYLubm5tGvXjqpVqzJ9+nR8fHzYt28fzZo1Izk5meXLl2Oz2WjXrp1O31iICuME8G/U2Np7gUdQyWUpKjmf1y80h3QKVW5HACmoGc4eBf5Azez1JuqY3vAjPaGvCjv3dVhYGMuWLWPjxo3Mnj2byMhI/Pz8aNCgAWlpaSQmJtK6dWtq167NZ599xpEjR5g7dy4tW7bEw8ODVatWMWvWLE6cOEGzZs0oLCzk/PnzTJ48mejoaFq1asXx48f1/ppCVARFwFFUp6SRqHmeJwDvo5q4xUVWVGevKOCfwNuo6UdnoIZATQBeBurrFaC4ORUiKZ8+fZqhQ4fStGlTmjZtypAhQ3B3d2fEiBH07t2bunXrkpCQgK+vLyEhIZw5c4Zvv/2W1157jQkTJpCdnU1hYSF169YlOjqaqKgoCgoKWLduHXfffTdxcXHUrl0bs9lMq1at+Pzzz0lMTKRZs2Z6f3UhKpIi1Pq7AajFJ/aiEvU7QAyle+Zc0VlQw8U+BLqiJgjZYn8dYDVqBrS/o46jcDIVovk6ODiYiRMnXtZ8bbPZ2LRpE23atOH48ePk5uZiMBiw2Wy4u7vTp08fXnzxRYqKisjIyGDPnj2YzRcPh6ZpeHt7k5mZicViIS8vD5vNRuPGjfn6669ZsmQJr776qh5fV4iKrCYQCHwGnAGWoJq0X0U117o6G2q1u2XAxGv8XkM9CmgM9ELN7CWcSIVIynl5ecydO5ft27cD6hlzVFQUa9asYcKECcycOZNVq1YRGRnJwoUL6du3L4WFhUyePJmCggLuvPPOa35ut27dmDlzJmlpaaSkpNCpUyd+/fVXsrKyKCoqIioq6nZ+TSFcwbPAr6iEDJCKGt5TA/WseZVOcTkKDbXe+ypKft5+GvgGtcxlCnLMnIrTL0iRkZERUFBQkJWZmYnRqFrj3dzc8Pb2xmg0EhoaSnZ2NhaLBbPZzIkTJ4iIiKCgoIDc3Fw0TSMiIoKioiLy8/MJCwsjNzeXgoICKlWqxKFDhzCbzWiaRkhICBaLhdOnT2MwGAgKCiIoKMjpj6EQDqIt6nnoI6iexVcyo2rRrrgYRVmZUM/jPwVGAz/rG45wGZqmBdzQwONbRO/vL0QFYULN69xc70AqmFjUOPAaegciSqciNF9bgIU3uvFPP/3UpWvXrv+5hfEIIcrub8AhVA9icevsQz0OeArVMztb33CE+GuySpQQ+qoEjANa6x1IBRWK6q39uN6BiL9WIYZECSGcWgNUr+IdegdSQZ1C9cJ+GNUiIYRDk5qyEPpxR/US7q5zHK4gDDWmuezzDAtxG0lSFkI/sajhO0E6x+Eq/gZ8AYT/1RuFPqT5WgihpzeAxVwclyzK1y/AbqAf4KdzLOIaJCkLIfTSFqiCWnxC3B5FwGzUeO/eOscixDVJ87UQt5+MS9ZXJdTxj9U7EHG5ijBOWQhxm2iaZga63OznLFiwIGb58uWBX331VSjwQGm3MxgMi2523xVZWc7Pl19+mbh27dqlM2bMGHKr9i/n5+bJFJGqplxZ7yCEcAaapgUAWXrt32AwSJl1HXJ+nJ/UlIUQpbZy5Up27tzJTz/9hJeXFwA1a9Zk6NChVKtW7bL3HjhwAJPJdNXrpTF16lTi4+NledQykvPj/CQpCyFKLTMzE6vVypAhQy5bKtVisZCfn4+XlxcWiwWr1cq8efOoWbPmhQVfioqKAPDy8sJms2GxqCWAbTYbHh4emEwmzp49i9Fo5Pjx41SvXh2LxcK5c2ptCg8Pj9v/hZ2MnB/nJ0lZCHHT9uzZwxdffMGoUaOYOXMmvr6+rF69ml27dhEWFsb69evJzc0lPz+fNm3a4OnpyY8//khCQgLJycm0b9+e6Ohoxo4dS4MGDdi4cSMtWrTg+++/Z+PGjXh6etKmTRu9v6bTkvPjPCQpCyHK5Mr1y++44w4efPBB2rVrxxtvvEHNmjXp378/+/fvp3Xr1pw9e5ZNmzbRsmVLzGYzS5YsoUePHnh4eDBo0KALTa5r166lR48ePPTQQwwbNgybzUZqaiqVK1emc+fOVK1aVedv7hzk/Dg3ScpCiDLx9PSkRYsWtG3bFgBfX19MJhPx8fGMGDGCunXr4ud3cV6Kc+fOERMTQ5cuXTAYDHh4eJCUlERoaCgGg+HCeuVnzpwhLCwMd3d3/Pz8MBqNDBw4kC1btrB8+XK8vb31+spORc6Pc5PJQ4QQZWIymQgKCiIiIoKIiAgqV67M2bNnefvtt5k3bx5paWns2LEDNzc3srOzCQwMBNSzyoKCAn777TeMRiNXdtSNjY1l/fr1pKWlsX//fiwWC99++y3169enX79+7Ny5U4+v63Tk/Dg36b4uQ6KEKLXNmzcH7Nq1K+u3337D09MTgMDAQGrXro2bmxu9evViw4YNZGRkULlyZWbOnMmAAQNISUkhMTERm81Gv379yM3NZe/evfTs2ZMdO3Zw4MABWrRowcSJE/Hz88NqtdK9e3cyMzNZunQpJpOJu+++m44dO0qZdR1yfpyfHEBJykKUmoyDdWxyfpyfNF8LIYQQwmHI3NdClB934DWgg96BiBtyD/AdsrTmbSM1ZSFEeapp/y9R70DEDVkNJAGPAV76hiJcxY96ByBEBfY9cK/eQYibEgq8AzyqdyDCNYToHYAQFVRb4FvAU+9AxE0xADHAYiBB51gqPAMQoHcQQlcakKN3EKLCMQELgfeA33WORdwaCcA0oDtwROdYKiyD2WzWunS56eVRhZNatGhRFjIkTNx6XYEGwBi9AxG31BPAXcBwIF3nWCokQ0BAgJaVpduwNqEzg8EgSVncaiHAUGAmsF3nWMSt5QYMRnUS/hLI1Tecikd6XwshbrXGQBGwX+9AxC1nAf4NVAU66hxLhSRJWQhxK3kCdwP/BfJ1jkWUj5PAp8CzQKzOsVQ4kpSFELdSHFAF+J/egYhydRAYj2rCrqlzLBWKJGUhxK00AZgCFOgdiCh3PwNTUZ2+qukcS4UhSVkIcas8DKQiQ6BcyVxUZ77eyIxft8RtScpWq5XVq1fTvn17AgICqFevHp9//jlnz5695fvSNK3E12fOnElSUlKJ27Zo0QKTyYSXlxchISH069ePvLy8Un3+lUaMGEHz5s1LH7jduXPnmDlzJqdPny7ztkLoyIya4/pVVCcv4RoKgPlAPaTj1y1hLu8daJrG9u3befHFF4mOjmbixIkcPHiQKVOmEBsbS9u2bTl69CjJyclomkatWrWoWbMmu3fvJicnB09PT9LS0oiJiaFGjRoAJCUlcezYMXx9fWnatClZWVns3bsXNzc3ABo3bsyePXs4duwYlSpVIiEhgR07dvDmm2/y97//naeffhovLy927drF2bNnqV27NnfccQcA8fHxvPXWWxw+fJixY8fywQcf8Nxzz132+U2aNGH//v0cOnQIDw8PYmNjqVq1Kjk5OWzatAmTyURmplrnwmq1smXLFnx8fKhTpw4HDx4kNTWVpk2bcu7cObZt28a5c+eoWbMmkZGRzJgxg4kTJ+Lm5ka3bt0urIkqhIP7O/Af4JjegYjb7hjwOfABkAzs0zcc53ZbknJiYiLnzp3j/fffp169euTn59O5c2fCw8PJyMhg6NChGAwGNE0jJyeHyZMnM3PmTObPn0+PHj3YvHkzwcHBfPTRRxw6dIhhw4ZRtWpVkpOT6du3LzExMQwePJgGDRrQvHlzCgsLGTt2LDExMWzevJnBgweTmZlJRkYGe/bsYf/+/axevZrt27cTGRnJv//9b95//30AqlSpQo8ePbBarcyePZs//viDli1bXvb5AKNHjyY8PJxTp04RGRnJqFGjmD59OlOnTqVLly5s3boVm82GxWJhwoQJ1KpVixEjRrB48WLmz5/PN998w5QpU1i3bh3Vq1cnOzubd999l8WLF5OdnU1KSgqFhYWSlIUzCEENg/pW70CEbrahEvNY1DzZW/UNx3mVe1K22WycPHmSiIgIKlWqBIC3tzetW7cG4NtvvyUlJYUvv/ySiIgI4uLiWLx4MQaDgYKCAl544QXWrFnDW2+9RWZmJv/6178wGAyMGzeObdu2kZWVhcFgID8/n+eee46GDRsyZswYgoODef3115k8eTI//vgjr7zyCpUrV6Znz54EBASwcOFCPvjgA5o0aULfvn3ZuHEjAIWFhRw/fpykpCTS0tLo2rXrVZ8/btw4fH19GTlyJDk5OTzwwAO0bt2aOXPmcM899zBixAjeeOMNtm4t+brcvXs3c+fOZeTIkXTo0IH169fj7+9Pz549OXHiBN26dcPf37+8T48Qt0JjIA9VSxKuqRBYgGrOfg54HTila0ROqtyTssFgwM/Pj+zsbM6fPw+oRH327Fnc3NxITk7G39+f6OhoqlatSkBAAMeOHcPPz4/w8HBCQkIIDg7GYDBgtVpJTk4mJCSEqlWrEhISgtVq5b///S9VqlQhOjoaHx8f0tLSWLRoEStWrMBms9G0aVMKCgowGAx4eHhQUFBAZmYmjz/+OGazGavVSnZ2NgAbNmygdu3aGAwGateuzejRo9m4ceNln3/06FEiIiIIDg6mcuXKGAwGDh06RH5+PrVr1yY4OJjQ0FBMJtOF41D8LNpmswFw6tQpCgoKqFevHlFRUTz88MMYjUY2btyI0WjE3d0dg8FQ3qdHiJtVPC55KTIu2dUVoXpkNwWeBD5GJWtRBuWelI1GI/Xr1yczM5P58+fTqVMnUlNTmTBhAn379qVRo0YsWbKE3bt3k56eTlZWFnXq1CE1NfWan9ewYUO2bdtGcnIya9asIS0tjaZNm15IYCaTierVq9OxY0dee+01MjMzCQgIoFKlShgMBk6ePHkh2Q8YMIDmzZtz6NAhGjVqxLRp02jSpAmffvopXl5exMTE4OWlOhRe+vkxMTFs2bKFo0ePcuLECUwmE7Gxsfj5+bFlyxYOHjzIwYMHsVqtF25Kjh8/ztGjR/nzzz8BCA8Px8fHhw0bNuDj48OCBQvo0qULJpOJwsJCMjJlOUslAAARZElEQVQysFqtlyV2IRyQjEsWl7KghkkNA1oDK/UNx/nclppyw4YNeeGFF/juu++YM2cOAPXq1aNNmzb4+/vz888/M378eKxWKw888AAPPPAAX3zxxTU/7+mnn+a1115j6NChZGdnM2jQoMtqlGazmfvvv5+dO3cyadIkcnNzGTBgAHXq1CE6Oprp06cTGRlJr169WLhwIatXr8bX15f4+HgA/P39adasWYnfx2w206NHD3bu3Mnw4cPJycmhd+/etG/fnmPHjjFhwgTeeecd0tLSLry/Xbt2fPjhh4wZMwaTyXShQ1u/fv2YOXMmK1eupFKlSheej589e5Y5c+ZQu3ZtKleWaamFQ5sAvImMSxYXpQKzgWeADGCLvuE4l9u2IEV+fj4nTpwgNzcXd3d3QkNDL9ReMzIyOHnyJAChoaEEBQWRlpZGXl4eMTEx5OXlcezYMapXr467uzupqalkZmbi5eVF9erVyc/PJy0tjerVq+Ph4YHFYuHEiRNkZmbi6elJVFQUHh4eHDlyhNzcXCIjIzGbzaSmplJYWHihuTklJQWj0UitWrUuiz0nJ+eyzy8qKuLUqVOcOXMGNzc3wsPD8ff3Jz8/n0OHDmEymXB3d8disRATE0N+fj5Hjx4FIDAwkKysLKpXr47FYuHo0aNYLBZCQkKoUqUKVquV/fv34+HhQVRU1IUe3+VFFqQQN+Fh4EHgcWQYlLicCdWM/R7wNJCibzjOQ1aJcnGSlMUNckM1WXdHhkGJkj0FNAOeRzVti78gM3oJIW7EAGA5kpDF9c0A0lDXi4fOsTgFScpCiLKKABoA8/QORDi888AcoC7QSedYnIIkZSFEWTUEMpFxyaJ09qAmFnkKCNM5FocnSVkIURbeQE/gF2RcsigdDZWYpwA/Ae76huPYzBaLhYULF+odhxDCOTQGDMi4ZFF2y4Ao1FKPH6NaW8QVDKi73df1DkTo5i2k93VZTNI7AJ11Qk2fuE3vQHRSgEoq5aWiX1+BQAvgT+CEzrE4JAPqbkUKZdcl578MfH19tbVr1+odhtBJo0aNynUIoStcX8Wr48XGxhIQEKB3OA6lUaNGGIAsoJrewQjdHEKScqnJuH7XVt7j+uX6cm0GgwEzquPGNzrHIoQQQrg8M3AW6KF3IEI30tlCCCEchAyJEkIIIRxE8SpRUltyXdl6ByCEEEIxI518hHAYNpuNPXv2cPjwYWw2G6GhocTFxV1Y1/t2yM/PJy8vj6CgoBLX887IyGD37t2cOXMGb29vYmJiiIyMvKn1vzMyMigqKiIkJKTU25w9e5aNGzfi5eVFo0aN8PCQ6ZWvR66vsl1fBw8eJDk5GZPJRHx8PFWrVr3h/ZdWua+nLIQovV9++YW3334bi8WCn58f6enpDBw4kP79+9/SZTw1TQO4bC3y4tf/+OMPNm3axMCBA/Hz87tq29OnTzNp0iQWLVpEaGgo586dIzg4mAkTJly27KmmaVd9/vV8/fXXeHl58fzzz5cq/ry8PN544w2WL19ObGwsU6ZMKVOB64rk+ir99XXq1Cmefvpp8vPzsVgsxMfHM23atFLv70ZJUhbCQVitVl544QVq1KjBpEmT8PHxYdGiRSQmJpKVlUVOTg6jR4/myJEjtGrViqFDh+Lu7s7jjz9Oo0aN2LBhAyEhIYwfP56QkBCWL1/OZ599hs1mY+DAgdx777107tyZRo0akZ+fz/Dhw0lJSWH8+PEYDAZGjBhBUFAQTz75JHl5eeTk5DBy5EjGjx/PihUrqF+/Ph9++CFbt27lm2++Ydy4cbRr1460tDS++OILkpOTycvL46233iIqKopq1aoxePDgy7YfP348BQUFfP311yxevJiqVasyevRo1q5dy4QJEzAajVitVnr16sWkSZNYv3498fHxDB48mHr16tGxY8cL8T/xxBMEBgbSo0cP9uzZo/fpc3hyfZXt+urUqRNBQUG8//77rFu3jvfee4+ioiLMZkmbQjiMgIAArbzs3btXc3d31z7//POrfpedna01a9ZMa926tTZjxgytSZMm2ptvvqllZWVpwcHBWq9evbTp06drHh4e2rhx47TExEStevXq2ssvv6yNGTNGa9q0qZaSkqKFhIRoDRo00L788ktt9+7dmq+vr/b6669rw4cP19q0aaPl5ORo//jHP7T7779f27lzpzZ16lQtNjZW++GHH7TGjRtr77zzjvbRRx9pLVq00I4cOXJVnH/88Yfm6empPfbYY9qaNWuu2n7MmDHazz//rCUkJGjz5s3TGjVqpD366KPa4cOHtdq1a2tPPPGElpKSoj3//PNa/fr1tWXLlmndu3fXevbsqaWnp18Wf3Z2tmaxWLQPP/xQu//++7WTJ0+W27kpRjn3v5Hry7GuL5vNpp09e1YbMmSIlpCQUG7nphigSe9rIRxEYWEhBoPhsud7mqahaRqJiYkcO3aM4cOH07t3bzp27MiKFSsA8Pb2plu3bjz55JPUqFGDo0ePsnnzZrKzsxk9ejTPP/88U6dOJSwsDKPRSJs2bXjmmWf4888/KSoqIjQ0lICAAJKSkkhPTycsLIzAwEAiIiKYN28efn5+eHl5Ub16dWbNmsX58+fx9PTEaDReFSdAWFgYTz75JK1bt75q+9mzZ9OkSRM++OADTCYT4eHhnD59Gl9fXzw8PKhSpQoAO3bsoH///nTu3JmnnnqKnTt3kpmZeVn8/v7+t/HsOD+5vsp+feXl5TFp0iTWrFnDe++9d1vOk9TDhXAQkZGReHp6kpiYiMViwc3NjZ07d7J27VrCwsLQNO1C05nBYMBmswHg7u6Op6cnoApQq9V64XfFz9zOnz+P1WrFYDBQqVIlQBV0VquV5ORkQkJCeOaZZ67qSKNpGjk5OWzdupW4uDiaNm1KZGQkR44cIT09nYiICPLy8li4cCHVqlXDw8MDT09PfHx8rrl9kyZNWLZsGd988w0dOnTgzJkz+Pv7Xyhwi7ex2WwXYjEYDJc9oyyOX5SNXF8X91ma68tqtTJ27Fh++eUXRowYQceOHW/9SbkGqSkL4SACAgJ47rnn+OGHH3jppZcYO3Ysffr04ddffyUhIYHw8HA+/fRTlixZwpo1a+jcuXOJn1W/fn18fX0ZP3483333Ha+++iqnTp0CLhakLVq0wN3dnaCgIKpWrcqJEycICgrCzc2NlJQU9uzZw7333ovJZCIuLo6cnBzMZjONGzcmLCyMgQMHMnHiRIYNG8aIESPIz796JccrtzcYDOzatQuLxULDhg3JyckhJyeHjIwMjEYjiYmJ5OfnU69ePWbNmsXatWuZNWsW9evXp3LlypfFn5OTw6pVq9i3bx/p6en89ttvF76juJpcX2W7vlasWMHHH39MVFQUJ0+eZMaMGWRmyuhhIRxKeT7z0zRNKyws1MaPH6/FxsZq1apV0wYMGKCdOHFC0zRNS0pK0jp27KjVqFFDe+6557TTp09r2dnZWuPGjbVFixZpmqZpbdu21V566SVN0zRt1qxZWnx8vBYXF6fNnTtXs1gsWt26dbX33nvvwv4WLFig1a9fX6tXr542c+ZMzWazaStXrtTi4+O1l19+WcvPz9cGDx6s1ahRQ7vnnnsuPOdLTEzUHnnkES0sLExr0qSJNmPGDO3cuXPa5s2btTvvvFPbvHmzpmnaNbdfv3691rhxY61169ba2rVrtTp16mjTpk3Txo4dq0VGRmpjx47Vjh49qj3xxBNaRESE9uCDD2rbt2/XNE27LP4tW7ZoAQEBl/1XfBzKC078TFnT5Poqy/U1ceLEq66vnTt3luv5AbTS9ycXQsiCAS5OFqQQ5clgMEjztRBCCOEoJCkLIYQQDkKSshBCCOEgJCkLIYQQDkKSshBCCOEgZPIQIcogNzeXhIQEvcMQFZRcX0IIUTYye4BrK+/zL9eXa5O5r4UQQghHIc3XQpSNFzBJ7yBEhSXXl4uTGb2EKJscoLXeQQjdrKYcZ/RCri9Xt03vAIRwNvLMz7XJM2VRnuSZshBCCOEoJCkLIYQQDkKSshBCCOEgJCkLIYQQDkKSshBCCOEgJCkLIYQQDkKSshBCCOEgJCkLcfOMgC/gXoZtTNzc5D1egM8Vr3kA/n+xndsl29/I378/F+N2s3+OJ+r7lMQAeAMB9v/8KNuxKmn/pXW92JyBXF9yfQkhSnCtyR2aAYuBbmX4nPuBqjcYgwE1FeNvXF7wTQBOU3Jh6A8MQRVanwL1bmDfR4AgVKH3BvA08ArQ+Tr7rQLMBJYDc4DZwJtApZvYf2mFAQ/ewH5KosfkIXJ9uc71pcnc10LcHHegD+qOPgu4A/VHagZ+ATajCqv7gNrAHmATqrBpB7wN1ALaowrDxcAhoBMQiCrgsoBlqAKxIVATsKJqLg1QU/OFoQonmz2uUKA7akrI7ajpIZ8DegOp9vc1Bx4C0oB5qITQDahv//d8IB1oC7QAdl3yvZsA4cAHQGOgi/27ngX6ogrHnEvenwu8A+xGJYsPgBqogrMGUAQsAtqUYv/e9tfW2X/fEjhvP65dgUbAQWAp8BYQDey3HwdnI9eXi11f0nwtxM0pQv0xbgf2AmNRhdIe4HVUQdgOqAMsAR5BFTJnuFgTeRZIBLYA01AFXRfUH/tKVMFYvMjuE6iC1AT8BAywv94C+ANVWLujCmUr8B+gFaq2dQhVQG5FNU1GoArpuqiCpyUwyL6NG9Af1Wz6NPA/VAHnbd9fe1RSsAL77DEXF9qn7K+X5DSQj2qWbIJKKH/av2Np9u9hP6aB9uPXEIgF7rS/dymq4Gxlj20fcPg68Tgyub5c7PqSpCzEzbEBJ1F31BlAP1Th+DsQg/rjj0MViFuBx1G1klzU3XY1VCGwAlVAnrO/34y6s9+DKlAboWpL9wM/2/e9DFV4BNl/vw5VSBfXajaiCou9qII33b7fE/a4FwI7gGRUzacLqiBOtO+jFaqwtwK/Aj/Y4/JG1WL22+PIAvLs3+U8qiA+e8VxMqAK+0r2z/W3x1Fk398uVO2tNPsvSVf7MfkTGG7/dxoqQWVfZztHJteXi11f0nwtxK3jgXqWVdzZJeSS14vs/y6y/1zMF1VQFitAFY75gAXQgCTUXX4v1B39qUs+azbq7r0AVXiD+rsOB4ahCrPiWs+lN+GFXF7bMKBqN/n2n8+jahre9vdif/95e/zWS74TqELSj5L5oppSc1CF2Neo53eaPUbKsH/s2xUr/l4+XDyWVipepUOur5JVmOtLkrIQt04I6plafdRzvAdQf7inUM/p3ICnUIUg9p8PoQqbEFRBEAUcuOJzD9jfOwDVZHmpOcA3wHRUTQrU87JDwI+oJsf6qEItGlUQldS7NBG4C/geVYM4ABxFNeNVRjVDuqEKSyOXF0oeqMLNaP8Ox7m8UL30md+VigvA0u7fwsUet2b7ezehmnjboWo8f0MlERs33hPX0cj15QLXV0W7kxRCTydRTVvfAx1RBcQkYBXqudRSoCmqyXC//XeVUZ1k/oW6ux8PHLvic7NQTYQmVE3mUkeAnaimyuK7/GxU0+GzqCbK/qjCYy+qyXNUCfHPQ9WI5qGaQb9GFX57UIVzV1QtpABVCIfZt/NCNRseQxVkb6IKurIq7f7PoZLBCFSPYCOqEF1g334Jqhn2BKrZshvQ4wbicTRyfcn1JYS4gl7r3fYBXtBp39fyCDDS/u/aqA5IEfqFc9tU1PWU5fpyDLKeshAOzgi0RvV+XaFzLJdagep40xg19GUPF585Cuch15eDuZkZX4RwRZmoJsHbxQTcg2o2+x8XmxAdQSzqWWURaljIqeu/vUIo7/Mv19dFrnh9aX/9FiHEpfRqXhSOoaI2XwvHIM3XQgghhKOQpCyEEEI4CBmnLETZeKGGmghRHuT6cnHS0UuIsmmodwBCV1bUuN3yIteXEEIIIYQQQgghxAX/D1UArUoCvEQ3AAAAAElFTkSuQmCC)


      1. #### <a name="__refheading___toc16328_1974857902"></a>***AbstractFactory***

         A set of FactotyMethods

         Interface for creating families of related or dependent objects

         `	  `ex: create gui elements. One implementation for windows and another for Mac

         Using the Factory pattern we would abstract the object creation. So we will have ButtonFactory to create Buttons as MacButton and WindowsButton. And TextBoxFactory that will create TextBox abstraction as MacTextBox and WindowsTextBox. Our code would handle types Button and TextBox so it will be intdependent of the visualization system but nothing prevent us for mixing MacButton with WindowsTextBox. In this case, we have groups of related objects so a use case for AbstractFactory.

         **trait** **Button**
         **case** **object** **MacButton** **extends** **Button**
         **case** **object** **WindowsButton** **extends** **Button**

         **trait** **TextBox**
         **case** **object** **MacTextBox** **extends** **TextBox**
         **case** **object** **WindowsTextBox** **extends** **TextBox**

         **trait** **AbstractFactory**{
         `  `**def** createButton(): **Button**
         `  `**def** createTextBox(): **TextBox**
         }

         **class** **AppleFactory** **extends** **AbstractFactory** {
         `  `**override** **def** createButton(): **Button** = **MacButton**
         `  `**override** **def** createTextBox(): **TextBox** = **MacTextBox**
         }

         **class** **WindowsFactory** **extends** **AbstractFactory** {
         `  `**override** **def** createButton(): **Button** = **WindowsButton**
         `  `**override** **def** createTextBox(): **TextBox** = **WindowsTextBox**
         }


 




      1. #### <a name="__refheading___toc16330_1974857902"></a>***Builder***
         Separate construction of complex object from it's representation
         #### <a name="__refheading___toc16332_1974857902"></a>***Prototype***
         Create copy of an object without knowing it's class. Delegates the cloning process to the actual objects that are being cloned.   

         `		`All clonable objects must share a common interface with clone() method.

		

         `	`**Shallow copy vs deep copy**:

		

         `		`Shallow copy: Copy the values and references to other objects. When references to other objects are copied, both the original and the copy points to the same object

         `		`Deep copy: Instead of copying references to objects creates new object and copy values from original one maybe with prototype pattern.

		

         `	`**Prototype Registr**y: Map[String, Object] containing the object you clone more frequently so they can be used like a cache to create new cloned objects.


         ### <a name="__refheading___toc16334_1974857902"></a>**Behavioral patterns**

      1. #### <a name="__refheading___toc16336_1974857902"></a>***Chain of responsibility***		
         `		`A request passes through a chain of handlers. Each handler is responsible of one task and can decide to process the request or pass it to the next handler in the chain.

         `		`The handlers are composed forming a linked list.

		

         `		`Example:

		

         `			`- VerifyUserNameHandler

         `			`- VerifyPasswordHandler

         `			`- CheckRoleHandler

      1. #### <a name="__refheading___toc16338_1974857902"></a>***Command***
	

         `	`Turn specific method call to a Command object. As a command is a piece of data it allows new possibilities like storing commands and execute them later.

         You can composite these commands to a bigger command.

         The inverse of a certain command can be used for undo operation.

         Reminds me of event sourcing but in the Command Pattern, commands have an execute method.

		

      1. #### <a name="__refheading___toc16340_1974857902"></a>***Iterator***
		

         `	`Provide and abstraction to traverse a data structure without the need of knowing any detail of it.

         `	`Iterator holds state of current position in data structure so multiple iterators can traverse the same data structure at the same time.

         `	`Extract the traversal behavior of a collection into a separate object called an iterator

		

         `	 `For a given collection multiple iterators can be defined each of them implementing a specific traversing algorithm.

		

         `		 `Example:

         `		  	`DepthFirstIterator -> traverse tree or graph visiting all decendants of a node before its siblings.

         `		          `BreadthFirstIterator -> first visit all siblings before moving to the next level

		          

         `		 `Methods:

         `		 	`- hasNext

         `		 	`- getNext

         `		 	`- reset

		 	

         `		 `You get an Iterator from a collaction so you make sure the iterator is compatible with the collection.	

	
      1. #### <a name="__refheading___toc16342_1974857902"></a>***Mediator***
	

         `	`Mediator object encapsulates how a set of objects interact with each others

		

         `		`Mediator: EventQueue

         `		`Colleague: GUI components

         `		`ConcreteColleague: EventListeners

		

         `		`**Example 1**: When you click button a new dialog appears:

         `		  `Instead of GUI button creating a new dialog, button interacts with mediator and mediator will send event to Listener

	

         `		`**Example 2**: Chat

         `			`Users in a chat room do not send message to all other users directly. Instead, a mediator (the chat room) is used to distribute

         `			`a user's message.

			
      1. #### <a name="__refheading___toc16344_1974857902"></a>***Memento***
         `	`Create a inner class called Memento which will encapsulate the creation of Snapthots containing the state of the objects.

         `	`Its inner class because Memento will have access to private members of the class when creating snapshot.

         In general, it is a useful pattern when undo or rollback capabilities are required

         #### <a name="__refheading___toc25087_2963167111"></a>***Observer***

         Moving from a poll to push.

         An Observable will push its state to all subscribers are Observers

         `	`Defines a one-to-many dependency where changes in one object notify others.

         ![](data:image/png;base64,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jp8zM0tLS7MOHTpY2bJlrVatWjZhwoTgtptuuskSExOte/fuwfM0atTIEhISrHHjxrZw4cLgvj/99JMNGjTIUlJSLD4+3lJTU+1vf/ubZWRkmJnZ559/boCNGjXKLrjgAktKSrKrr77aDhw4YGauh3W9evUsPj7eatWqFdFzPNp5c7oeM7NBgwYFH5cKd6LHKSiA+fyZ0LO/ACne/L/uY//EF8k/Kv/EMz6fL3/vCb/88ss0bdqUhIQEkpOT6dWrFxs2bMjPU56wF198kXXr1uVq3xkzZtCqVSvKlClD+fLl6datGytXrgxuf/755/H5fCxZsiS/knvSqlevTufOnXPcdiqnW0SkKMu3IPzEE09w4403smfPHm655RZ69uzJ/PnzadeuXUQvv/yUmZkZc/vPP//Mrbfemqsg/Morr9C7d29++OEHBg8eTP/+/VmyZAnt2rVj1apVeZXkmI53PSIiUvjkeTv30aNHrXLlylalShXbtWtXcP3ChQutffv2tnLlSjMzW7lypbVp08aSkpLszDPPtLFjx1pWVpaZmVWqVMmuueYaGzp0qJUtW9aaNGliX3/9tZm5odJuvvlmS0lJscqVK9utt95qR44cCX6uf//+1q1bN+vSpYuZ5TxaytatWyOGTxw1apSZmT322GNWt25dS0xMtGuuucYOHDhgmZmZlpKSYhUrVrQdO3YEr2fRokUGHPPg9+OPP24NGjSwSpUqRYwkM3bsWDv99NMtISHBzj///Ij7EDmdN6fradGihVWrVi34PQXS8Nhjj9nRo0ft1ltvtSpVqliFChXsD3/4gx06dMjMzFJSUqxTp042ePBgS0xMtGbNmllaWlpEugPpiTa6TH5A94TFW/mWt0WOh/warOOLL74wwG666aao+/z0009WsWJFa9y4sc2bN8+GDh1qgL3yyitm5oJGuXLlbOzYsfbSSy8ZYP379zczsxEjRpjP57PnnnvOJk6cGDEuaUpKilWoUMGGDBlic+bMiTpaypEjR2zChAkG2NixY23btm3BUV7uu+8+++ijj6xcuXI2evRo+/LLLw2wG2+88ZjraNy4scXHx1tGRkYwmLVq1crmzJljXbp0CQ7dtmrVqmA6ly9fbp06dQoOCRftvDldz6OPPmqArVq1yszMRo4caYBt2bLFnnnmmeCPgMDyU089FTxOQkKCjRkzxl56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)











         Multiple instances of ConcreteObservable are registered to the ConcreteObservable via the add method. Once the Observable’s state changes it calls update method of each registered Observer.

         Optional: ConcreteObserver has a dependency on ConcreteObservable so it can call its getState method in update() method. Alternativelly we can push the updated state ro the observer by including it as a parameter in the method call update.
      1. ##
      1. ##
      1. #### <a name="__refheading___toc25089_2963167111"></a>***State***

         Pattern to implement a Finite State Machine decomposed in several State objects sharing a common interface IState.  Each state object encapsulates the behavior for its state. So instead of having a big object with all behavior (full of if else’s) we divide it in state objects.





      1. #### <a name="__refheading___toc22564_88264807"></a>***Strategy***
	

         Use composition over inheritance.

         Lets say we have a base class and we want to create subclasses with different behaviors, we could put this behaviors as methods of the superclass and overwrite them in subclasses so classes sharing common behaviors will have a vertical relation in the class tree. But what if we need to compose behaviors in a way that is not limited by having a common ancestor? We apply the strategy pattern extracting the behaviors out of different overwritten methods of the hierarchy to a common interface with the method and all overwritten implementations as specific implementations of the behavior.  

         We have an Animal base class that uses IEatBehavior (Strategy), IReproduceBehavior (Strategy). Now we can create animals by injecting different behaviors so different unrelated animals can share a EatingBehavior without having a common ancestor. Composition over inheritance.

         In scala, instead of creating val dog = new Animal( new OmnivorBehavior), we would create a type dog with trait OmnivorBehavior and some others.

         Hide different business logic or implementations behind and interface and use it together with the Liskov substitution principle to easily change between implementations.

         Example: If you embed a sorting algorithm within a list you cannot change the algorithm without changing the list. However, using the strategy pattern you can extract the sorting algorithm so you can change it without changing List (decoupling). Moreover, you can define multiple sorting algorithms and apply the most convenient one in each situation.

	
      1. #### <a name="__refheading___toc25091_2963167111"></a>***Template***

         A base class define steps and structure of an algorithm allowing its descendants to overwrite certain steps without changing the algorithm structure. Allows customization of certain steps.

      1. #### <a name="__refheading___toc25093_2963167111"></a>***Visitor***

         Allows to add new operations in objects when interacting with another group of objects without coupling the two object groups.

         In the following example there are 3 types of credit cards and 2 types of business. We want to calculate the cash back when a specific type of credit card is paying in a specific business. But every time we have a new business type we don’t want to change the CreditCard hierarchy adding a method called compute CashBackForBusinessXXX.   

         **trait** **CreditCard**{
         `  `**def** computeCashBack(v: **BusinessTypeVisitor**): **BigDecimal**
         }

         **class** **Bronze** **extends** **CreditCard** {
         `  `**override** **def** computeCashBack(v: **BusinessTypeVisitor**): **BigDecimal** = v.calcCashBackBronze()
         }
         **class** **Silver** **extends** **CreditCard**{
         `  `**override** **def** computeCashBack(v: **BusinessTypeVisitor**): **BigDecimal** = v.calcCashBackSilver()
         }
         **class** **Gold**   **extends** **CreditCard** {
         `  `**override** **def** computeCashBack(v: **BusinessTypeVisitor**): **BigDecimal** = v.calcCashBackGold()
         }

         **trait** **BusinessTypeVisitor**{
         `    `**def** calcCashBackBronze(): **BigDecimal**
         `    `**def** calcCashBackSilver(): **BigDecimal**
         `    `**def** calcCashBackGold(): **BigDecimal**
         }

         **class** **Hotel** **extends** **BusinessTypeVisitor** {
         `  `**override** **def** calcCashBackBronze(): **BigDecimal** = {println("Calc cashback for Bronze in Hotel"); 1}

         `  `**override** **def** calcCashBackSilver(): **BigDecimal** = {println("Calc cashback for Silver in Hotel"); 2}

         `  `**override** **def** calcCashBackGold(): **BigDecimal** = {println("Calc cashback for Gold in Hotel"); 3}
         }

         **class** **GasStation** **extends** **BusinessTypeVisitor** {

         `  `**override** **def** calcCashBackBronze(): **BigDecimal** = {println("Calc cashback for Bronze in GasStation"); 4}

         `  `**override** **def** calcCashBackSilver(): **BigDecimal** = {println("Calc cashback for Silver in GasStation"); 5}

         `  `**override** **def** calcCashBackGold(): **BigDecimal** = {println("Calc cashback for Gold in GasStation"); 6}
         }

         **val** business: **BusinessTypeVisitor** = **new** **Hotel**
         **val** creditCard: **CreditCard** = **new** **Bronze**

         **val** result = creditCard.computeCashBack(business)


         Like this, the CreditCard hierarchy remains unchanged when we add new business types.

         Alternative application using implicits

         **trait** **CreditCard**

         **class** **Bronze** **extends** **CreditCard**

         **class** **Silver** **extends** **CreditCard**
         **class** **Gold** **extends** **CreditCard**

         **trait** **Business**
         **case** **class** **Hotel**() **extends** **Business**
         **case** **class** **GasStation**() **extends** **Business**

         **trait** **CashbackCalculator**[**T**<: **CreditCard**, **B**<: **Business**] {
         `  `**def** calcCashBack(): **BigDecimal**
         }

         **object** **CashbackCalculator**{
         `  `**implicit** **val** hotelBronze = **new** **CashbackCalculator**[**Bronze**, **Hotel**]{
         `    `**override** **def** calcCashBack(): **BigDecimal** = 1
         `  `}

         `  `**implicit** **val** gasStationBronze = **new** **CashbackCalculator**[**Bronze**, **GasStation**]{
         `    `**override** **def** calcCashBack(): **BigDecimal** = 2
         `  `}
         }



         **val** bronzeGas = implicitly[**CashbackCalculator**[**Bronze**, **GasStation**]].calcCashBack()
         println(s"bronzeGas **$**bronzeGas")



   1.
   1.
   1.





   1. ## <a name="__refheading___toc25095_2963167111"></a>**Structural**

      1. ### <a name="__refheading___toc25097_2963167111"></a>**Adapter**

         Allows object with incompatible interface to collaborate. Converts the interface of a class to another interface that the client is expecting.

         Our code interacts with an interface IBase that has a bunch of implementations. Now we have a new family of objects whose interface are similar to IBase but not equal, IDiff. Using the adapter pattern we create an implementation of IBase called IDiffAdapter which receives an IDiff interface and exposes it as IBase. IDiffAdapter receives an object that implements IDiff and wraps it in such a way than the client can interact with it as it was an implementation of IBase.

         Adapter pattern is something you apply when you have a problem of mismatched interfaces.

      1. ### <a name="__refheading___toc25099_2963167111"></a>**Bridge**

         Decouple an abstraction from their implementations so both can vary independently.

         A first abstraction is a View which represent a visualization of some resource. So IView has one Iresource. We have some implementations of IView like LongView and ShortView. Resource will have some methods like getText, getFullImage, getShort image. IResource will have some implementations like Album, Book, etc...   

         In this way, we can make any combination of view with concrete IResources without adding new classes. Adding new a class for each relation like LongViewAlbum, LongViewBook, etc… would lead to implementing the cartesian product of classes.  And code or logic associated with LongView will be duplicated in all classes LongViewXXX.

         If a concrete view do not use some of the methods defined in IResource it doesn’t mean we break the interface segregation pronciple because IView and IResources doesn’t have a hierarchical relation but a ‘IView has/use a IResource’.

         See the Bridge shape of class diagram:

         ![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAjwAAAC6CAYAAACqeZd2AAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAOxAAADsQBlSsOGwAAIABJREFUeJzt3Xl0VPX5x/H3BMSIIQQUpIAQCFmQmKaoFAhbCAiI8APRBDRiiha1eLBWq7VqXSpWq0dtsQJ1g7JWpSKLbMUtJCyyRVyQRYEgwYAkiISwJM/vj5CpgRCy38ydz+ucnGTu/c6d595855ln7vK9HqSqzOkApNI8TgcgUsuUr3yX8lUV1Xc6ADcwUw7xNR6Pcof4J+Ur36N8VT0CnA5AREREpKap4BERERHXU8EjIiIirqeCR0RERFxPBY+IiIi4ngoeERERcT0VPCIiIuJ6KnhERETE9VTwiIiIiOup4BERERHXU8EjIiIirqeCR0RERFxPBY+IiIi4ngoeERERcT0VPCIiIuJ6KnhERETE9VTwiIj4nv5OByDia1TwiEi1sWrk9LrUcc2AHOBupwMR8RUqePxEXFwckyZNOmP6lClT6NmzJ+vWraNDhw4ORCYilTALaHfqp84XPj169KBBgwYEBgYSGBhI48aN6devH19++aXToYkfUcHjJ1JSUpg+ffoZ02fMmEFKSgqxsbGsXr3agcjETSZPnkxKSkqJaZ999hlRUVHOBORuucBv8ZHC5/XXXyc/P5/8/Hz27dtH586dufHGGx2Lp6CgwLHXFmeo4PETSUlJZGRksGPHDu+0nTt3snHjRhITE9m0aRNdu3YF4PDhw4wePZqIiAg6derE5MmTAUhOTubVV18F4LvvvsPj8bB8+XIANmzYQExMTC2vlYjgY4UPwAUXXMDYsWP57LPPKD56uWjRImJiYoiKiuKaa64hKysLKMpTvXr1Ijw8nPbt2/OXv/wFgMLCQh5++GEiIyOJjIwkOTmZH374AYDAwED27dvnfb3ixxs2bCA2Npbk5GT69esHwNy5c4mKiqJ169bcfPPNHDt2rMx4xHep4PETwcHBDBs2jJkzZ3qnzZw5k+HDh9OoUaMSbf/0pz9hZnz11Vd8/PHHPPPMM2RkZNC3b19WrVoFQGpqKl26dCEtLQ2AlStXkpCQUHsrJD4pLS2NuLg4evbsyZVXXkl6ejoAixcvpnfv3lx99dUMGjSI3bt3OxypT/KZwicvL4+XXnqJrl274vF42LdvH8nJycyaNYstW7aQkJDAuHHjAHjuuee4+uqr2bZtGxs3bmT9+vUcOnSIN998k/fee48NGzawZcsWzIwJEyaU+brnnXce27dvZ8iQIXzwwQfs3buXO++8kyVLlrBr1y5yc3N54YUXyoxHxJ9V53maNWrZsmUWHh7ufRwVFWX//e9/zczsk08+sbCwMDMza9euna1evdrb7r777rPHHnvMvv76a+vYsaOZmY0fP96mTZtm/fr1MzOzG264wRYsWFBbq1JlgE6KrQGTJk2yW265pcS23rx5s0VGRpqZWWJios2bN8/MzLZt22Zz5861H374wSIjI+3QoUNmZjZnzhy76aab9P+puhDgRf5X+JyHQ/kqLi7OGjZsaI0bN7bGjRubx+OxESNGWGZmppmZTZs2zQYOHOhtf/jwYatfv76dPHnSnnzySevdu7etWbPGCgoKvG2Sk5Pt2Wef9T5esmSJxcbGmpnZ+eefb1lZWd55xY83b95sF1xwgXc5U6dOtaFDh3rbHTlyxPLz88uMxwkoX1UL7eHxIwkJCeTn57NmzRrWrVtHXl4e8fHxZ7TLzs5mxIgRhIaGEhoayowZM8jJyaFdu3bk5+eTk5NDeno6w4cPJysri4KCAtasWUOvXr0cWKsqKU4kj/5k2qOaXqXppfJ4PAAkJiZyzz33cN9995GZmcl1113H559/zr59+xg6dCh9+vRh4sSJZGdnFy+zrqyXL07PpajYCQHGAc/joClTppCbm0tubi5XXnklAwcOpHXr1kBRzklNTfXmnOjoaIKCgti/fz8PPPAAAwcO5LbbbqNly5a88MIL3udcdNFF3uU3bdqU/fv3nzOOJk2aEBAQ4F1GSEiId17Dhg05//zzy4xHxJ85UvFX1h//+Ee7++677d5777WHH37YO/2ne3jCwsJs48aNpT4/JSXF5syZY1dccYWZmSUlJdnbb79t3bp1q/ngqxH6xlQjZs6caddee22Jbb18+fIS/eP777+3OXPmWEJCgv32t7+11atXe/vTaf8jqZrGwAv871BXAxzcwzN9+nTv4xUrVliLFi3s8OHDZmY2ffp0+7//+79zLmfr1q3WqlUrW79+vSUnJ9szzzzjnffee+9Z586dzcysYcOGtnfvXjMzO3bsmHk8Hu8enlatWnmfM3XqVBs0aJD38cGDB2337t3ljqe2oHxVLbSHx8+kpKQwb9485s+fzy233FJqm6FDhzJ58mTMjBMnTvC73/2O9evXAxAfH8+LL77oPcG5e/fuPP/88zp/RwC853kV95fDhw/zzDPPcP311wPw1FNP4fF4SEpK4rnnniM1NZVOnTqxe/du7wn1ixcvLvWKQim34kJn16mf4kNbx50M6qf69u1LTEwMTz/9NAD9+/cnPT2dbdu2AfDJJ58wfvx4AEaNGsWSJUsAuPTSSwkODqawsJAhQ4Ywe/Zs8vLyKCws5PXXX2fw4MEAtGrVis8//xyAN99807uH8XT9+vUjPT2dL774goKCAsaOHcvMmTPLjEfEnzld/FdYXFyc9ejRo8S0n+7h+eGHH2z06NEWFhZmbdu2tXHjxtnx48fNzGz37t0G2KxZs8zMbO3atQbY+++/X7srUUXoG1ONMDN7//337YorrrCwsDALCwuzRx55xHvOxFtvvWVXXnml9enTx7p3725Lliwxs6Jv57/85S8tPj7e+vTpYzt27ND/p+JO36NTGkfeb6fv4TEzW79+vTVs2NB2795tZmYLFy60yy+/3MLCwiw2NtZSU1PNrCjHXHHFFRYaGmrt27e3Rx991MzMCgoK7KGHHrKIiAgLDw+3W2+91X788UczM/v3v/9tYWFhFh8fb88++6z97Gc/sz179pyxh6e4bXh4uLVo0cKSk5MtPz+/zHicgPJVtSi97JWKONUfxZec+san/l/NqvPN4Dnb13I5XWPgMeBXp36/WEZb5SsfpHxVPXRIS0TEN53t0JWIlEIFj4iI7xmFCh2RCqnvdAAi4h46DFVrvqeo0BGRclJyqjodE/dBOiYufkr5ygcpX1UPHdISERER11PBIyIiIq6ngkdERERcTwWPiIiIuJ4KHhEREXE9FTwiIiLieip4RERExPVU8IiIiIjrqeARERER11PBIyIiIq6ngkdERERcTwWPiIiIuJ4KHhEREXE9FTwiIiLieip4RERExPVU8IiIiIjreZwOwAXM6QCk0tT/xd8oX/ku5SuRalQfuBX4CPgK6HLq9wfAr4B6zoUmIlKC8pVUiA5pCcBAYBZwFOgGTKaob6wFGgBTgJ7AMWAmMMCZMEVElK9EpGJigOeAbGAxMOon834LvHDq74nAXT+ZdyOwBPgO+CsQXeORioi/U74SkQq5CLgH2ARkAPcCzUpptwLoe+rvq4GlpbRpDvwe2AxsoCjpNK3meEXEfylfiUiFJQGLgAPA88DPy2jbEDhy2rRjFO0qPptfUPQN63tgIZBY6UhFxN8pX4lIhfQAXqHozT8HuKacz0sE/n3atLnAdeV8/uBTzz9K0bH0uHI+T0T8l/KViFTY5cA3QCpwG2V/0ynNdCD5tGkpwBsVXE4gMBZYeSqeiAo+X0TcT/lKRCqtMXAYaF3J5+cAIadNuxjYX8nlhQK5QHAlny8i7qV8JSJVlgl0quBzelD0Tas0q4CuFVzezyn6tiQiUhblK6lxGofHvS6l6Nh0RY5JDwEWnGXeglPzy6sXMA1oV4HniIh/Ur4SkSpbSflPAPwcuOws82IoujS0PIZQNPqpiEhFKF+JSJUsouRAXaVpD+w4R5tdQJtztLkZmF/OuERETqd8JSJV8jbwbBnz7wZePMcyXgLGlTH/BYouKRURqQrlK6l2OofHP/wc6AAEAQ+cpc21FA3CVZaFp9qV5iGKbuYXTcVPPhQRKaZ8JSKVEkrJKw+eBp46rU0gRQNvlccJihLFT/0VePInjzOp/GWmIuK/QlG+EpFKaAIcLGX6g8DLP3l8PfBWOZf5DjDsJ4+nUHSPmtP9ADQq5zJFRJSvRKRSAoCCMubfCcw89fc0YHQ5lzsGeO3U33MoGp20NB6gsJzLFBH/pnwlIpV2mKJj4GW5kaLj3Acp+nZVHs2AbGAJRTf5K0sIRSOhioiURflKRCplD9CqnG1vAf5cweX/haLkUx5tgZ0VXL6I+A/lKxGplLIG4zqbxjXcviKDgImI/1C+EpFKSQe6OR3EWfQEPnY6CBGpM5SvRKRS3gMGOR3EOVzL2e99IyL+Q/lKRCplNjDS6SDK6SZghtNBiIhjlK9EpFImA7c7HUQF/Qb4h9NBiEitU74SkUp5Brjf6SAq6UHOHEFVRNxL+UpEKuWPwASng6iipzn7vXJExD2Ur0SkUsZRdCdgN5gE3OF0ECJSY5SvRKRSkoHpTgdRzWYBo5wOQkSqnfKViFTKEGC+00HUkEXANU4HISLVRvlKRCqlF/CR00HUsJVAnNNBiEiVKV+JSKX8HNjkdBC1ZDMQ7XQQIlJpylciUin+eDO73cClTgchIhWmfCUilRIC5DgdhEN+ABo5HYSIlJvylYhUigcodDoIB/n7+ov4En9/v/r7+otUib4x+Pc3RhFfonylfCVSKZlAa6eDqCP88ZwAEV+ifPU/yld1mMfpAHyNmZnTMZyNx+Op8/9PbT+R2qP3W9Vo+7lLgNMBiIiIiNQ0FTwVNGfOHIKCgujQoUOJn7feeuusz9mwYQNbtmypltePiopi586d1bIsJ2j7idQevd+qRtvPXeo7HYAvGjhwIG+//Xa527/55pt07dqVqKioGozKd2j7idQevd+qRtvPPVTwVKPnn3+eLVu28M9//pMvv/ySYcOGMXHiRKZNm8ayZcu48MILadeuHXfddReFhYXk5+fzxBNP0KdPHx5//HH27dtHYWEhW7dupWPHjrz88stkZWUxcuRIAgMD6dChA4WFRVc+pqWlcf/99xMQEMDRo0f5+9//7vDaV522n0jt0futarT9xPVmz55tI0aMsNIUFBRYr169bOXKlRYfH28ffvihmZklJSXZO++8Y2Zmffv2tTVr1piZ2Z49eyw0NNTMzP785z/bgAEDzMzs5MmT1rJlS8vOzrZ7773XHn/8cTMz+/LLLy0gIMC++eYbS0xMtHnz5pmZ2bZt22zu3Ll19uS6n9L2E6k9er9Vjbafu2gPTyUsW7bsjN2Vq1evJiQkhNdee43evXtzww030Lt37xJtzIxVq1Zx//33e6fVq1ePgwcPAtC1a1fvtGbNmnHw4EEyMjK87aOiomjVqhUAiYmJ3HPPPaSmpjJ48GCuu+66Glvf6qbtJ1J79H6rGm0/91DBUwlXX331WY/pHjx4kKCgIHbv3n3GvOKrCBcuXEhQUNAZ8+vXL/nvMDPstKsiCwoKABgxYgTx8fEsX76cCRMmMH/+/EqtixO0/URqj95vVaPt5x66Sqsa5efnc/vtt7NgwQIaNGjAzJkzAQgICODYsWMAxMXF8Z///AeAzMzMEtV/aTp16sSqVasAyMjIICsrC4CnnnoKj8dDUlISzz33HKmpqTW1WrVG20+k9uj9VjXafr5He3gqobRdnDfccAPHjh3juuuuIyIigr/97W/ExcURHx9PfHw8v//97wGYNGkSd9xxB1OnTiUvL49HH320zNe67777SEpK4sMPPyQ8PJzY2FgKCwuJiIjg6quvJigoiOPHjzNhwgQGDhxYY+tcnbT9RGqP3m9Vo+3nHhqpsYLs9H2OdYgvjLyp7SdSe/R+qxptP3fRIS0RERFxPRU8IiIiIlIlIUCO00H4qUNAsNNBiPgQ5SvnKF+JT/MAhU4H4efq7PF3kTpG+cp5ylfis34AGjkdhJ9rDOQ6HYSID1C+cp7ylfik3cClTgchALQBdjkdhEgdpnxVdyhfiU/ZDEQ7HYSUcDnwqdNBiNRByld1j/KV+ISVQJzTQUipegAanlTkf5Sv6i7lK6nTFgHXOB2ElOlaYIHTQYjUAcpXdZ/yldRJs4BRTgch5XITMMPpIEQcpHzlO5SvpE6ZBNzhdBBSIb8B/uF0ECIOUL7yPcpXUic8DTzgdBBSKQ8CTzkdhEgtUr7yXcpX4ih1QN+nDwDxF8pXvk/5ShyhXYzuoV384nbKV+6hfCW1SieRuY9O4hS3Ur5yH+UrqRWDgYVOByE1QpfpitsoX7mX8pXUKA0E5X4aiE3cQvnK/ZSvpEZoqG//oaH2xdcpX/kP5SupVrqZm//RzRTFVylf+R/lK6kWjYFcp4MQRxwCgp0OQqQClK/8l/KVVJk5HYA4Sv9/8SXqr/5N/3+pNFXMom/M4iuUr0T5SipFx0SlmM6JkLpO+UqKKV9JheisdzmdrnqRukr5Sk6nfCXlonEN5Gw0ronUNcpXcjbKV1KmhRSNTCpyNhq5VuoK5Ss5F+UrKdVM4EangxCfcCNF/UXEKcpXUl7KV1LCy8CdTgchPuVOivqNSG1TvpKKUr4SAP4C/MHpIMQn/YGi/iNSW5SvpLKUr4AApwNwUHHieNrRKMRXFfcbfQBJbVC+kqpQvvJj2sUn1UWHGKSmKV9JdVG+8jM6iUuq2yxglNNBiCspX0l1U77yE7pMT2rKIuAap4MQV1G+kpqifOVyGohJapoGgpPqonwlNU35yqU01LbUFg31L1WlfCW1RfnKZS6l6OZ6IrVFN3OUylK+ktqmfOUSwcAhp4MQv3SIov4nUl7KV+IUv8hXHsCcDkIqzeN0ANVA/c93OdH/1F98l/KVOMlTH8BM/0Nf4/G4IXcUUf/zPU72P/UX36N8JU4q7n/+PNKyiIiI+AkVPCIiIuJ6KnhERETE9VTwiIiIiOup4BERERHXU8EjIiIirqeCR0RERFxPBY+IiIi4ngoeERERcT0VPCIiIuJ6KnhERETE9VTwiJTDvHnz6Ny5M82bN6d58+YMHjyYb775BoCXXnqJ5OTkKr/G1KlTq7wMEREpnQoekXPYtWsXY8aMYcqUKWRnZ5OZmUlUVBSjRo2qluUXFBRgZvzhD3+oluWJiMiZVPCInMP27dtp1qwZV111FQDnn38+EyZMYM6cOd42BQUFJCYm0rJlSzp37syuXbsA2Lx5M3FxcURERBATE8OCBQsA2LBhA7GxsSQnJ9OvXz+uu+46srOziY6OJjMzs/ZXUkTE5VTwiJxDly5dOHr0KCNHjmTx4sUcPnyYwMBAQkNDvW2WLVvG448/zt69e4mKiuKf//wnhYWFJCUlcdddd7F161Zmz55NcnIyBw4c4LzzzmP79u0MGTKEDz74gFdeeYUGDRrw2Wefcemllzq3siIiLqWCR+QcGjVqxPr162nfvj0PPPAAF110EQMHDmTTpk3eNnFxcXTs2BGArl27smfPHr755hsyMzMZOXIkAJ06deKyyy4jLS0Nj8dDYWEhN9xwgyPrJCLib1TwiJRDs2bNeOqpp/j000/59ttvueqqq+jXrx95eXkABAcHe9sGBARQUFBAdnY2TZs2xePxeOc1bdqU/fv3A9CkSRMCAvQWFBGpDcq2Iuewbt06NmzY4H3crFkznnjiCfLy8so836Z58+YcPHiQwsJC77QDBw5wySWXAJQohEREpGY5UvD897//pUOHDjX+OsuXL6dly5YUFBSUmF5YWEjr1q1ZsWIFQUFB7Nmzp8ZjEd/16aefkpiYSEZGBgAnTpzg5ZdfJiQkhPbt25/1ee3bt6dNmzbek5s3bdrE9u3b6dGjxxltzzvvPE6ePMmRI0dqZiWk1nTv3p3Y2NgS0zZt2uTNeS+++CK33XabE6GJn+jRowcNGjQgMDCQoKAgfvGLX7B48eIqLdMN/dbVe3gSEhKoX78+K1asKDH9gw8+oF69esTHx/P111/TsmVLhyIUXzBmzBjGjx/PqFGjaNKkCa1bt2bx4sUsXbqU884776zP83g8zJkzh3/84x9ERkaSkpLCnDlzaNKkyRltGzduTN++fWnbti1r166tydWRGvT555/TqFEjQkNDWbVqldPhiB97/fXXyc/P59ChQ9x9990kJiZy4sQJp8NyVJ0reA4ePEhSUhIRERFERUXxxBNPAJCRkUFsbCwPP/wwvXv3JiIigqVLlwKQn5/PTTfdRGhoKAkJCTz22GOkpKQQEBDAzTffzIwZM0q8xowZMxg9ejQBAQG0b9+evXv3ArBo0SJiYmKIiorimmuuISsri1dffbXEoHIdO3bkoYceAor2FDVt2pTvv/++NjaNOGj8+PF88cUX5OTk8N1337Fw4UIuv/xyAO66664Sfeynjy+//HLS0tL46quv2LRpE/379wcgOjr6jD2Ly5Yt48CBA3Tp0qWW1kqq29SpUxk5ciRJSUn861//Omu7H3/8kUGDBtGyZUt69Ojh7QuBgYHs27fP2674cXH+e/DBB4mLi+Oyyy7jo48+YtiwYXTq1Ilx48bV+LqJb6pXrx6jRo3ixx9/5MCBA8DZh8sAeOutt4iOjiYyMpLevXuzZcuWM5a5Z88e2rZtS2pqaq2tR3Wx2rZ8+XILCwsrdd7tt99uY8eONTOzQ4cOWWRkpL333nu2efNmq1evni1evNjMzGbPnm3du3c3M7NJkyZZz5497cSJE/btt99amzZt7NZbbzUzs61bt1pQUJAdOXLEzMzy8vIsODjYtm3bZmZmF154oWVmZlpWVpaFhITY5s2bzczsueees+HDh9uOHTusffv2ZmaWnZ1tXbp0sT59+piZWUZGhsXGxtbEJjonwJzuONXEke0nVYNz/c/pVT+rkydPWvv27e3QoUN25MgRa9OmjeXn55uZ2caNG70574UXXrCgoCD74osvzMwsJSXFbrvtNjMzO//88y0rK8u7zOLHxfkvLS3NzMxGjRpl0dHRdvToUcvLy7OgoCDbu3dvba5uhTjYX6qb05uyXOLi4mz69OlmZnbixAmbOHGiXXXVVWZmVlBQYB07drRZs2aZmdlnn31mwcHBtn//ftu1a5eFhIR4Px+nTJliXbp0MbOifnvrrbdaXl6eXXHFFd7l+wJO9b86t4dn0aJF/PrXvwaKrnwZPnw4y5YtA+DCCy9k4MCBAFx22WXeb0UfffQR119/PfXr16dly5YMGjTIu7zw8HBiYmJ45513AHj33XeJiYk54xyiZcuW0bVrV6KjowG4/fbbWbBgAW3btuXkyZNkZ2ezcuVK+vfvT05ODidOnGDlypUkJCTU7AYREZ+wdOlSrrrqKoKDg2nYsCF9+vRh4cKFpbbt0aOHdxiDUaNGlevwV5MmTejevTsAYWFh9OzZk8DAQC644AJatGhRYs+QyO23305ISAhBQUE88sgjPPLIIwBlDpexfPly4uLivJ+Po0ePZu3atRw6dMi73DFjxnDttddWy+10alt9pwM4XXZ2NhdddJH3cdOmTb0nizZq1Mg7vfjSX4Dvv/+epk2beue1adOGr7/+2vs4JSWFGTNmcNNNNzFjxgxSUlJKfd3U1NQSg8kFBQWxf/9+4uPjWbVqFR9//DH9+/cnMzOTjRs3snLlSm6++ebqWnUR8WFTp07lvffeIyQkBICTJ0+Sk5PDiBEjzmjbvHlz799NmjQhJyfnnMu/8MILvX/Xq1ePhg0blnh8+sUZ4t+mTJlCcnIyZsbWrVsZOnQoABdffPFZh8vYv39/ic/fwMBAGjZs6B1KY+7cuRw7doyJEyfW7spUkzq3h6d58+bejQslL+M9m8aNG5eoQE+/VDgpKYm0tDS2bt3KypUrSUxMPGMZLVq0oF+/fuzcudP7k5OTQ4sWLbwFT1paGt26daNbt26kpaWxdu1aevbsWcU1FhFfl5uby4cffsjBgwfJzc31/qxdu7ZEPiv20wInNzfX+yFTr149ivbAw/Hjxzl+/HjtrIC4lsfjITIykkGDBrF06dIyh8s4/fM3Ly+PvLw872dw586dWb16NQ8++KD39jm+pM4VPEOGDOG1114DipLC3LlzGTx4cJnP6dKlC/PmzaOwsJBvv/2W+fPnl5gfHBzMkCFD+M1vfsOQIUNK7Ckq1r9/f9LT09m2bRsAn3zyCePHjwcgPj6e999/n+PHj3t3K7/99tv87Gc/IygoqDpWW0R82OzZs+nbty8NGjTwTqtfvz4DBgxg9uzZZ7RPTU31fmC8+eab9OrVC4BWrVrx+eefe6drrCapDtu3b2fx4sXExsaWOVzGgAEDSE9PZ/v27QC89tpr9OzZ0/uZ2a5dO2JiYrjnnnsYM2aMtzj3FY4VPDt27KB+/folfo4dO8aECRPIzc0lIiKCbt26ceedd9K3b98ylzV27FgaNGhAaGgov/71rxk9evQZieJXv/oVK1asKPVwFsAll1zCG2+8wYgRI+jQoQNjx4717glq06YNBw8e5Je//CVQdIXN5s2bzxmXuEdcXByTJk06Y/qUKVPo2bMn69atq5WxpaRumjZtGsOGDTtj+vDhw8+4WqugoIBrr72WcePG0a5dO7Zt28bDDz8MwJNPPskdd9xB37592bdvH5dccokOVUmljBkzhsDAQAIDA0lISGDkyJHceuutZQ6X0bp1a1599VWGDRtGREQE7777LlOnTj1j2ffffz+HDx/mpZdeqv0VqwIPRWedOx1HlRUWFnqH6X/sscfIy8vjr3/9q8NR1ZxTBZ0bvv75RP975ZVXeOONN0hPTy8xvWfPnqSkpHDLLbeQm5vLxRdf7FCEtcvB/ucT/UVKUr4SJxX3vzp3SKsy5s+fT1RUFHl5efz444/85z//oVu3bk6HJS6SlJRERkYGO3bs8E7buXMnGzduJDExkU2bNtG1a1cADh8+zOjRo4mIiKBTp05MnjwZgOTkZF599VWGgoWmAAACYUlEQVQAvvvuOzweD8uXLwdgw4YNxMTE1PJaiYj4D1cUPIMHD6Zfv35ERkYSHR3NgAEDSt29LFJZwcHBDBs2jJkzZ3qnzZw5k+HDh59xTtif/vQnzIyvvvqKjz/+mGeeeYaMjAz69u3rvfw4NTWVLl26kJaWBqAhDkREapgrCp569erx8ssvk5mZyc6dO3n22Wd1sp9Uu+LhDYqdbYiDd999l7vuuguPx8NFF13E9ddfz7x587xX+0FRwTNu3DgVPCIitcQVBY9IbUhISCA/P581a9awbt068vLyiI+PP6NddnY2I0aMIDQ0lNDQUGbMmEFOTg7t2rUjPz+fnJwc0tPTGT58OFlZWRQUFLBmzRrvlToiIlL96tzAgyJ1VfG92WbPnk39+vW992M7XYsWLXj77bfPuGM2QO/evVm2bBlmRqNGjYiOjmbevHm0atWK4ODg2lgNERG/pD08IhWQkpLCvHnzmD9/PrfcckupbYYOHcrkyZMxM06cOMHvfvc71q9fDxSN6fTiiy96T3Du3r07zz//vA5niYjUMBU8IhUQHh5O69atueSSS8467s7jjz/O0aNHCQ8PJzw8nOPHj3uvwIqPj2f16tXExcUB0K1bN9LT0zWmk4hIDXPNODz+RuNaiJM0Do9UhPKVOMlV4/CIiIiIlEUFj4iIiLieCh4RERFxPRU8IiIi4noqeERERMT1VPCIiIiI66ngEREREddTwSMiIiKup4JHREREXE8Fj4iIiLieCh4RERFxPRU8IiIi4noeQHdC812uuBmf0wFIpTly81AHXlOqh/KVOMnz/5dcVrXN16sUAAAAAElFTkSuQmCC)


      1. #
      1. #
      1. #
      1. #
         ![](data:image/png;base64,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)

      1. #
      1. #
      1. #
      1. #
      1. ### <a name="__refheading___toc25101_2963167111"></a>**Composite**

         Composes objects into tree structures to represent part-whole hierarchies.

         Single object and a composite of objects both implementing the same interface.

         A tree has nodes and Node can be of type Composite, because it has other nodes as child, or Leafs because it doesn’t. In this context, Composite pattern allow us to write code for a generic Node regardless if it’s Composite or Leave.

         We can ask a Node it’s name and implemented in such a way that if node is a Composite it will return its name along with the names of his descendends recursively.


      1. ### <a name="__refheading___toc25103_2963167111"></a>**Decorator**

         Composition over inheritance to share behavior.

         Attaches additional responsibilities to an object dynamicly. It provide a flexible alternative to subclassing for extending functionality.

         We have an original object that we wrap with another object that contains (has a) the original object and at the same time is an object of the same kind so it has the same methods (same interface). The wrapper adds new responsibility/functionality and it contains the original objects so messages/function calls and it’s results can be passed to and be obtained from the original object.

         As the wrapper is of the same kind of the original object, it can be wrapped again adding more layers of functionality recursively.

         As building instances of wrapped objects happens at runtime, functionality is composed at run time in opposition of inheritance where functionality composition happens at compile time.  

         ![](data:image/png;base64,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6kqrVq1o0aIFBoOBd955p/QLyN/+9jeysrIIDAzk+eefJzk5GQCLxUJkZCSNGjXCYDAwevRoPD09S+ONjY0FoGXLlhftS1xcHABdupy7SfeWW24p/f+4cePOW3/69OkkJSXRokULwsLC0DSNiIgI3njjDXbv3g1AmzZtaN68OZ6ensyYMYPgYJm5SFw9SZKq0LZt2+jZs2fp87fffpsbb7yR33//nYULFzLIQjUmAAAgAElEQVRlyhSCgoJo1KgRTZs25dVXX6Vu3bq4uLhw7Ngx+vfvj8lkolmzZvTo0YMZM2aQlJTEoUOHePrpp2nYsCHu7u54eHiQmJhIdnY2AwcO5MYbb9Rxr6uen58fSUlJbNiwgXnz5vHYY48RHx+Pv78/gYGBvP766wwfPhxQf+g/+OADfvzxRx577DE8PT158803yczMJCEhgTFjxjB37lyysrL45JNPaNWqFVFRURw6dIj4+Hid91QICAoKKk08SkRERBAREQFAq1ataNWq1UXva9++fdkxjaUsFst5f6fKKmnpAejevXvp//v27XvZ+MomSBWtQ4cOdOjQAYAWLVqULi+7/yXCwsIICwurtFhE7SRJUhVq3779Rd1tBQUF5OfnY7VazxssCaoffubMmaWtH25ubqxatap0AGTJgMay4wJsNhv169dn8uTJbN++nXfffRc/P78q2T89FBUVMWvWLFauXAmogafz58/ngQceYMiQIXTu3JmuXbty6NAhzGYzBoOBhQsXkpiYiKZpuLu7k5OTQ2hoKMHBwXh6eqJpGrt37yYiIoLg4GBat27Njh07iImJYcKECSQlJdG7d29CQ0N13nshhBCVSZKkKnTmzBkWL15c+rx+/frk5eWRlpbG448/zueff87YsWMBNVZp0KBBzJgxg8jISE6cOHHRt0VQY3DCwsL4/vvvCQoKoqioiMTERP7880/q1atHt27d2LlzZ5XtY1UzmUw88sgj53W32e12Nm/eTPv27Tl58iSnTp0CVAJpNBqJiopi2rRpeHh4sG/fPjw8PC4qKufm5kZmZmbpwM/CwkICAgJYtGgR69evZ9q0aWRkZFTpvgohhKhakiRVkaioKNzd3c9r9QHw9vZmxIgRhISEYDabMZvN3HfffRQXF9OtWze2bNmCzWYjOjoaX19f+vfvX3qH3KOPPkrDhg2599572bNnD97e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)







	

         Decaf and Espresso are like the base cases of a recursion. They are the base objects on which we wrap addon’s. Base Decaf and Espresso returns its cost and concrete decorators calculates it by using its inner beverage cost + addOnCost.

         Decorators have to be wrapp something that can exist by itself.

         ![](data:image/png;base64,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)


      1. #






      1. ### <a name="__refheading___toc25105_2963167111"></a>**Facade**

         Create a Facade object to hide complexity below it. Facade will provide utility methods that would avoid dealing with the under laying complexity.

         Law Of Demeter (specific case of loose coupling). Minimize interactions with other objects. Command a dog to walk, do not command each of his legs independently.

      1. ### <a name="__refheading___toc25107_2963167111"></a>**Flyweight**

      1. ### <a name="__refheading___toc25109_2963167111"></a>**Proxy**

         Adds some additional behavior to control access of the underlying object. Without changing the interface of the underlying object.

         **Remote**: Access a remote object (other server) through a proxy object. The proxy looks like the remote resource. As opposite to then adapter pattern, proxy doesn’t change the interface of the remote object.

         **Virtual**: Controls access to a resource that is expensive to create. Like cashing.

         `	 `It ensures you only interact with the expensive resource when you really need it.

         **Protection:** Access manager. Access the resource via a protection proxy which makes sure that only allowed users interact with the resource.


         ![](data:image/png;base64,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9Xj00Uf59ddfXYdWYUS6DiBQd955J02aNCE3N5ePPvqI9PR04uPjefbZZwM+9r59++jZsyd169YlLS2NX3/9leeff57evXuzdetWatasWeJjJycnM23aNJo1a1biY7z++utkZGQwaNCgEh9DRIKrXr163H///eTm5pKRkcELL7xAjRo1GDx4cKH9cnNzqVSpkqMow5uFopEjRxpgc+fOzd/2888/G2DdunUzM7Ps7Gzr2rWrxcbG2oUXXmhz5szJ3/f111+3+vXrW9WqVa1jx462bt06MzMbO3asAZaZmWnLly83wJ555pn81/373/+2KVOm2L59+2zRokUG2BtvvGFmZqtXrzbAnnrqKTMzO+ecc6xz58529913W9WqVe2yyy6zNWvWnPA+Zmbz5s2zSy65xKKioqxt27aWnZ2d/56vvPKKJSQkWGxsrPXo0cO2bt1qd9xxR6Hhaw4dOhSEbzn4/PFL+HJ9ijkVExNjV155Zf7jX375xaKioiwxMdHMzKpXr25/+MMfrFu3bta1a1czM1u5cqW1b9/eYmNjLSEhwUaMGGFHjx61JUuWmM/nsyeeeMLMzN5++20D7O2337YuXbpYXFyc5eTkmJnll02jR48u2w9czgAWstWVeXbt2sXGjRtZt24db7zxBgDNmzfHzOjbty/ff/89H3/8MYmJidx00038/PPPfPvtt6SkpNC+fXtmz57N559/zpAhQ044dtOmTTnrrLMYMWIEqampzJo1i4SEBPr370/16tWLFd+yZcuoV68e6enpfPPNN9x3330n7LNt2zZ69epF3bp1WbFiBYcOHSIlJQWA2bNnk5qaSteuXZk4cSLLli1jwIABDBs2jGbNmpGQkMBnn31GlSpVAvgWRaQsREdHU7lyZX766ScAKleuzNy5c2nQoAGpqans3buX5ORkDhw4wLRp07jmmmsYOnQo77zzDh07duSee+5h5MiRrFq1ikceeYTu3bszYMAAbr75Zg4ePMiSJUsAmD9/Pj6fj759+7r8uOWG62RbInlXcscvv//9723//v35V1WPPPKImZl99913Bti0adMsJyfH9uzZY4cPHzYzs5YtW1qTJk3M7MQrrJUrV1r37t0tKirKAKtcubLdd999lpubW6wrucaNG+fH3LlzZ4uMjLTc3NxC75O3npGRYWZmY8aMMZ/PZ7t377abb77ZAPvPf/5jZmafffaZffjhh/lxN2/ePMjfdHChK7lw5/oUcyomJsYuu+wy27Bhg2VnZ9vw4cMNsPvvv9/MvDKifv36+fuPHz/eAJs6daqZmeXk5FjVqlXza6cOHjxo9evXt7i4OIuLi7PNmzebmdmPP/5oUVFRlpqaamZe2dCmTZsy/KTlE+FwJffkk08yY8YM+vXrB8DgwYOJj49n165dAIwePZrY2Fhat24NwKZNmzh48CB//vOfqV27NlFRUXzxxRccOXKkyOPndTTZv38/ixcvpkOHDrz66qtMmTKlWPHVrXtswt9zzjmHI0eOcODAgUL75MXau3dvYmNj+etf/4qZsXnzZrZv306VKlWoVq0aAK1ataJHjx5n8A2JiEurVq2iQYMGNGzYkMcff5wWLVowbNiw/OcbNGiQv75161bgWLlRuXJlzj77bLZv3w54HVluueUWDh48SHJyMueffz4AZ511Fj169ODDDz9k7969fPHFF/llYkUX8kmubdu29OrVi5deeomoqCgefvhhzIw6deoAMHDgQFatWsWqVavIysri9ttvZ9SoUcyaNYv33nuPw4cP06RJkyKPPW/ePG677TY2bdpEVFQUiYmJPP/88wBs2LAhv4owL2lt2bLlhGPs2LGj0HrlypXzE1aevFjHjRvHqlWr+Prrr8nKyuKiiy6iTp065OTksH//fgAWLlzI3/72N3JzcwP52kSkjDRu3JgZM2Ywc+ZMli9fzqpVq6hVq1b+8wU7m+Qlt23btgGQk5PDDz/8kL9969atvPzyy1x00UW8//77ZGZm5r/25ptvZt26dYwfPz6/uUbCIMnlOe+880hJSWHlypVMnTqVRo0a0aJFC+bMmcOmTZuYNGkS/fv3Z+fOnfzyyy+Al5TS09PZsWMHP/zwA2vXri10zMjISCZMmEC3bt144YUXSEtLY9CgQfh8PhITE0lISKBSpUpMmDCBjz76iNGjRwNgBaYWyc7OJi0tjbfeeovMzEySk5PzppfJ16NHD6pUqcLkyZPZsWMHzz33HCkpKUREROT/GhsyZAizZ8/mT3/6E5MmTaJSpUpER0ezefNmZs6cGdBtEyISPNWrV6dXr15cf/31tG3bloiIkxe7vXr1Ij4+nuHDhzNv3jweeOABDh06xO233w5ASkoKVatWZenSpVxyySXcdddd+X/7PXv2pFq1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)






         # <a name="__refheading___toc22566_88264807"></a>**SOLID principles**

         ## <a name="__refheading___toc22568_88264807"></a>**Single Responsibility Principle**

         One class should have only one reason to change. Improve high cohesion.
   1. ## <a name="__refheading___toc22570_88264807"></a>**Open/Closed Principle**

      One class should be open to extension but close to modification. That means that to add new functionalities we should create new code (new class, new function, etc…) instead of modifying existing one. Following this principle is very useful to avoid introducing regressions in our existing features when new one is added.

   1. ## <a name="__refheading___toc22572_88264807"></a>**Liskov Substitution Principle**

      Anywhere a base class is used, it could be substituted by a derived class without changing the program behavior. Subtypes keep the semantics of the contract.

      If something is true

      When violated, a possible solution is to extract the methods that caused the violation to a separate interface.

   1. ## <a name="__refheading___toc22574_88264807"></a>**Interface Segregation Principle**

      An interface that defines methods that only applies to certain implementations (ex: left void in others) should be broken down to smaller interface.

      It’s better to have multiple specialized interfaces that a big general purpose one. Parts of the program can depend only on the functionality they need. Improving loosely coupling and high cohesion.

      Classes should not depend (through an interface) of methods that they don’t use.
   1. ## <a name="__refheading___toc22576_88264807"></a>**Dependency Inversion**

      High level modules should not depend on low level modules directly but through an interface.

      Domain do not depend on Postgres, instead it has a dependency on Irepositoty.

   1. ## <a name="__refheading___toc25685_325327998"></a>**DRY**

      Don’t Repeat Yourself.

      Every piece of knowledge must have a single, unambiguous, authoritative representation within a system. Improve maintainability.

      ` `Duplication can happen in: code, config, logging, tests

   1. ## <a name="__refheading___toc25687_325327998"></a>**YAGNI**

      Ya Ain’t Gonna Need It.

      You guess you will need something in a future but generally this is not true.

      Do not anticipate requirements.

      Avoid increasing complexity, avoid introducing bugs, more code to maintain.

      At sometime you might think that you need to create a more configurable flexible system vs a more rigid hardcoded system. It requires a lot more architecture and design effort. In this case, is difficult to predict but YAGNI is still valid.

      It’s easyer to generalize a hardoded system by introducing abstractions that to deal with an over architected system from which you get no benefit of its complexity.

      Do not use it to avoid writing clean code.

   1. ## <a name="__refheading___toc25804_1747409186"></a>**KISS**

      All systems work better is they are kept simple. The goal is to materialize complex

      Break problems into smaller parts, make abstractions, make each piece to do one thing really well and build new feature composing existing pieces rather than make existing pieces more complex by adding on them.

      Build modular programs

      Write readable programs

      Use composition

      Separate mechanism from policy

      Write simple and small programs

      Write transparent programs

      Write robust programs

      Make data complicated when required, not the program

      Write programs which fails in a way that is easy to diagnose

      Prototype software before polishing it

      Make program extensible



      #







      # <a name="__refheading___toc22578_88264807"></a>**Data structures & Algorithms**

      **Big O**: Tool to compare time or space complexity between algorithms. It is expressed as a function taking the size of input data as a parameter and giving the number of steps or operations to calculate the answer with a given algorithm.

      It focuses on the dominant term of the algorithms complexity function.

      **List vs Array**

      ||` `Array|List|
      | :- | :-: | :-: |
      |Read|O(1)|O(n)|
      |Insert|O(n)|O(1)|
      |Delete|O(n)|O(1)|


      In arrays memory is allocated contiguously, so to add one new element all elements on its right has to be moved. In the worst case, if there is no enough contiguous memory on the right to move the elements, all elements has to be reallocated to a memory region with enough space.

      The same for deletion.

      In Lists, inserts and deletions are cheaper because it’s enough to change next pointer of the inserted element and next pointer of the element to the left.

      **Binary search:** Given an ordered list, try the element in the middle, if element in the middle is too low you can discard the half of the list that contains lower elements. Keep iterating so in each guess you discard the half of the remaining numbers. Time complexity log2 n.


      **Dictionary**: Generic way to map keys to values

      **hash table**: Implementation of a dictionary using a hash function

      hash table can be implemented in scala using a Array[List[V]]:

      - Insert: Get the hashcode of the key mod Array.size to translate key hascode to array index

      `   `Then insert into the list in that array position (empty if no collisions)

      **Hash function**: transform a key to an index (location in the table)

      `      `Two keys can get the same index --> collision

      

      `      `Method to handle collisions is chaining. In our table, each position is a liked list where we store key and value.

      `      `Hash function should maximize randomness (flat probability distribution function)

      `      `and minimize the amount of collisions

      **In scala:**

      **- HashMap:** Based on a hash table for fast key lookups.

      In a hash table you map each key to a memory position using a hash function

      <a name="__refheading___toc28944_1000696367"></a>Time Complexity:

      |**Operation**|**Time Complexity**|
      | :- | :- |
      |**Lookup**|O(1) (average), O(n) (worst-case, due to hash collisions)|
      |**Insertion**|O(1) (average), O(n) (worst-case, due to resizing or collisions)|
      |**Deletion**|O(1) (average), O(n) (worst-case, due to collisions)|

      Very fast for the average case. Does not maintain order for keys.

      Performance can be degraded if collisions.

      Ideal for fast lookups and inserts.

      **Tree:** Hierarchical data structure.

      - The topmost is called the root node.

      - Each node has only one parent and has zero or more children

	

      - **TreeMap**: Keys are sorted implementing a Red-Black tree.

      Keys are kept ordered so it’s ideal if you need range queries or sorted iterations.

      <a name="__refheading___toc28946_1000696367"></a>Time Complexity:

      |**Operation**|**Time Complexity**|
      | :- | :- |
      |**Lookup**|O(logn)|
      |**Insertion**|O(logn)|
      |**Deletion**|O(logn)|

      

      Direct access tables. Insert, delete and search costs O(1). Is an Array

      Heap data structure:

      `	`- binary heap or

      `	`- nearly complete binary tree (all levels are filled except the lowest)

      `	  `=> height = O(log(n))

      `	`- lowest level filled to a certain point started from the left

	

      `	`Uses:

      `		`- heapsort

      `		`- priority queues

		

      `	`types:

      `		`- max-heap: a value of the node is less than or equal of his parent. Used for heapsort

      `		`- min-heap: value of a node is greater or equal to his parent. Used for priority queues

	

      `	`We can represent heaps as an array. Root is at first position of the array.

      `	`To get a node's left child = 2\*i where i is the 1-based index of the node

      `	`left(i)  = 2\*i

      `	`right(i) = 2\*i + 1

      `	`parent(i) = floor(i/2) //floor gets the integer part

      Linked Lists:

      `	`- Stores objects in linear order

      `	`- Objects has data an a pointer to next object in the list

      `	`- Single Link list. next pointer only

      `	`- Doubly Link List. next and prev pointers

      `	`- circular list.

      `		`Previous pointer from the first element points to the tail

      `		`Next pointer of the last element points to the head

      `	`- Operation:

      `		`- Search O(n)

      `		`- insert O(1) prepend at the beginning of the list

      `		`- delete O(1). But if you only have the key you have to search first


      Search algos:

      ` `- Binary search: Find a target value in a sorted array

      `   `With each iteration, half the values are eliminated

      `   `Pointers: left, right and mid

   

      `   `Translate the sorted array to binary tree. The height is floor(log2(n) + 1)

      `   `In each iteration we descend one level in the tree. Time complexity: O(log n)

   

   

      ` `- **Breadth-First Search**:

      `   `Algorithm for searching a graph. Horizontal progress

      `   `FIFO queue

   

      `   `Already visited nodes: black nodes

      `   `Nodes in the queue pending to be visited: grey nodes

   

      `   `In each iteration:

      `   `- we get a node from the queue and marked it as visited

      `   `- we add its descendants to the queue

   

      `   `So the nodes of one level are all visited before its descendants (Breadth)

   

      `   `Time complexity: O(|V| + |E|)

      `   `V: Vertices

      `   `E: Edges

   

      ` `- **Depth-First Search**:

      `   `Depth means vertical before horizontal

      `   `LIFO Stack

   

      `   `In each iteration:

      `   `- pop node from stack and mark as visited

      `   `- push its descendants to the stack

   

      `   `So the descendants are visited before the siblings.

      `   `Time complexity: O(|V| + |E|)

   

      ` `DFS: solve a Maze (laberint), find the depth of a binary tree

      ` `BFS: Finding the shortest path

      **Binary search trees**: Ordered binary trees. They might be unbalanced (not all nodes have two descendants) then it will slow down operations

      Items to the left of a given node are smaller, items to the right are larger.

      An unbalanced binary search tree can be so unbalanced that all elements are in a different level (being all of them left nodes of the root), which would be equivalent to a list.

      **Balanced Search Trees**: By being balanced they guarantee height of O(log n) for n items.

      Which is crucial for operations like search, insertion and deletion.

      **Red-black trees**: better binary tree. keep the tree balanced when inserting and deleting nodes

      Red black trees are not strictly balanced but they guaranty height of O(log n) for n items.

      So all operation will have O(log n) complexity.

      It ensures that the most unbalanced red-black tree will have at most twice the heigth of it’s balanced version but height will be still be log n related to the number of elements so O(log n) for all operations

      - All nodes are red or black

      - the root and the leaves nodes (Nil) are black

      - All red nodes has black children (Leaves are not Nodes)

      - All path from a node to its Nil descendants contains the same number of black nodes

      **AVL trees:** Strictly balances. Better for lookups

      Depth-First Search is used to insert so if height of the tree is O(log n) this is the time complexity of insertion

      |**Operation**|**BST (Unbalanced)**|**BST (Balanced)**|**Red-Black Tree**|**AVL Tree**|
      | :- | :- | :- | :- | :- |
      |**Search**|O(n)|O(logn)|O(logn)|O(logn)|
      |**Insert**|O(n)|O(logn)|O(logn)|O(logn)|
      |**Delete**|O(n)|O(logn)|O(logn)|O(logn)|


      B-Trees: Like red-black trees they are balanced search trees, but they are not binary (a node can have multiple descendants)

      `	`Used in database systems. Large volume of data with the goal to reduce disk operations

      `	`Number of disk operation are proportional to the tree's height

      `	`Runtime of O(log(n)) for many operations

      `	`Height can be much less than a black tree due to the branching factor (number of children)

      `	`Each node is like a memory page that can be loaded from disk to RAM.


      TreeMap: TreeMap(1 → “hello”, 2 → “bye”, 3 → ”smth” ). Implemented with Red-Black tree. Ideal when range queries in keys are required or query by key < X.

      TreeSet: The same as TreeMap but with unique single values.




   1. ## <a name="__refheading___toc29291_3312526517"></a>**Quicksort**

      `  `recursive divide and conquer algorithm

      `  `Choose a pivot and try to find the final resting place of it.

      `  `Pivot is moved to the end of the array.

      `  `- (j) one index is pointing to the current element we will compare with pivot. It starts from the left

      `  `- (i) another index will point to the last element starting from the left that is smaller than the pivot starting at -1

      `  `When element on j is less than the pivot, we increment i and swap contents of i and j so the i is pointing to the most right element smaller than the pivot.

      `  `When the j reaches the pivot we increment i and swap i and pivot so the cycle is ended with:

      `   `- pivot in its final position

      `   `- elements at the left of the pivot are all smaller

      `   `- elements at the right of the pivot are all bigger

      `  `We apply recursively the same quicksort function to the left subarray and to the right subarray

  

      `  `Time complexity hardly depends on how good is your choise of the pivot.

      `  `- Worst case O(n2). Average case O( n log(n) )

      `  `- Space complexity is O(1) because we sort inplace, we don’t need to allocate extra space.

      `  `Inductive demonstration:

  

      `  `- Base case: It can handle a base case, simplest imput: one element/ empty list /smallest input possilbe

      `  `- Inductive hypothesis: It can handle input of n elements

      `  `- Inductive step: Show that if algorithm works corectly for input size n, it will also work for n + 1

  

      `  `Like if I'm able to climb to the first step of a ladder and

      `  `given that my feed are in one step I can move them to the next step we can induce that I can climb the whole ladder.


   1. ## <a name="__refheading___toc29293_3312526517"></a>**Merge sort**

      Divide and conquere algorithm.

      Merge function receives left subarray, right sub array and original subarray. It will take elements of left and right arrays and put them  back to its original arary in order

      Break down the array until you have pairs so you order them and merge the ordered pair with another ordered pair by combining the for elements building an ordered array of 4. Iterate.

      Time complexity: O(n log n)

      Space complexity: O(n) because we need to create new subarrays.

      **Heap sort**

      **Buble sort**

      **Slelection Sort**

      **Insertion Sort**
1. # <a name="__refheading___toc22580_88264807"></a>**Pattern matching**

   **object** **EmailExtractor** {

   `  `*// The unapply method takes a String (email) and returns an Option[(String, String)]*
   `  `**def** unapply(email: **String**): **Option**[(**String**, **String**)] = {
   `    `*// Check if the email contains an "@" symbol*
   `    `**val** parts = email.split("@")

   `    `*// If the email is valid (contains exactly one "@"), extract username and domain*
   `    `**if** (parts.length == 2) {
   `      `**val** username = parts(0)
   `      `**val** domain = parts(1)
   `      `**Some**((username, domain)) *// Return Some((username, domain))*
   `    `} **else** {
   `      `**None** *// Return None if the format is invalid*
   `    `}
   `  `}
   }

   *// Example usage with pattern matching*
   **val** email = "user@example.com"

   email **match** {
   `  `**case** **EmailExtractor**(username, domain) =>
   `    `println(s"Username: **$**username, Domain: **$**domain")
   `  `**case** \_ =>
   `    `println("Invalid email format")
   }

   # <a name="__refheading___toc25689_325327998"></a>**Composition over inheritance**

   The only time when you want to use inheritance is when you want both:

   - hierarchical reuse of code (subclasses call methods from the parent class)

   - Subtype polymorphism (implies overwriting parent methods)


   If you need hierarchical use of code but you don’t need subtype polymorphism, you should use object composition instead of inheritance. It’s a ‘has a’ relation rather than ‘is a’.

   If we need subtype polymorphism but not hierarchical reuse of code, we can use a common interface instead of a parent class.

   But even we want both, we should use interfaces to implement subtype polymorphism and object composition for code reuse.

   We are trying to avoid using inheritance when possible.
1.



1.
1. # <a name="__refheading___toc25662_325327998"></a>**GRASP patterns**
1.
1. # <a name="__refheading___toc25843_1747409186"></a>**Testing**

   1. ## <a name="__refheading___toc25845_1747409186"></a>**Test Levels**

      Classification based on the zoom level or granularity.

      Test Levels: Unit, Contract, Component, Integration, System, Acceptance

      Testing pyramid. As you go up the pyramid there’s fewer test in each level, they run slower and they are harder to maintain.


      **Unit:** Write unit test for all the methods and functions.

      **Component test**: Involves a complete section of the application but in isolation.

      `          `It makes sure that all elements tested in unit tests works when they are put together.

      `	`Includes test where other components are down or responds with errors.

      `	`Ex: Only server without database neither front end

      **Integration test**: Test how components behaves when are put together.

      `		       `Ex: Server with database and redis

      `	`*White box testing*: Test if your repository interacts well with database

      `       `*Black box testing*: send a message to the server and then check for data in the 	database. Do not need to know the internals of the application.

      `	`Tool: Docker container


      **End-to-end test:** Involves all components of the application

      `	`Includes *Functional testing* (logging works) and *acceptance testing* (meet business requirements)

      **Manual tests:** Too complicated to be automated or they don’t worth the time to do it.

      The lower in the pyramid you catch a bug, the better.


   1. ## <a name="__refheading___toc25847_1747409186"></a>**Test Types**

      Test Types: Functional, Non-functional (performance, security, configuration, accessibility) and Change-related (confirmation, smoke, sanity, regression).


      **Functional testing:** Check if system does what the user expects. They are requirement based, user focused and black boxed. Checks individual features.

      `	`Includes Unit testing, Integration testing,…

      `	`Goal: Identify and fix defects.

      **Acceptance test**: The goal is to check is  we can deliver. Focus in business requirements. Classic BDD. Black box tests.

      They are the genuine specification of our system. Expensive in time and resources.

      Includes business goals and customer expectations. Conducted by end-users or clients. Done in User Acceptance Testing environment.

      `	`Alpha testing (internal users) Beta-testing (real world environment)

      `           `It comes after Functional testing.



      **Non-functional testing**

      **- Performance testing:** Checks how system performs under expected load

      - **Load testing**: Check how system behaves under different loads: number of concurrent users, users activity, etc… The goal is to identify bottlenecks.

      - **Stress testing:** Check how system behaves under extreme conditions beyond normal loads. Goal: Identify the breaking point.

      **- Reliability testing:** Check that systems can recover from failovers

      - **Scalability testing**: Check system ability to scale up and down.

      - **Security testing:** Goal: detect system vulnerabilities. Unauthorized access, security breaches,  etc…

      - **Compatibility testing:** Check system can work in different browsers, different operating systems, devices, networks…

      - **Compliance testing:** Check that software adheres to legal or regulatory standards.

      ….

 


      **Approval test**: Tests that guaranties that implementation has exactly the same output as before. After a refactor or re implementation. We have an output of a benchmark run and we compare it with the output of the current refactored or re implemented run.






      ## <a name="__refheading___toc25854_1747409186"></a>Change related tests

      **Regression testing**: Verifies that existing functionality continues to work after changes.

      **Smoke tests**: Quick broad test to verify the critical functionality is working after a change.

      **Confirmation tests:** Verifies that changes meet requirements.

      **Sanity tests**: Focused on specific area where changes are made, checks that they work correctly without extensively  testing the entire system.

   1. ## <a name="__refheading___toc25866_1747409186"></a>**Mocks vs Stubs vs Dummies**

      **Dummy**: Used in testing to be injected to the SUT with the only purpose to do not make SUT fail when used.

      **Stub**: Alternative implementation of a dependency of SUT that provides hardcoded data when called.

      **Mock:** Alternative implementation of a dependency of SUT used to check its method calls and parameters. Interaction verification.

   1. ## <a name="__refheading___toc25878_1747409186"></a>**TDD vs BDD**

      **TDD:** Design technique which consist of writing test first and then implement the code in a Red→Green→ Refactor loop. Focused on unit tests.

      `	`Trippe A: Arrange, Act, Assert

      **BDD**: Tests focus on the behavior of overall system. Uses high level business readable test cases. Given-When-Then

      `	`Given: Precondition that describe elements of the system needed for the test

      `	`When: Describe an interaction with the previous elements

      ` 	`Then: Describe the result of the interaction


1. # <a name="__refheading___toc25880_1747409186"></a>**Software Architecture**

   1. ## <a name="__refheading___toc25882_1747409186"></a>**Architecture patterns**

      1. ### <a name="__refheading___toc25884_1747409186"></a>**Layered (N-Tier) architecture**

         **Definition**: Divides the application into logical layers with specific responsibilities such as Presentation, Business Logic, Data Access.

         Originally each Tier was hosted in different machine.

         **Use cases**: Enterprise applications

         **Advantages**: Clear separation of concerns. Easy to test and maintainability

         **Disavantages:** Can lead to performance issues due to multiple layering. Rigid structure can slowdown development.

         ###

      1. ### <a name="__refheading___toc25962_1747409186"></a>**Client-Server**

         **Definition**: A system where clients requests services and servers provide responses

         **Use cases**: Web applications, database access, etc…

         **Advantages**: Centralized control on the server.

         **Disadvantages**: Server dependency can create bottlenecks

      1. ### <a name="__refheading___toc25964_1747409186"></a>**Microservices Architecture**

         **Definition:** Breaks down the application into loosely coupled, independently deployable services.

         **Advantages**: Independent scalability of components. Easy to deploy an maintain individual services.

         Strongly related with team scalability: If more and more developers are working on the same project, communication and synchronization overhead can slow down development. Breaking the project and team into smaller independent components allow scalability.

         **Disadvantages**: Complex inter-services communication. Fan out problems. Requires sophisticated monitoring and orchestration. Distributed system problems.

      1. ### <a name="__refheading___toc25966_1747409186"></a>**Clean Architecture**

         **Definition**: Focuses on dependency inversion, ensuring that high-level business rules are not dependent on low-level details. Focus in the separation of concerns.

         Like hex but with restrictions. Clean is more prescriptive

         Applications requiring long-term maintainability and flexibility.

         **Advantages:** Highly adaptability to changes. Clear separation of concerns

         **Disadvantages**: Can be over-engineered for small projects.

         Core has Domain (business objects and business logic shared among use cases ) and Application has use cases (orchestration). Presentation and Infrastructure depends on Domain by implementing interfaces defined in Domain.

         ![](data:image/png;base64,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)

      1. ### <a name="__refheading___toc25968_1747409186"></a>**Hexagonal Architecture**

         **Definition**: The goal is to isolate core logic from external interactions via ports. Ports are abstractions, usually interfaces through which core interacts with external elements and they are part of the core. Then, adapters are implementations of that port interface.  

         Driven adapters: The ones that are driven by core. Ex: Postgres adapters

         Driver adapters: The ones that driven by external users, like Http or grpc ,command line… They use an interface as an abstraction of the core application capabilities, aka the port.

         **Advantages**: Flexibility to change external systems.

         **Disadvantage:** Over engineered for small projects

         ![](data:image/png;base64,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)

         **DDD**:  Emphasize exploring the Domain (the problem modeling exploring problem space)  before implementing with the goal of creating software which resembles the domain we are working in.

         Ubiquitous language: The objects and methods names in the Domain should match with those that business experts use.

         There are guides to explore the domain and guides how to model Domain objects (value objects, aggregates, etc…) to build a right domain.

         Aggregates (transactional behavior), entities, ValueObjects, Enums, Domain events

         Pattern Repository is part of it.

         Often use as implementation of the core in Clean architecture or Hexagonal. In general, in any Domain centric architectural pattern.

      1. ### <a name="__refheading___toc25970_1747409186"></a>**EDA: Event Driven Architecture**

         **Definition:** System components communicate asynchronously via events

         **Advantages**: High scalability and responsiveness. Decoupled components

         **Disadvantages:** Difficult to debug and maintain. Requires event management infrastructure.

         - **Event Notification**. In order to decouple subsystems, avoid one calling the other. Just publish a event notification and interested subsystems will process it

         Event vs Command. CustomerAddressChanged (communicate) vs RecalculateCustomerInssurance (you want something to happen)

         Events allow to add more consumers that react to that event.

         Dark side: Hard to trace whats going on by looking into the code, you have to rebuild sequence of events.

         - **Event-carried State Transfer:** To prevent the consumer of one event to query the event emitter for further information, the event consumer maintains a database with all data needed from the event publisher. A lot of duplicated data but improve availability of the consumer, reduces service calls, etc…

         But high availability comes with lack of consistency… so eventual consistency.

         - **Event Sourcing:** A sequence of events determine the application state. We can rebuild the application state by replaying the log of events. Like git for code but for data.

         Advantages: Audit, debugging, historic state, alternative state (branching), memory image (no need of database but inmemory system with persistent log)

         Disadvantage: Event schema evolution and code changes, response from external systems has to be saved as events.

         - **CQRS:** Separate query model from command model (insert/update) data from your storage.

 









1. # <a name="__refheading___toc25972_1747409186"></a>**Concurrency & Parallelism**

   ## <a name="__refheading___toc28954_2462428895"></a>**Atomic**
   java package of thread safe class like AtomicInteger, AtomicReference…

   Implementation relies on low level JVM instructions and use no locks.

   **Implemented using a volatile variable**.

   Implementation relies on Unsafe class to perform atomic operations. CAS (Compare and swap) operation ensures that updates are done atomically without locking.

   Value stored is a volatile variable.

   CAS: Compare and swap-

   - expected value, new value and memory address

   - if memory address contains the expected value it assigns new value to the memory address. Otherwise it fails and return the current value of the memory address.

   Atomic classes:

   - Primitives: AtomicBoolean, AtomicInteger, AtomicLong

   - Arrays: AtomicIntegerArray, AtomicLongArray, AtomicReferenceArray

   - References: AtomicReferencem

   - Counters and Accumulators: LongAdder, DoubleAdder, LongAccomulator, DoubleAccomulator

   - AtomicFieldUpdaters: AtomicIntegerFieldUpdater

   `	`Use cases:

   `	`- you want to define and interact with the variable normally. But occasionally you need 	atomic operations on it (which you cannot do with volatile field)

   `	`- You want to create large number of objects and you don’t want to overhead them with 	extra embeded objects like AtomicReference just for atomic cases. I.e: Concurrent list with 	next pointed


   Problems:

   ABA:

   - variable is modified from A to B and back to A. CAS will incorrectly succeed. Problem if behavior of your application depends on this sequence of changes, you have not seen them.

   - Solution: Add version number next to devariable value

   Spin-waiting:

   - can lead to busy waiting if many thread repeatedly retry the operation causing CPU waste   

   ## <a name="__refheading___toc28956_2462428895"></a>**volatile (**visibility problem**)**
   Changes to a volatile variable by one thread are immediately visible to other threads.

   Threads has it’s own caches.

   JVM ‘s memory model allows relaxed consistency. Theads might see change in a shared variable in non-deterministic order.

   JIT can cache variable values in registers delaying updates to shared memory.

   Volatile can be used with primitive types and with reference types but with reference types they act on the reference itself not with the values referenced by it.

   ## <a name="__refheading___toc28958_2462428895"></a>**Synchronized**
   Keyword to ensure both mutual exclusion (only one thread can access the code block at a time) and visibility (like volatile). Used for code blocks or methods.

   Prevents data corruption and race-conditions

   **- sincronized method:** Ensures only one thread at a time will access the method for a given object or class. Uses monitor of object ‘this’. If static method it uses monitor of the class object ClassName.class

   - **sincronized block**: Not applied to a full method but to a code section. Minimize the sincronized amount of code improving performance. The lock can be on any object, allowing fine grained synchronization.

   Implemented using monitor locks (mutex). Every object in java has its own monitor (lock).

   When a thread enters a synchronized block or method it acquires the monitor for the object or class.



   1. ## <a name="__refheading___toc27098_3482476484"></a>**Fork-Join pool**
      Provides implementation for efficiently executing divide-and-conquer algorithms using multi-core processors.

      As opposite to ExecutionServeice, task in a fork-join pool can create subtasks.

      ExecutionService: Thread pool + blocking queue

      The pool has one thread per core. Each thread has its own queue (deque, double ended queue) + common queue

      Divide-and-conquer algorithms divide a large task  into smaller subtasks (Fork) that are computed concurrently and, when done, its results are combined (Join)

      When a subtask created other subtask they are queued in the same thread’s queue, not in the common queue.

      Idle threads uses the **Work-Stealing** technique take tasks from busy thread’s queue.

      A thread pulls tasks from the front of the queue, the stealer takes tasks from de bottom of another thread’s queue.

      No blocking (unless for WorkStealing)

      Easier scheduling.

      Abstractions:

      - RecursiveTask<V>: A task returning a result of type V (Callable)

      - RecursiveAction: A task that does not return a result  (Runnable)

      If subtask are too small you have computation overhead if they are too large you are loosing efficiency.



   1. ## <a name="__refheading___toc27100_3482476484"></a>**Locking**

      1. ### <a name="__refheading___toc27102_3482476484"></a>**Optimistic locking**

         It assumes that conflicts hardly ever happens. Data is read along with a version and when data is ready to be written we check if data version has changed. If changed data is written and version is incremented. If versions has changed it means other concurrent worker has changed the data while we were calculating what to write so the operation/transaction fails and will be eventually retried.

         **Advantages**: Improve performance for read-heavy or low contention environments. Prevents deadlocks

         **Disadvantages**: Needs retry logic. Performance degradation for high contentions scenarios because of too much retries

      1. ### <a name="__refheading___toc27104_3482476484"></a>**Pessimistic locking**

         Data is locked as soon as it’s accessed. Other transactions must wait until the lock is released.

         **Read lock**: Prevents other transactions from writing the data when it’s being read-heavy

         **Write lock**: Prevents transaction from reading the data while is being written

         Possible deadlocks

         **Lock over synchronized:** Locks provide more control. Locks provide ‘try with timeout’

      1. ### <a name="__refheading___toc27106_3482476484"></a>**Monitor**

         Monitor is a synchronization construct that allows to have exclusive access to a shared resource.

         In java every object has a implicit monitor with it which is used when you use the synchronized keyword.

         A thread acquires the monitor of an object or class before entering synchronized block or method

         other threads attempting to acquire the same monitor will be blocked until is released

      1. ### <a name="__refheading___toc27108_3482476484"></a>**Semaphore**

         Synchronization utility that controls access to shared resource by maintaining a fixed number of permits. Threads have to acquire a permit before accessing the resource and released when done.

      1. ### <a name="__refheading___toc27110_3482476484"></a>**ReentrantLock**

         A type of lock that allows a thread to repeatedly acquire the same lock without blocking itself.

      1. ### <a name="__refheading___toc27112_3482476484"></a>**FairLock**
         Threads acquire the lock in the order they requested it


         ## <a name="__refheading___toc27276_2130932612"></a>**Future vs IO**

         Future is eager: starts executing as soon it is created. Designed for imperative-style asynchronous programming. Poor composability.  Abstraction for asynchronous computation eagerly eveluated.

         IO: Pure description of an effectful computation. It is lazy.

         # <a name="__refheading___toc28027_14989605"></a>**JVM**

   1. ## <a name="__refheading___toc28029_14989605"></a>**Concepts**
      **JVM**: Provides execution of bytecode

      - Specification: Document describing how JVM should behave

      - Implementation: Concrete implementation of the specification.

      Oracle HotSpot JVM, GraalVM,...

      - Instance: Runtime instance of a implementation

      .java files are compiled into .class files containing bytecode. There is no linker, instead, the class files are loaded in the JVM (running in RAM) by the ClassLoader.

      Once a .class is loaded code is verified by the ByteCodeVerifier and passed to the execution engine where the JIT compiler will translate the byte codes to machine code.

      **JRE**: JVM implementation + Set of libraries  (java.lang, java.util, java.io, …)

      - Standard Edition Java Platform: Basic fundation for other editions. Serves standard needs

      - Enterprise Edition Java Platform. For large scale aplications

      Includes EJB (Enterprise Java Beans), JPA (Java Persistence API), JTA (Java Transactional API)

      - Micro Edition Java Platform: Optimized for devices with limited resources. Lightweight runtime environment.

      **JDK**: JRE + Development tools like javac, jps, jstack…

      java: Launcher for java applications

      javac: Compiler for Java programming language

      javadoc: Documentation generatior

      jdeps: Dependency analyzer

      javap: Class file disassembler

      keytool: Manage keystores and certificates

      jar: Create Java Archive file

      jarsigner: Generate and verify JAR


      Reference types are stored in the heap while primitive types are stored in t he stack

1.


   1. ## <a name="__refheading___toc28031_14989605"></a>**Garbage collection algorithms:**

      1. ### <a name="__refheading___toc28033_14989605"></a>**KPI**
         Key Performace Indicators:

         - **Latency**: Pause time. Average, max and distribution

         - **Throughput**: Time ratio: Customer Transaction / Garbage collections

         - **Memory and CPU Footprint**

         **Enable GC logs** -Xlog:gc\*:file=<file-path>

      1. ### <a name="__refheading___toc28035_14989605"></a>**Algorithms Oracle**

         **Serial GC**: It performs all garbage collection work in a single thread. It stops all application threads (stop the world) during the garbage collection so it can cause long pauses in the application. It was the default algorithm in the early

         **Parallel GC**: It uses multiple threads to perform garbage collection phases so the work is distributed across multiple CPU cores. Low impact in application’s performance.

         **CMS GC:** Concurrent Mark-Sweep. Designed to minimize the application pause times.

         Garbage collection work is done concurrently with application threads. The down side is that it doesn’t compact the heap so, over time, this can lead to fragmentation.

         **G1 GC:** Garbage First is an adaptive algorithm. Emphasize predictable pause time.

         Ideal for low latency.

         It divides the heap into equal-sized regions. Most operations are done concurrently reducing the ‘stop-the-world’ pauses.

         Aims to provide the best balance between latency and throughtput.

         Works well if your heap is not very large (less thatn 32Gbytes)

         *-XX:MaxGCPauseMillis*: Pause time goal

         Modifies de young generation size at runtime to meet the Pause Goal

         Ideal for throughput

         **Shenandoah GC:** Lastest low-pause-time **GC** algorithms. Targeting large heaps (> 32G).

         **ZGC:** From Java 11

         Scalable low latency algorithm. Designed to manage very large heaps with minimal pause times

         Uses Colored Pointers: Store metadata about objects in their pointers providing fastest mark and relocating without the need of using extra metadata structure.

         A Load Barriere allows to reallocate objects without requirement the application thread to stop.

         Phases: Mark, Realocate, Reclamation

         Disadvantages: Runtime overhead (but low letancy!)

         **Epsilon GC**: No op. Does nothing with the goal to do performance testing without the impact of GC.

         **Marking cycle**: Identify reachable objects in the heap marking them as live (still in use) so they are not collected. Unreachable objects are considered garbage.

         The marking cycle must ensure that the program state remains consistent, often requiring synchronization or stop-the-world pauses.

         **Mark and Sweep**: Mark objects still in use and then Sweep the heap cleaning unmarked objects.

         In the Mark phase a graph of dependencies is build in order to determine which objects are accessible.

         **Mark and Compact**: Mark,Sweep and Compact leaving live objects into a contiguous area of memory to reduce fragmentation,

      1. ### <a name="__refheading___toc28037_14989605"></a>**GC event causes:**

         - Out of space in Young Generation

         - Old generation full

         - Low memory space triggered by -Xmx (young and old generation spaces)

         - System.gc() call

         - GC tunning parameters regarding particular implementations

         - Processing of finalizers: Objects overwriting the finalize() method are placed in a queue so GC can invoke its finalize method before reclaiming its memory. When the queue of finalizers is full enough it can trigger.


      1. ### <a name="__refheading___toc28039_14989605"></a>**Generation in garbage collection algorithms**
         Generation implies dividing heap memory into different areas also called generations to optimize performance of garbage collection. Most objects tend to have a short live span.

         - **Young generation (Eden space, S0 and S1)**: Part of the heap where newly created objects are allocated

         `	`**Eden Space**: Where new objects are created

         `	`**S0 and S1**: If objects survive one or more garbage collection cycles hey are moved to the 	survivor space

         `	`The Garbage Collection for the young generation happens more frequently and it’s faster. It 	is called Minor GC	

         `	`-Xmn

         - **Old Generation (Tenured space)**:

         Major GC or Full GC. It’s more expensive and time consuming because it involves the entire heap affecting young and old generations. Objects can have cross-generation references.

         ` 	`-Xmx (includes young and old)

         - **Permanent Generation**:

         Called Metaspace in newer versions of the JVM. Special are of memory that holds metadata such as class definitions, method information, etc..

   1. ## <a name="__refheading___toc28948_1000696367"></a>**Class Loaders**

      **Bootstrap Class Loader**: Root classloader of the JVM. Loads classes that are part of the JRE such as java.lang (String, Object, System, etc…). Loads classes under the lib directory

      Part of the JVM, cannot be modified.

      **Extension Class Loader**: Loads classes from the extension libraries (lib/ext)

      **System Class Loader/ Application Class Loader:** Loads classes from the application classpath. Classes provided by the user or the application itself. -cp or -classpath when launching the jvm.

      **Custom Class Loader**: Extension of the ClassLoader class. It can be used to load classes from non standard sources such as databases, network connections or encrypted files.

      It allows Dynamic Class Loading: Loading classes at runtime based on some condition. Ie: loading plugins, modules, etc...

      **Class Loader Hierarchy:**

      Class loaders forms a hierarchy such that each class loader transfer the responsibility to load a certain class to its father before attempting to load it by itself.

      This process prevents loading multiple versions of the same class and assures that classes from Bootstrap Class Loader are loaded first.

   1. ## <a name="__refheading___toc29295_3312526517"></a>**JVM cold start**

      Cold start overhead:

      - classes to be loaded by class loaders have to be loaded.

      `  `Specially slow if an application application loads classes at runtime

      - JIT: It performs optimizations like precalculating most used bycodes

      `         `JIT is reset when restrted

      - Class initialization with static initializers can be slowdown

      **JVM Memory Model**

      **Heap:** Shared memory among all threads. Contains Young Generation (Eden, S0, S1), Old Generation. Metaspace

      **Stack Memory:** Each thread has its own stack where local primitive variables and reference to objects in heap are stored. No garbage collection. Each method call means a Stack Frame pushed to the stack.

      **Issues and solutions**:

      - **Visibility**: When a thread updates a shared variable other threads doesn’t see it immediately.

      - **Atomicity:** Shared variable mutations are not atomic.

      - **Ordering**: The compiler JIT and the CPU may change execution order for optimization.

      **Barriers**: Synchonization mechanism among threads

      1- Intrinsic locks: synchronized

      2- volatile variables

      3- Explicit locks: ReentrantLock

      4- Atomic variables

      5- explicit Barriers: CyclicBarrier, CountDownLatch

      Threads have their own working memory that maynoth be immediatelly consistent with main memory. Synchronization barriers force updates to be flushed to main memory and reloaded from it.

      - **Cyclic barrier**: Shared between threads and initialized with the numThreads to wait. It allaows each thread to wait on that barrier until all threads have finished their jobs and are waiting too.

      - **Phaser**: Like CyclicBarrier but allows dynamic thread registration.

      - **CountDownLatch:** One time barrier. Waits for a certain number of events before proceeding. Once count reaches 0, all waiting threads continues.

      - **Semaphore**: Allows a limited number of threads to access a resource. Useful for rate limiting or resouce pool.

      Future.sequence in scala forces all Futures to be executed before continue.

      **wait()**: Puts the current thread in Waiting state. Causes the current thread to pause execution and release the object lock (intrinsec lock) this allows other threads to get the lock, modify shared data and and notify when done

      **notify():** Wakes up one threadwaiting on the object monitor. Move thread from Waiting to Ready.

      The notified thread must adquire the lock before resuming execution.

      **notifyAll():** Wakes up all threads waiting on the object’s monitoring

      There methods must be called inside a synchonized block

1. # <a name="__refheading___toc29297_3312526517"></a>**Akka**



   ## <a name="__refheading___toc29299_3312526517"></a>**Message Delivery Guarantees**

   **At Most One**: Message will be delivered once or not at all. No retry policy. It is the default strategy

   **At Least One:** Message sender expects an Ack from the receiver. If Ack is not received within a certain period, sender can retry so it can lead to multiple received message. Solution is to implement idempotency in the received.

   **Exactly Once:** No lost message, no duplication

   # <a name="__refheading___toc29756_1013244755"></a>**Collections**

   **Mutable collection**: Can be mutated, reduced or extended in place. Add, modify and remove elements as a side effect.

   **Immutable collections:** Each operation creates a new collection leaving the previous one unchanged.

   **Scala.collection (root package)**

   ![](data:image/png;base64,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EytWrOAPf/gDCxcu5I477nC6NJHLosAnInKFLMuipaWFt956C4Brr72WJUuWqFevxJimyYQJE3j88cd58803+fDDD4nH4yxatIhgMOh0eSKXRIFPROQKfLflSktLC5ZlsXTpUubOnYvL5XK6NBkGhmEwfvx4nnnmGd544w2+/PJLenp6ePLJJ7XNjhQFzeETEbkMtm3T19fH66+/ztdff01VVRV/8Rd/wfXXX6+wVwaqqqp44oknmDx5MgcOHOCf//mf6erqcroskYtS4BMRuQz79+/nhRdeYPfu3UydOpXly5dry5UyEwwGefLJJ7npppvo6uripZde4vjx406XJXJBCnwiIpcgm83y9ddf88orrxCNRrnlllt46qmnqK6u1rYrZcjr9XLvvfeyaNEi4vE4v/71r9m3b5/TZYmclwKfiMhFWJbFO++8w6pVq/B4PDzxxBPcfffdGsItc4ZhsHDhQh5++GHy+TwrVqzg888/1wbNUpAU+ERELqCzs5Pf/OY3fP3119TW1rJs2TKmTZuG2601bzIY+mbOnMlzzz2Hx+Nh3bp1fPLJJ+RyOadLEzmDAp+IyHns2rWLF198kWPHjnHNNdfw05/+lLFjx2oIV87S1NTEsmXLqKysZP369axcuZKBgQGnyxI5RY+oIiLfk81m2bRpEx988AEul4tbbrmFxYsXawhXzsswDEaPHs3PfvYz/vjHP7Jjxw4sy+L+++8nEok4XZ6IAp+IyOni8TirVq1i7969uN1uHnnkEaZPn45pakBELi4UCvH444/z4YcfsmXLFnp6enjkkUdobGx0ujQpc3oHExFhcH+9jo4OXnrpJXbv3k1jYyN//dd/zYwZMxT25JIZhkFFRQUPPPAAN998M52dnbz88sscO3YMy7KcLk/KmN7FRESA7du382//9m+0trYyb948li1bpvNw5Yq53W4WL17M0qVLSSaTvPjii+zYscPpsqSMaUhXRMpaMpnkiy++4NNPP8Xn83HPPfdw8803a76eXDW32828efPw+Xy8++67rFy5kmg0yo033ojX63W6PCkzCnwiUraSySSvvPIKR44coaqqih/96EeMGTNGQ7gyZL7btqWuro4//vGPrFu3jq6uLh566CGt9pYRpcAnImXp0KFDvP7668RiMcaPH8+DDz5IbW2t02VJCTIMg4aGBpYvX87KlSvZ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3nvs2bOH5uZmli5dSmNjo9NliYjIMAqHwxiGocA3hBT4pCDZts23337LG2+8QTab5cYbb+See+7B6/U6XZqIiAwzj8dDbW2tAt8QUuCTgpNIJPjiiy/YsGEDgUCABx98kGuvvdbpskREZAQ1NzfzzTffaPPlIaLAJwUllUrx4osv0tbWxtixY1m+fDl+v9/pskREZIQ1NTWxdetWTpw4wbhx45wup+gp8ElBsCyLlpYW1qxZQy6X45ZbbuEHP/gBgUDA6dJERMQBTU1NALS2tirwDQEFPnFcPp/njTfeYMeOHZimyZNPPsmUKVMwDMPp0kRExCGjR4/GMAza29udLqUkKPCJo9ra2li7di2HDh1iypQp3H///dTW1jpdloiIOMwwDMLhMG1tbU6XUhIU+MQxO3bsYOXKleRyOW6//XYWLlyIx+NxuiwRESkQkUiEzs5OLdwYAgp8MuLi8TgbN25kw4YNBINB7r33XmbNmuV0WSIiUmDC4TAnTpwgkUgo8F0lBT4ZUZlMhhdffJH29nbGjh3L008/rRexiIicUyQSwbIsYrEYNTU1TpdT1BT4ZMRs27aNd999l3w+z80338wdd9yhLVdEROS8IpEItm2TSCScLqXoKfDJsMvlcqxcuZKdO3diWRbLly9n6tSpWoUrIiIXFA6HsSyLeDzudClFT4FPhlV7ezvvv/8+Bw4cYPLkySxdupTq6mqnyxKRIZTJZMhkMvT09DhdipSYSCQCQH9/v8OVFD8FPhk227Zt46233iKfz3P77bezaNEi3G41ORERuTTfBb6+vj6HKyl+uvvKkOvv7+eTTz7h66+/JhwOc//99zN9+nSnyxIRkSKjHr6ho8AnQyqVSvH888/T29vLpEmT+MlPfqK5eg776quvWLp0qdNliIhcNrfbTU1NzRk9fNFolGPHjnH06FGOHj3K7Nmzufnmmx2ssjgYtm3bThchxc+2bbZs2cJ7772HaZrceuutLFiwQFuujIAdO3awadOmsz5u2zaHDx8GYMKECWd93u128+STT2qza7lk3377LV9++eVZHx8YGOD48eP4/X4aGxvP+vyoUaO455571NbkojKZDNFolP7+fqLRKNFolM2bNxONRqmvrycajZJOp8/4mr/6q79izJgxDlVcHAzDMNTDJ+eVy+Uuac5dLpfj1VdfZc+ePZimybPPPquD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)

   **Array:** Array backed by java array. O(1) acces by index. It’s immutable in size.

   `            `Elements are mutable.

   `	`It is not in the hierarchy
   ##
   ## <a name="__refheading___toc29758_1013244755"></a>**Seq**
   <a name="__refheading___toc29777_1013244755"></a> 

   Represent sequences. An iterable that has a length and whose elements have fixed indexed position starting by 0.

   **LinearSeq:** Efficient head and tail operations

   **IndexedSeq**: Efficient search and update operations

   **Buffer (mutable):** Allow updates, additions, insertions and removals. Main subclasses: ArrayBuffer and ListBuffer. Use case: When size of memory structure is not known in advance.

   **ArraySeq:** Immutable sequence backed by an array. It has O(1) access by index

         
   1. ## <a name="__refheading___toc29760_1013244755"></a>**Set**
      Iterable containing no duplicated elements

      **Sorted Sets**: Produces elements in a given order.

      `	`**TreeSet**: Default representation of Sorted sets using a binary search Tree (Red-Black tree)

      `	`**BitSet**:  Sets where elements are non negative integers. Use each member value as the index 	in a bit array (long value is 64 bits) to number 5 would be represented as a 1 in the 6<sup>th</sup> bit (0 	based) of the long/bit array. It is implemented like an array of longs. An emty set will have 	all it’s values to 0.

      **HashSet:** Set backed by a hashtable. Elements hash code determin its position in the set.

      `	`O(1) for contains, insertion and deletion but can go to O(n) if colisions

      **ListSet:** Backed by a linked list. Contains is O(n). Insertion order is preserved.

   1. ## <a name="__refheading___toc29779_1013244755"></a>**Map**

      **HashMap**: Implemented with a hash table O(log n)

      SortedMap → **TreeMap:** Map implemeted as a binary search tree (red-black tree)

      SeqMap: Map that preserve the order of insertion

      ` 	`**ListMap:** Implementation of SeqMap using a linkedin litst. O(n) lookup

      `		     `It might be an option for small Maps when order preservation is needed.

      `	`**VectorMap:** Keeps order but faster lookups

      **Priority Queue**:

      Mutable heap based collection that maintains elements sorted based on element priority. The highest priority element is dequeued first. It requires implicit Ordering[E]

      O(1) for dequeue. O(log n) for insertions and deletions.

      A Heap is a binary tree:

      - Max Heap: largest element is always at the root

      - Min Heap: smallest element is always at the root

      **Scala.collection.immutable**

      ![](data:image/png;base64,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)**scala.collection.mutable**

      ![](data:image/png;base64,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SlTAEJWLvJSUHvXp9ttvZ926dUyZMoX8/PwetTGYiGRzQRAEYcA5cuQI//u//0tmZiZLly5l6NChqFTXfmS1tLTw8ssvs2DBApKSkvq4p5969NFHmT59+qVCm5WVlbz88sscOHCAaEz+1NfX88YbbzBv3jymTJly3fvTXRbLp1u6tLa29rgdq9XKsmXL2Lt3L8XFxb3q02AgAilBEARhQAgEAhw4cIB33nkHWZb527/9W9LT0294Tl1dHevXr+crX/kKCQkJfdTTa5MkidmzZ/PUU0+RnJx86fX169fz+uuvY7fbI3KdQCDApk2bOHToEE899RSxsZEpp2AwGC79uaXlmiXZu02tVvP444/T3t7Ou+++i8832PdNvD4RSAmCIAj9yufzUV5ezltvvYXX6+W+++5j1KhRaDQ3nppqbGxk48aNLF68mPj48KbzokWSJHJzc3nmmWcYPnw4siwTCoUoKSnh97//PWfPniUYDN68oetoa2tj9erV6PV6Fi5cGLEgCq4OpCIxijZt2jQyMjLYsGEDDoej1+0NRCKQEgRBEPqFoihUVFTwpz/9Cbvdzv3338+0adNQq2++hL62tpY333yTpUuXRjSYiBSDwcBDDz3EsmXL0H6S+O50Olm1atWlgDFc586d409/+hMzZ85k6tSpEdmr77N9vsjhcERsOnLChAmMGzeOP/zhD7fkyJQIpARBEIQ+V1ZWxvvvv09FRQVLly5lwoQJ6PXd25+ttraWffv28aUvfQmjceBW0ZYkiYKCAr7yla8wcuRIJEkiFApx5swZXn75ZU6dOkUoFLppO36/ny1btnDmzBmef/55kpOTIx5EwZWBlM/n69XI2eUkSSItLY3HH3+cV155hcrKyoi0O1CIQEoQBEHoE6FQiJaWFt544w2OHTvGokWLmDVr1hVJzjdjt9tZvXo19957b0RrFUUjMLnIYrGwdOlSFi1ahE7XtcdeS0sLb775Jhs2bMDr9V539MfhcPDGG29gNptZvHjxFcFOpEUrkLooPj6eL3/5y3z44YfY7faoJOD3B1H+QBAEQYg6h8PB+vXriYuLY86cOSQmJoYdvLS3t7Nu3TqeffbZbk3/hUMbRt2pnho3bhzZ2dmsWbOGCxcuALB3717KyspYsmTJVYn1paWl7N27l7lz55LSw1IE4ZBlGaPRiMvlikogddETTzzB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)
      #
      #
      # <a name="__refheading___toc30630_252999171"></a>**Scala implicits**

   1. ## <a name="__refheading___toc30632_252999171"></a>**Types of implicits**

      1. ### <a name="__refheading___toc30634_252999171"></a>**Implicit conversion**
         If you call a method foo in an objects of class A and class A doesn’t have this method defined, scala compiler will try to find a conversion from class A to another class that have the method foo defined. If found, the implicit conversion will be applied, otherwise a compiler error will be raised.

         Scala 2:   **implicit** **def** aToB(a: **A**): **B** = ...

         Scala 3:

         `	`**given** **Conversion**[**A**,**B**] **with**

         `		`**def** apply(a: **A**): **B** = ...

      1. ### <a name="__refheading___toc30636_252999171"></a>**Implicit parameters**
         Parameters passed to a method call but compiler will try to fill them automatically.

         **def** foo[**T**](a: **T**)(**implicit** p: **JsonSerializable**[**T**])    

      1. ### <a name="__refheading___toc30638_252999171"></a>**View bound**

         An implicit that is both implicit conversion and implicit parameter.

         **def** getIndex[**E**,**S**](seq: **S**, element: **E**)(**implicit** conv: **S** => **Seq**[**T**]): **Int** = seq.indexOf(element)

         getIndex("abc", 'a')

         The syntactic sugar <% is called View Bond

         **def** getIndex[**T**, **CC** <% **Seq**[**T**]](seq: **CC**, value: **T**) = seq.indexOf(value)

      1. ### <a name="__refheading___toc30640_252999171"></a>**Context bound**

         **def** serialize[**T**](v: **T**)(implicti serializer: **JsonSerializable**[**T**]): **String**

         **def** serialize[**T**: **JsonSerializable**](v:**T**): **String** = {

         `	`**val** serializer = implicitly[**JsonSerializable**[**T**]]

         }

         The Syntax sugar is called Context Bound
   1. ## <a name="__refheading___toc30642_252999171"></a>**Implicit scope**

      - current scope: method or class

      - imports: first explicit then wild char

      - Companion objects

      - implicit scope of type arguments

      1- Current Scope

      `	`- Implicits defined in current scope (current method or class)

      `	`- Explicit imports

      `	`- wildcard imports

      2- Associated types

      `	`- Companion object of a type (ex: implicit conversion in Option companion object allows to use it like Iterable)

      `	`- Implicit scope of an argument’s type

      `	`- Implicit scope of type arguments

      `	`- Outer objects for nested types



   1. ## <a name="__refheading___toc30644_252999171"></a>**Recursive implicit resolution**

      **trait** **Show**[**T**] {
      `  `**def** show(a: **T**): **String**
      }

      **object** **instances** {
      `  `**implicit** **val** integer = **new** **Show**[**Int**] {
      `    `**override** **def** show(a: **Int**): **String** = s"Integer **$**a"
      `  `}

      `  `**implicit** **val** double = **new** **Show**[**Double**] {
      `    `**override** **def** show(a: **Double**): **String** = s"Double **$**a"
      `  `}

      `  `**implicit** **def** listShow[**T**: **Show**]: **Show**[**List**[**T**]] = **new** **Show**[**List**[**T**]] {
      `    `**override** **def** show(a: **List**[**T**]): **String** = a.map(implicitly[**Show**[**T**]].show).mkString(",")
      `  `}

      }

      **object** **syntax** {
      `  `**implicit** **class** **IntOps**(a: **Int**) {
      `    `**def** show(**implicit** s: **Show**[**Int**]): **String** = s.show(a)
      `  `}
      `  `**implicit** **class** **ListOps**[**T**](l: **List**[**T**]) {
      `    `**def** show(**implicit** showList: **Show**[**List**[**T**]]): **String** = showList.show(l)
      `  `}

      }

      **import** **instances**.\_
      **import** **syntax**.\_
      3\.show
      println(**List**(1,2,3,4,5).show)















1. # <a name="__refheading___toc30646_252999171"></a>**List example**

   **sealed** **trait** **CustomList**[+**T**] {
   `  `**def** add[**B** >: **T**](e: **B**): **CustomList**[**B**] = **Build**(e, this)
  
   `  `**def** headOption: **Option**[**T**] = this **match** {
   `    `**case** **Build**(h, t) => **Option**(h)
   `    `**case** **EmptyList** => **None**
   `  `}

   `  `**def** tail: **CustomList**[**T**] = this **match** {
   `    `**case** **Build**(h, t) => t
   `    `**case** **EmptyList** => **CustomList**.**Empty**
   `  `}
   `  `**override** **def** toString: **String** = {

   `    `**def** sep(acc: **String**): **String** = **if**(acc.isEmpty) "" **else** ","

   `    `@tailrec
   `    `**def** toStr(acc: **String**, l: **CustomList**[**T**]): **String** = l **match** {
   `      `**case** **Build**(h, t) => toStr(acc + sep(acc) + h, t)
   `      `**case** **EmptyList** => acc
   `    `}
   `    `toStr("", this)
   `  `}
   }

   **object** **CustomList** {
   `  `**def** apply[**T**](a: **T**\* ): **CustomList**[**T**] = a.foldRight(**Empty**[**T**]){ **case** (e, acc) => **Build**(e, acc)}
   `  `**def** Empty[**T**]: **CustomList**[**T**] = **EmptyList**
   }


   **case** **class** **Build**[**T**](h: **T**, t: **CustomList**[**T**]) **extends** **CustomList**[**T**]
   **case** **object** **EmptyList** **extends** **CustomList**[**Nothing**]


   Generic tree structure with F-bounded polymorfism
<a name="pagenumwizard_footer_default page style46"></a>84
