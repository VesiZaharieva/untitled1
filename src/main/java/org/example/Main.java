package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World!";
        //int x = 4;
        //int y = 5, z = 6;
        //byte b = 101;
        //int sum = x + y;
        //String firstName = "Alex";
        //String lastName = "Dermenji";
        //String fullName = firstName + " " + lastName;
        //System.out.println(myNum);
        //System.out.println(myFloatNum);
        //System.out.println(myLetter);
        //System.out.println(myBool);
        //System.out.println(myText);
        //printName();
        //String name = printName ("Test");
        //System.out.println(name);
        String firstName = "Merry";
        String secondName = "Carol";
        String familyName = "Smith";
        int age = 36;
        String mail = "aaa@b.b";
        String address = "18 Moon str.";
        String phone = "+359888223344";
        int postCode = 9010;
        String info = "More info";
        System.out.println("Names: " + firstName + " " + secondName + " " + familyName);
        System.out.println("Age: " + age);
        System.out.println("E-mail: " + mail);
        System.out.println("Post code: " + postCode);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Additional info: " + info);

        calculateAvg(1000, 2000);

    }

    public static void printName() {
        System.out.println("Alex");
    }

    public static String printName(String name) {
        return name + "!";
    }

    public static void calculateAvg(int numberOne, int numberTwo) {
        int result = (numberOne + numberTwo) / 2;
        System.out.println(result);


    }
}
