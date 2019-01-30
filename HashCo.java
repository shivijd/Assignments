import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashCo {

	public static void main(String[] args) {
		HashSet<Employee> hs=new HashSet<>();
		hs.add(new Employee("Radhika","Developer"));
		hs.add(new Employee("Sarita","Trainer"));
		hs.add(new Employee("Shikha", "Developer"));
		hs.add(new Employee("Aradhya", "Trainer"));
		hs.add(new Employee("Shikha", "Developer"));
	//	System.out.println(hs);
		ArrayList arr=new ArrayList<>(hs);
		Collections.sort(arr,new SortByName());
		System.out.println(arr);


	}

}
