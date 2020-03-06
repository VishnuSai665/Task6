package tasklist;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args)
	{
		lists l=new lists();
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Enter 1.Insertion  2.Deletion  3.Fetch  4.Size 5.Display  6.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				   System.out.println("Enter the element to be inserted");
				   int key=sc.nextInt();
				   l.insert(key);
				   break;
			case 2:
				  System.out.println("Enter the index of element to be removed");
				  int rem=sc.nextInt();
				  l.remove(rem);
				  break;
			case 3:
				  System.out.println("Enter the index to be fetched");
				  int seaid=sc.nextInt();
				  l.fetch(seaid);
				  break;
			case 4:
				System.out.println("The size of the list is : "+l.size());
				break;
			case 5:
				System.out.println("The elements of the list are :");
				l.display();
				break;
			case 6: 
				System.exit(0);
			}
			
			
			
		}
	}
}