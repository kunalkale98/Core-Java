public class DailyEmpWage{

	public static void main(String[] args){
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int wage_Per_Hr = 20;
		int full_Day_Hrs = 8;
		int part_Time_Hrs = 4;

		double check = Math.floor(Math.random() * 10) % 3;

		if(check==IS_FULL_TIME){
			System.out.println("Employee is Present Full Time");
			int emp_Wage = wage_Per_Hr * full_Day_Hrs;
			System.out.println("Full Time Employee Wage is "+emp_Wage);
		}
		else if(check==IS_PART_TIME){
			System.out.println("Employee is Part Time");
			int emp_Wage = wage_Per_Hr * part_Time_Hrs;
			System.out.println("Part Time Employee Wage is "+emp_Wage);
		}
		else{
			System.out.println("Employee is Absent");
		}
	}
}
