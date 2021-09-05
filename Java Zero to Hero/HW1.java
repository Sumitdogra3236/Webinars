// Interpreter -> It translates the code instruction by instruction, Its execution is slower, Its compile time is less.

// Compiler -> It translates the entire program at once, Its execution is faster, It takes more time to compile the code.

import java.util.*;
class Test {
    public static void main(String[] args) {

        String name;
        int roll;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the roll no: ");
        roll = sc.nextInt();

        System.out.println("Name: "+ name + "\nRoll No: "+ roll);
    }
}