
public class main
{

	public static void main(String[] args) 
	{
		String abc = "abcdefeghi";
		Boolean repeat = LinearSearch(abc);
		if(repeat)
		{
			System.out.println("String does not have all unique characters.");
		}
		else
		{
			System.out.println("String is unique!");
		}

	}
	public static boolean LinearSearch(String abc)
	{
		for(int i = 0; i < abc.length(); i++)
		{
			char key = abc.charAt(i);
			for(int j = i+1; j < abc.length(); j++)
			{
				char compare = abc.charAt(j);
				if(key == compare)
				{
					return true;
				}
			}
			
		}
		return false;
	}

}

