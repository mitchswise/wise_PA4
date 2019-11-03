import java.io.*;
import java.util.*;

public class DuplicateRemover { // created class called DuplicateRemover

    private Set<String> uniqueWords; // the unique words should be stored in an instance variable called uniqueWords

    public DuplicateRemover() { // default constructor

        uniqueWords = new HashSet<>();

    }

    public void remove(String dataFile) { // instance meathod called removed, that takes a single parameter called dataFile

        try { // try this first, if it does not work properly than catch
            Scanner scnr = new Scanner(new File(dataFile));

            while(scnr.hasNext()) { // scan through dataFile (problem1.txt) while theirs a next word in the file

                uniqueWords.add(scnr.next());  // puts the next word in dataFile (problem1.txt) into the HashSet uniqueWords

            }

            scnr.close(); // close dataFile (problem1.txt)
        }
        catch (FileNotFoundException e) { // if try does not work properly, then catch

            System.out.println(e);

        }

    }

    public void write(String outputFile) { // created instance method called write, that takes a single parameter called outputFile

        try { // try this first, if it does not work properly than catch
            PrintWriter printWriter = new PrintWriter(new File(outputFile));

            for (String string : uniqueWords) {

                printWriter.println(string); // prints string to outputFile

            }

            printWriter.close(); // close outputFile (unique_words.txt)
        }
        catch (FileNotFoundException e) { // if try does not work properly, then catch

            System.out.println(e);

        }

    }

}