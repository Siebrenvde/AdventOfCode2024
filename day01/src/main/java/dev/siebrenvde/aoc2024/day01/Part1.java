package dev.siebrenvde.aoc2024.day01;

import dev.siebrenvde.aoc2024.InputReader;
import lombok.Getter;

import java.util.*;

@Getter
public class Part1 {

    private final List<Integer> leftList = new ArrayList<>();
    private final List<Integer> rightList = new ArrayList<>();

    public Part1() {
        InputReader.readInput().forEach(line -> {
            String[] parts = line.split(" {3}");
            leftList.add(Integer.parseInt(parts[0]));
            rightList.add(Integer.parseInt(parts[1]));
        });
    }

    public int getResult() {
        List<Integer> leftNums = getLeftList().stream().sorted().toList();
        List<Integer> rightNums = getRightList().stream().sorted().toList();

        int result = 0;

        for(int i = 0; i < leftNums.size(); i++) {
            int left = leftNums.get(i);
            int right = rightNums.get(i);
            result += (Math.max(left, right) - Math.min(left, right));
        }

        return result;
    }

}
