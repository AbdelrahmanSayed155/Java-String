package com.abdelrahman.StringBuilder.vs.stringbuffer;

public class StringBufferClass {
	
	public static StringBuffer getString(){
		StringBuffer buffer = new StringBuffer("abdelrahman");
		for(int y=0;y<100000;y++)
			buffer.append(" sayed");
		
		return buffer;
	}

}
