import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class CompareSets {
	
	public static void Compare()
	{
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		int n, k;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of inputs: ");
		n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element for set 1: ");
			k = sc.nextInt();
			set1.add(k);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element for set 2: ");
			k = sc.nextInt();
			set2.add(k);
		}
		sc.close();
		set1.retainAll(set2);
		System.out.print("Reatined elements: ");
		System.out.println(set1);
		
	}

	public static void main(String[] args) {
		
		Compare();

	}

}
