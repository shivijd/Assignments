import java.util.HashMap;
import java.util.Iterator;//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Kkk{
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(123, "AYnsuyh");
		map.put(12, "AYns");map.put(23, "suyh");
		map.put(4156, "Ayh");map.put(78, "gupys");
		map.put(123, "kkkk");
		
		System.out.println(map);
		
		Set<Integer>list = map.keySet();
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int n = itr.next();
			System.out.println(n+" "+map.get(n));
		}
		
		for(Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
