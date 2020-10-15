import java.util.Random;
interface CalcEmpWage {
	int computeEmpWage(EmpMethods companyEmpWage);
}


class EmpMethods{
	int Day_hour=0;
	int Total_Wage=1;
	int Total_Woking_Days=1;
	int hours=0;
	
	public int TotalEmpWage;
	
	
	public final String Company;
	public final int Emp_Rate_Per_Hour;
	public final int Num_Of_Working_Days;
	public final int Max_Hours_Per_Month;
	
	public EmpMethods(String Company, int Emp_Rate_Per_Hour, int Num_Of_Working_Days, int Max_Hours_Per_Month){
		this.Company=Company;
		this.Emp_Rate_Per_Hour=Emp_Rate_Per_Hour;
		this.Max_Hours_Per_Month=Max_Hours_Per_Month;
		this.Num_Of_Working_Days=Num_Of_Working_Days;
	}
	
	public void setTotalEmpWage(int TotalEmpWage){
		this.TotalEmpWage=TotalEmpWage;
	}
	//public String toString(){	return 0 }
	
	
	
	int Total_Month_Wage=0;
	
}
public class EmpWage implements CalcEmpWage{
	
		Random rand = new Random();
		
		private EmpMethods[] companyEmpArray;
		private int NumOfCompany=0;
		
		
		public EmpWage(){
			companyEmpArray =new EmpMethods[5];
		}
		
		private void addCompnyEmpWage(String Company, int Emp_Rate_Per_Hour, int Num_Of_Working_Days, int Max_Hours_Per_Month){
			companyEmpArray[NumOfCompany]=new EmpMethods(Company,Emp_Rate_Per_Hour,Num_Of_Working_Days,Max_Hours_Per_Month);
			NumOfCompany++;
		}
		
		private void computeEmpWage(){
			for (int i=0;i<NumOfCompany;i++){
				companyEmpArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpArray[i]));
				//System.out.println(companyEmpArray[i]);
			}
		}
		public int computeEmpWage(EmpMethods companyEmpWage){
			while(companyEmpWage.Total_Woking_Days<=companyEmpWage.Num_Of_Working_Days&&companyEmpWage.hours<companyEmpWage.Max_Hours_Per_Month){
					int choice = rand.nextInt(10) % 3;
					switch (choice){
						case 0:
							companyEmpWage.Day_hour=8;
							break;
						case 1:
							companyEmpWage.Day_hour=4;
							break;
						case 2:
							companyEmpWage.Day_hour=0;
							break;
						default:
							companyEmpWage.Day_hour=0;
							break;
					}
					companyEmpWage.hours=companyEmpWage.hours+companyEmpWage.Day_hour;
					companyEmpWage.Total_Wage=companyEmpWage.Emp_Rate_Per_Hour*companyEmpWage.Day_hour;
					companyEmpWage.Total_Month_Wage=companyEmpWage.Total_Month_Wage+companyEmpWage.Total_Wage;
					companyEmpWage.Total_Woking_Days=companyEmpWage.Total_Woking_Days+1;
				}
			System.out.println("------------------------Total-------------------------");
			System.out.println("Total Month Wage in "+ companyEmpWage.Company +" is : "+companyEmpWage.Total_Month_Wage);
			System.out.println("Total Month Work Hours in "+ companyEmpWage.Company +" is : "+companyEmpWage.hours+" Out of "+companyEmpWage.Max_Hours_Per_Month);
			System.out.println("Total Month Working Days in "+ companyEmpWage.Company +" is : "+(companyEmpWage.Total_Woking_Days-1)+" Out of "+companyEmpWage.Num_Of_Working_Days);
			System.out.println("------------------------------------------------------");
			return companyEmpWage.Total_Month_Wage;		
		}
		
		
		public static void main(String args[]){
		EmpWage EmpWageBuilder = new EmpWage();
		EmpWageBuilder.addCompnyEmpWage("Dmart", 20, 20, 100);
		EmpWageBuilder.addCompnyEmpWage("Reliance", 10, 25, 120);
		EmpWageBuilder.computeEmpWage();
	}
}