package com.main;

public class Main {

    public static void main(String[] args) {
        print(args);

        args = sort(args);
        print(args);

        args = new String[]{"XXX", "CCC", "DDD", "AAA", "TTT"};
        args = sort(args);
        print(args);
    }

    private static void print(String[] args) {
        for (String str : args) {
            System.out.println(str);
        }
    }

    private static <T extends Comparable<T>> T[] sort(T[] args) {
        int min;
        for (int i = 0; i < args.length - 1; i++) {
            min = i;
            for (int j = args.length - 1; j > i; j--) {
                if (args[min].compareTo(args[j]) > 0) {
                    min = j;
                }
            }
            T temp = args[min];
            args[min] = args[i];
            args[i] = temp;
        }
        return args;
    }
}
