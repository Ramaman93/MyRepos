
     
class ThrowExample
{
public static void main(String [] args)
{
throw new ArithmeticException("/ by 0");
//ArithmeticException by the user explicitly by new ArithmeticException("/ by 0") and then it is handedover to jvm by using throw keyword.
// throw keyword is best used with throws keyword specially in case of custom exception
}
}