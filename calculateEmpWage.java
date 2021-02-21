public class calculateEmpWage{

	public static void main(String[] args){

		int wage_Per_Hr = 20;
		int work_Hrs;
		int total_Wage = 0;
		int working_Days = 0;
		int total_Work_Hrs = 0;
		while (working_Days < 20 && total_Work_Hrs < 80){

			working_Days++;
			int check = (int)Math.floor(Math.random() * 10) % 3;
			switch (check){

			case 1:
				System.out.println("Employee is Present Full Time");
				work_Hrs = 8;
				break;

			case 2:
				System.out.println("Employee is Present Part Time");
				work_Hrs = 4;
				break;

			default:
				System.out.println("Employee is Absent");
				work_Hrs = 0;
			}

			total_Work_Hrs = total_Work_Hrs + work_Hrs;
			int emp_Wage = wage_Per_Hr * work_Hrs;
			total_Wage = total_Wage + (emp_Wage);
		}
		System.out.println("Total Working Hrs is "+total_Work_Hrs);
      System.out.println("Total employee wage for a month is "+total_Wage);

	}
}
