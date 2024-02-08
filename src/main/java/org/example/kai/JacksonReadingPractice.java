package org.example.kai;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.example.Programmer;

import java.io.File;
import java.io.IOException;

public class JacksonReadingPractice {
    public static void run() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper = objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        ProgrammerInfo programmerInfo = objectMapper.readValue(new File("program.json"), ProgrammerInfo.class);
//        System.out.println(objectMapper.writeValueAsString(programmerInfo));

        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true)
                .registerModule(new JavaTimeModule());
        Programmer programmer = objectMapper.readValue(new File("program.json"), Programmer.class);
        System.out.println(objectMapper.writeValueAsString(programmer));
    }
}
