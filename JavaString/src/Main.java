
public class Main {
	public static void main(String []args){
		String g=null;
		if(g.isEmpty()){
			 System.out.println("null");
		}
		// two have the same hash code 
		 String intern1 = "abdo";
		 String intern2 = "abdo";
		 System.out.println(intern2.hashCode());
		 System.out.println(intern1.hashCode());
	}
}
