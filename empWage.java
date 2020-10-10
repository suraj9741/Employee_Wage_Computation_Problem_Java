import java.util.Random;
class empMethods{
	int Wage_per_hour=20;
	int Day_hour=0;
	int Total_Wage=1;
	Random rand = new Random();
	void check(){
		int choice = rand.nextInt(10) % 3;
		switch (choice){
			case 0:
				System.out.println("Present Full time employee");
				Day_hour=8;
				break;
			case 1:
				System.out.println("Present Part time employee");
				Day_hour=4;
				break;
			case 2:
				System.out.println("Absent");
				Day_hour=0;
				break;
			default:
				System.out.println("Invalid");
				Day_hour=0;
				break;
		}
		Total_Wage=Wage_per_hour*Day_hour;
		System.out.println("Total Wage of Day : "+Total_Wage);
	}
}
public class empWage{
	public static void main(String args[]){
		System.out.println("Welcome to Wage Computation Program");
		empMethods e1=new empMethods();
		e1.check();
	}
}