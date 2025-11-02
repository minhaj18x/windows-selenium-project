package SeleniumBasics;

//Example of basic Java concepts

//1. Class definition
class Person {
 // 2. Attributes (Variables)
 String name;
 int age;

 // 3. Constructor (used to initialize object)
 Person(String name, int age) {
     this.name = name;  // "this" refers to the current object
     this.age = age;
 }

 // 4. Method (Function inside a class)
 void introduce() {
     System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
 }
}

//5. Inheritance: Student extends Person
class Student extends Person {
 String course;

 // Constructor using 'super' to call parent constructor
 Student(String name, int age, String course) {
     super(name, age);  // calls Person(name, age)
     this.course = course;
 }

 // Overriding a method
 @Override
 void introduce() {
     System.out.println("Hi, I'm " + name + ", a " + course + " student.");
 }
}

//6. Main class where program starts

public class Java_all_concepts {
	
	 public static void main(String[] args) {
	     // 7. Object creation (Instantiation)
	     Person p1 = new Person("Minhaj", 35);
	     Student s1 = new Student("Heena", 33, "Computer Science");

	     // 8. Method calling
	     p1.introduce();   // calls Person’s method
	     s1.introduce();   // calls overridden Student’s method
	 }

}
