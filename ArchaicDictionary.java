import java.util.HashMap;
import java.io.*;
import java.util.Scanner;
/**
 * @author Brad Davis
 * This class creates a dictionary with a list of words and a list of definitions and lets the user search through and find
 * each word with its definition
 */
public class ArchaicDictionary {
HashMap<String,String> archaicDict = new HashMap<String,String>();

/**
 * This method scans two different lists each one containing either
 * the archaic words or the archaic definitions, then puts them both
 * into the archaicDictionary
 * @throws FileNotFoundException
 */
public ArchaicDictionary() throws FileNotFoundException{
		File archaicWordsFile = new File("archaicWords.txt");
		Scanner wordScanner = new Scanner(archaicWordsFile);
		File archaicDefsFile = new File("archaicDefinitions.txt");
		Scanner defsScanner = new Scanner(archaicDefsFile);
		
		while(wordScanner.hasNextLine() && defsScanner.hasNextLine()) {
			archaicDict.put(wordScanner.nextLine(), defsScanner.nextLine());
}
		wordScanner.close();
		defsScanner.close();
}//end ArchaicDictionary


/**
 * This method lets the user type in a word they want to search for
 * and returns that word with the definition
 * @param word  The word that the user wants to search for
 */
public void searchDict(String word) {
	if(archaicDict.containsKey(word)) {
		System.out.println("Archaic Word & Definition: " + word + " - " + archaicDict.get(word) + " \nHashkey: " + word.hashCode() +"\n");
	}
}//end searchDict

/**
 * This method goes through and prints each word with its definition
 */
public void printDict() {
	for(String word : archaicDict.keySet()) {
		System.out.println(word + " - " + archaicDict.get(word));
	}
}//end printDict
}//end ArchaicDictionary
