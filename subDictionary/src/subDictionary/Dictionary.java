package subDictionary;

import java.util.ArrayList;


public class Dictionary {
	//attributes
	private int count;
	private String fileName;
	private ArrayList<String> A; 
	private ArrayList<String> B; 
	private ArrayList<String> C; 
	private ArrayList<String> D; 
	private ArrayList<String> E; 
	private ArrayList<String> F; 
	private ArrayList<String> G; 
	private ArrayList<String> H; 
	private ArrayList<String> I; 
	private ArrayList<String> J; 
	private ArrayList<String> K; 
	private ArrayList<String> L; 
	private ArrayList<String> M; 
	private ArrayList<String> N; 
	private ArrayList<String> O; 
	private ArrayList<String> P; 
	private ArrayList<String> Q; 
	private ArrayList<String> R; 
	private ArrayList<String> S; 
	private ArrayList<String> T; 
	private ArrayList<String> U; 
	private ArrayList<String> V; 
	private ArrayList<String> W; 
	private ArrayList<String> X; 
	private ArrayList<String> Y; 
	private ArrayList<String> Z; 

	
	//setters
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	//getters
	public int getCount() {
		return count;
	}
	public String getFileName() {
		return fileName;
	}
	
	//constructors
	public Dictionary() {
		count = 0;
		fileName = "";
		A = new ArrayList<String>();
		B = new ArrayList<String>();
		C = new ArrayList<String>();
		D = new ArrayList<String>();
		E = new ArrayList<String>();
		F = new ArrayList<String>();
		G = new ArrayList<String>();
		H = new ArrayList<String>();
		I = new ArrayList<String>();
		J = new ArrayList<String>();
		K = new ArrayList<String>();
		L = new ArrayList<String>();
		M = new ArrayList<String>();
		N = new ArrayList<String>();
		O = new ArrayList<String>();
		P = new ArrayList<String>();
		Q = new ArrayList<String>();
		R = new ArrayList<String>();
		S = new ArrayList<String>();
		T = new ArrayList<String>();
		U = new ArrayList<String>();
		V = new ArrayList<String>();
		W = new ArrayList<String>();
		X = new ArrayList<String>();
		Y = new ArrayList<String>();
		Z = new ArrayList<String>();
	}

	//Method to find first character of word to store in right arraylist
	public String firstChar(String word) {
		switch(word){
			case "A":
				return "A";
			case "B":
				return "B";
			case "C":
				return "C";
			case "D":
				return "D";
			case "E":
				return "E";
			case "F":
				return "F";
			case "G":
				return "G";
			case "H":
				return "H";
			case "I":
				return "I";
			case "J":
				return "J";
			case "K":
				return "K";
			case "L":
				return "L";
			case "M":
				return "M";
			case "N":
				return "N";
			case "O":
				return "O";
			case "P":
				return "P";
			case "Q":
				return "Q";
			case "R":
				return "R";
			case "S":
				return "S";
			case "T":
				return "T";
			case "U":
				return "U";
			case "V":
				return "V";
			case "W":
				return "W";
			case "X":
				return "X";
			case "Y":
				return "Y";
			case "Z":
				return "Z";
			default:
				System.out.println("Error with first char");
				return "";
		}
	}
	
	//method to search for illegal characters
	public static boolean illegalChar(String word) {
		int index;
		//check for question mark -- false if contains illegal version of question mark, i.e not at end of word
		if((word.indexOf("?")) >= 0) {
			index = word.indexOf("?");
			if(index != (word.length() - 1)) {
				return false;
			}
		}
		//check for : -- false if it appears and is not at end of word
		if((word.indexOf(":")) >= 0) {
			index = word.indexOf(":");
			if(index != (word.length() - 1)) {
				return false;
			}
		}
		//check for apostrophe -- can only appear in front of m or s
		if((word.indexOf("'")) >= 0) {
			index = word.indexOf("'");
			if(index == word.length() -1) {
				return false;
			}
			char temp = word.charAt(index + 1);
			String next = Character.toString(temp);
			if((next.equalsIgnoreCase("m")) || (next.equalsIgnoreCase("s"))) {
				
			} else {
				return false;
			}
		}
		//check for , -- can only appear at end of word
		if((word.indexOf(",")) >= 0) {
			index = word.indexOf(",");
			if(index != (word.length() - 1)) {
				return false;
			}
		}
		
		//check for = sign, if word contains it it is an invalid word so returns false
		if((word.indexOf("=")) >= 0) {
			return false;
		}
		//check for semi-colon -- only appears at end of a word
		if((word.indexOf(";")) >= 0) {
			index = word.indexOf(";");
			if(index != (word.length() - 1)) {
				return false;
			}
		}
		//check for exclamation mark -- only appears at end of a word
		if((word.indexOf("!")) >= 0) {
			index = word.indexOf("!");
			if(index != (word.length() - 1)) {
				return false;
			}
		}
		//check for period -- only appears at the end of a word
		if((word.indexOf(".")) >= 0) {
			index = word.indexOf(".");
			if(index != (word.length() - 1)) {
				return true;
			}
		}
		//check for numbers - dates or any word containing a number is not recorded
		for(int i = 0; i < 10; i++) {
			String tempp = Integer.toString(i);
			if((word.indexOf(tempp)) >= 0) {
				return false;
			}
		}
		//check for single characters except a and i (ignore case)
		if(word.length() == 1) {
			if((word.equalsIgnoreCase("a")) || (word.equalsIgnoreCase("i"))) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	//methods to take out special characters (if any) -- use containsIllegalCharacter before to make sure word is valid -- return upper case word 
	public static String extract(String word) {
			@SuppressWarnings("unused")
			int index;
			String str;
			//check for question mark -- true if contains illegal version of question mark, i.e not at end of word
			if((word.indexOf("?")) >= 0) {
				index = word.indexOf("?");
				str = word.substring(0, word.length() - 1);
				str = str.toUpperCase();
				return str;
			}
			//check for : -- true if it appears and is not at end of word
			if((word.indexOf(":")) >= 0) {
				index = word.indexOf(":");
				str = word.substring(0, word.length() - 1);
				str = str.toUpperCase();
				return str;
			}
			//check for apostrophe -- can only appear in front of m or s, if not returns true
			if((word.indexOf("'")) >= 0) {
				index = word.indexOf("'");
				str = word.substring(0, index);
				str = str.toUpperCase();
				return str;
			}
			//check for , -- can only appear at end of word
			if((word.indexOf(",")) >= 0) {
				index = word.indexOf(",");
				str = word.substring(0, word.length() - 1);
				str = str.toUpperCase();
				return str;
			}
			//check for semi-colon -- only appears at end of a word
			if((word.indexOf(";")) >= 0) {
				index = word.indexOf(";");
				str = word.substring(0, word.length() - 1);
				str = str.toUpperCase();
				return str;
			}
			//check for exclamation mark -- only appears at end of a word
			if((word.indexOf("!")) >= 0) {
				index = word.indexOf("!");
				str = word.substring(0, word.length() - 1);
				str = str.toUpperCase();
				return str;
			}
			//check for period -- only appears at the end of a word
			if((word.indexOf(".")) >= 0) {
				index = word.indexOf(".");
				str = word.substring(0, word.length() - 1);
				str = str.toUpperCase();
				return str;
			}
			str = word;
			str = str.toUpperCase();
			return str;
	}
	
	
	//main method for testing
	public static void main(String args[]) {
		

		
	}
	
	
}
