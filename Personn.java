package com.assign;

public class Personn extends Account {
String Name;
public Personn(long accountNo, double balance, String name, float age) {
	super(accountNo, balance);
	Name = name;
	this.age = age;
}
float age;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}
public String toString()
{
	return getAccountNo()+" "+getBalance()+" "+getName()+" "+getAge();
	
}

}

