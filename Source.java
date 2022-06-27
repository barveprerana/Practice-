import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections; 
class ArrayListOps
{
   public ArrayList<Integer> makeArrayListInt(int n)
   {
	   ArrayList<Integer> list = new ArrayList<>();
	   for(int i=0; i<n;i++)
	   {
		   list.add(0);
	   }
	return list;
   }
   public ArrayList<Integer> reverseList(ArrayList<Integer> list)
   {
	   Collections.reverse(list);
	   return list;
   }
   public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
   {
	    ArrayList<Integer> list1 = new ArrayList<>();
		for(Integer i : list)
		{
			if(i==m)
			list1.add(n);
			else
			list1.add(i);
		}
		return list1;
   }
}

public class Source{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));

		ArrayListOps obj = new ArrayListOps();

		ArrayList<Integer> list1 = obj.makeArrayListInt(4);
		ArrayList<Integer> list2 = obj.reverseList(list);
		ArrayList<Integer> list3 = obj.changeList(list2, 28, 20);

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
}
