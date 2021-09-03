
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


In Java, JVM calls the main function
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
        static int y;
        // void show() { // method -> function defined inside a class
        //     System.out.println("Hello from Class Test");
        // }
    
        void show() {
            System.out.println("X = " + x + " Y = " + y);
        }
}

class TestDrive {
    public static void main(String[] args) {
        Test ob1 = new Test();
        Test ob2 = new Test();
        ob1.x = 20;
        ob2.x = 40;

        ob1.y = 20;
        ob2.y = 50;
        // System.out.println("Data: " +ob1.x + ", " + ob2.x  );
        ob1.show();
        ob2.show();
    }

}


/*
 * James Arthur Goseling - Father of Java - 1995 Sun Microsystems Oracle
 * 
 */

/*
 * 
 * JVM - Java Virtual Machine JRE - Java Runtime Environment JDK - Java
 * Development Kit
 * 
 * 
 * C/C++ programs -> directly interact with the OS Java Programs -> Interacts
 * with JVM
 * 
 * java is platform independent - it is due to JVM JVM is platform dependent
 * 
 * Tasks of JVM: Load the code Verify the code Provide JRE Execute the code
 * 
 * 
 * Class File/Byte Code Prog.c -> a.out Prog.java -> Class File/Byte Code
 * 
 */

/*
 * class Demo { public static void main(String args[]) {
 * System.out.println("Hello Java Coders");
 * System.out.print("Hi LetsUpgraders"); } }
 */

/*
 * 
 * OOP vs POP
 * 
 * OOP - bottom up approach, focuses on data POP - Top Down Approach, focuses
 * more on performing the task
 * 
 * Class & object
 */

// class Test {
//     int x; // instance variable or object variable
//     static int y; // static variable or class variable
//     /*
//      * void show() { //method System.out.println("Test Class Method"); }
//      */

//     void show() {
//         System.out.println("X = " + x + " Y = " + y);
//     }
// }

// class TestDrive {
//     public static void main(String[] args) {
//         Test ob1 = new Test();
//         Test ob2 = new Test();
//         Test ob3 = new Test();
//         ob1.x = 20;
//         ob2.x = 40;
//         ob3.x = 10;

//         ob1.y = 30;
//         ob2.y = 50;
//         ob3.y = 70;

//         // System.out.println("Data: " + ob1.x + ", " + ob2.x);
//         ob1.show();
//         ob2.show();
//         ob3.show();

//     }
// }