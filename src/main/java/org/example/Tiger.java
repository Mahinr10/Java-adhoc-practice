package org.example;

import org.example.syria.Place;

import java.io.Serial;
import java.io.Serializable;

public class Tiger implements Serializable {
    @Serial
    private static final long serialVersionUID = 1383342233;

    public static String owner = "Mahin";

    private String name;
    private String id;
    private int age;

    private Place place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
