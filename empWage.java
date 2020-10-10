import java.util.Random;
class empMethods{
	int Wage_per_hour=20;
	int Day_hour=8;
	int Part_time=4;
	int Total_Wage=1;
	Random rand = new Random();
	void check(){
		int choice = rand.nextInt(10) % 3;
		if(choice==0){
			System.out.println("Present Full time employee");
			Total_Wage=Wage_per_hour*Day_hour;
			System.out.println("Total Wage : "+Total_Wage);
		}
		else if(choice==1){
			System.out.println("Present Part time employee");
			Total_Wage=Wage_per_hour*Part_time;
			System.out.println("Total Wage : "+Total_Wage);
		}
		else{
			System.out.println("Absent");
			Total_Wage=0;
			System.out.println("Total Wage : "+Total_Wage);
		}
	}
}
public class empWage{
	public static void main(String args[]){
		System.out.println("Welcome to Wage Computation Program");
		empMethods e1=new empMethods();
		e1.check();
		//System.out.println(choice + " Hello world");
	}
}