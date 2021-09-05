/*
System.out.print() / println()
Scanner sc = new Scanner(System.in)
Final
Constructor
Mini Project - Cab(Uber) Fare Calculation

*/

/*
PrintStream class - present in java.io package
print() & println() are members of PrintStream class.

We need object of PrintStream to access print() or println()
"out" is object of PrintStream which is present in System class.
"out" is a static member of System class.

So, out can be accessed by System.out
Finally, to access println(), System.out.println() is used

*/

/*

class Test {
    int x;
    psv main() {
        Test ob = new Test(); // Creates object
        ob.x = 20;
    }
}

Test ob = new Test() - Doesn't create object by itself.
It takes help from constructor to create object;

new Test() -> implicitly call constructor and constructor creates object
Test ob     -> reference variable

Constructor - method with the same name as class and no return type

class Test:

//default constructor
Test() {

}

When user don't mention any constructor, then JVM places a default
constructor automatically.
*/

/*
class Test {
    int x;

    
    Hidden Constructor - placed by JVM
    Test() {

    }

    public static void main(String[] args) {
        Test ob = new Test();
        ob.x = 20;
        System.out.println(ob.x);
    }
}
*/

/*
Task of Constructor:
1. Creates object
2. It initializes the object

Types:
- Default
- Parameterized

Copy constructor copies one object data to another object.
*/

//Cab Fare Calculation Object
import java.util.Scanner;

class Cab {
    int fare;
    int d; // distance travelled by user

    public Cab() {
        fare = 30;
    }

    // parameterized constructor
    public Cab(int amt) {
        fare = amt;
    }

    // copy Constructor
    public Cab(Cab ob2) { // Cab ob1 = new Cab(ob);
        fare = ob2.fare; // ob1.fare = ob.fare
    }

    void showFare() {
        System.out.println("Total Fare: Rs " + fare);
    }
}

class RideCab {
    public static void main(String[] args) {
        int cd; // distance of cab from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from user: ");
        cd = sc.nextInt();
        if (cd > 5) {
            Cab ob = new Cab(30 + 10 * (cd - 5));
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare = ob.fare + 10 * ob.d;

            ob.showFare();
        } else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare = ob.fare + 10 * ob.d;

            ob.showFare();

            Cab ob1 = new Cab(ob);
            ob1.showFare();
        }

    }
}

/*
 * Scanner sc = new Scanner(System.in); Scanner doesn't have default
 * constructor. It has a param constructor taking object of InputStream class as
 * argument "in" is object of InputStream class which is present in System
 * class. "in" is a staic member of System class. So, we can acess "in" by
 * System.in. Finally, we write: Scanner sc = new Scanner(System.in);
 * 
 */

/*
 * Final, static - Non-access modifiers
 * 
 * Final variable - final int x; - variable value cannot be changed Final method
 * - final void fun(); - method cannot be overriden Final class - final class
 * Test(); - Class cannot be inherited
 * 
 * 
 */