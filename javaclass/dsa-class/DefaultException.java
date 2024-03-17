/*Default Exception Handling in Java-*/ 




class DefaultException
{

public static void main(String [] args)
{
  method1();

System.out.println("method1 is called");
	
}



static void method1()
{

method2();
System.out.println("method2 is called");
}

static void method2()
{
System.out.println(1/0);
System.out.println("hello this is method2");
}
//every program in java contain atleast one thread , in above program we have one thread that is main thread.
//this main thread creates runtime stack for the given program.program will
//if we do not use any exception technique such as try cartch block then how default exception handlig work
//the method in which exception occurs will create an object Exception class with the help of jvm  following details
// name of Exception 
//Decription of exception 
// Stack trace or location of exception
//then method will overhand it to jvm then will ask to method wheather do u have any exception handling course
///such as try catch block if not then jvm remove it from run time stack and abnormal terminition occurs.
//it will print out jvm will perform with help of default exception object and that object will print details
 

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DefaultException.method2(DefaultException.java:28)
        at DefaultException.method1(DefaultException.java:22)
        at DefaultException.main(DefaultException.java:11)
}


Custom Exception :- have five body part

try:-the code that may thrown an exception should be placed inside try block.
	in a method there may one more statement that could through an exception all this statement should have there own try block and
 for each of them there should be corresponding catch block.

catch:- if an exception occur in try block then correponding associated catch block handles the exception
connection
finally:- it executes after try block ends wheather an exception occurs or not.it use to realese the system resources such as database 
connection.




imp point:- exception always occur at runtime and what we get at compile time some times people miss understood as a compile time exception which is 
actually compile time syntatical error.


there are two types of exception 
1. exception that are checked at compile time that are known as compile time exception 
2.  exception that are checked at run time that are known as run time exception 

**exception handling is used to avoid the abnormal termination of program.
Suppose ur whole is consiste 6 satement nd exception at 3rd statement then remaining 3 statement will not get executed this is abnormal termination .
but if handle it will execute all the statement.

Partially Checked Exception:-
Full Checked Exception:-

Error:- it occur due to system resources 


Common Scenarios of Java Exceptions
There are given some scenarios where unchecked exceptions may occur. They are as follows:

1) A scenario where ArithmeticException occurs
If we divide any number by zero, there occurs an ArithmeticException.

int a=50/0;//ArithmeticException  
2) A scenario where NullPointerException occurs
If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.

String s=null;  
System.out.println(s.length());//NullPointerException  
3) A scenario where NumberFormatException occurs
If the formatting of any variable or number is mismatched, it may result into NumberFormatException. Suppose we have a string variable that has characters; converting this variable into digit will cause NumberFormatException.

String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  
4) A scenario where ArrayIndexOutOfBoundsException occurs
When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. there may be other reasons to occur ArrayIndexOutOfBoundsException. Consider the following statements.

int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException  

