import java.util.Random;
class empMethods{
	int Wage_per_hour=20;
	int Day_hour=8;
	int Total_Wage=1;
}
public class empWage{
	public static void main(String args[]){
		System.out.println("Welcome to Wage Computation Program");
		Random rand = new Random();
		empMethods e1=new empMethods();
		int choice = rand.nextInt(10) % 2;
		if(choice==0){
			System.out.println("Present");
			e1.Total_Wage=e1.Wage_per_hour*e1.Day_hour;
			System.out.println("Total Wage : "+e1.Total_Wage);
		}
		else{
			System.out.println("Absent");
			e1.Total_Wage=0;
			System.out.println("Total Wage : "+e1.Total_Wage);
		}
		//System.out.println(choice + " Hello world");
	}
}