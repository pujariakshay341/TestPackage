package testPackege;

public class Test1 
{
	public static void main(String[] args) 
	{
		String name="HeXaEAreTesTiNg1";
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				sb.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch))
			{
				sb.append(Character.toUpperCase(ch));
			}
			else
			{
				sb.append(ch);
			}
			
		}
		System.out.println(name);
		System.out.println(sb);
	}

}
