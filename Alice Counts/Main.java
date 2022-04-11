// add import statements
import java.util.Scanner;
import java.io.*;


// create class AliceCount (For REPL.IT this class would be "Main")
public class Main{

	// create main method - remember to throw the exception
	public static void main(String[] args) throws FileNotFoundException {
	
		// instantiate Scanner object using text file "alice.txt".
    Scanner scanner = new Scanner(new File("alice.txt"));
		
		// instatiate PrintWriter with output file name
    PrintWriter out = new PrintWriter(new FileOutputStream("output.txt"));
		
		// create variable to track the number of words in the text
    int words = 0;
		
		// create variable to track each of the letters
    int eCount = 0;
    int tCount = 0;
    int aCount = 0;
    int oCount = 0;
    int iCount = 0;
		
		// loop through the file		
    while(scanner.hasNext()){
			// read in the word one at a time
			// increment the word counter
      words++;
			
			// check to see if the letter occurs in the word
      int isIn = 0;
      String wordToCheck = scanner.next();
      char[] cleaner = new char[wordToCheck.length()];
      for (int i = 0; i < wordToCheck.length(); i++) {
            cleaner[i] = wordToCheck.charAt(i);
        }

			if((wordToCheck.indexOf('e') != - 1) || (wordToCheck.indexOf('E') != -1)){
				// increment the letter counter
        eCount++;
        isIn = 1;
				}
      if((wordToCheck.indexOf('t') != - 1) || (wordToCheck.indexOf('T') != -1)){
				// increment the letter counter
        tCount++;
        isIn = 1;
				}
      if((wordToCheck.indexOf('a') != - 1) || (wordToCheck.indexOf('A') != -1)){
				// increment the letter counter
        aCount++;
        isIn = 1;
				}
      if((wordToCheck.indexOf('o') != - 1) || (wordToCheck.indexOf('O') != -1)){
				// increment the letter counter
        oCount++;
        isIn = 1;
				}
      if((wordToCheck.indexOf('i') != - 1) || (wordToCheck.indexOf('I') != -1)){
				// increment the letter counter
        iCount++;
        isIn = 1;
				}
				// write the word to the output file
        if(isIn == 1){
        for(int i = 0; i < cleaner.length ; i++ ) {
          if(Character.isLetter(cleaner[i]) || cleaner[i] == '-'){
            out.print(cleaner[i]);
          }
        }
        out.print("\n");
        }
      }
		// calculate the percentage of words containing the character
		double perE = (double) Math.round((((double)eCount / words) * 100) * 100) / 100;
    double perT = (double) Math.round((((double)tCount / words) * 100) * 100) / 100;
		double perA = (double) Math.round((((double)aCount / words) * 100) * 100) / 100;
    double perO = (double) Math.round((((double)oCount / words) * 100) * 100) / 100;
    double perI = (double) Math.round((((double)iCount / words) * 100) * 100) / 100;

    System.out.println("Words with the letter 'e' = " + eCount);
    System.out.println("Total number of Words = " + words);
    System.out.println("Percentage of words containing the letter 'e' is " + perE + "%");
    System.out.println("Percentage of words containing the letter 't' is " + perT + "%");
    System.out.println("Percentage of words containing the letter 'a' is " + perA + "%");
    System.out.println("Percentage of words containing the letter 'o' is " + perO + "%");
    System.out.println("Percentage of words containing the letter 'i' is " + perI + "%");
		//  close the files
    scanner.close();
    out.close();
      }
    }