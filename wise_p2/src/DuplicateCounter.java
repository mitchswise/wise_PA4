import java.io.*;
import java.util.*;

public class DuplicateCounter { // problem 2 shall contain a public class called DuplicateCounter

    private int wordCounter; // The counts should be stored in an instance variable called wordCounter
    private Map<String, Integer> countWords;

    public DuplicateCounter() { // default constructor

        this.countWords = new HashMap<String, Integer>();

    }

    public void count(String dataFile) throws FileNotFoundException { // DuplicateCounter shall contain a method called count

        Scanner input = new Scanner(new File(dataFile));

        while (input.hasNext()) {

            String word = input.next();
            Integer count = countWords.get(word);
            wordCounter++;

            if (count != null) {
                count = count + 1;
            }
            else {
                count = 1;
            }

            countWords.put(word, count);

        }

    }

    public void write(String outputFile) throws IOException { // DuplicateCounter shall contain a method called write

        FileWriter fileWriter = new FileWriter(new File(outputFile));

        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            fileWriter.write(entry.getKey() + " " + entry.getValue() + "\n");
            fileWriter.write(System.getProperty( "line.separator" ));
        }

        fileWriter.write("\n\n\nNumber of words in the file :" + wordCounter + "\n");

        fileWriter.close(); // close outputFile (unique_words_count.txt)

    }

}