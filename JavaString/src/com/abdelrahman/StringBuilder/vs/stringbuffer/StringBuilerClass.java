package com.abdelrahman.StringBuilder.vs.stringbuffer;

public class StringBuilerClass {
	
	public static StringBuilder getString(){
		StringBuilder builder = new StringBuilder("abdelrahman");
		for(int y=0;y<100000;y++)
			builder.append(" sayed");
		
		return builder;
	}

}
