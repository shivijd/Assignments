
package com.assign;

public class ClassDia {
	
		public static void main(String[]args)
{
			ClassDia c=new ClassDia();
			c.setFirstName("First Name");
			c.setSecondNme("Second name");
			c.setGender("Gender");
			System.out.println("PERSON");
			System.out.println(c.getFirstName());
			System.out.println(c.getSecondNme());
			System.out.println(c.getGender());
			
}
	
	private static String FirstName;
	private static String SecondNme;
	private static String Gender;
	public static String getFirstName() {
		
		return FirstName;
	}
	public static void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public static String getSecondNme() {
		return SecondNme;
	}
	public void setSecondNme(String secondNme) {
		SecondNme = secondNme;
	}
	public static String getGender()

{
	return Gender;
		}
	public static void setGender(String gender)
	{
		Gender=gender;
	}
}

