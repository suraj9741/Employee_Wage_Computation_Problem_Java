import java.util.Random;
public class EmpWage{
	public static void main(String args[]){
		System.out.println("Welcome to Wage Computation Program");
		Random rand = new Random();
		int choice = rand.nextInt(10) % 2;
		if(choice==0)
			System.out.println("Present");
		else
			System.out.println("Absent");
		//System.out.println(choice + " Hello world");
	}
}