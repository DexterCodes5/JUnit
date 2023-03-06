package dev.dex;

public class Main {

    public static void main(String[] args) {
        Utilities u = new Utilities();

        System.out.println(u.removePairs("ABBCDEEFF"));
        System.out.println(u.everyNtChar(new char[] {'a', 'b', 'c', 'd'}, 2));
    }
}
