import java.util.Random;
class EmpMethods{
	int Day_hour=0;
	int Total_Wage=1;
	int Total_Woking_Days=1;
	int hours=0;
	
	private final String Company;
	private final int Emp_Rate_Per_Hour;
	private final int Num_Of_Working_Days;
	private final int Max_Hours_Per_Month;
	
	public EmpMethods(String Company, int Emp_Rate_Per_Hour, int Num_Of_Working_Days, int Max_Hours_Per_Month){
		this.Company=Company;
		this.Emp_Rate_Per_Hour=Emp_Rate_Per_Hour;
		this.Max_Hours_Per_Month=Max_Hours_Per_Month;
		this.Num_Of_Working_Days=Num_Of_Working_Days;
	}
	
	int Total_Month_Wage=0;
	Random rand = new Random();
	void check(){
		while(Total_Woking_Days<=Num_Of_Working_Days&&hours<Max_Hours_Per_Month){
			int choice = rand.nextInt(10) % 3;
			switch (choice){
				case 0:
					Day_hour=8;
					break;
				case 1:
					Day_hour=4;
					break;
				case 2:
					Day_hour=0;
					break;
				default:
					Day_hour=0;
					break;
			}
			hours=hours+Day_hour;
			Total_Wage=Emp_Rate_Per_Hour*Day_hour;
			Total_Month_Wage=Total_Month_Wage+Total_Wage;
			Total_Woking_Days=Total_Woking_Days+1;
		}
		System.out.println("------------------------Total-------------------------");
		System.out.println("Total Month Wage in "+ Company +" is : "+Total_Month_Wage);
		System.out.println("Total Month Work Hours in "+ Company +" is : "+hours+" Out of "+Max_Hours_Per_Month);
		System.out.println("Total Month Working Days in "+ Company +" is : "+(Total_Woking_Days-1)+" Out of "+Num_Of_Working_Days);
		System.out.println("------------------------------------------------------");
	}
}
public class EmpWage{
	public static void main(String args[]){
		System.out.println("Welcome to Wage Computation Program");
		EmpMethods Dmart=new EmpMethods("Dmart", 20, 20, 100 );
		Dmart.check();
		System.out.println("#################################Next Company#########################################");
		EmpMethods Reliance=new EmpMethods("Reliance", 10, 25, 120);
		Reliance.check();
	}
}