public class EmpWageBuilder
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String Company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	public EmpWageBuilder(String Company,int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.Company = Company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	private int computeEmpWage()
	{
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpWage =0;

		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		{
			totalWorkingDays++;
			int randomValue = (int) Math.floor(Math.random()*10)%3;
			switch (randomValue) {
					case IS_PART_TIME:
						empHrs=4;
						break;
					case IS_FULL_TIME:
						empHrs=8;
						break;
					default:
						empHrs=0;
			}
			totalEmpHrs += empHrs;
		}
		totalEmpWage =totalEmpHrs*empRatePerHour;
		return totalEmpWage;
	}
	public static void main(String [] args)
	{
		EmpWageBuilder samsung = new EmpWageBuilder("SAMSUNG",50,20,100);
		EmpWageBuilder nokia   = new EmpWageBuilder("NOKIA", 60, 20, 100);

		System.out.println("Total Emp wage for Company " + samsung.Company +" is "+samsung.computeEmpWage());
		System.out.println("Total Emp wage for Company " + nokia.Company +" is "+nokia.computeEmpWage());
	}
}
