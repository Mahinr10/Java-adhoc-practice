package org.example;

import org.example.syria.Place;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class SerializePractice {
    public static void run() {
        Tiger tiger = new Tiger();
        tiger.setName("bracket");
        tiger.setId("1");
        tiger.setAge(3);

        Place place = new Place();
        tiger.setPlace(place);
        place.setContinent("ASIA");
        place.setCountry("Bangladesh");

       //writeOnFile(tiger);

        Optional<Tiger> carbon = Optional.ofNullable(readFromFile());
        carbon.ifPresent(c -> System.out.printf("Name: " +
                "%s, Country: %s%n", c.getName(), c.getPlace().getCountry()));

    }

    public static void writeOnFile(Tiger tiger) {
        try(
                FileOutputStream fileOutputStream = new FileOutputStream("tiger.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(tiger);
        } catch (FileNotFoundException ex) {
            System.out.println("404: File Not Found");
        } catch (IOException ex) {
            System.out.println("500: Internal Server Error");
            System.out.println(ex.getMessage());
        }
    }

    public static Tiger readFromFile() {
        try(
                FileInputStream fileInputStream = new FileInputStream("tiger.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            return (Tiger) objectInputStream.readObject();
        } catch (IOException ex) {
            System.out.println("500: Internal Server Error");
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("400: Bad Request");
        }
        return null;
    }
}
