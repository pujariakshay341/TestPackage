package testPackege;

public class Test2 
{
   public static void main(String[] args) 
   {
	  String name="AKSHAY";
	  String name1="";
	  System.out.println("Initial string1: "+name);
	  
	  if(name==name.toUpperCase() && name!=name.toLowerCase())
	  {
		  System.out.println("Name is in uppercase.");
	  }
	  else if(name==name.toLowerCase() && name!=name.toUpperCase())
	  {
		  System.out.println("Name is in lowercase.");
	  }
	  else
	  {
		  System.out.println("Name having both upper and lower case.");
	  }
	  
	  System.out.println("Initial string1 in lowercase: "+name.toLowerCase());
	  StringBuilder sb=new StringBuilder("AKSHAY P");
	  System.out.println("Next String in reverse: "+sb.reverse());
	  
	  for(int i=name.length()-1;i>=0;i--)
	  {
		  char ch= name.charAt(i);
		  name1=name1+ch;
	  }
	  System.out.println("Initial string in reverse: "+name1);
   }
}
