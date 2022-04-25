package org.vashonsd;

public class Main {

    public static void main(String[] args) {
	Holiday h = new Holiday(4, "The Day Concert", "A concert delving deep into the world's problems", true);
        System.out.println(h);
        Holiday t = new Holiday(5, "Later", "Concert about words", false);
        System.out.println(t);
        Holiday p = new Holiday(9, "Never", "Sadness", true);
        System.out.println(p);
    }
}
