package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.stream.Stream;

public class JacksonPractice {
    public static void run() throws IOException {

        Stream<String> p;
        Programmer programmer = new Programmer();
        programmer.setId("1");
        programmer.setName("Mahin");
        programmer.addSkill("JAVA", "Basic");
        programmer.addSkill("SPRING BOOT", "BASIC PRO MAX");
        programmer.addSkill("ADA", "Wannabe");
        programmer.setMotivation("{\"source\":\"The Great Genghis Khan [UPDATED] \", \"message\":\"If you are afraid doing it then " +
                "don't do it. If you are doing it then don't afraid\"}");
        programmer.setProgrammerType(Utils.PROGRAMMER_TYPE.SLEEPY);
        programmer.setDob(LocalDate.of(1999, 8, 11));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);


        System.out.println(objectMapper.writeValueAsString(programmer));
        System.out.println(objectMapper.writeValueAsString(Utils.PROGRAMMER_TYPE.LAZY));

        objectMapper.writeValue(new File("program.json"), programmer);
    }
}
