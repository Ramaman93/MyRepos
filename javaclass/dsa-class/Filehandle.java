import java.io.File;  

// Importing the IOException class for handling errors  
import java.io.IOException;   
 class CreateFile {  
               public static void main(String args[])  {  
                 // Creating an object of a file  

                 try{
                       File f0 = new File("D:/Users/aman/Desktop/javaclass/FileOperationExample.txt");   
                       if (f0.createNewFile()) {  
                                  System.out.println("File " + f0.getName() + " is created successfully.");  
                                                } else {  
                                  System.out.println("File is already exist in the directory.");   
                                                       }  
                         } 
                catch(Exception e)
                {
                 System.out.println("everything is ok");
                } 
                 System.out.println("hello k");

        }  
}  