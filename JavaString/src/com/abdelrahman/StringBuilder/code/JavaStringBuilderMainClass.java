package com.abdelrahman.StringBuilder.code;

public class JavaStringBuilderMainClass {

	public static void main(String[] args) {
		/// mutable ,  non synchronous  
            StringBuilder builder=  new StringBuilder();
            builder.append(" Sayed");
    		System.out.println(builder);
    		/// insert word after index 0
    		builder.insert(0, "Eng:");
    		System.out.println(builder);
    		builder.replace(0, 3, "Egineer");
    		System.out.println(builder);
    		builder.delete(0, 8);
    		System.out.println(builder);
    		System.out.println(builder.reverse());
    		// maximum value this string reach to it  it good if you want to limit it 
    		System.out.println("cap"+builder.capacity());
    		System.out.println("len"+builder.length());
    		/// capacity equation = (oldcapacity *2)+2
    		
    		 StringBuilder builder2 = new StringBuilder("abdelrhman");
    		// to set minimum capacity 20 and extend with 20
    		 builder2.ensureCapacity(20);
    		/// this make string with 6 lentgh and cut more than 6
    		 builder2.setLength(6);
	}

}
 