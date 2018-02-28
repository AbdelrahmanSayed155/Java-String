package com.abdelrahman.String.vs.stringbuffer;

public class VSClass {
	
	public static void main(String []args){
		
		long startstring = System.currentTimeMillis();
		StringClass.StringClass();
		long endstring = System.currentTimeMillis();
		
		long startstringbuffer = System.currentTimeMillis();
		StringBufferClass.stringBuffergClass();
		long endstringbuffer = System.currentTimeMillis();
		
		System.out.println("Time for String :"+(endstring-startstring)+"ms");
		System.out.println("Time for StringBuffer :"+(endstringbuffer-startstringbuffer)+"ms");
	
		System.out.println("-------- hasing code --------");
		//// hashing code will chage after any change in strin becuase it depend to value
		String str1 = "abdelrahman";
		System.out.println(str1.hashCode());
		str1 = str1 +" sayed";
		System.out.println("after appending "+str1.hashCode());
		
		StringBuffer strbuffer =  new StringBuffer("abdelrahman");
		System.out.println(strbuffer.hashCode());
		strbuffer.append(" sayed");
		System.out.println("after appending "+strbuffer.hashCode());
	
	}

}
