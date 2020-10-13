import java.util.Random;
class EmpMethods{
	int Wage_per_hour=20;
	int Day_hour=8;
	int Total_Wage=1;
}
public class EmpWage{
	public static void main(String args[]){
		System.out.println("Welcome to Wage Computation Program");
		Random rand = new Random();
		EmpMethods call=new EmpMethods();
		int choice = rand.nextInt(10) % 2;
		if(choice==0){
			System.out.println("Present");
			call.Total_Wage=call.Wage_per_hour*call.Day_hour;
			System.out.println("Total Wage : "+call.Total_Wage);
		}
		else{
			System.out.println("Absent");
			call.Total_Wage=0;
			System.out.println("Total Wage : "+call.Total_Wage);
		}
		//System.out.println(choice + " Hello world");
	}
}