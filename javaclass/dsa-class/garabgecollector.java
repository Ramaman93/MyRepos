/*
class CallingGC
{

//using system class

 public static void main(String []args)
 {
  CallingGC s=new CallingGC();
  s=null;
  System.gc();
  System.out.println("GC has been called by JVM");

 // System.out.println("GC ");
 // System.out.println("GC has ");

 }
*/

class CallingGC
{

/*using Runtime class
 it is singleton class in java , with the help of runtime class we can access runtime 
object by using getRunTime() method. */
 public static void main(String []args)
 {
  CallingGC s=new CallingGC();
  s=null;
  Runtime.getRuntime().gc();
  System.out.println("GC has been called by JVM");

 System.out.println("hello");
System.out.println("hello112");

 }


 protected void finalize() 
{
  System.out.println("it is called for clean up coding");
}


}