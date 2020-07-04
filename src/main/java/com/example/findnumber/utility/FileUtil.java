package com.example.findnumber.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtil {
    
    public static void writeObjectToFile(Object obj,String path) throws IOException {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))){
           outputStream.writeObject(obj);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static Object rideObjectFromFile(String path) throws ClassNotFoundException, IOException {
        Object obj = null;
        ObjectInputStream objectStream = new ObjectInputStream(new FileInputStream(path));
        obj = objectStream.readObject();
        return obj;
    }
}
