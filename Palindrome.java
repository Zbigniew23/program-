public class Palindrome
{
  static int d = 11122111;
  static int y = 33555789255;
  static int z = 171;
	// some comments  
  // add comment
	public static void main(String[] args)
	{
		Palindrom3 pal = new Palindrom3();
		 System.out.println(Palindrom3.isPalindrome(d));
		 System.out.println(Palindrom3.isPalindrome(y));
		 System.out.println(Palindrom3.isPalindrome(z));
	}
	
	private static boolean isPalindrome(Integer u) {
        if (u == 0)
            return false;
        String ir =  Integer.toString(u);
        StringBuilder sb = new StringBuilder(ir);
       sb.reverse();     
       return sb.toString().equals(ir);
    }
}
