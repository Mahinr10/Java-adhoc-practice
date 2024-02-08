package org.example;

import com.fasterxml.jackson.annotation.JsonValue;

public class Utils {

    public static enum PROGRAMMER_TYPE {
        LAZY(1, "Lazy"), SLEEPY(2, "Sleepy");

        private Integer id;
        private String name;
        PROGRAMMER_TYPE(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @JsonValue
        public String JsonName() {
            return name + " " + id.toString();
        }
    }


}
