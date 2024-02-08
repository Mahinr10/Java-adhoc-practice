package org.example.timeline;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DateTimePractice {
    public static void run() {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        String a = "11/08/1999";
        List<Integer> b = Arrays.stream(a.split("/")).map(Integer::parseInt).toList();
        LocalDate e = LocalDate.of(b.get(2), b.get(1), b.get(0));
        System.out.println(e);

        String c = "1999-08-11";
        LocalDate f = LocalDate.parse(c);
        System.out.println(f);

        List<LocalDate> p = Arrays.asList(LocalDate.parse("2024-08-11"), LocalDate.parse("2024-07-11"),
                LocalDate.parse("2024-08-09"), LocalDate.parse("0999-01-12"));
        //Collections.sort(p);
        p.sort(LocalDate::compareTo);
        p.forEach(System.out::println);

        p.sort((ss, dd) -> dd.compareTo(ss));
        p.forEach(System.out::println);


    }
}
