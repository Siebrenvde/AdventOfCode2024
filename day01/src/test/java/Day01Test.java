import dev.siebrenvde.aoc2024.InputReader;
import dev.siebrenvde.aoc2024.day01.Part1;
import dev.siebrenvde.aoc2024.day01.Part2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test {

    @BeforeAll
    static void setTesting() {
        InputReader.setTesting();
    }

    @Test
    void part1() {
        int result = new Part1().getResult();
        assertEquals(11, result);
    }

    @Test
    void part2() {
        int result = new Part2().getResult();
        assertEquals(31, result);
    }

}
