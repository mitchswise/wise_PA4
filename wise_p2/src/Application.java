/**
 * Mitchell Wise
 * 10/28/2019
 * COP3330
 * Dr. Christopher D. Hollander
 */

import java.io.*;

public class Application { // problem 2 shall contain a public class called Application

    public static void main(String[] args) throws IOException { // Application shall contain a main method

        DuplicateCounter duplicateCounter = new DuplicateCounter(); // the main method shall create an instance of a DuplicateCounter called duplicateCounter

        duplicateCounter.count("problem2.txt");

        // the main method shall use the write method of duplicateCounter to output
        // the unique words of "problem2.txt" to a file called "unique_word_counts.txt"
        duplicateCounter.write("unique_word_counts.txt");

    }

}