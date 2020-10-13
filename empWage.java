import java.util.Random;
class EmpMethods{
	int Wage_per_hour=20;
	int Day_hour=0;
	int Total_Wage=1;
	int count=1;
	Random rand = new Random();
	void check(){
		while(count<21){
			int choice = rand.nextInt(10) % 3;
			switch (choice){
				case 0:
					System.out.println("------------------------------------------------------");
					System.out.println("Present Full time employee");
					Day_hour=8;
					break;
				case 1:
					System.out.println("------------------------------------------------------");
					System.out.println("Present Part time employee");
					Day_hour=4;
					break;
				case 2:
					System.out.println("------------------------------------------------------");
					System.out.println("Absent");
					Day_hour=0;
					break;
				default:
					System.out.println("------------------------------------------------------");
					System.out.println("Invalid");
					Day_hour=0;
					break;
			}
			Total_Wage=Wage_per_hour*Day_hour;
			System.out.println("Total Wage of "+count+" Day : "+Total_Wage);
			count=count+1;
		}
	}
}
public class EmpWage{
	public static void main(String args[]){
		System.out.println("Welcome to Wage Computation Program");
		EmpMethods call=new EmpMethods();
		call.check();
	}
}