package com.jotorres.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> username = Optional.of("jotorres");

        username.ifPresent(System.out::println);

        String gender = null;
        Optional<String> genderOpt = Optional.ofNullable(gender);

        if (genderOpt.isEmpty()) {
            System.out.println("Empty");
        }

        Optional<String> greeting = Optional.of("Hello everyone");
        greeting.ifPresent((message) -> System.out.println(message.concat(", I'm Jorge")));
    }
}
