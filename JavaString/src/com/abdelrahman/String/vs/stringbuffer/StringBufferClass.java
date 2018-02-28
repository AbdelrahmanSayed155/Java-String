package com.abdelrahman.String.vs.stringbuffer;

public class StringBufferClass {

	public static StringBuffer stringBuffergClass(){
		StringBuffer name = new StringBuffer( "Abdelrahman");
		for(int y=0;y<10000;y++){
			name.append(" Sayed");
		}
		return name;
	}
	
}
