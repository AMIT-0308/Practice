package stringProgramme;

public class ReverseString {

	public static void main(String[] args) {
		String name="Amit Arun Jadhav";
		int size=name.length();
		for(int a=size-1;a>=0; a--) {
			char b= name.charAt(a);
			System.out.print(b);
			
		}

	}

}
