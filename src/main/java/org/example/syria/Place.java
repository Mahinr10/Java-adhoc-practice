package org.example.syria;

import java.io.Serial;
import java.io.Serializable;

public class Place implements Serializable {
    @Serial
    private static final long serialVersionUID = 113;

    private String country;
    private String continent;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
