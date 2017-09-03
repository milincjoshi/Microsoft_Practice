/*
	Q: Find a longest palindromic substring
	Approach:	Middle out iterating over each character
*/
public class LongestPalindrome{
	static String maxpalin="";

	static void longestPalindrome(String str){

		for(int i=0;i<str.length()-1;i++){
			palin(i,i, str);
			palin(i,i+1, str);	
		}
	}

	static void palin(int start, int end, String str){

		while(start>=0 && end <str.length() && str.charAt(start) == str.charAt(end)){
	
			if(end-start>maxpalin.length()){
				maxpalin = str.substring(start,end+1);
			}
	
			start--;
			end++;
		}

	}

	public static void main(String[] args){
		String str ="milin";
		longestPalindrome(str);
		System.out.println(maxpalin);
	}
}