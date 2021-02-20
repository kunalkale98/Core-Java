public class DailyEmpWage{

	public static void main(String[] args){
		int IS_FULL_TIME = 1;
		int wage_Per_Hr = 20;
		int full_Day_Hrs = 8;

		double check = Math.floor(Math.random() * 10) % 2;

		if(check==IS_FULL_TIME){
			System.out.println("Employee is Present");
			int emp_Wage = wage_Per_Hr * full_Day_Hrs;
			System.out.println("Daily Employee Wage is "+emp_Wage);
		}
		else{
			System.out.println("Employee is Absent");
		}
	}
}
