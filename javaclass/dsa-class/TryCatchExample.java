

import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class TryCatchExample {


    public static void main(String[] args) throws FileNotFoundException {     
      
         PrintWriter pw = new PrintWriter("amanssss.txt"); //may throw exception
  
        System.out.println("File saved successfully");
    }
}

