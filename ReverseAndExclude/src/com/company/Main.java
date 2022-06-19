package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        List<Integer> input = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int numToDivideOn = Integer.parseInt(scan.nextLine());

        input.removeIf(el -> el % numToDivideOn == 0);
        Collections.reverse(input);
        input.forEach(el -> System.out.print(el + " "));

    }
}
