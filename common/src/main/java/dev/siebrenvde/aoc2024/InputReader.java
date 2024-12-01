package dev.siebrenvde.aoc2024;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.Objects;

public class InputReader {

    public static List<String> readInput(String fileName) {
        try {
            URL resource = InputReader.class.getClassLoader().getResource(fileName);
            Objects.requireNonNull(resource);
            return Files.readAllLines(new File(resource.toURI()).toPath());
        } catch(URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
