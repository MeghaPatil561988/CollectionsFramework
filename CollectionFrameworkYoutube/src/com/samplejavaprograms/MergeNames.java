package com.samplejavaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeNames 
{
	public static String[] uniqueNames(String[] names1, String[] names2) {

        String[] combine = Stream.concat(Arrays.stream(names1), Arrays.stream(names2))
                .toArray(String[]::new);

        List<String> distinctElements = Arrays.stream(combine)
                .distinct()
                .collect(Collectors.toList());

        return distinctElements.toArray(new String[distinctElements.size()]);

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
