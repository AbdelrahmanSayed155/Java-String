package com.abdelrahman.StringBuilder.vs.stringbuffer;



public class VSMainClass {

	public static void main(String[] args) {
		// buffer is synchronized
		/// builder is non sysnchronize , multihreading 
		/// builder is efficient than buffer
		
		
		long startBuffer = System.currentTimeMillis();
		StringBufferClass.getString();
		long endBuffer = System.currentTimeMillis();
		
		long startBuiler = System.currentTimeMillis();
		StringBuilerClass.getString();
		long endBuiler = System.currentTimeMillis();
		
		System.out.println("Time for StringBuffer :"+(endBuffer-startBuffer)+"ms");
		System.out.println("Time for StringBuilder :"+(endBuiler-startBuiler)+"ms");
		

	}

}
