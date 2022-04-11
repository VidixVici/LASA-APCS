import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
 
public class WordSearchRunner {
  public static void wsMain(String fileName) throws FileNotFoundException
  {
   System.out.println("Starting main");
    // instantiate Scanner object to read in from file
    Scanner scan = new Scanner(new File(fileName));
    // read in rows
    int tRows = scan.nextInt();
    // read in columns
    int tCols = scan.nextInt();
    // instantiate WordSearch object passing in number of rows & columns for 2D array
    scan.nextLine();
   WordSearch wordFile = new WordSearch(tRows, tCols);
   char[][] wGrid = wordFile.getArray();
    // loop through the rows in the file
    for(int i = 0; i < tRows; i++){
      // loop through the columns in the file
      for(int j = 0; j < tCols; j++){
        // read in value from file using local variable
        // pass row, column, and value into the 2D array
       wGrid[i][j] = scan.next().charAt(0);
     }
   }   
    // read number of words to search for from file
    scan.nextLine();
   int totalW = scan.nextInt();
   scan.nextLine();
    // loops through the words
   String[] wordsToSearch = new String[totalW];
    for(int i = 0; i < totalW; i++){
      // read in word from file
      wordsToSearch[i] = scan.nextLine();
   }
   System.out.println("Done with array");
   System.out.println();
      // method call to search for the word in the 2D array
      System.out.println( wordFile.toString());
     System.out.println();
   for(int i = 0; i < wordsToSearch.length; i++){
     boolean tof = wordFile.inGrid(wordsToSearch[i]);
      // print out word to search for and true/false
     System.out.println(wordsToSearch[i] + " -> " + Boolean.toString(tof));
   }
   scan.close();
  }
}
