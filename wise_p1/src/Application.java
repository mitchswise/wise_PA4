/**
 * Mitchell Wise
 * 10/28/2019
 * COP3330
 * Dr. Christopher D. Hollander
 */

// create a separate class called Application that contains a main method
public class Application {

    public static void main(String[] args) {

        DuplicateRemover duplicateRemover = new DuplicateRemover();

        // illustrates the use of DuplicateRemover by calling both the remove and write methods
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");

    }

}