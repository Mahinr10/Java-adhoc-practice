package org.example;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.kai.JacksonReadingPractice;
import org.example.timeline.DateTimePractice;

import static org.example.Utils.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        //DateTimePractice.run();

        //SerializePractice.run();

        //JacksonPractice.run();

        JacksonReadingPractice.run();

    }

    public static void MahinMisc() {
        String a = "apple";
        StringBuilder b = new StringBuilder(a);

        if(a == b.toString()) {
            System.out.println("OKI DOKI (1)");
        }

        if(a == b.toString().intern()) {
            System.out.println("OKI DOKI (2)");
        }

        for(int i = 0; i < b.length(); i++) {
            if(b.charAt(i) == 'p') {
                b.replace(i, i + 1, "s");
            }
        }

        System.out.println(b);

        for(int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            x++;
            b.append(x);
        }

        b.replace(1, 3, "mahin");

        System.out.println(b.toString().repeat(2));
    }

    public static void TashrifStringCount() {
        String cake = "Aabir";
        String lower = cake.toLowerCase();
        String upper = cake.toUpperCase();

        Set<Character> s = new HashSet<>();
        for(char d : lower.toCharArray()) {
            s.add(d);
        }
        System.out.println(s.size());
    }

    public static void ProtapBhai() throws IOException {
        Map<String, Object> jsonRead = new ObjectMapper().readValue(new File("program.json"), new TypeReference<Map<String, Object>>() {});
        System.out.println("start manual parsing");
        goJson(jsonRead);
    }

    public static void goJson(Map<String, Object> json) {
        for(Map.Entry<String, Object> entry : json.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            if(entry.getValue() instanceof String) {
                System.out.println(entry.getValue() + ", ");
            } else {
                System.out.println(" {");
                Map<String, Object> obj = (Map<String, Object>) entry.getValue();
                goJson(obj);
                System.out.println("},");
            }

        }
    }



}