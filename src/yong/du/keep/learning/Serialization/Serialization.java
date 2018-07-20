package yong.du.keep.learning.Serialization;

import yong.du.keep.learning.Util.*;
import java.io.*;

public class Serialization {
    public static void main(String[] args)
    {
        Person person = new Person(28, "Pokemon");
        Address address = new Address(100);
        Employee employee = new Employee(person,address);

        String filename = "employee.txt";

        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(employee);
            out.flush();
            out.close();
            file.close();

            System.out.println("Employee has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


        Employee employeelDe = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            employeelDe = (Employee) in.readObject();

            in.close();
            file.close();

            System.out.printf("Object has been deserialized " + employeelDe);
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
