package score;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class queue6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s1 = new String[3];
		int[] i1 = new int[3];
		ArrayList<Students> arr = new ArrayList<>();
		Students[] st = new Students[3];
		for(int i=0;i<=2;i++)
		{
			System.out.println("Enter Name....");
			s1[i] = sc.next();
			System.out.println("Enter Score...");
			i1[i] = sc.nextInt();
		}
		for(int i=0;i<=2;i++)
		{
			st[i] = new Students(s1[i],i1[i]);
			arr.add(st[i]);
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		int rank = 1;
		for(Students s : arr)
		{
			System.out.println(s+" Rank : "+rank);
			rank++;
		}
	}
}