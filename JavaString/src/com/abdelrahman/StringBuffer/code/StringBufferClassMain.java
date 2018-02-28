package com.abdelrahman.StringBuffer.code;

public class StringBufferClassMain {

	public static void main(String[] args) {
		// StringBuffer is mutable change in value of String in memory
        // using in multiThreading shyncronous
		// intial capacity 16 it extends when string will be more than 16
		StringBuffer buffer = new StringBuffer("abdelrhman");
		buffer.append(" Sayed");
		System.out.println(buffer);
		/// insert word after index 0
		buffer.insert(0, "Eng:");
		System.out.println(buffer);
		buffer.replace(0, 3, "Egineer");
		System.out.println(buffer);
		buffer.delete(0, 8);
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		// maximum value this string reach to it  it good if you want to limit it 
		System.out.println("cap"+buffer.capacity());
		System.out.println("len"+buffer.length());
		/// capacity equation = (oldcapacity *2)+2
		
		StringBuffer buffer2 = new StringBuffer("abdelrhman");
		// to set minimum capacity 20 and extend with 20
		buffer2.ensureCapacity(20);
		/// this make string with 6 lentgh and cut more than 6
		buffer2.setLength(6);
	}

}
