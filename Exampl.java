import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Exampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h=new HashSet<>();
		h.add(2);
		h.add(20);
		h.add(10);
		h.add(5);
		h.add(5);
		h.add(5);	
       ArrayList<Integer>list = new ArrayList<>(h); 
       
		Collections.sort(list);
		System.out.println(list);

}
}