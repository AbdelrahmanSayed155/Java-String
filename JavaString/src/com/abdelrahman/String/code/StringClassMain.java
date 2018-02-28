package com.abdelrahman.String.code;

public class StringClassMain {
	public static void main(String []args){
	/// is imutable values don't change
	// jvm check have value in memory
	// if fount you will get this from memory 
	// if not found jvm will create new string
	String s = "abdelrahman Sayed ";
	/// newS is hav two object newS in head memory 
	////"mohamed" in stack memory 	
	String newS = new String("mohamed");
    ///
    String string =  s.concat(newS);
    System.out.println("concat"+string);
	char [] cs = {'g','o','o'};
	System.out.println(new String(cs));
	/// contain 
	String con1 = "abdelrahman Sayed ";
	if(con1.contains("abd")){
		
	}
	if(con1.contains("sosl")){
		
	}
	/// equality
	/// value equality
	if(s.equals(newS)){
		
	}
	/// value equality
	if(s.equalsIgnoreCase(newS)){
		
	}
	/// refrence equality
	if(s == newS){
		
	}
	
	//// compare to return 
	/* it work by values of char 
	 * 0 if two values if equal
	 * > 0 if frist value >  second value and resualt is diffrent 
	 * < 0 if frist value <  second value and resualt is diffrent 
	 * */
	
	/// there is compareIgnoreCase
	int y =  s.compareTo(newS);
	if(y==0){
		System.out.println("equal");
	}else if(y >0){
		System.out.println("frist > ssecond");
	}else if(y<0){
		System.out.println("second < frist");
	}
	y =  s.compareToIgnoreCase(newS);
	if(y==0){
		System.out.println("equal");
	}else if(y >0){
		System.out.println("frist > ssecond");
	}else if(y<0){
		System.out.println("second < frist");
	}
	//// cocatnation prefer String bulder Stringbuffer
	 con1 = "abdelrahman ";
	String con2 =" sayed";
	String con3 = con1+con2;
	////or 
	con3 = con1.concat(con2);
	//// substring 
	String sub1 ="abdelrahman";
	String sub2 ="Sayed";
	                      // cut from 0 index to 3 index but index 3 not found
	String sub3 = sub1.substring(0,3);
	// cut from 3 index to ÈÇÞí ÇáßáãÉ 
	 sub3 = sub1.substring(3);
	 /// Capital && Small 
	 
	 //// deleting white Spaces 
	 String trimString = string.trim();
	 String upper = string.toUpperCase();
	 String lowwer = string.toLowerCase();
	 ///// starting with
	 if(string.startsWith("adm")){
		 System.out.println("this start with adm");
	 }
	 if(string.endsWith("adm")){
		 System.out.println("this end with adm");
	 }
	 /// get char at specific index 
	 char c = string.charAt(2);
	 //// getLengh
	 System.out.println(string.length());
	 /// values of it convert int long tp string value
	 double num =10.25;
	 String numString  = String.valueOf(num);
	 System.out.println(numString);
	 ////////repalce 
	 String doc1 = " i want to kill shor , so ";
	 String replac = "abdo";
	 String newdoc = doc1.replace(doc1, replac);
	 System.out.println(newdoc);
	 /// formating 
	 String name2 ="Abdelrahman Sayed";	 
	 String format1 = String.format("Name is %s", name2);
	 String format2 = String.format("value is %f", 33.24);
	 String format3 = String.format("value is %4.8f", 3.4);
	 /// getting byte 
	 String name3 ="Abdelrahman";
	 byte [] name3byte = name3.getBytes();
	 for(int index=0;index<name3byte.length;index++){
		 System.out.println(name3byte[index]);
	 }
	 //// index of  print index of frist char match return -1 if it don't contain than
	 String indexOfString = "abdelrahman Sayed mohamed ";
	 int indexofint = indexOfString.indexOf("Say");
	 //// 14 is lenght allowed to search 
	 indexofint = indexOfString.indexOf("Say" , 14);
     /// intern methods if i want to duplicate String 
	 String intern1 = "abdo";
	 String intern2 = "abdo";
	 String intern3 = intern2.intern();
	 /// empty
	 if(intern1.isEmpty()){
		 
	 }
	 
	 /// join
	 String join = String.join(",", intern1,intern2,intern3);
    /// replace
	 String replaceString="abdelrahman sayed Mohamed";
	 String newString = replaceString.replace("a", "A");
	 
	  replaceString="abdelrahman sayed Mohamed";
	 String noSpacenewString = replaceString.replace(" ", "");
	 noSpacenewString = replaceString.replace("\\s", "");
	 
	 // spalit
	 String splitString ="abdo sayed g";
	 String [] splitingString = splitString.split("\\s");
	 // loop for display 
	 
	  splitString ="abdo sayed g";
	  splitingString = splitString.split("\\s" , 0);
	 // loop for display 
	  
	  splitString ="abdo sayed g";
	  /// split to 1 part array have one element array have 1 block
	  splitingString = splitString.split("\\s" , 1);
	  /// split to 2 part array have one element
	  splitingString = splitString.split("\\s" , 2);
	  /// split to 3 part array have one element
	  splitingString = splitString.split("\\s" , 3);
	  /// split to 4 part array have one element
	  splitingString = splitString.split("\\s" , 4);
	 // loop for display
	 
	  // to char array
	  char [] car = splitString.toCharArray();
	  for(char css :car){
		  System.out.println(css);
	  }
	  
	  // last index 
	  
	  int lastIndexOfChar = splitString.lastIndexOf('g');
	 // is mutable change 
	StringBuffer stringBuffer;
	StringBuilder stringBuilder;
	}
	
}
