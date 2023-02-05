package assig1;
import java.util.*;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number to check");
		List<Integer> checker=new ArrayList();
		checker.add(s1.nextInt());
		checker.add(s1.nextInt());
		checker.add(s1.nextInt());
		checker.add(s1.nextInt());
		checker.forEach(odd->
		{
			if(odd%2!=0)
				System.out.println("the odd numbers are: "+odd);
		});
		s1.close();
				
		
		
	}

}
