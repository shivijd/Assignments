import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<>();
hm.put(1, "shivi");
hm.put(2, "shikha");
hm.put(3, "three");
hm.put(4, "four");
System.out.println(hm);
Set<Integer> s=hm.keySet();
Iterator<Integer> it=s.iterator();
while(it.hasNext())
{
	Integer key=it.next();
	System.out.println("keys are"+" "+hm.get(key));
	//System.out.println("values are"+" "+hm.get(values));
}
	}

}
