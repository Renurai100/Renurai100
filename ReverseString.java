public class ReverseString {

	public static void main(String[] args) {
		
String input="hello world my name is prakash";
			
	System.out.println(input.length());
	
	for(int i=input.length()-1;i>=0;i--)
	{
		System.out.print(input.charAt(i));
	}

	}

}
