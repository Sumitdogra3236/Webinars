/*

Data Types:
Primitive Data Types - int, char, float, double, boolean, byte, short, long
Non-Primitive Data Types - array, string, class etc.
*/

/*
Packages - it consists of sub-packages and class files
Types:
Built-in - lang, util, sql, awt, net, io
lang - default package
lang - String, System, Math
util - Arrays, Scanner
io - PrintStream, InputStream

User defined- user creates

*/
/*

Scanner Class - Present in util package
It contains;
nextInt() - Takes integer input
nextFloat() - takes float input
nextLine() - takes entire line as input
*/

/*
import java.util.Scanner;
class Test {
    public static void main(String[] args) {

        int roll;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll no: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name: ");
        name = sc.nextLine();

        System.out.println("Roll no: " + roll + "\nName: " + name);
    }
}
*/

/*
// User defined package   -> Syntax to create package -> javac -d . Day2.java ,  -d -> directoty, . -> location / position(. means the same directory), then file name
i.e. javac -d . Day2.java
To execute -> java packagename.className
i.e -> java hero.TestPackage 

package hero;
class TestPackage {
    public static void main(String[] args) {
        System.out.println("This is package");
    }
}
*/

/*
Access Modifiers:
They define/modify how a member can be accessed.

Types:
public - can be accessed anywhere
private - can be accessed only within the same class
protected - can be accessed  
default - cannot be accessed outside the current package

two packages - zero and hero
zero - class A - protected member x
hero - class B
B can access x (protected member of A) only if B is child class of A

Order of strictness of Access modifiers:
public < protected < default < private
*/
/*
class Test {
    private int p;
    protected int q;
    public int x;
    int y;
}

class TestDrive {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.p = 10;
        ob.q = 20;
        ob.x = 30;
        ob.y = 40;

        System.out.println("Data: " + ob.p + ob.q + ob.x + ob.y);
    }
}
*/
/*
//Setters and getters - indirect way to access private member
class Test {
    private int x;

    //setter method
    void setX(int a) {  
        x = a;
    }

    //getter method
    int getX() {
        return x;
    }
}

class TestDrive {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.setX(20);
        System.out.println("Data: " + ob.getX());
    }
}
*/

/*
Static methods: 
- can be accessed by both objects and class name
- can only access static member of the class
Non-static methods: 
- can be accessed only by objects
- can access both non-static and static members of the class
*/

/*
class Test {
    int x;
    static int y;

    //Non-static method
    void show() {
        System.out.println("Data: " + x + y);
    }

    //static method
    static void display() {
        System.out.println("Data: " + y);
    }
}
class TestDrive {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.x = 10;
        Test.y = 20;

        ob.show();
        Test.display();
    }
}
*/

/*
Why main is public static void?

public static void main(String[] args)

Command Line Argument - Taken by main function

*/

class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}