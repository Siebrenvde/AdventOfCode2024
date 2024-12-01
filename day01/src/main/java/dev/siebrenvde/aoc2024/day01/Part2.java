package dev.siebrenvde.aoc2024.day01;

public class Part2 extends Part1 {

    @Override
    public int getResult() {
        int similarity = 0;

        for(int left : getLeftList()) {
            similarity += (left * (int) getRightList().stream().filter(right -> right == left).count());
        }

        return similarity;
    }

}
