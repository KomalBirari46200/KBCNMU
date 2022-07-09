import java.util.*;

class bufferdemo
{
	public static void main(String argsp[])
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		str=sc.next();

		StringBuffer b = new StringBuffer(str);
		System.out.println(str);



	}
}