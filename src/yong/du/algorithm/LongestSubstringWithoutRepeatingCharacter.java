package yong.du.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
	public static void main(String[] args) {
		String str = "pwwkew";
		System.out.println("the length of longest substring is " + lenthOfLongestSubstring(str));
		
	}
	
	public static int lenthOfLongestSubstring(String s) {
		int maxLength = 0;
		int lengthOfString = s.length();
		for (int i = 0;i< lengthOfString ; i++)
		{
			Set<Character> substring = new HashSet<>() ;
			substring.add(s.charAt(i));
			for (int j = i+1; j< lengthOfString; j++)
			{
				Character ch = s.charAt(j);
				if(substring.contains(ch)){
					break;
				}
				else {
					substring.add(ch);
				}	
			}
			maxLength = (substring.size() >= maxLength)?substring.size():maxLength;
		}
		return maxLength;
	}
}
