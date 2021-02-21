public class empWageUsingSC{

	public static void main(String[] args){

		int wage_Per_Hr = 20;
		int check = (int)Math.floor(Math.random() * 10) % 3;
		int work_Hrs;
		switch (check){

		case 1:
			System.out.println("Employee is Present Full Time");
			work_Hrs = 8;
			//int emp_wage = wage_Per_Hr * work_Hrs;
			break;

		case 2:
			System.out.println("Employee is Present Part Time");
			work_Hrs = 4;
			//int emp_wage = wage_Per_Hr * work_Hrs;
			break;

		default:
			System.out.println("Employee is Absent");
			work_Hrs = 0;
		}

		int emp_Wage = wage_Per_Hr * work_Hrs;
      System.out.println("Employee Wage is "+emp_Wage);

	}
}
