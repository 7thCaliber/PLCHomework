package homework1;

/*
Sivasubramaniyan Mourougassamy
Programming Language Concepts
Tuesday, Thursday, 12:45 PM - 2:30 PM
Homework 1

Question 3
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class homeworkOne {

	public static void main(String[] args) {
		//String displayed in assignment
		String test1 = "2345 6tgbsauhd9sa67*l{OPKDSl;jaklhl";
		
		//Another string to test
		String test2 = "this  is a test*test*test{}@$test{t{est";
		
		List<String> tokensList = parseTokens(test1);
		
		//Display as a list
		//System.out.println(tokeno.toString());
		
		//Display as displayed on assignment
		for(int i = 0; i<tokensList.size(); i++) {
			System.out.println(tokensList.get(i));
		}
	}
	
	public static List<String> parseTokens(String inputString){
		//List for final  output
		List<String> tokens = new ArrayList<>();
		
		//Delimiter RegEx stored separately for readability later on
		String delimiterText = "((?<=%1$s)|(?=%1$s))";
		
		//Splits input string by any character that is not alphanumeric or underscore
		String[] tokensWhitespace = inputString.split(String.format(delimiterText, "[^\\w]"));
		
		//filter out white spaces/empty strings and output into tokens list
		for(int i = 0; i < tokensWhitespace.length; i++) {
			if(!(tokensWhitespace[i].isEmpty())&&(tokensWhitespace[i].trim().length() > 0)) {
				tokens.add(tokensWhitespace[i]);
			}
		}
		
		//return filtered list of tokens
		return tokens;
	}

}
