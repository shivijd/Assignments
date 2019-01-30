import java.util.Comparator;

class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	//	System.out.println(o1.getDesignation());
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class Employee implements Comparable<Employee>,Comparator<Employee>{
	private  String Name;
	private  String Designation;
	public  String getName() {
		return Name;
	}
	public  void setName(String name) {
		Name = name;
	}
	public String getDesignation()
	{
		return Designation;
	}
	public void setDesignation(String designation)
	{
		Designation=designation;
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode called");
		return Name.length();
	}
	public boolean equals(Object obj)
	{
		System.out.println("equals method called");
		Employee emp=(Employee)obj;
//		System.out.println(Name+" "+emp.getName()+" : "+Designation+" "+emp.getDesignation());
		System.out.println("hash code"+emp.hashCode());
		if(Name.equals(emp.getName()) && Designation.equals(emp.getDesignation()))
		{
//			System.out.println("exist");
			return true;
		}
		return false;		
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Designation=" + Designation + "]";
	}
	public Employee(String name, String designation) {
		super();
		Name = name;
		Designation = designation;
	}
	//@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return 0;
	}
}

