import java.util.StringTokenizer;

public class TokenizerClassJava {

	public static void main(String[] args) {
		
		// tokenizer support you with 
		/// additional process for string 
		/// by default it split by space 
		StringTokenizer  stringTokenizer = new StringTokenizer("i want to , play ee , ww");
		while(stringTokenizer.hasMoreTokens()){
			//System.out.println(stringTokenizer.nextToken());
			System.out.println(stringTokenizer.nextToken(","));
		}
		
	
		
		

	}

}
