

public class ExepceptionSequence {
    public static void main(String[] args) {
//        try {
//            System.out.println("hello this is try block");
//        }catch(Exception e)
//        {
//            System.out.println("this is catch block 1");
//        }
//        try{
//            System.out.println("second try block ");
//        }
//        catch(Exception e)
//        {
//            System.out.println("this is catch block 1");
//        }

	try {
            System.out.println("hello this try");
           }
        try{
            System.out.println("hello this try");
        }
        catch (Exception e) {
            System.out.println("hello this finally");
        }
        finally{
            System.out.println("hello this finally");   
          }
    }
}