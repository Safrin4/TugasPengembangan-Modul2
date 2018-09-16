package Modul2.Tugas2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class no01 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String inputloc= "E:/inp.txt";
        String outputloc="E:/tugas1.txt";
        InputStream fileInput= new FileInputStream(inputloc);
        OutputStream fileOutput= new FileOutputStream(outputloc);
        int data= fileInput.read();
        String word ="";
        
        while (data !=-1) {            
            char z=(char) data;
            System.out.print(z);
            data=fileInput.read();
            word+=(z);
        }
        
        for (int i = 0; i < word.length(); i++) {
            fileOutput.write((byte)word.charAt(i));
        }
        
        fileInput.close();
        fileOutput.close();
    }
}
