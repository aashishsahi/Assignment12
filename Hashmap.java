import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hashmap {
	
	public static HashMap<Integer, String> Create()
	{
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		int n;
		Integer Id;
		String Name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of inputs: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter id: ");
			Id = sc.nextInt();
			System.out.print("Enter Name: ");
			Name = sc.next();
			map1.put(Id, Name);
			
		}
		sc.close();
		
		return map1;
	}

	public static void main(String[] args) {
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2 = Create();
		for(Map.Entry<Integer, String> element: map2.entrySet())
		{
			System.out.println("Id: " + element.getKey() + "    Name: " + element.getValue());
		}
		

	}

}
