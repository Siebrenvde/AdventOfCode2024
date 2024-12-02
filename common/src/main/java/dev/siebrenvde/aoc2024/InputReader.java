package dev.siebrenvde.aoc2024;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.Objects;

public class InputReader {

    private static String FILE_NAME = "input.txt";

    public static List<String> readInput() {
        try {
            URL resource = InputReader.class.getClassLoader().getResource(FILE_NAME);
            Objects.requireNonNull(resource);
            return Files.readAllLines(new File(resource.toURI()).toPath());
        } catch(URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setTesting() {
        FILE_NAME = "example.txt";
    }

}
