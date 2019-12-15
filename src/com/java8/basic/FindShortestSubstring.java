package com.java8.basic;

public class FindShortestSubstring {
	  static boolean[] traced = new boolean[256];
	    /*
	     * Complete the 'shortestSubstring' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts STRING s as parameter.
	     */

	    public static int shortestSubstring(String s) {
	    // Write your code here
	        int charCount = 0; // dis_count
	        int startIndex = -1;

	        int[] charArr = new int[256]; // curr_count
	        int start = 0; // count
	        int initial = 0; // start
	        int initialIndex = -1;// start index
	        int len = 10000; // min_len
	        //bollean[] traced = new boolean[256];
	        for(int i=0;i<s.length();i++){
	            if(traced[s.charAt(i)]==false){
	                traced[s.charAt(i)] = true;
	                charCount++;
	            }
	        }
	        for(int i=0;i<s.length();i++){
	            charArr[s.charAt(i)]++;
	            if(charArr[s.charAt(i)]==1){
	                start++;
	            }
	            if(start==charCount){
	                while(charArr[s.charAt(initial)]>1){
	                    if(charArr[s.charAt(initial)]>1){
	                        charArr[s.charAt(initial)]--;
	                        initial++;
	                    }
	                }
	                int containerLen = i-initial+1;
	                if(len>containerLen){
	                    len=containerLen;
	                    initialIndex = initial;
	                }
	            }
	        }
	        return s.substring(initialIndex, initialIndex+len).length();
	    }

	public static void main(String[] args) {
		System.out.println(shortestSubstring("aaabbbc"));

	}

}
