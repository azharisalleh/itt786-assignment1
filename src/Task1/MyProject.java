package Task1;
//Create by Azhari Hj Salleh 2014461166
//Title - Using reverse order string
import java.util.*;

public class MyProject {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Azhari");
		names.add("Hj Salleh");
		
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println("");System.out.println("");
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}

}
