package assignments;
import java.util.*;
import java.io.*;

public class VowelProto {

	@SuppressWarnings("resource")
	public static void main(String...args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a directory. \n"
				+ "(Example: /Users/RoD/Desktop/TestFile.docx)");
		String filename = input.nextLine();
		File file = new File(filename);
		if(file.exists())
		{
			System.out.println("There are "
					+ getVowel(file)
					+ " vowels and "
					+ getConso(file)
					+ " consonants in "
					+ file
					+ ". ");
		}//if
		else
		{
			System.out.println("That file does not exist.");
		}//else
	}//main
	
	@SuppressWarnings({ "resource", "unused" })
	public static int getVowel(File file) throws IOException
	{
		String[] Vowels = {"A", "a", "E", "e", "I", "i", "O", "o", "U", "u"};
		Set<String> VowelSet =
				new HashSet<>(Arrays.asList(Vowels));
		int vowelCount = 0;
		
		Scanner input = new Scanner(file);
		String filename = input.toString();
		
		while(input.hasNext())
		{
			String word = input.next();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String thisLine = null;
			
			char current;
			//Open input and read it with print statements for testing.
			while ((thisLine = br.readLine()) != null) {
				for (int i = 0; i < thisLine.length(); i++) {
					current = thisLine.charAt(i);
					if (VowelSet.contains(current)) {
						vowelCount++;
						//System.out.println(thisLine);
					}
				}//for
			}//while
			break;
		}
		return vowelCount;
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public static int getConso(File file) throws IOException
	{
		String[] Conso = {"B", "b", "C", "c", "D", "d", "F", "f", "G", "g",
				"H", "h", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n",
				"P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "V", "v",
				"W", "w", "X", "x", "Y", "y", "Z", "z"
		};
		Set<String> ConsoSet =
				new HashSet<>(Arrays.asList(Conso));
		int consoCount = 1;
		
		Scanner input = new Scanner(file);
		String filename = input.toString();
		
		while(input.hasNext())
		{
			String word = input.next();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String thisLine = null;
			
			char current;
			//Open input and read it with print statements for testing.
			while ((thisLine = br.readLine()) != null) {
				for (int i = 0; i < thisLine.length(); i++) {
					current = thisLine.charAt(i);
					if (ConsoSet.contains(current)) {
							consoCount++;
							//System.out.println(thisLine);
						}
				}//for
			}//while
			break;
		}
		return consoCount;
	}
	
}//class
