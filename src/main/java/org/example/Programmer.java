package org.example;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import static org.example.Utils.*;

@JsonPropertyOrder(alphabetic = true)
@JsonRootName("Hashirama")
public class Programmer {
    @JsonIgnore
    String id;
    String name;

    @JsonAnyGetter
    Map<String, String> skills;

    @JsonRawValue
    String motivation;

    PROGRAMMER_TYPE programmerType;

    LocalDate dob;

    public Programmer() {
        skills = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonGetter("Alien")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSkill(String particular, String level) {
        skills.put(particular, level);
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public PROGRAMMER_TYPE getProgrammerType() {
        return programmerType;
    }

    public void setProgrammerType(PROGRAMMER_TYPE programmerType) {
        this.programmerType = programmerType;
    }

    @JsonProperty("Date of Birth")
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
