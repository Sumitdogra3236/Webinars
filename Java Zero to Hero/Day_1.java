import javax.print.event.PrintJobListener;

/*
James Arthur Gosling -> Father of Java - 1995
Sun-MicroSystem -> Oracle

*/

/*
JVM - Java Virtual Machine 
JRE - Java Runtime Environment - provides the runtime environment for the code
JDK - Java Development Kit - its a kit, contains other libraries

C/C++ Programs -> directly interact with OS
Java Programs-> intracts with JVM

Java is platform dependent - it is due to JVM
JVM is patform dependent

Tasks of JVM:
Load the code
Verify the code 
Provide JRE
Execute the code


*/


// class Demo {
//     public static void main(String[] args) {
//         System.out.println("Hello there!");
//     }
// }

/*
OOP Vs POP

OOP - bottom up approach, focuses on data
POP - Top Down Approach, focuses more on performing the task 


Classes & Object:
Class - is a a collection of similar object, its a blueprint (set of features, specifications) &
Object - is a instance of a class, object implement those features

Memory is not allocated for the class, when we declare the object, then the memory is allocated for that object.
Class doesn't take space, object take space
*/


class Test {
    
        int x; // instance variable or object variable
        void show() { // method -> function defined inside a class
            System.out.println("Hello from Class Test");
        }
    
}

class TestDrive {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.x = 20;
        System.out.println("Data: " +ob.x );
        ob.show();
    }

}