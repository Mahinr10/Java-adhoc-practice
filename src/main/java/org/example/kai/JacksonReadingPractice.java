package org.example.kai;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonReadingPractice {
    public static void run() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper = objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ProgrammerInfo programmerInfo = objectMapper.readValue(new File("program.json"), ProgrammerInfo.class);
        System.out.println(objectMapper.writeValueAsString(programmerInfo));
    }
}
