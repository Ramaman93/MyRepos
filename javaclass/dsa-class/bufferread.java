package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferReader {

    public static void main(String[] args) throws IOException  {
        InputStreamReader inputStreamReader=new InputStreamReader( System.in);

        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.println("Enter your name");
        int s= bufferedReader.read();
       // System.out.println(s);

    }
}
